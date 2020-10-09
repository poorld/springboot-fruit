package com.teenyda.entity;

import java.io.Serializable;

/**
 * (Spec)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:58
 */
public class Spec implements Serializable {
    private static final long serialVersionUID = 176125375001612113L;

    private Integer specId;

    private Integer productId;

    private String specName;

    private Double price;

    private Integer quantity;


    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}