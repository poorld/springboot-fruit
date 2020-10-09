package com.teenyda.dao;

import com.teenyda.entity.DiscountsCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (DiscountsCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:10:43
 */
public interface DiscountsCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param discountsCategoryId 主键
     * @return 实例对象
     */
    DiscountsCategory queryById(Integer discountsCategoryId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DiscountsCategory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param discountsCategory 实例对象
     * @return 对象列表
     */
    List<DiscountsCategory> queryAll(DiscountsCategory discountsCategory);

    /**
     * 新增数据
     *
     * @param discountsCategory 实例对象
     * @return 影响行数
     */
    int insert(DiscountsCategory discountsCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DiscountsCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DiscountsCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DiscountsCategory> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<DiscountsCategory> entities);

    /**
     * 修改数据
     *
     * @param discountsCategory 实例对象
     * @return 影响行数
     */
    int update(DiscountsCategory discountsCategory);

    /**
     * 通过主键删除数据
     *
     * @param discountsCategoryId 主键
     * @return 影响行数
     */
    int deleteById(Integer discountsCategoryId);

}