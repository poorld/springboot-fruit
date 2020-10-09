package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.ProductCategory;
import com.teenyda.service.ProductCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ProductCategory)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:18
 */
@RestController
@RequestMapping("productCategory")
public class ProductCategoryController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<ProductCategory> selectOne(Integer id) {
        return responseSuccessJson(this.productCategoryService.queryById(id));
    }

}