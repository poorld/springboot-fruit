package com.teenyda.common;

/**
 * 全局异常
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public class GlobalErrorInfoException extends Exception {

    private ErrorInfoInterface errorInfo;
    private int code;
    private String message;

    public GlobalErrorInfoException(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public GlobalErrorInfoException(ErrorInfoInterface errorInfo, String explain) {
        this.errorInfo = errorInfo;
        this.errorInfo.setExplain(explain);
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getMessage(){
        return this.errorInfo.getMessage();
    }

    public int getCode() {
        return code;
    }

}
