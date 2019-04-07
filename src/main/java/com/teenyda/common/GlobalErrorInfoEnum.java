package com.teenyda.common;

/**
 * 应用系统界别的错误码
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS(0, "success"),
    NOT_FOUND(-1, "service not found")
    ;

    private int code;

    private String message;

    GlobalErrorInfoEnum(int code,String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
