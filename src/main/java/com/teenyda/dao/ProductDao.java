package com.teenyda.dao;

import com.teenyda.controller.product.dto.ProductQueryDto;
import com.teenyda.controller.product.dto.SimpleProductDto;
import com.teenyda.entity.OrderProductDto;
import com.teenyda.entity.Product;
import com.teenyda.entity.ProductCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Product)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:10:52
 */
public interface ProductDao {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    Product queryById(Integer productId);

    OrderProductDto orderProductByIdAndSpec(@Param("productId") int productId, @Param("specId") int specId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Product> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    // @Param("offset") int offset, @Param("limit") int limit
    List<SimpleProductDto> simpleProduct();

    List<SimpleProductDto> queryByCategoryId(@Param("categoryId") Integer categoryId);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    List<Product> queryAll(Product product);

    List<Product> queryByCategory(@Param("categories") List<ProductCategory> categories);


    List<Product> queryByCategoryAndStatus(@Param("categories") List<ProductCategory> categories,@Param("status") Integer status);

    List<Product> query(@Param("query")ProductQueryDto queryDto);
    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int insert(Product product);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Product> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Product> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Product> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Product> entities);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 影响行数
     */
    int update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 影响行数
     */
    int deleteById(Integer productId);

}