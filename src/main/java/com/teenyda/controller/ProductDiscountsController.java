package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.ProductDiscounts;
import com.teenyda.service.ProductDiscountsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ProductDiscounts)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:19
 */
@RestController
@RequestMapping("productDiscounts")
public class ProductDiscountsController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductDiscountsService productDiscountsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<ProductDiscounts> selectOne(Integer id) {
        return responseSuccessJson(this.productDiscountsService.queryById(id));
    }

}