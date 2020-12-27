package com.teenyda.controller.comments.controller;

import com.teenyda.common.ResultBody;
import com.teenyda.controller.api.AbstractApiController;
import com.teenyda.controller.comments.dto.CommentsDto;
import com.teenyda.controller.comments.dto.CommentsDto1;
import com.teenyda.entity.Comments;
import com.teenyda.service.CommentsService;
import com.teenyda.utils.CloneBeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Comments)表控制层
 *
 * @author makejava
 * @since 2020-10-09 20:17:06
 */
@RestController
@RequestMapping("fruit")
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
    @GetMapping("comments/{commentsId}")
    public ResultBody<Comments> selectOne(@PathVariable("commentsId")Integer id) {
        return responseSuccessJson(this.commentsService.queryById(id));
    }

    @GetMapping("comments/product/{productId}")
    public ResultBody<List<CommentsDto>> commentsByProductId(@PathVariable("productId")Integer id) {
        List<Comments> comments = this.commentsService.queryByProductId(id);
        return responseSuccessJson(CloneBeanUtils.copyListProperties(comments, CommentsDto::new));
    }

    @GetMapping("comments/product/{productId}/best")
    public ResultBody<Comments> bestCommentsByProductId(@PathVariable("productId")Integer id) {
        return responseSuccessJson(this.commentsService.bestCommentsByProductId(id));
    }

    /**
     * 评论商品
     * @param comments
     * @return
     */
    @PostMapping("comments/product")
    public ResultBody<CommentsDto1> commentProduct(@RequestBody CommentsDto1 comments) {
        comments.setCreateTime(new Date());
        return responseSuccessJson(this.commentsService.insert(comments));
    }
}