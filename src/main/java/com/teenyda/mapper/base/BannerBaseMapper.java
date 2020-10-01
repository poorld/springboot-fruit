package com.teenyda.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.teenyda.dao.Banner;
/**
*  @author mymx.banner
*/
public interface BannerBaseMapper {

    int insertBanner(Banner object);

    int updateBanner(Banner object);

    int update(Banner.UpdateBuilder object);

    List<Banner> queryBanner(Banner object);

    Banner queryBannerLimit1(Banner object);

}