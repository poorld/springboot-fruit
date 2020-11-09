package com.teenyda.entity;

import com.teenyda.controller.product.dto.ProductDto;
import lombok.Data;

import java.io.Serializable;

/**
 * (OrderItem)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:50
 */

@Data
public class Order {

    private String orderItemId;

    private String orderNum;

    private Double price;

    private Integer quantity;

    private Integer userId;

    private OrderInfo orderInfo;

    private OrderProductDto product;

}