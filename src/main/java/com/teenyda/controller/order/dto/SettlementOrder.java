package com.teenyda.controller.order.dto;

import com.teenyda.entity.Product;
import com.teenyda.entity.Spec;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-02 15:18
 * @description: 结算订单
 **/
public class SettlementOrder {
    private String orderItemId;

    private String orderNum;

    private Integer quantity;

    private Integer userId;

    private OrderProduct product;
}
