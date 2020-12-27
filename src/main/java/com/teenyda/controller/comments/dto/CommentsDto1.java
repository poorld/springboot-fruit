package com.teenyda.controller.comments.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.teenyda.entity.User;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-12-27 14:54
 * @description: 用户评论
 **/
@Data
public class CommentsDto1 {

    private Integer commentsId;

    private Integer userId;

    private Integer productId;

    private String content;

    private String img1;

    private String img2;

    private String img3;
    /**
     * 0未审核 1审核通过
     */
    private Integer audit;
    /**
     * 商家回复
     */
    private String reply;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;
}
