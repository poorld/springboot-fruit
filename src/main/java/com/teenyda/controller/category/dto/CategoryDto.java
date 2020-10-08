package com.teenyda.controller.category.dto;

import lombok.Data;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-08 10:43
 * @description:
 **/

@Data
public class CategoryDto {

    /**
     * 主键
     *
     * isNullAble:0
     */
    private Integer productCategoryId;

    /**
     *
     * isNullAble:1
     */
    private String name;


    /**
     *
     * isNullAble:1
     */
    private String description;

    /**
     *
     * isNullAble:1
     */
    private String image;

}
