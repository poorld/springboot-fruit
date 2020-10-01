package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.OrderInfo;
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