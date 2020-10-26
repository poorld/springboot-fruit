package com.teenyda.entity;

import lombok.Data;

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

    private Date lastLoginTime;

    private Date registerTime;



}