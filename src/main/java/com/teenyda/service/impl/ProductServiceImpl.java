package com.teenyda.service.impl;

import com.teenyda.dao.ProductDao;
import com.teenyda.entity.Product;
import com.teenyda.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Product)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:52
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    @Override
    public Product queryById(Integer productId) {
        return this.productDao.queryById(productId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Product> queryAllByLimit(int offset, int limit) {
        return this.productDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<Product> queryAll() {
        return this.productDao.queryAll(null);
    }

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product insert(Product product) {
        this.productDao.insert(product);
        return product;
    }

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    @Override
    public Product update(Product product) {
        this.productDao.update(product);
        return this.queryById(product.getProductId());
    }

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer productId) {
        return this.productDao.deleteById(productId) > 0;
    }
}