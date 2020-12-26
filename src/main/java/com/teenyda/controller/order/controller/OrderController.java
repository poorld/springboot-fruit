package com.teenyda.controller.order.controller;

import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.ResultBody;
import com.teenyda.constant.OrderStatusEnum;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.order.dto.ProductSales;
import com.teenyda.controller.order.service.OrderInfoService;
import com.teenyda.controller.order.service.OrderItemService;
import com.teenyda.entity.Order;
import com.teenyda.entity.OrderInfo;
import com.teenyda.entity.OrderPayment;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-09 10:11
 * @description: 订单查询、购物车查询
 **/
@RestController
@RequestMapping("fruit")
public class OrderController extends AbstractApiController {

    /**
     * 服务对象
     */
    @Resource
    private OrderItemService orderItemService;
    @Resource
    private OrderInfoService orderInfoService;

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

    @GetMapping("order/sales/{productCategoryId}")
    public ResultBody<ProductSales> getSales(@PathVariable("productCategoryId") Integer productCategoryId) {
        return responseSuccessJson(this.orderInfoService.queryOrderSalesByCategoryId(productCategoryId));
    }

    @GetMapping("order/query")
    public ResultBody<List<OrderInfo>> queryOrder() {
        return responseSuccessJson(this.orderItemService.queryAllOrder());
    }

    /**
     * 更新订单
     * @return
     */
    @PutMapping("order")
    public ResultBody<OrderInfo> updateContact(@RequestBody OrderInfo orderInfo) {
        return responseSuccessJson(this.orderInfoService.update(orderInfo));
    }

    /**
     * 发现已经写过了payment/finish/{orderNum}
     * 暂时不要这个接口
     * @param orderPayment
     * @return
     * @throws GlobalErrorInfoException
     */
    @PostMapping("order/timeout")
    public ResultBody<OrderInfo> orderTimeout(@RequestBody OrderPayment orderPayment) throws GlobalErrorInfoException {
        OrderInfo orderInfo = this.orderInfoService.changeOrderStatus(orderPayment.getOrderNum(), OrderStatusEnum.PayOvertime.getOrderStatus());
        return responseSuccessJson(orderInfo);
    }

}
