package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.OrderInfo;
/**
*  @author mymx.banner
*/
public interface OrderInfoBaseMapper {

    int insertOrderInfo(OrderInfo object);

    int updateOrderInfo(OrderInfo object);

    int update(OrderInfo.UpdateBuilder object);

    List<OrderInfo> queryOrderInfo(OrderInfo object);

    OrderInfo queryOrderInfoLimit1(OrderInfo object);

}