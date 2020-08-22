package com.teenyda.common;

import lombok.ToString;
import org.springframework.util.StringUtils;

/**
 * 统一返回格式
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
@ToString
public class ResultBody<T> {

    /**
     * 响应码
     */
    private int code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应结果
     */
    private T data;

    public ResultBody(){
        this.code = GlobalResponseInfoEnum.SUCCESS.getCode();
        this.msg = GlobalResponseInfoEnum.SUCCESS.getMessage();
        this.data = null;
    }

    public ResultBody(ResponseInfoInterface errorInfo){
        this.code = errorInfo.getCode();
        this.msg = errorInfo.getMessage();
        String explain = errorInfo.getExplain();
        if (!StringUtils.isEmpty(explain)) {
            // ERROR_FOUND(40006, "文件没有找到 %s"), %s 占位符 explain 额外说明
            this.msg = String.format(this.msg, explain);
        }
    }

    /**
     * 默认返回success
     * @param data
     */
    public ResultBody(T data){
        this.code = GlobalResponseInfoEnum.SUCCESS.getCode();
        this.msg = GlobalResponseInfoEnum.SUCCESS.getMessage();
        this.data = data;
    }

    public ResultBody(ResponseInfoInterface errorInfo, T data){
        this.code = errorInfo.getCode();
        this.msg = errorInfo.getMessage();
        this.data = data;
    }

    public ResultBody(GlobalErrorInfoException errorInfo) {
        this.code = errorInfo.getCode();
        this.msg = errorInfo.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
