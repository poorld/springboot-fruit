package com.teenyda.service.impl;

import com.teenyda.dao.ConsumptionRecordDao;
import com.teenyda.entity.ConsumptionRecord;
import com.teenyda.service.ConsumptionRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ConsumptionRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-10-09 17:10:39
 */
@Service("consumptionRecordService")
public class ConsumptionRecordServiceImpl implements ConsumptionRecordService {
    @Resource
    private ConsumptionRecordDao consumptionRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param consumptionId 主键
     * @return 实例对象
     */
    @Override
    public ConsumptionRecord queryById(Integer consumptionId) {
        return this.consumptionRecordDao.queryById(consumptionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ConsumptionRecord> queryAllByLimit(int offset, int limit) {
        return this.consumptionRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param consumptionRecord 实例对象
     * @return 实例对象
     */
    @Override
    public ConsumptionRecord insert(ConsumptionRecord consumptionRecord) {
        this.consumptionRecordDao.insert(consumptionRecord);
        return consumptionRecord;
    }

    /**
     * 修改数据
     *
     * @param consumptionRecord 实例对象
     * @return 实例对象
     */
    @Override
    public ConsumptionRecord update(ConsumptionRecord consumptionRecord) {
        this.consumptionRecordDao.update(consumptionRecord);
        return this.queryById(consumptionRecord.getConsumptionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param consumptionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer consumptionId) {
        return this.consumptionRecordDao.deleteById(consumptionId) > 0;
    }
}