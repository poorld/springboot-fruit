package com.teenyda.controller.product_tag.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.ProductTag;
import com.teenyda.service.ProductTagService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductTag)表控制层
 *
 * @author makejava
 * @since 2020-10-21 13:48:26
 */
@RestController
@RequestMapping("fruit")
public class ProductTagController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private ProductTagService productTagService;


    /**
     * 修改商品携带的标签
     * @return
     */
    @PostMapping("product/tag/{productId}")
    public ResultBody<Integer> updateTags(@RequestBody List<ProductTag> tags,@PathVariable("productId") Integer productId) {
        return responseSuccessJson(this.productTagService.updateProductTag(tags, productId));
    }

}