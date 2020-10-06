package com.teenyda.controller.api;

import com.teenyda.common.ResponseInfoInterface;
import com.teenyda.common.ResultBody;
import com.teenyda.common.ResultUtil;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

/**
 * @Author Administrator
 * @Date 2020-08-19.
 * @Email teenyda@gmail.com
 *
 * 响应拦截 {@link com.teenyda.aspect.ResponseAspect}
 */

// @EnableAspectJAutoProxy(exposeProxy = true)
public abstract class AbstractApiController {


    // protected static final Logger LOGGER = LoggerFactory.getLogger(BookController.class);

    public <T> ResultBody<T> responseSuccessJson(){
        return ResultUtil.success();
    }

    public <T> ResultBody<T> responseSuccessJson(T data){
        return ResultUtil.success(data);
    }


    public <T> ResultBody<T> responseSuccessJson(ResponseInfoInterface errorInfo) {
        return ResultUtil.success(errorInfo);
    }

    public <T> ResultBody<T> responseSuccessJson(ResponseInfoInterface errorInfo, T data) {
        return ResultUtil.success(errorInfo, data);
    }

    public <T> ResultBody<T> responseSuccessJson(ResponseInfoInterface errorInfo, String explain) {
        errorInfo.setExplain(explain);
        return ResultUtil.success(errorInfo);
    }
}
