package com.teenyda.common;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public class ResultUtil {

    public static <T>  ResultBody<T> success(ResponseInfoInterface errorInfo) {
        return success(errorInfo, null);
    }

    public static <T> ResultBody<T> success(ResponseInfoInterface errorInfo, T data) {
        return new ResultBody<>(errorInfo,data);
    }

    public static <T> ResultBody<T> error(ResponseInfoInterface errorInfo){
        return new ResultBody<>(errorInfo);
    }

    public static <T> ResultBody<T> error(ResponseInfoInterface errorInfo, String explain){
        errorInfo.setExplain(explain);
        return new ResultBody<>(errorInfo);
    }

}
