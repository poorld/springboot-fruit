package com.teenyda.service;

import com.teenyda.entity.DiscountsCategory;

import java.util.List;

/**
 * (DiscountsCategory)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:44
 */
public interface DiscountsCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param discountsCategoryId 主键
     * @return 实例对象
     */
    DiscountsCategory queryById(Integer discountsCategoryId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DiscountsCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param discountsCategory 实例对象
     * @return 实例对象
     */
    DiscountsCategory insert(DiscountsCategory discountsCategory);

    /**
     * 修改数据
     *
     * @param discountsCategory 实例对象
     * @return 实例对象
     */
    DiscountsCategory update(DiscountsCategory discountsCategory);

    /**
     * 通过主键删除数据
     *
     * @param discountsCategoryId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer discountsCategoryId);

}