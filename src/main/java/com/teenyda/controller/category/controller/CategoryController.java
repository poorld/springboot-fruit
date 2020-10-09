package com.teenyda.controller.category.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.category.exception.CategoryException;
import com.teenyda.controller.category.service.CategoryService;
import com.teenyda.domain.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-06 09:52
 * @description: 商品分类
 **/

@RestController
@RequestMapping("/fruit")
@Slf4j
public class CategoryController extends AbstractApiController {

    @Autowired
    CategoryService service;

    @Autowired
    ProductCategory category;

    @GetMapping("/category/{id}")
    public ResultBody<ProductCategory> getCategory(@PathVariable("id") Integer id) {
        category.setProductCategoryId(id);
        log.info("category", category.getProductCategoryId());
        return responseSuccessJson(service.getCategoryById(category));
    }

    @PostMapping("/category")
    public ResultBody<ProductCategory> addCategory(@RequestBody ProductCategory category) {
        category.setUpdateTime(LocalDateTime.now());
        int i = service.addCategory(category);
        if (i > 0)
            return responseSuccessJson();
        return responseSuccessJson(CategoryException.ERROR);
    }


}
