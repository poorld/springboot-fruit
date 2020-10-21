package com.teenyda.controller.product_discounts.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.ProductDiscounts;
import com.teenyda.service.ProductDiscountsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ProductDiscounts)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:19
 */
@RestController
@RequestMapping("fruit")
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
    /*@GetMapping("product/discounts/{productId}")
    public ResultBody<ProductDiscounts> selectOne(@PathVariable("productId") Integer id) {
        return responseSuccessJson(this.productDiscountsService.queryById(id));
    }*/

    /**
     * 更新用户优惠
     * @param pds
     * @param id
     * @return
     */
    @PostMapping("product/user/discounts/{productId}")
    public ResultBody<Integer> updateUserDiscounts(@RequestBody List<ProductDiscounts> pds, @PathVariable("productId") Integer productId) {
        return responseSuccessJson(this.productDiscountsService.updateUserDiscounts(pds, productId));
    }

    /**
     * 更新会员优惠
     * @param pds
     * @param id
     * @return
     */
    @PostMapping("product/user/discounts/{productId}")
    public ResultBody<Integer> updateMembersDiscounts(@RequestBody List<ProductDiscounts> pds, @PathVariable("productId") Integer productId) {
        return responseSuccessJson(this.productDiscountsService.updateMemberDiscounts(pds, productId));
    }

}