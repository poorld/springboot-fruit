package com.teenyda.service;

import com.teenyda.entity.SnapUp;

import java.util.List;

/**
 * (SnapUp)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:57
 */
public interface SnapUpService {

    /**
     * 通过ID查询单条数据
     *
     * @param snapUpId 主键
     * @return 实例对象
     */
    SnapUp queryById(Integer snapUpId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SnapUp> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param snapUp 实例对象
     * @return 实例对象
     */
    SnapUp insert(SnapUp snapUp);

    /**
     * 修改数据
     *
     * @param snapUp 实例对象
     * @return 实例对象
     */
    SnapUp update(SnapUp snapUp);

    /**
     * 通过主键删除数据
     *
     * @param snapUpId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer snapUpId);

}