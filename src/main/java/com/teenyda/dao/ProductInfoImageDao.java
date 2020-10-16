package com.teenyda.dao;

import com.teenyda.entity.ProductInfoImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ProductInfoImage)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-16 18:16:44
 */
public interface ProductInfoImageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    ProductInfoImage queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductInfoImage> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productInfoImage 实例对象
     * @return 对象列表
     */
    List<ProductInfoImage> queryAll(ProductInfoImage productInfoImage);

    /**
     * 新增数据
     *
     * @param productInfoImage 实例对象
     * @return 影响行数
     */
    int insert(ProductInfoImage productInfoImage);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductInfoImage> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductInfoImage> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductInfoImage> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductInfoImage> entities);

    /**
     * 修改数据
     *
     * @param productInfoImage 实例对象
     * @return 影响行数
     */
    int update(ProductInfoImage productInfoImage);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 影响行数
     */
    int deleteById();

}