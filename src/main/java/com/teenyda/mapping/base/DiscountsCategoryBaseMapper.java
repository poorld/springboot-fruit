package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.dao.DiscountsCategory;
/**
*  @author mymx.banner
*/
public interface DiscountsCategoryBaseMapper {

    int insertDiscountsCategory(DiscountsCategory object);

    int updateDiscountsCategory(DiscountsCategory object);

    int update(DiscountsCategory.UpdateBuilder object);

    List<DiscountsCategory> queryDiscountsCategory(DiscountsCategory object);

    DiscountsCategory queryDiscountsCategoryLimit1(DiscountsCategory object);

}