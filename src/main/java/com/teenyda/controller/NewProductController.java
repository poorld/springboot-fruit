package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.NewProduct;
import com.teenyda.service.NewProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (NewProduct)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:15
 */
@RestController
@RequestMapping("newProduct")
public class NewProductController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private NewProductService newProductService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<NewProduct> selectOne(Integer id) {
        return responseSuccessJson(this.newProductService.queryById(id));
    }

}