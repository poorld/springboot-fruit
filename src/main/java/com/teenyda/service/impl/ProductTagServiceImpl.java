package com.teenyda.service.impl;

import com.teenyda.dao.ProductTagDao;
import com.teenyda.entity.ProductTag;
import com.teenyda.service.ProductTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductTag)表服务实现类
 *
 * @author makejava
 * @since 2020-10-21 13:48:25
 */
@Service("productTagService")
public class ProductTagServiceImpl implements ProductTagService {
    @Resource
    private ProductTagDao productTagDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @return 实例对象
     */
    @Override
    public ProductTag queryById() {
        return this.productTagDao.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ProductTag> queryAllByLimit(int offset, int limit) {
        return this.productTagDao.queryAllByLimit(offset, limit);
    }

    @Override
    public int updateProductTag(List<ProductTag> productTags,Integer productId) {
        // 先删除全部标签
        int i = this.productTagDao.deleteById(productId);
        if (productTags.size() > 0)
            return this.productTagDao.insertBatch(productTags);

        return i;
    }

    /**
     * 新增数据
     *
     * @param productTag 实例对象
     * @return 实例对象
     */
    @Override
    public ProductTag insert(ProductTag productTag) {
        this.productTagDao.insert(productTag);
        return productTag;
    }

    /**
     * 修改数据
     *
     * @param productTag 实例对象
     * @return 实例对象
     */
    @Override
    public ProductTag update(ProductTag productTag) {
        this.productTagDao.update(productTag);
        // return this.queryById(productTag.get());
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
        // return this.productTagDao.deleteById() > 0;
        return false;
    }
}