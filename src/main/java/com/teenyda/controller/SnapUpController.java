package com.teenyda.controller;

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
 * @since 2020-10-09 17:10:57
 */
@RestController
@RequestMapping("snapUp")
public class SnapUpController {
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
    public SnapUp selectOne(Integer id) {
        return this.snapUpService.queryById(id);
    }

}