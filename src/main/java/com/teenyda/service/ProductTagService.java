package com.teenyda.service;

import com.teenyda.entity.ProductTag;

import java.util.List;

/**
 * (ProductTag)表服务接口
 *
 * @author makejava
 * @since 2020-10-21 13:48:25
 */
public interface ProductTagService {

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    ProductTag queryById();

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductTag> queryAllByLimit(int offset, int limit);

    int updateProductTag(List<ProductTag> productTags, Integer productId);

    /**
     * 新增数据
     *
     * @param productTag 实例对象
     * @return 实例对象
     */
    ProductTag insert(ProductTag productTag);

    /**
     * 修改数据
     *
     * @param productTag 实例对象
     * @return 实例对象
     */
    ProductTag update(ProductTag productTag);

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    boolean deleteById();

}