package com.teenyda.controller.order.dto;

import com.teenyda.entity.OrderInfo;
import com.teenyda.entity.OrderPayment;
import lombok.Data;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-07 11:10
 * @description: 立即支付订单
 **/
@Data
public class OrderPaymentReq {
    // 订单信息
    private OrderInfo orderInfo;
    // 支付金额、优惠金额
    private OrderPayment orderPayment;
}
