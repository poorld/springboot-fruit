package com.teenyda.controller.product.service;

import com.teenyda.controller.product.dto.ProductQueryDto;
import com.teenyda.controller.product.dto.SimpleProductDto;
import com.teenyda.entity.Product;
import com.teenyda.entity.ProductCategory;

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

    /**
     * 用户app数据列表
     * @param offset
     * @param limit
     * @return
     */
    List<SimpleProductDto> simpleProduct(int offset, int limit);

    SimpleProductDto simpleProductById(int productId);

    List<SimpleProductDto> queryByCategoryId(Integer categoryId);

    List<Product> queryAll();

    List<Product> queryByCategory(List<ProductCategory> productCategories);

    List<Product> query(ProductQueryDto queryDto);
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