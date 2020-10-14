package com.teenyda.entity;

import java.io.Serializable;

/**
 * (ProductInfoImage)实体类
 *
 * @author makejava
 * @since 2020-10-14 12:39:30
 */
public class ProductInfoImage implements Serializable {
    private static final long serialVersionUID = 485888426861903348L;

    private Integer productId;
    /**
     * 排序
     */
    private Integer sort;

    private String url;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}