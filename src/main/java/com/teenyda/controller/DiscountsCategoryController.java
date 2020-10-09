package com.teenyda.controller;

import com.teenyda.entity.DiscountsCategory;
import com.teenyda.service.DiscountsCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (DiscountsCategory)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:44
 */
@RestController
@RequestMapping("discountsCategory")
public class DiscountsCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private DiscountsCategoryService discountsCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DiscountsCategory selectOne(Integer id) {
        return this.discountsCategoryService.queryById(id);
    }

}