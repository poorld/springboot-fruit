package com.teenyda.controller;

import com.teenyda.entity.OrderItem;
import com.teenyda.service.OrderItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (OrderItem)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:51
 */
@RestController
@RequestMapping("orderItem")
public class OrderItemController {
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
    @GetMapping("selectOne")
    public OrderItem selectOne(String id) {
        return this.orderItemService.queryById(id);
    }

}