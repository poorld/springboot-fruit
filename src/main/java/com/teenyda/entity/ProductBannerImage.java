package com.teenyda.entity;

import java.io.Serializable;

/**
 * (ProductBannerImage)实体类
 *
 * @author makejava
 * @since 2020-10-16 19:07:56
 */
public class ProductBannerImage implements Serializable {
    private static final long serialVersionUID = -81726258007280983L;

    private Integer pbiId;

    private Integer productId;
    /**
     * 0图片 1视频
     */
    private Integer type;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}