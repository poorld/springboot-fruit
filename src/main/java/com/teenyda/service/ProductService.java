package com.teenyda.service;

import com.teenyda.entity.Product;

import java.util.List;

/**
 * (Product)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:52
 */
public interface ProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    Product queryById(Integer productId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Product> queryAllByLimit(int offset, int limit);

    List<Product> queryAll();

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product insert(Product product);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer productId);

}