package com.teenyda.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一异常处理
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
@RestControllerAdvice
@ResponseBody
public class GlobalErrorInfoHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalErrorInfoHandler.class);

    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody<String> globalErrorInfoHandler(HttpServletRequest req,GlobalErrorInfoException e){
        LOGGER.error(e.getMessage());
        return ResultUtil.error(e.getErrorInfo());
    }

    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ResultBody<String>  requestMethodNotSupport(HttpServletRequest req,HttpRequestMethodNotSupportedException e) {
        LOGGER.error(e.getMessage());
        return ResultUtil.error(GlobalResponseInfoEnum.ERROR, e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    public ResultBody<String> otherErrorInfoHandler(Exception e) {
        LOGGER.error(e.getMessage());
        return ResultUtil.error(GlobalResponseInfoEnum.ERROR, e.getMessage());
    }
}
