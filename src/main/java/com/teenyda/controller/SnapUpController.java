package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.SnapUp;
import com.teenyda.service.SnapUpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SnapUp)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:20
 */
@RestController
@RequestMapping("snapUp")
public class SnapUpController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private SnapUpService snapUpService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<SnapUp> selectOne(Integer id) {
        return responseSuccessJson(this.snapUpService.queryById(id));
    }

}