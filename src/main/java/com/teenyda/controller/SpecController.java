package com.teenyda.controller;

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
 * @since 2020-10-09 17:10:59
 */
@RestController
@RequestMapping("spec")
public class SpecController {
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
    public Spec selectOne(Integer id) {
        return this.specService.queryById(id);
    }

}