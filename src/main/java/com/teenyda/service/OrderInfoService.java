package com.teenyda.service;

import com.teenyda.entity.OrderInfo;

import java.util.List;

/**
 * (OrderInfo)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:48
 */
public interface OrderInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderNum 主键
     * @return 实例对象
     */
    OrderInfo queryById(String orderNum);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderInfo 实例对象
     * @return 实例对象
     */
    OrderInfo insert(OrderInfo orderInfo);

    /**
     * 修改数据
     *
     * @param orderInfo 实例对象
     * @return 实例对象
     */
    OrderInfo update(OrderInfo orderInfo);

    /**
     * 通过主键删除数据
     *
     * @param orderNum 主键
     * @return 是否成功
     */
    boolean deleteById(String orderNum);

}