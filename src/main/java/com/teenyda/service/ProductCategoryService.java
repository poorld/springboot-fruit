package com.teenyda.service;

import com.teenyda.entity.ProductCategory;

import java.util.List;

/**
 * (ProductCategory)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:53
 */
public interface ProductCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param productCategoryId 主键
     * @return 实例对象
     */
    ProductCategory queryById(Integer productCategoryId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductCategory> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    ProductCategory insert(ProductCategory productCategory);

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    ProductCategory update(ProductCategory productCategory);

    /**
     * 通过主键删除数据
     *
     * @param productCategoryId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer productCategoryId);

}