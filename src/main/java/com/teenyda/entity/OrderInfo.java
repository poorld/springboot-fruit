package com.teenyda.entity;

import com.teenyda.controller.order.dto.OrderItemDto;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (OrderInfo)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:48
 */
@Data
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = -23908278943625271L;

    private String orderNum;

    private Integer paymentFlag;

    private Integer userId;

    private String contactName;

    private String contactMobile;

    private String contactAddress;

    private String message;

    private Integer status;

    private Integer type;

    private Integer paymentType;

    private Date createTime;

    private Double totalPrice;

    private List<OrderItemDto> orderItems;

    // private List<OrderProductDto> product;

}