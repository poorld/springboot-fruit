package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
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