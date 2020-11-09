package com.teenyda.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.teenyda.controller.product.dto.ProductDto;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-09 09:26
 * @description:
 **/

@Data
public class OrderProductDto  {
    /**
     * 主键
     *
     * isNullAble:0
     */
    private Integer productId;

    /**
     *
     * isNullAble:0
     */
    private Integer productCategoryId;

    /**
     *
     * isNullAble:1
     */
    private String name;

    /**
     *
     * isNullAble:1
     */
    private String explain;

    /**
     *
     * isNullAble:1
     */
    private java.math.BigDecimal shopPrice;

    /**
     *
     * isNullAble:1
     */
    private java.math.BigDecimal price;

    /**
     *
     * isNullAble:1
     */
    private Integer hot;

    /**
     *
     * isNullAble:0,defaultVal:0
     */
    private Integer productStatus;

    /**
     * 是否加推荐标签
     */
    private Boolean recommended;

    /**
     *
     * isNullAble:1
     */
    private String defaultImg;

    /**
     *
     * isNullAble:1
     */
    private Date updateTime;


    /**
     *
     * isNullAble:1
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    private Spec spec;
}
