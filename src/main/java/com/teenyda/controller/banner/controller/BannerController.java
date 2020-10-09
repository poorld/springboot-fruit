package com.teenyda.controller.banner.controller;

import com.teenyda.entity.Banner;
import com.teenyda.service.BannerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Banner)表控制层
 *
 * @author makejava
 * @since 2020-10-09 16:52:17
 */
@RestController
@RequestMapping("banner")
public class BannerController {
    /**
     * 服务对象
     */
    @Resource
    private BannerService bannerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Banner selectOne(Integer id) {
        return this.bannerService.queryById(id);
    }

}