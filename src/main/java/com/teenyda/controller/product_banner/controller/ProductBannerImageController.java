package com.teenyda.controller.product_banner.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.ProductBannerImage;
import com.teenyda.controller.product_banner.service.ProductBannerImageService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProductBannerImage)表控制层
 *
 * @author makejava
 * @since 2020-10-20 18:57:41
 */
@RestController
@RequestMapping("fruit")
public class ProductBannerImageController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductBannerImageService productBannerImageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<ProductBannerImage> queryOne(Integer id) {
        return responseSuccessJson(this.productBannerImageService.queryById(id));
    }

    @PostMapping("product/banner")
    public ResultBody<ProductBannerImage> addProductBanner(@RequestBody ProductBannerImage bannerImage) {
        return responseSuccessJson(this.productBannerImageService.insert(bannerImage));
    }

    @PutMapping("product/banner")
    public ResultBody<ProductBannerImage> updateProductBanner(@RequestBody ProductBannerImage bannerImage) {
        return responseSuccessJson(this.productBannerImageService.update(bannerImage));
    }
}