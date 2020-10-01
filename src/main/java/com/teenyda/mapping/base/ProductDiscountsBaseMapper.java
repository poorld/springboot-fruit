package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.dao.ProductDiscounts;
/**
*  @author mymx.banner
*/
public interface ProductDiscountsBaseMapper {

    int insertProductDiscounts(ProductDiscounts object);

    int updateProductDiscounts(ProductDiscounts object);

    int update(ProductDiscounts.UpdateBuilder object);

    List<ProductDiscounts> queryProductDiscounts(ProductDiscounts object);

    ProductDiscounts queryProductDiscountsLimit1(ProductDiscounts object);

}