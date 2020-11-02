package com.teenyda.controller.order.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.OrderItem;
import com.teenyda.controller.order.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderItem)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:17
 */
@RestController
@RequestMapping("fruit")
public class OrderItemController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderItemService orderItemService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("order/{id}")
    public ResultBody<OrderItem> selectOne(String id) {
        return responseSuccessJson(this.orderItemService.queryById(id));
    }

    @PostMapping("order/cart")
    public void shoppingCart(@RequestBody OrderItem orderItem) {

    }

    @PostMapping("order/buy")
    public ResultBody<OrderItem> buy(@RequestBody OrderItem orderItem) {
        OrderItem order = orderItemService.insert(orderItem);
        return responseSuccessJson(order);
    }

}