package com.teenyda.service.impl;

import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.Util;
import com.teenyda.constant.*;
import com.teenyda.controller.order.dto.OrderPaymentReq;
import com.teenyda.controller.order.exception.PaymentException;
import com.teenyda.dao.ConsumptionRecordDao;
import com.teenyda.dao.OrderInfoDao;
import com.teenyda.dao.OrderPaymentDao;
import com.teenyda.dao.WalletDao;
import com.teenyda.entity.ConsumptionRecord;
import com.teenyda.entity.OrderInfo;
import com.teenyda.entity.OrderPayment;
import com.teenyda.entity.Wallet;
import com.teenyda.service.OrderPaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (OrderPayment)表服务实现类
 *
 * @author makejava
 * @since 2020-11-07 10:42:34
 */
@Service("orderPaymentService")
public class OrderPaymentServiceImpl implements OrderPaymentService {
    @Resource
    private OrderPaymentDao orderPaymentDao;
    @Resource
    private OrderInfoDao orderInfoDao;
    @Resource
    private WalletDao walletDao;
    @Resource
    private ConsumptionRecordDao consumptionRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderPaymentId 主键
     * @return 实例对象
     */
    @Override
    public OrderPayment queryById(Integer orderPaymentId) {
        return this.orderPaymentDao.queryById(orderPaymentId);
    }

    @Override
    public OrderPayment queryByOrderNum(String orderNum) {
        return this.orderPaymentDao.queryByOrderNum(orderNum);
    }

    @Transactional
    @Override
    public OrderPayment payment(OrderPaymentReq paymentReq) {
        OrderInfo orderInfo = paymentReq.getOrderInfo();
        OrderPayment orderPayment = paymentReq.getOrderPayment();

        /*
        // 查询余额
        Integer userId = orderInfo.getUserId();
        Wallet wallet = walletDao.queryByUserId(userId);
        // 获取需要支付的金额
        Double payAmount = orderPayment.getPayAmount();
        // 获取余额
        Double balance = wallet.getBalance();*/


        orderInfo.setStatus(OrderStatusEnum.WaitingPayment.getOrderStatus());
        orderInfoDao.update(orderInfo);

        Date createDate = new Date();
        Date endDate = Util.getAfterMinutes(createDate, OrderConstant.ORDER_END_TIME);
        orderPayment.setCreationTime(createDate);
        orderPayment.setEndTime(endDate);
        orderPayment.setPayStatus(PaymentStatusEnum.UN_PAYMENT.getPaymentType());
        orderPaymentDao.insert(orderPayment);
        return orderPayment;
    }

    /**
     * 支付订单
     * @param orderNum
     * @return
     */
    @Transactional
    @Override
    public OrderPayment pay(String orderNum) throws GlobalErrorInfoException {
        OrderInfo orderInfo = orderInfoDao.queryById(orderNum);
        OrderPayment orderPayment = orderPaymentDao.queryByOrderNum(orderNum);
        Integer payType = orderPayment.getPayType();
        Integer userId = orderInfo.getUserId();

        // 余额
        if (payType == PaymentTypeEnum
                .Balance.getPaymentType()) {

            // 查询余额
            Wallet wallet = walletDao.queryByUserId(userId);
            // 获取需要支付的金额
            Double payAmount = orderPayment.getPayAmount();
            // 获取余额
            Double balance = wallet.getBalance();
            if (balance > payAmount) {
                // 支付订单
                double sub = Util.sub(balance, payAmount);
                // todo 更新余额
                wallet.setBalance(sub);
                walletDao.update(wallet);

            }else {
                throw new GlobalErrorInfoException(PaymentException.LACK_OF_BABALCE);
            }
        }

        // 微信或者支付宝 直接结算
        // todo 更新orderInfo
        orderInfo.setPaymentFlag(PaymentStatusEnum.PAYMENT.getPaymentType());
        orderInfo.setStatus(OrderStatusEnum.HaveToPay.getOrderStatus());
        orderInfoDao.update(orderInfo);

        //todo orderPayment
        orderPayment.setPayStatus(PaymentStatusEnum.PAYMENT.getPaymentType());
        orderPaymentDao.update(orderPayment);

        // todo ConsumptionRecord
        ConsumptionRecord cr = new ConsumptionRecord();
        cr.setUserId(userId);
        cr.setSource("购物");
        cr.setConsumption(orderPayment.getPayAmount());
        cr.setCreateTime(new Date());
        consumptionRecordDao.insert(cr);

        return null;
    }

    /**
     * 结束订单
     * @param orderNum
     * @return
     */
    @Override
    public OrderPayment finish(String orderNum) {
        OrderInfo orderInfo = orderInfoDao.queryById(orderNum);
        // todo 更新orderInfo
        orderInfo.setStatus(OrderStatusEnum.PayOvertime.getOrderStatus());
        orderInfoDao.update(orderInfo);
        return null;
    }


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderPayment> queryAllByLimit(int offset, int limit) {
        return this.orderPaymentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderPayment 实例对象
     * @return 实例对象
     */
    @Override
    public OrderPayment insert(OrderPayment orderPayment) {
        this.orderPaymentDao.insert(orderPayment);
        return orderPayment;
    }

    /**
     * 修改数据
     *
     * @param orderPayment 实例对象
     * @return 实例对象
     */
    @Override
    public OrderPayment update(OrderPayment orderPayment) {
        this.orderPaymentDao.update(orderPayment);
        return this.queryById(orderPayment.getOrderPaymentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderPaymentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer orderPaymentId) {
        return this.orderPaymentDao.deleteById(orderPaymentId) > 0;
    }
}