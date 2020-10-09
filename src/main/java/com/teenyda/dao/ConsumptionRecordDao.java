package com.teenyda.dao;

import com.teenyda.entity.ConsumptionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ConsumptionRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-09 17:10:39
 */
public interface ConsumptionRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param consumptionId 主键
     * @return 实例对象
     */
    ConsumptionRecord queryById(Integer consumptionId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ConsumptionRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param consumptionRecord 实例对象
     * @return 对象列表
     */
    List<ConsumptionRecord> queryAll(ConsumptionRecord consumptionRecord);

    /**
     * 新增数据
     *
     * @param consumptionRecord 实例对象
     * @return 影响行数
     */
    int insert(ConsumptionRecord consumptionRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ConsumptionRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ConsumptionRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ConsumptionRecord> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ConsumptionRecord> entities);

    /**
     * 修改数据
     *
     * @param consumptionRecord 实例对象
     * @return 影响行数
     */
    int update(ConsumptionRecord consumptionRecord);

    /**
     * 通过主键删除数据
     *
     * @param consumptionId 主键
     * @return 影响行数
     */
    int deleteById(Integer consumptionId);

}