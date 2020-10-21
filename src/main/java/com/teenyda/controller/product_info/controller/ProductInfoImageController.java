package com.teenyda.controller.product_info.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.ProductInfoImage;
import com.teenyda.controller.product_info.service.ProductInfoImageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductInfoImage)表控制层
 *
 * @author makejava
 * @since 2020-10-21 09:55:25
 */
@RestController
@RequestMapping("fruit")
public class ProductInfoImageController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductInfoImageService productInfoImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("product/info")
    public ResultBody<ProductInfoImage> selectProductInfo(Integer id) {
        return responseSuccessJson(this.productInfoImageService.queryById(id));
    }

    @PostMapping("product/info")
    public ResultBody<ProductInfoImage> insert(@RequestBody ProductInfoImage infoImage) {
        return responseSuccessJson(this.productInfoImageService.insert(infoImage));
    }

    @PutMapping("product/info")
    public ResultBody<ProductInfoImage> update(@RequestBody ProductInfoImage infoImage) {
        return responseSuccessJson(this.productInfoImageService.update(infoImage));
    }

    @PutMapping("product/info/sort")
    public ResultBody<Integer> update(@RequestBody List<ProductInfoImage> infoImages) {
        return responseSuccessJson(this.productInfoImageService.updateSort(infoImages));
    }

    @DeleteMapping("product/info/{id}")
    public ResultBody<Boolean> delete(@PathVariable("id") Integer id) {
        return responseSuccessJson(this.productInfoImageService.deleteById(id));
    }


}