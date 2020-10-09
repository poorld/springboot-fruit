package com.teenyda.controller;

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
 * @since 2020-10-09 17:10:38
 */
@RestController
@RequestMapping("comments")
public class CommentsController {
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
    public Comments selectOne(Integer id) {
        return this.commentsService.queryById(id);
    }

}