package com.teenyda.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.entity.Comments;
import com.teenyda.service.CommentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Comments)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:06
 */
@RestController
@RequestMapping("comments")
public class CommentsController extends AbstractApiController {
    /**
     * 服务对象
     */
    @Resource
    private CommentsService commentsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResultBody<Comments> selectOne(Integer id) {
        return responseSuccessJson(this.commentsService.queryById(id));
    }

}