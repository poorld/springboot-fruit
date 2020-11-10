package com.teenyda.controller.order.dto;

import lombok.Data;

import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-10 16:49
 * @description: 产品日销售额
 **/
@Data
public class ProductSales {

    /**
     * 分类名称
     */
    private String categoryName;

    private List<Sales> sales;


}

@Data
class Sales {
    /**
     * 当日销售额度
     */
    private Double sales;

    /**
     * 当天日期
     */
    private String day;
}