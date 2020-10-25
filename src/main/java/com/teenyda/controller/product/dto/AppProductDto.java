package com.teenyda.controller.product.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.teenyda.entity.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-25 17:14
 * @description:
 **/
@Data
public class AppProductDto {

    private Integer productId;

    private String name;

    // 描述
    private String explain;

    // 市场价格
    private Double shopPrice;

    // 售卖价格
    private Double price;

    private Integer hot;


    // 是否加推荐标签
    private Boolean recommended;

    // 产品状态 0上线 1下线
    private Integer productStatus;

    // 封面图片
    private String defaultImg;

    private Date updateTime;

    private Integer updateUserId;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    private Integer createUserId;

    // 产品分类
    private ProductCategory productCategory;

    // 规格
    private List<Spec> spec;

    // 优惠
    private List<Discounts> discounts;

    // 产品图片
    private List<ProductInfoImage> productInfoImages;

    // 产品幻灯片
    private List<ProductBannerImage> productBannerImages;

    // 产品标签
    private List<Tag> tags;
}
