package com.teenyda.dao;

import com.teenyda.controller.order.dto.ProductSales;
import com.teenyda.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (OrderInfo)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:10:48
 */
public interface OrderInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderNum 主键
     * @return 实例对象
     */
    OrderInfo queryById(String orderNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderInfo 实例对象
     * @return 对象列表
     */
    List<OrderInfo> queryAll(OrderInfo orderInfo);

    /**
     * 新增数据
     *
     * @param orderInfo 实例对象
     * @return 影响行数
     */
    int insert(OrderInfo orderInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderInfo> entities);

    /**
     * 修改数据
     *
     * @param orderInfo 实例对象
     * @return 影响行数
     */
    int update(OrderInfo orderInfo);

    /**
     * 通过主键删除数据
     *
     * @param orderNum 主键
     * @return 影响行数
     */
    int deleteById(String orderNum);

    /**
     * 根据分类获取当月销售额
     * @param productCategoryId
     * @return
     */
    ProductSales productSales(@Param("productCategoryId") int productCategoryId);

}