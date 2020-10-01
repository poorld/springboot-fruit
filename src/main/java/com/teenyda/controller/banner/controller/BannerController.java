package com.teenyda.controller.banner.controller;

import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.dao.Banner;
import com.teenyda.mapper.base.BannerBaseMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-01 09:55
 * @description: 幻灯片控制器
 **/
@RestController
@RequestMapping("/fruit")
public class BannerController extends AbstractApiController {

    @GetMapping("/banner")
    public void getFruit(){


    }
}
