package com.teenyda.entity;

import java.io.Serializable;

/**
 * (DiscountsCategory)实体类
 *
 * @author makejava
 * @since 2020-10-12 18:44:25
 */
public class DiscountsCategory implements Serializable {
    private static final long serialVersionUID = 520668961860415181L;

    private Integer discountsCategoryId;
    /**
     * 充值 满减 折扣
     */
    private String discountsType;

    private Integer discountsFlag;

    private String description;


    public Integer getDiscountsCategoryId() {
        return discountsCategoryId;
    }

    public void setDiscountsCategoryId(Integer discountsCategoryId) {
        this.discountsCategoryId = discountsCategoryId;
    }

    public String getDiscountsType() {
        return discountsType;
    }

    public void setDiscountsType(String discountsType) {
        this.discountsType = discountsType;
    }

    public Integer getDiscountsFlag() {
        return discountsFlag;
    }

    public void setDiscountsFlag(Integer discountsFlag) {
        this.discountsFlag = discountsFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}