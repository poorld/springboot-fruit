package com.teenyda.service;

import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.controller.order.dto.OrderPaymentReq;
import com.teenyda.entity.OrderPayment;

import java.util.List;

/**
 * (OrderPayment)表服务接口
 *
 * @author makejava
 * @since 2020-11-07 10:42:32
 */
public interface OrderPaymentService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderPaymentId 主键
     * @return 实例对象
     */
    OrderPayment queryById(Integer orderPaymentId);
    OrderPayment queryByOrderNum(String orderNum);

    OrderPayment payment(OrderPaymentReq paymentReq);
    OrderPayment pay(String orderNum) throws GlobalErrorInfoException;
    Boolean finish(String orderNum);


    Boolean cancel(String orderNum);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderPayment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderPayment 实例对象
     * @return 实例对象
     */
    OrderPayment insert(OrderPayment orderPayment);

    /**
     * 修改数据
     *
     * @param orderPayment 实例对象
     * @return 实例对象
     */
    OrderPayment update(OrderPayment orderPayment);

    /**
     * 通过主键删除数据
     *
     * @param orderPaymentId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer orderPaymentId);

}