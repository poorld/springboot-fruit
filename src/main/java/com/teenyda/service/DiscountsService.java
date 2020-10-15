package com.teenyda.service;

import com.teenyda.entity.Discounts;

import java.util.List;

/**
 * (Discounts)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:42
 */
public interface DiscountsService {

    /**
     * 通过ID查询单条数据
     *
     * @param discountsId 主键
     * @return 实例对象
     */
    Discounts queryById(Integer discountsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Discounts> queryAllByLimit(int offset, int limit);


    List<Discounts> queryAll(Discounts discounts);

    /**
     * 新增数据
     *
     * @param discounts 实例对象
     * @return 实例对象
     */
    Discounts insert(Discounts discounts);

    /**
     * 修改数据
     *
     * @param discounts 实例对象
     * @return 实例对象
     */
    Discounts update(Discounts discounts);

    /**
     * 通过主键删除数据
     *
     * @param discountsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer discountsId);

}