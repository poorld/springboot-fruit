package com.teenyda.controller.product.dto;

import lombok.Data;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-12-28 14:16
 * @description: 查询req
 **/

@Data
public class ProductQueryReq {
    private Integer categoryId;
    private String name;
}
