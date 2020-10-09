package com.teenyda.entity;

import java.io.Serializable;

/**
 * (DiscountsCategory)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:43
 */
public class DiscountsCategory implements Serializable {
    private static final long serialVersionUID = -33453128360096938L;

    private Integer discountsCategoryId;
    /**
     * 充值 满减 折扣
     */
    private String discountsType;

    private Integer discountsFlag;


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

}