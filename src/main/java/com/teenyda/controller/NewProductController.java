package com.teenyda.controller;

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
 * @since 2020-10-09 17:10:47
 */
@RestController
@RequestMapping("newProduct")
public class NewProductController {
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
    public NewProduct selectOne(Integer id) {
        return this.newProductService.queryById(id);
    }

}