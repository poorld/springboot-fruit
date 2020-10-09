package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
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
 * @since 2020-10-09 20:17:08
 */
@RestController
@RequestMapping("consumptionRecord")
public class ConsumptionRecordController extends AbstractApiController {
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
    public ResultBody<ConsumptionRecord> selectOne(Integer id) {
        return responseSuccessJson(this.consumptionRecordService.queryById(id));
    }

}