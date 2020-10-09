package com.teenyda.mapping.base;

import java.util.List;

import com.teenyda.domain.Banner;
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