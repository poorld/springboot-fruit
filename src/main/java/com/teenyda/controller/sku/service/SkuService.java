package com.teenyda.controller.sku.service;

import com.teenyda.entity.Sku;

import java.util.List;

/**
 * (Sku)表服务接口
 *
 * @author makejava
 * @since 2020-10-14 19:59:46
 */
public interface SkuService {

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    Sku queryById(Integer skuId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Sku> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    Sku insert(Sku sku);

    /**
     * 修改数据
     *
     * @param sku 实例对象
     * @return 实例对象
     */
    Sku update(Sku sku);

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer skuId);

}