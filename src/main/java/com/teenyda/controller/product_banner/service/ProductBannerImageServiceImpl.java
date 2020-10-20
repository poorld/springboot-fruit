package com.teenyda.controller.product_banner.service;

import com.teenyda.dao.ProductBannerImageDao;
import com.teenyda.entity.ProductBannerImage;
import com.teenyda.controller.product_banner.service.ProductBannerImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductBannerImage)表服务实现类
 *
 * @author makejava
 * @since 2020-10-20 18:59:05
 */
@Service("productBannerImageService")
public class ProductBannerImageServiceImpl implements ProductBannerImageService {
    @Resource
    private ProductBannerImageDao productBannerImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pbiId 主键
     * @return 实例对象
     */
    @Override
    public ProductBannerImage queryById(Integer pbiId) {
        return this.productBannerImageDao.queryById(pbiId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductBannerImage> queryAllByLimit(int offset, int limit) {
        return this.productBannerImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productBannerImage 实例对象
     * @return 实例对象
     */
    @Override
    public ProductBannerImage insert(ProductBannerImage productBannerImage) {
        this.productBannerImageDao.insert(productBannerImage);
        return productBannerImage;
    }

    /**
     * 修改数据
     *
     * @param productBannerImage 实例对象
     * @return 实例对象
     */
    @Override
    public ProductBannerImage update(ProductBannerImage productBannerImage) {
        this.productBannerImageDao.update(productBannerImage);
        return this.queryById(productBannerImage.getPbiId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pbiId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pbiId) {
        return this.productBannerImageDao.deleteById(pbiId) > 0;
    }
}