package com.teenyda.controller.sku.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Sku;
import com.teenyda.controller.sku.service.SkuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sku)表控制层
 *
 * @author makejava
 * @since 2020-10-14 19:59:46
 */
@RestController
@RequestMapping("fruit")
public class SkuController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private SkuService skuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    // @GetMapping("selectOne")
    // public ResultBody<Sku> selectOne(Integer id) {
    //     return responseSuccessJson(this.skuService.queryById(id));
    // }

    @GetMapping("sku")
    public ResultBody<List<Sku>> all(Integer id) {
        return responseSuccessJson(this.skuService.queryAllByLimit(0, 100));
    }

}