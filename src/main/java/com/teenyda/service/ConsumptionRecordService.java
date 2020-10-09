package com.teenyda.service;

import com.teenyda.entity.ConsumptionRecord;

import java.util.List;

/**
 * (ConsumptionRecord)表服务接口
 *
 * @author makejava
 * @since 2020-10-09 17:10:39
 */
public interface ConsumptionRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param consumptionId 主键
     * @return 实例对象
     */
    ConsumptionRecord queryById(Integer consumptionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ConsumptionRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param consumptionRecord 实例对象
     * @return 实例对象
     */
    ConsumptionRecord insert(ConsumptionRecord consumptionRecord);

    /**
     * 修改数据
     *
     * @param consumptionRecord 实例对象
     * @return 实例对象
     */
    ConsumptionRecord update(ConsumptionRecord consumptionRecord);

    /**
     * 通过主键删除数据
     *
     * @param consumptionId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer consumptionId);

}