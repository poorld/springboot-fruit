package com.teenyda.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:11:00
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 306459186430359308L;

    private Integer userId;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private String image;

    private String qq;

    private String mobile;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date lastLoginTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date registerTime;

    // 会员
    private Members members;

}