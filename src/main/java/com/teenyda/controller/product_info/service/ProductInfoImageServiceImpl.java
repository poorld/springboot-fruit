package com.teenyda.controller.product_info.service;

import com.teenyda.dao.ProductInfoImageDao;
import com.teenyda.entity.ProductInfoImage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductInfoImage)表服务实现类
 *
 * @author makejava
 * @since 2020-10-21 09:57:13
 */
@Service("productInfoImageService")
public class ProductInfoImageServiceImpl implements ProductInfoImageService {
    @Resource
    private ProductInfoImageDao productInfoImageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param piiId 主键
     * @return 实例对象
     */
    @Override
    public ProductInfoImage queryById(Integer piiId) {
        return this.productInfoImageDao.queryById(piiId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductInfoImage> queryAllByLimit(int offset, int limit) {
        return this.productInfoImageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productInfoImage 实例对象
     * @return 实例对象
     */
    @Override
    public ProductInfoImage insert(ProductInfoImage productInfoImage) {
        this.productInfoImageDao.insert(productInfoImage);
        return productInfoImage;
    }

    /**
     * 修改数据
     *
     * @param productInfoImage 实例对象
     * @return 实例对象
     */
    @Override
    public ProductInfoImage update(ProductInfoImage productInfoImage) {
        this.productInfoImageDao.update(productInfoImage);
        return this.queryById(productInfoImage.getPiiId());
    }


    /**
     * 修改排序
     *
     * @param productInfoImage 实例对象
     * @return 实例对象
     */
    @Override
    public Integer updateSort(List<ProductInfoImage> productInfoImage) {
        return this.productInfoImageDao.insertOrUpdateBatch(productInfoImage);
        // return this.queryById(productInfoImage.getPiiId());
    }

    /**
     * 通过主键删除数据
     *
     * @param piiId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer piiId) {
        return this.productInfoImageDao.deleteById(piiId) > 0;
    }
}