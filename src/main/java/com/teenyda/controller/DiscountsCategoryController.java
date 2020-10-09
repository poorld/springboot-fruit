package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
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
 * @since 2020-10-09 20:17:12
 */
@RestController
@RequestMapping("discountsCategory")
public class DiscountsCategoryController extends AbstractApiController {
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
    public ResultBody<DiscountsCategory> selectOne(Integer id) {
        return responseSuccessJson(this.discountsCategoryService.queryById(id));
    }

}