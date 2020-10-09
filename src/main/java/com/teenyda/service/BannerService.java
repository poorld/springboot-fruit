package com.teenyda.service;

import com.teenyda.entity.Banner;

import java.util.List;

/**
 * (Banner)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 16:52:08
 */
public interface BannerService {

    /**
     * 通过ID查询单条数据
     *
     * @param bannerId 主键
     * @return 实例对象
     */
    Banner queryById(Integer bannerId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Banner> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    Banner insert(Banner banner);

    /**
     * 修改数据
     *
     * @param banner 实例对象
     * @return 实例对象
     */
    Banner update(Banner banner);

    /**
     * 通过主键删除数据
     *
     * @param bannerId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bannerId);

}