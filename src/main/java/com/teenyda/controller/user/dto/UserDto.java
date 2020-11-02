package com.teenyda.controller.user.dto;

import com.teenyda.entity.Members;
import lombok.Data;

import java.util.Date;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-10-26 19:38
 * @description:
 **/
@Data
public class UserDto {
    private Integer userId;

    private String username;

    // private String password;

    private String nickname;

    // private String email;

    private String image;

    // private String qq;

    private String mobile;

    private Date lastLoginTime;

    private Date registerTime;

    private Members members;
}
