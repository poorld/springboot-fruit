package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.ProductCategory;
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