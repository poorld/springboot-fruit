package com.teenyda.controller;

import com.teenyda.entity.OrderInfo;
import com.teenyda.service.OrderInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (OrderInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-09 17:10:49
 */
@RestController
@RequestMapping("orderInfo")
public class OrderInfoController {
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
    public OrderInfo selectOne(String id) {
        return this.orderInfoService.queryById(id);
    }

}