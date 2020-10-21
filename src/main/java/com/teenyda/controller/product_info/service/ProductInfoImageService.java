package com.teenyda.controller.product_info.service;

import com.teenyda.entity.ProductInfoImage;

import java.util.List;

/**
 * (ProductInfoImage)表服务接口
 *
 * @author makejava
 * @since 2020-10-21 09:57:11
 */
public interface ProductInfoImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param piiId 主键
     * @return 实例对象
     */
    ProductInfoImage queryById(Integer piiId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductInfoImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productInfoImage 实例对象
     * @return 实例对象
     */
    ProductInfoImage insert(ProductInfoImage productInfoImage);

    /**
     * 修改数据
     *
     * @param productInfoImage 实例对象
     * @return 实例对象
     */
    ProductInfoImage update(ProductInfoImage productInfoImage);

    /**
     * 修改排序
     * @param productInfoImage
     * @return
     */
    Integer updateSort(List<ProductInfoImage> productInfoImage);

    /**
     * 通过主键删除数据
     *
     * @param piiId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer piiId);

}