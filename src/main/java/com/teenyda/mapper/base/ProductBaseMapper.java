package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.Product;
/**
*  @author mymx.banner
*/
public interface ProductBaseMapper {

    int insertProduct(Product object);

    int updateProduct(Product object);

    int update(Product.UpdateBuilder object);

    List<Product> queryProduct(Product object);

    Product queryProductLimit1(Product object);

}