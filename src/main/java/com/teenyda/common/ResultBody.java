package com.teenyda.common;

/**
 * 统一返回格式
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public class ResultBody<T> {

    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private T data;

    public ResultBody(ErrorInfoInterface errorInfo){
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
    }

    public ResultBody(T data){
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.message = GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.data = data;
    }

    public ResultBody(ErrorInfoInterface errorInfo,T data){
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
