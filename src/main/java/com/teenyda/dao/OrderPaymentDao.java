package com.teenyda.dao;

import com.teenyda.entity.OrderPayment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (OrderPayment)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-07 10:44:08
 */
public interface OrderPaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param orderPaymentId 主键
     * @return 实例对象
     */
    OrderPayment queryById(Integer orderPaymentId);
    OrderPayment queryByOrderNum(@Param("orderNum")String orderNum);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderPayment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderPayment 实例对象
     * @return 对象列表
     */
    List<OrderPayment> queryAll(OrderPayment orderPayment);

    /**
     * 新增数据
     *
     * @param orderPayment 实例对象
     * @return 影响行数
     */
    int insert(OrderPayment orderPayment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderPayment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderPayment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderPayment> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderPayment> entities);

    /**
     * 修改数据
     *
     * @param orderPayment 实例对象
     * @return 影响行数
     */
    int update(OrderPayment orderPayment);

    /**
     * 通过主键删除数据
     *
     * @param orderPaymentId 主键
     * @return 影响行数
     */
    int deleteById(Integer orderPaymentId);

}