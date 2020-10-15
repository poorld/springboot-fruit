package com.teenyda.controller.tag.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Tag;
import com.teenyda.controller.tag.service.TagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Tag)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:09:23
 */
@RestController
@RequestMapping("fruit")
public class TagController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private TagService tagService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    // @GetMapping("selectOne")
    // public ResultBody<Tag> selectOne(Integer id) {
    //     return responseSuccessJson(this.tagService.queryById(id));
    // }

    @GetMapping("tag")
    public ResultBody<List<Tag>> all() {
        return responseSuccessJson(this.tagService.queryAll(null));
    }

}