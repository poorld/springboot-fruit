package com.teenyda.controller.product.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.product.dto.AppProductDto;
import com.teenyda.controller.product.service.ProductService;
import com.teenyda.entity.Product;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-25 17:38
 * @description:
 **/
@RestController
@RequestMapping("v1/fruit")
public class AppProductController extends AbstractApiController {

    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("product/{productId}")
    public ResultBody<AppProductDto> selectOne(@PathVariable("productId")Integer id) {
        Product product = this.productService.queryById(id);
        AppProductDto appProductDto = CloneBeanUtils.copyProperties(product, AppProductDto.class);
        return responseSuccessJson(appProductDto);
    }
}
