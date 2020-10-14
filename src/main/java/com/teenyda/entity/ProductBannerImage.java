package com.teenyda.entity;

import java.io.Serializable;

/**
 * (ProductBannerImage)实体类
 *
 * @author makejava
 * @since 2020-10-14 12:39:30
 */
public class ProductBannerImage implements Serializable {
    private static final long serialVersionUID = 492254558049560612L;

    private Integer productId;
    /**
     * 0图片 1视频
     */
    private Object type;
    /**
     * 地址
     */
    private String url;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}