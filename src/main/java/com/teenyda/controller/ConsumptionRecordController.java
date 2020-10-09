package com.teenyda.controller;

import com.teenyda.entity.ConsumptionRecord;
import com.teenyda.service.ConsumptionRecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ConsumptionRecord)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:39
 */
@RestController
@RequestMapping("consumptionRecord")
public class ConsumptionRecordController {
    /**
     * 服务对象
     */
    @Resource
    private ConsumptionRecordService consumptionRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ConsumptionRecord selectOne(Integer id) {
        return this.consumptionRecordService.queryById(id);
    }

}