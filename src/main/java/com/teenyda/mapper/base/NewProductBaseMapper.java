package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.NewProduct;
/**
*  @author mymx.banner
*/
public interface NewProductBaseMapper {

    int insertNewProduct(NewProduct object);

    int updateNewProduct(NewProduct object);

    int update(NewProduct.UpdateBuilder object);

    List<NewProduct> queryNewProduct(NewProduct object);

    NewProduct queryNewProductLimit1(NewProduct object);

}