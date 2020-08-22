package com.teenyda.common;

/**
 * 应用系统界别的错误码
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public enum GlobalResponseInfoEnum implements ResponseInfoInterface {
    SUCCESS(200, "success"),
    ERROR(40001, "%s"),
    NOT_FOUND(40002, "service not found");

    private int code;

    private String message;

    private String explain;

    GlobalResponseInfoEnum(int code, String message){
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

    @Override
    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String getExplain() {
        return explain;
    }
}
