package com.teenyda.controller.comments.dto;

import com.teenyda.controller.user.dto.UserDto;
import com.teenyda.entity.User;
import lombok.Data;

import java.util.Date;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-26 19:36
 * @description: 用户评论
 **/
@Data
public class CommentsDto {

    private Integer commentsId;

    // private Integer userId;

    // todo UserDto 居然复制不了，先用User
    private User user;

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

    private Date createTime;
}
