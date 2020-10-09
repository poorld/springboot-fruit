package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Spec;
import com.teenyda.service.SpecService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Spec)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:21
 */
@RestController
@RequestMapping("spec")
public class SpecController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private SpecService specService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<Spec> selectOne(Integer id) {
        return responseSuccessJson(this.specService.queryById(id));
    }

}