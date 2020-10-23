package com.teenyda.service.impl;

import com.teenyda.controller.banner.dto.BannerDto;
import com.teenyda.dao.BannerDao;
import com.teenyda.entity.Banner;
import com.teenyda.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Banner)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 16:52:14
 */
@Service("bannerService")
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerDao bannerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bannerId 主键
     * @return 实例对象
     */
    @Override
    public Banner queryById(Integer bannerId) {
        return this.bannerDao.queryById(bannerId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Banner> queryAllByLimit(int offset, int limit) {
        return this.bannerDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<BannerDto> queryBanners() {
        return this.bannerDao.queryBanners();
    }

    /**
     * 新增数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    @Override
    public Banner insert(Banner banner) {
        this.bannerDao.insert(banner);
        return banner;
    }

    /**
     * 修改数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    @Override
    public Banner update(Banner banner) {
        this.bannerDao.update(banner);
        return this.queryById(banner.getBannerId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bannerId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bannerId) {
        return this.bannerDao.deleteById(bannerId) > 0;
    }
}