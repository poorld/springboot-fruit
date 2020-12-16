package com.teenyda.controller.order.service;

import com.teenyda.common.Util;
import com.teenyda.constant.OrderStatusEnum;
import com.teenyda.constant.OrderTypeEnum;
import com.teenyda.constant.PaymentFlagEnum;
import com.teenyda.controller.order.dto.OrderItemDto;
import com.teenyda.controller.order.dto.SettlementOrder;
import com.teenyda.dao.OrderInfoDao;
import com.teenyda.dao.OrderItemDao;
import com.teenyda.dao.ProductDao;
import com.teenyda.entity.OrderInfo;
import com.teenyda.entity.OrderItem;
import com.teenyda.entity.OrderProductDto;
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
    @Resource
    private ProductDao productDao;

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

    @Override
    public List<SettlementOrder> queryCartOrder(String orderNum) {
        return this.orderItemDao.queryCartOrder(orderNum);
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
     * 新增订单
     * 生成订单(OrderInfo)->生成订单项(OrderItem)
     *
     * @param orderItem 实例对象
     * @param type 0订单 1购物车
     * @return 实例对象
     */
    @Transactional
    @Override
    public OrderItem insert(OrderItem orderItem, int type) {
        OrderInfo orderInfo = new OrderInfo();
        // 生成订单号码
        orderInfo.setOrderNum(Util.getOrderNumber());
        // 未付款
        orderInfo.setPaymentFlag(PaymentFlagEnum.Not_Paying.getPaymentFlag());
        orderInfo.setUserId(orderItem.getUserId());
        orderInfo.setStatus(OrderStatusEnum.ToCart.getOrderStatus());
        orderInfo.setType(type);
        orderInfo.setCreateTime(new Date());

        orderItem.setOrderItemId(Util.getOrderId());
        orderItem.setOrderNum(orderInfo.getOrderNum());

        this.orderInfoDao.insert(orderInfo);
        this.orderItemDao.insert(orderItem);

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
     * 购物车下单
     * @param orderItem
     * @return
     */
    @Transactional
    @Override
    public OrderInfo updateCart(List<OrderItem> orderItem) {
        OrderInfo orderInfo = new OrderInfo();
        // 生成订单号码
        orderInfo.setOrderNum(Util.getOrderNumber());
        // 未付款
        orderInfo.setPaymentFlag(PaymentFlagEnum.Not_Paying.getPaymentFlag());
        orderInfo.setStatus(OrderStatusEnum.ToCart.getOrderStatus());
        orderInfo.setType(OrderTypeEnum.Order.getOrderType());
        orderInfo.setCreateTime(new Date());

        for (OrderItem item : orderItem) {
            // 删除，重新生成订单
            orderItemDao.deleteById(item.getOrderItemId());
            orderInfoDao.deleteById(item.getOrderNum());

            item.setOrderItemId(Util.getOrderId());
            item.setOrderNum(orderInfo.getOrderNum());

            orderInfo.setUserId(item.getUserId());

        }
        this.orderInfoDao.insert(orderInfo);
        this.orderItemDao.insertBatch(orderItem);


        // return this.queryById(orderItem.getOrderItemId());
        return orderInfo;
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

    /**
     * 查询所有订单
     * @return
     * @param userId
     */
    @Override
    public List<OrderInfo> queryAllOrder(Integer userId) {
        /*List<OrderInfo> orderInfos = orderItemDao.queryOrderAll(userId);
        for (OrderInfo orderInfo : orderInfos) {
            List<OrderItemDto> orderItems = orderInfo.getOrderItems();
            for (OrderItemDto orderItem: orderItems) {
                Integer productId = orderItem.getProductId();
                Integer specId = orderItem.getSpecId();
                OrderProductDto orderProductDto = productDao.orderProductByIdAndSpec(productId, specId);
                orderItem.setProduct(orderProductDto);
            }
        }*/
        return queryByStatus(userId, null);
    }

    @Override
    public List<OrderInfo> queryCart(Integer userId) {
        List<OrderInfo> orderInfos = orderItemDao.queryCart(userId);
        for (OrderInfo orderInfo : orderInfos) {
            List<OrderItemDto> orderItems = orderInfo.getOrderItems();
            for (OrderItemDto orderItem: orderItems) {
                Integer productId = orderItem.getProductId();
                Integer specId = orderItem.getSpecId();
                OrderProductDto orderProductDto = productDao.orderProductByIdAndSpec(productId, specId);
                orderItem.setProduct(orderProductDto);
                orderItem.setUserId(orderInfo.getUserId());
            }
        }
        return orderInfos;
    }

    @Override
    public List<OrderInfo> queryByStatus(Integer userId, Integer status) {
        List<OrderInfo> orderInfos = null;
        if (status == null) {
            orderInfos = orderItemDao.queryOrderAll(userId);
        } else {
            orderInfos = orderItemDao.queryOrderByStatus(userId, status);
        }

        for (OrderInfo orderInfo : orderInfos) {
            List<OrderItemDto> orderItems = orderInfo.getOrderItems();
            for (OrderItemDto orderItem: orderItems) {
                Integer productId = orderItem.getProductId();
                Integer specId = orderItem.getSpecId();
                OrderProductDto orderProductDto = productDao.orderProductByIdAndSpec(productId, specId);
                orderItem.setProduct(orderProductDto);
            }
        }
        return orderInfos;
    }

    @Override
    public OrderInfo queryOrderByNumber(Integer userId, String orderNum) {
        OrderInfo orderInfo = orderItemDao.queryOrderByNumber(userId, orderNum);
        List<OrderItemDto> orderItems = orderInfo.getOrderItems();
        for (OrderItemDto orderItem: orderItems) {
            Integer productId = orderItem.getProductId();
            Integer specId = orderItem.getSpecId();
            OrderProductDto orderProductDto = productDao.orderProductByIdAndSpec(productId, specId);
            orderItem.setProduct(orderProductDto);
        }
        return orderInfo;
    }


}