package com.teenyda.controller.spec.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Spec;
import com.teenyda.controller.spec.service.SpecService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Spec)表控制层
 * 规格
 * @author makejava
 * @since 2020-10-09 20:17:21
 */
@RestController
@RequestMapping("fruit")
public class SpecController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private SpecService specService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("spec")
    public ResultBody<Spec> selectOne(Integer id) {
        return responseSuccessJson(this.specService.queryById(id));
    }

    @PostMapping("spec")
    public ResultBody<Spec> insert(@RequestBody Spec spec) {
        return responseSuccessJson(this.specService.insert(spec));
    }

    @PutMapping("spec")
    public ResultBody<Spec> update(@RequestBody Spec spec) {
        return responseSuccessJson(this.specService.update(spec));
    }

    @DeleteMapping("spec/{id}")
    public ResultBody<Boolean> delete(@PathVariable("id") Integer id) {
        return responseSuccessJson(this.specService.deleteById(id));
    }

}