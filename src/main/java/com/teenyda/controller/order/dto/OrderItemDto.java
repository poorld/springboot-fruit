package com.teenyda.controller.order.dto;

import com.teenyda.entity.OrderProductDto;
import lombok.Data;

import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-09 13:29
 * @description:
 **/
@Data
public class OrderItemDto {

    private String orderItemId;

    private String orderNum;

    private Integer productId;

    private Double price;

    private Integer quantity;

    private Integer userId;

    private Integer specId;

    private OrderProductDto product;
}
