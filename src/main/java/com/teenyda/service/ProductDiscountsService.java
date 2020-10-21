package com.teenyda.service;

import com.teenyda.entity.ProductDiscounts;

import java.util.List;

/**
 * (ProductDiscounts)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:55
 */
public interface ProductDiscountsService {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    List<ProductDiscounts> queryById(Integer productId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductDiscounts> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productDiscounts 实例对象
     * @return 实例对象
     */
    ProductDiscounts insert(ProductDiscounts productDiscounts);

    /**
     * 修改用户优惠
     *
     * @param productDiscounts 实例对象
     * @param productId
     * @return 实例对象
     */
    Integer updateUserDiscounts(List<ProductDiscounts> productDiscounts, Integer productId);

    /**
     * 修改会员
     * @param productDiscounts
     * @param productId
     * @return
     */
    Integer updateMemberDiscounts(List<ProductDiscounts> productDiscounts, Integer productId);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer productId);

}