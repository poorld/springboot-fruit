package com.teenyda.controller.discounts.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Discounts;
import com.teenyda.entity.DiscountsCategory;
import com.teenyda.service.DiscountsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Discounts)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:11
 */
@RestController
@RequestMapping("fruit")
public class DiscountsController extends AbstractApiController {
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
    @GetMapping("discounts/{id}")
    public ResultBody<Discounts> selectOne(@PathVariable("id")Integer id) {
        return responseSuccessJson(this.discountsService.queryById(id));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("discounts")
    public ResultBody<List<Discounts>> discounts() {
        return responseSuccessJson(this.discountsService.queryAllByLimit(0, 100));
    }

    @PostMapping("discounts")
    public ResultBody<Discounts> add(@RequestBody Discounts discounts) {
        return responseSuccessJson(this.discountsService.insert(discounts));
    }

    @PutMapping("discounts")
    public ResultBody<Discounts> update(@RequestBody Discounts discounts) {
        return responseSuccessJson(this.discountsService.insert(discounts));
    }


    @DeleteMapping("discounts/{discountsId}")
    public ResultBody<Boolean> delete(@RequestBody @PathVariable("discountsId")Integer discountsId) {
        return responseSuccessJson(this.discountsService.deleteById(discountsId));
    }
}