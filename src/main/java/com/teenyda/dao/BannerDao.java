package com.teenyda.dao;

import com.teenyda.controller.banner.dto.BannerDto;
import com.teenyda.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Banner)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 16:52:07
 */
public interface BannerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param bannerId 主键
     * @return 实例对象
     */
    Banner queryById(Integer bannerId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Banner> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<BannerDto> queryBanners();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param banner 实例对象
     * @return 对象列表
     */
    List<Banner> queryAll(Banner banner);

    /**
     * 新增数据
     *
     * @param banner 实例对象
     * @return 影响行数
     */
    int insert(Banner banner);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Banner> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Banner> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Banner> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Banner> entities);

    /**
     * 修改数据
     *
     * @param banner 实例对象
     * @return 影响行数
     */
    int update(Banner banner);

    /**
     * 通过主键删除数据
     *
     * @param bannerId 主键
     * @return 影响行数
     */
    int deleteById(Integer bannerId);

}