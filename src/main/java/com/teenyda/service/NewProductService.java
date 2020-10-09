package com.teenyda.service;

import com.teenyda.entity.NewProduct;

import java.util.List;

/**
 * (NewProduct)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:47
 */
public interface NewProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param newProductId 主键
     * @return 实例对象
     */
    NewProduct queryById(Integer newProductId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<NewProduct> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param newProduct 实例对象
     * @return 实例对象
     */
    NewProduct insert(NewProduct newProduct);

    /**
     * 修改数据
     *
     * @param newProduct 实例对象
     * @return 实例对象
     */
    NewProduct update(NewProduct newProduct);

    /**
     * 通过主键删除数据
     *
     * @param newProductId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer newProductId);

}