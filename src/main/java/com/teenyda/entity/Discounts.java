package com.teenyda.entity;

import java.io.Serializable;

/**
 * (Discounts)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:41
 */
public class Discounts implements Serializable {
    private static final long serialVersionUID = -78622205559742887L;

    private Integer discountsId;

    private Integer discountsCategoryId;
    /**
     * 说明
     */
    private String explain;
    /**
     * 满足条件的价格
     */
    private Integer conditions;
    /**
     * 满足条件说明
     */
    private String conditionsExplain;
    /**
     * 优惠
     */
    private String discounts;
    /**
     * 会员限制
     */
    private Integer members;


    public Integer getDiscountsId() {
        return discountsId;
    }

    public void setDiscountsId(Integer discountsId) {
        this.discountsId = discountsId;
    }

    public Integer getDiscountsCategoryId() {
        return discountsCategoryId;
    }

    public void setDiscountsCategoryId(Integer discountsCategoryId) {
        this.discountsCategoryId = discountsCategoryId;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public Integer getConditions() {
        return conditions;
    }

    public void setConditions(Integer conditions) {
        this.conditions = conditions;
    }

    public String getConditionsExplain() {
        return conditionsExplain;
    }

    public void setConditionsExplain(String conditionsExplain) {
        this.conditionsExplain = conditionsExplain;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

}