package com.teenyda.controller.order.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.order.dto.OrderPaymentReq;
import com.teenyda.entity.OrderPayment;
import com.teenyda.service.OrderPaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OrderPayment)表控制层
 *
 * @author makejava
 * @since 2020-11-07 10:42:35
 */
@RestController
@RequestMapping("fruit")
public class OrderPaymentController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderPaymentService orderPaymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("order/payment")
    public ResultBody<OrderPayment> selectOne(Integer id) {
        return responseSuccessJson(this.orderPaymentService.queryById(id));
    }

    @PostMapping("order/payment")
    public ResultBody<OrderPayment> orderPayment(@RequestBody OrderPaymentReq orderPaymentReq) {
        return responseSuccessJson(this.orderPaymentService.payment(orderPaymentReq));
    }

}