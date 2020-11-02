package com.teenyda.controller.order.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.teenyda.entity.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (Product)下订单的产品
 *
 * @author makejava
 * @since 2020-10-09 17:10:52
 */
@Data
public class OrderProduct implements Serializable {
    private static final long serialVersionUID = 441512402768951880L;

    private Integer productId;

    private String name;

    // 描述
    private String explain;

    // 封面图片
    private String defaultImg;

    private Date updateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    // 规格
    private Spec spec;

}