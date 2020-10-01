package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dto.Brand;
/**
*  @author mymx.brand
*/
public interface BrandBaseMapper {

    int insertBrand(Brand object);

    int updateBrand(Brand object);

    int update(Brand.UpdateBuilder object);

    List<Brand> queryBrand(Brand object);

    Brand queryBrandLimit1(Brand object);

}