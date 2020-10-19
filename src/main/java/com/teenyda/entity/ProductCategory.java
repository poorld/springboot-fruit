package com.teenyda.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProductCategory)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:53
 */
@Data
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = -39528109752538233L;

    private Integer productCategoryId;

    private String name;

    private Integer sortOrder;

    private String description;

    private String image;

    private Date updateTime;

    private Integer updateUserId;



}