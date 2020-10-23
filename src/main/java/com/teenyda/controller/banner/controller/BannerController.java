package com.teenyda.controller.banner.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.banner.dto.BannerDto;
import com.teenyda.entity.Banner;
import com.teenyda.service.BannerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Banner)表控制层
 *
 * @author makejava
 * @since 2020-10-09 16:52:17
 */
@RestController
@RequestMapping("fruit")
public class BannerController extends AbstractApiController {
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
    @GetMapping("banner")
    public ResultBody<Banner> selectBanner(Integer id) {
        return responseSuccessJson(this.bannerService.queryById(id));
    }

    @GetMapping("banner/all")
    public ResultBody<List<Banner>> getBanners() {
        return responseSuccessJson(this.bannerService.queryAllByLimit(0, 100));
    }

    @PostMapping("banner")
    public ResultBody<Banner> insertBanner(@RequestBody Banner banner) {
        return responseSuccessJson(this.bannerService.insert(banner));
    }

    @PutMapping("banner")
    public ResultBody<Banner> updateBanner(@RequestBody Banner banner) {
        return responseSuccessJson(this.bannerService.update(banner));
    }

    @DeleteMapping("banne/{bannerId}")
    public ResultBody<Boolean> updateBanner(@PathVariable("bannerId") Integer bannerId) {
        return responseSuccessJson(this.bannerService.deleteById(bannerId));
    }


}