package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.dao.OrderItem;
/**
*  @author mymx.banner
*/
public interface OrderItemBaseMapper {

    int insertOrderItem(OrderItem object);

    int updateOrderItem(OrderItem object);

    int update(OrderItem.UpdateBuilder object);

    List<OrderItem> queryOrderItem(OrderItem object);

    OrderItem queryOrderItemLimit1(OrderItem object);

}