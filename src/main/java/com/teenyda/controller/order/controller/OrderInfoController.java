package com.teenyda.controller.order.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.OrderInfo;
import com.teenyda.controller.order.service.OrderInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (OrderInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:16
 */
@RestController
@RequestMapping("orderInfo")
public class OrderInfoController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private OrderInfoService orderInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<OrderInfo> selectOne(String id) {
        return responseSuccessJson(this.orderInfoService.queryById(id));
    }

}