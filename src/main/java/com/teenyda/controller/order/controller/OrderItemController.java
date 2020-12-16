package com.teenyda.controller.order.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.constant.OrderTypeEnum;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.order.dto.SettlementOrder;
import com.teenyda.entity.OrderInfo;
import com.teenyda.entity.OrderItem;
import com.teenyda.controller.order.service.OrderItemService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (OrderItem)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:17
 *
 * 下订单、加入购物车
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
    @GetMapping("order/{orderNum}")
    public ResultBody<SettlementOrder> selectOne(@PathVariable("orderNum") String orderNum) {
        return responseSuccessJson(this.orderItemService.queryByOrderNum(orderNum));
    }

    /**
     * 购物车订单
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("cart/order/{orderNum}")
    public ResultBody<List<SettlementOrder>> queryCartOrder(@PathVariable("orderNum") String orderNum) {
        return responseSuccessJson(this.orderItemService.queryCartOrder(orderNum));
    }

    @GetMapping("order/cart/{userId}")
    public ResultBody<List<OrderInfo>> queryCart(@PathVariable("userId") Integer userId) {
        return responseSuccessJson(this.orderItemService.queryCart(userId));
    }

    /**
     * 添加购物车
     * @param orderItem
     */
    @PostMapping("order/cart")
    public ResultBody<OrderItem> shoppingCart(@RequestBody OrderItem orderItem) {
        OrderItem order = orderItemService.insert(orderItem, OrderTypeEnum.Cart.getOrderType());
        return responseSuccessJson(order);
    }

    /**
     * 购买 确定
     * @param orderItem
     * @return
     */
    @PostMapping("order/buy")
    public ResultBody<OrderItem> buy(@RequestBody OrderItem orderItem) {
        OrderItem order = orderItemService.insert(orderItem, OrderTypeEnum.Order.getOrderType());
        return responseSuccessJson(order);
    }

    /**
     * 购物车 确定
     * @param orderItem
     * @return
     */
    @PostMapping("cart/buy")
    public ResultBody<OrderInfo> cartBuy(@RequestBody List<OrderItem> orderItem) {
        OrderInfo order = orderItemService.updateCart(orderItem);
        return responseSuccessJson(order);
    }

}