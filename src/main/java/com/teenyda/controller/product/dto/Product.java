package com.teenyda.controller.product.dto;

import lombok.Data;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-01 12:52
 * @description:
 **/

@Data
public class Product {

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
     *
     * isNullAble:1
     */
    private String defaultImg;

    /**
     *
     * isNullAble:1
     */
    private java.time.LocalDateTime updateTime;


    /**
     *
     * isNullAble:1
     */
    private java.time.LocalDateTime createTime;


}
