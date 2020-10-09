package com.teenyda.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (ProductCategory)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:53
 */
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = -39528109752538233L;

    private Integer productCategoryId;

    private String name;

    private Integer sortOrder;

    private String description;

    private String image;

    private Date updateTime;

    private Integer updateUserId;


    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

}