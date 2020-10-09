package com.teenyda.controller;

import com.teenyda.entity.Discounts;
import com.teenyda.service.DiscountsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Discounts)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:42
 */
@RestController
@RequestMapping("discounts")
public class DiscountsController {
    /**
     * 服务对象
     */
    @Resource
    private DiscountsService discountsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Discounts selectOne(Integer id) {
        return this.discountsService.queryById(id);
    }

}