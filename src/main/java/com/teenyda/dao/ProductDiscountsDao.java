package com.teenyda.dao;

import com.teenyda.entity.ProductDiscounts;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ProductDiscounts)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:10:55
 */
public interface ProductDiscountsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param productId 主键
     * @return 实例对象
     */
    List<ProductDiscounts> queryById(Integer productId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ProductDiscounts> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param productDiscounts 实例对象
     * @return 对象列表
     */
    List<ProductDiscounts> queryAll(ProductDiscounts productDiscounts);

    /**
     * 新增数据
     *
     * @param productDiscounts 实例对象
     * @return 影响行数
     */
    int insert(ProductDiscounts productDiscounts);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductDiscounts> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductDiscounts> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductDiscounts> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductDiscounts> entities);

    /**
     * 修改数据
     *
     * @param productDiscounts 实例对象
     * @return 影响行数
     */
    int update(ProductDiscounts productDiscounts);

    /**
     * 通过主键删除数据
     *
     * @param productId 主键
     * @return 影响行数
     */
    int deleteById(Integer productId);

    /**
     * 根据产品id删除全部用户优惠
     * @param productId
     * @return
     */
    int deleteUserPDbyProductId(Integer productId);

    /**
     * 根据产品id删除全部会员优惠
     * @param productId
     * @return
     */
    int deleteMembersPDbyProductId(Integer productId);

}