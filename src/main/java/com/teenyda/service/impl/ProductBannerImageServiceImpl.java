package com.teenyda.service.impl;

import com.teenyda.dao.ProductBannerImageDao;
import com.teenyda.entity.ProductBannerImage;
import com.teenyda.service.ProductBannerImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductBannerImage)表服务实现类
 *
 * @author makejava
 * @since 2020-10-16 18:20:30
 */
@Service("productBannerImageService")
public class ProductBannerImageServiceImpl implements ProductBannerImageService {
    @Resource
    private ProductBannerImageDao productBannerImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public ProductBannerImage queryById() {
        return this.productBannerImageDao.queryById();
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
        // return this.queryById(productBannerImage.getProductId());
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById() {
        return this.productBannerImageDao.deleteById() > 0;
    }
}