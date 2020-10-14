package com.teenyda.controller.discounts_category;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.DiscountsCategory;
import com.teenyda.service.DiscountsCategoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (DiscountsCategory)表控制层
 * 优惠类型
 * @author makejava
 * @since 2020-10-09 20:17:12
 */
@RestController
@RequestMapping("fruit")
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
    // @GetMapping("selectOne")
    // public ResultBody<DiscountsCategory> selectOne(Integer id) {
    //     return responseSuccessJson(this.discountsCategoryService.queryById(id));
    // }

    /**
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("discountsCategory")
    public ResultBody<List<DiscountsCategory>> all() {
        return responseSuccessJson(this.discountsCategoryService.queryAllByLimit(0, 100));
    }



}