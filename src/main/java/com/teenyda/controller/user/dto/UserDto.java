package com.teenyda.controller.user.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.teenyda.entity.Members;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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

    private Members members;
}
