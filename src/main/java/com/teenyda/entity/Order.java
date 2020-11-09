package com.teenyda.entity;

import com.teenyda.controller.product.dto.ProductDto;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

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

    //商品的价格
    private Double price;

    private Integer quantity;

    private Integer userId;


}