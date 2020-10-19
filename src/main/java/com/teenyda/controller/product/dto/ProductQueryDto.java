package com.teenyda.controller.product.dto;

import com.teenyda.entity.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-19 14:30
 * @description: 查询对象
 **/
@Data
public class ProductQueryDto {
    // 根据名称查询
    private String name;
    // 根据分类
    private List<ProductCategory> categories;
    // 根据状态
    private Integer status;
}
