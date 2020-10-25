package com.teenyda.controller.product.dto;

import com.teenyda.entity.ProductTag;
import lombok.Data;

import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-24 09:51
 * @description: app 数据列表
 **/

@Data
public class SimpleProductDto extends ProductDto {

    private List<ProductTag> tags;
}
