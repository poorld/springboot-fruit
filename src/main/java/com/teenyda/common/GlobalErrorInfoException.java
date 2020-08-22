package com.teenyda.common;

/**
 * 全局异常
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public class GlobalErrorInfoException extends Exception {

    private ResponseInfoInterface errorInfo;
    private int code;
    private String message;

    public GlobalErrorInfoException(ResponseInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public GlobalErrorInfoException(ResponseInfoInterface errorInfo, String explain) {
        this.errorInfo = errorInfo;
        // ERROR_FOUND(40006, "文件没有找到 %s"), %s 占位符 explain 额外说明
        this.errorInfo.setExplain(explain);
    }

    public ResponseInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ResponseInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getMessage(){
        return this.errorInfo.getMessage();
    }

    public int getCode() {
        return code;
    }

}
