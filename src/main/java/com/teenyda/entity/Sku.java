package com.teenyda.entity;

import java.io.Serializable;

/**
 * (Sku)实体类
 * 规格
 * @author makejava
 * @since 2020-10-14 12:39:31
 */
public class Sku implements Serializable {
    private static final long serialVersionUID = -34203287261462875L;

    private Integer skuId;

    // 斤、箱、袋
    private String attrbute;


    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getAttrbute() {
        return attrbute;
    }

    public void setAttrbute(String attrbute) {
        this.attrbute = attrbute;
    }

}