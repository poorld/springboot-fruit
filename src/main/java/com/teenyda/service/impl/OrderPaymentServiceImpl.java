package com.teenyda.service.impl;

import com.teenyda.common.Util;
import com.teenyda.constant.OrderConstant;
import com.teenyda.constant.OrderStatusEnum;
import com.teenyda.controller.order.dto.OrderPaymentReq;
import com.teenyda.dao.OrderInfoDao;
import com.teenyda.dao.OrderPaymentDao;
import com.teenyda.dao.WalletDao;
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
        orderPaymentDao.insert(orderPayment);
        return orderPayment;
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