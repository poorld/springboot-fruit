package com.teenyda.controller.order.service;

import com.power.common.util.DateTimeUtil;
import com.teenyda.common.Util;
import com.teenyda.constant.OrderStatusEnum;
import com.teenyda.constant.PaymentFlagEnum;
import com.teenyda.controller.order.dto.SettlementOrder;
import com.teenyda.dao.OrderInfoDao;
import com.teenyda.dao.OrderItemDao;
import com.teenyda.entity.OrderInfo;
import com.teenyda.entity.OrderItem;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (OrderItem)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:51
 */
@Service("orderItemService")
public class OrderItemServiceImpl implements OrderItemService {
    @Resource
    private OrderItemDao orderItemDao;
    @Resource
    private OrderInfoDao orderInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderItemId 主键
     * @return 实例对象
     */
    @Override
    public SettlementOrder queryByOrderNum(String orderNum) {
        return this.orderItemDao.queryByOrderNumber(orderNum);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderItem> queryAllByLimit(int offset, int limit) {
        return this.orderItemDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderItem 实例对象
     * @param type
     * @return 实例对象
     */
    @Transactional
    @Override
    public OrderItem insert(OrderItem orderItem, int type) {
        // 生成订单号码
        orderItem.setOrderItemId(Util.getOrderId());
        orderItem.setOrderNum(Util.getOrderNumber());

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderNum(orderItem.getOrderNum());
        // 未付款
        orderInfo.setPaymentFlag(PaymentFlagEnum.Not_Paying.getPaymentFlag());
        orderInfo.setUserId(orderItem.getUserId());
        orderInfo.setStatus(OrderStatusEnum.WaitingPayment.getOrderStatus());
        orderInfo.setType(type);
        orderInfo.setCreateTime(new Date());

        this.orderItemDao.insert(orderItem);
        this.orderInfoDao.insert(orderInfo);

        return orderItem;
    }

    /**
     * 修改数据
     *
     * @param orderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OrderItem update(OrderItem orderItem) {
        this.orderItemDao.update(orderItem);
        // return this.queryById(orderItem.getOrderItemId());
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param orderItemId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String orderItemId) {
        return this.orderItemDao.deleteById(orderItemId) > 0;
    }
}