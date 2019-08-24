package com.teenyda.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalErrorInfoHandler.class);

    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody globalErrorInfoHandler(HttpServletRequest req,GlobalErrorInfoException e){
        LOGGER.error(e.getMessage());
        ResultBody resultBody = ResultUtil.error(e.getErrorInfo());
        return resultBody;
    }

    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ResultBody requestMethodNotSupport(HttpServletRequest req,HttpRequestMethodNotSupportedException e) {
        LOGGER.error(e.getMessage());
        ResultBody error = ResultUtil.error(GlobalErrorInfoEnum.ERROR, e.getMessage());
        return error;
    }
}
