package com.teenyda.service;

import com.teenyda.entity.Spec;

import java.util.List;

/**
 * (Spec)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:58
 */
public interface SpecService {

    /**
     * 通过ID查询单条数据
     *
     * @param specId 主键
     * @return 实例对象
     */
    Spec queryById(Integer specId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Spec> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param spec 实例对象
     * @return 实例对象
     */
    Spec insert(Spec spec);

    /**
     * 修改数据
     *
     * @param spec 实例对象
     * @return 实例对象
     */
    Spec update(Spec spec);

    /**
     * 通过主键删除数据
     *
     * @param specId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer specId);

}