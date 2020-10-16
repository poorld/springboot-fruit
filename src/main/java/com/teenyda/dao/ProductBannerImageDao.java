package com.teenyda.dao;

import com.teenyda.entity.ProductBannerImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ProductBannerImage)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-16 18:20:30
 */
public interface ProductBannerImageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    ProductBannerImage queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductBannerImage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productBannerImage 实例对象
     * @return 对象列表
     */
    List<ProductBannerImage> queryAll(ProductBannerImage productBannerImage);

    /**
     * 新增数据
     *
     * @param productBannerImage 实例对象
     * @return 影响行数
     */
    int insert(ProductBannerImage productBannerImage);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductBannerImage> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductBannerImage> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductBannerImage> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductBannerImage> entities);

    /**
     * 修改数据
     *
     * @param productBannerImage 实例对象
     * @return 影响行数
     */
    int update(ProductBannerImage productBannerImage);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 影响行数
     */
    int deleteById();

}