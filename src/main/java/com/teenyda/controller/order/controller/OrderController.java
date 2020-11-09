package com.teenyda.controller.order.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.order.service.OrderItemService;
import com.teenyda.entity.Order;
import com.teenyda.entity.OrderInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-09 10:11
 * @description: 订单查询
 **/
@RestController
@RequestMapping("fruit")
public class OrderController extends AbstractApiController {

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
    /*@GetMapping("order")
    public ResultBody<SettlementOrder> selectOne(@PathVariable("orderNum") String orderNum) {
        return responseSuccessJson(this.orderItemService.queryByOrderNum(orderNum));
    }*/

    @GetMapping("order/item/{userId}")
    public ResultBody<List<OrderInfo>> allOrder(@PathVariable("userId") Integer userId) {
        return responseSuccessJson(this.orderItemService.queryAllOrder(userId));
    }

    @GetMapping("order/item/{userId}/status/{status}")
    public ResultBody<List<OrderInfo>> allOrder(@PathVariable("userId") Integer userId,
                                                @PathVariable("status") Integer status) {
        return responseSuccessJson(this.orderItemService.queryByStatus(userId, status));
    }

    @GetMapping("order/item/{userId}/{orderNum}")
    public ResultBody<OrderInfo> allOrder(@PathVariable("userId") Integer userId,
                                            @PathVariable("orderNum") String orderNum) {
        return responseSuccessJson(this.orderItemService.queryOrderByNumber(userId, orderNum));
    }
}
