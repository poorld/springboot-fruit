package com.teenyda.controller.product_banner.service;

import com.teenyda.entity.ProductBannerImage;

import java.util.List;

/**
 * (ProductBannerImage)表服务接口
 *
 * @author makejava
 * @since 2020-10-20 18:59:03
 */
public interface ProductBannerImageService {

    /**
     * 通过ID查询单条数据
     *
     * @param pbiId 主键
     * @return 实例对象
     */
    ProductBannerImage queryById(Integer pbiId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductBannerImage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productBannerImage 实例对象
     * @return 实例对象
     */
    ProductBannerImage insert(ProductBannerImage productBannerImage);

    /**
     * 修改数据
     *
     * @param productBannerImage 实例对象
     * @return 实例对象
     */
    ProductBannerImage update(ProductBannerImage productBannerImage);

    /**
     * 通过主键删除数据
     *
     * @param pbiId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pbiId);

}