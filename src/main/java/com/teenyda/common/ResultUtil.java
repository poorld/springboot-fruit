package com.teenyda.common;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public class ResultUtil {

    public static ResultBody success(ErrorInfoInterface errorInfo) {
        return success(errorInfo, null);
    }

    public static<T> ResultBody success(ErrorInfoInterface errorInfo,T data) {
        ResultBody resultBody = new ResultBody(errorInfo,data);
        return resultBody;
    }

    public static ResultBody error(ErrorInfoInterface errorInfo){
        ResultBody resultBody = new ResultBody(errorInfo);
        return resultBody;
    }


}
