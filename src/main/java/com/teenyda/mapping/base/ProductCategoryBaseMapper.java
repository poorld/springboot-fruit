package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.ProductCategory;
/**
*  @author mymx.banner
*/
public interface ProductCategoryBaseMapper {

    int insertProductCategory(ProductCategory object);

    int updateProductCategory(ProductCategory object);

    int update(ProductCategory.UpdateBuilder object);

    List<ProductCategory> queryProductCategory(ProductCategory object);

    ProductCategory queryProductCategoryLimit1(ProductCategory object);

}