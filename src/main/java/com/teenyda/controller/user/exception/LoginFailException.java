package com.teenyda.controller.user.exception;

import com.teenyda.common.ResponseInfoInterface;

/**
 * @program: personal_information
 * @author: Teenyda
 * @create: 2020-11-11 13:12
 * @description:
 **/
public enum  LoginFailException implements ResponseInfoInterface {

    USERNAME_PASSWORD_ERR(30001, "用户名或密码错误!"),
    USER_NOT_EXIST(30002, "用户不存在!"),
    USER_EXIST(30003, "用户名已存在!");

    private String desc;
    private int code;

    LoginFailException(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return desc;
    }

    @Override
    public void setExplain(String explain) {

    }


    @Override
    public String getExplain() {
        return null;
    }
}
