package com.teenyda.controller;

import com.teenyda.common.GlobalErrorInfoEnum;
import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.ResultBody;
import com.teenyda.common.ResultUtil;
import com.teenyda.constant.CityErrorInfoEnum;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
@RestController
public class ErrorJsonController {

    @GetMapping(value = "/api/city")
    public ResultBody getCity(@RequestParam(value = "cityName" ,required = false)String name) throws GlobalErrorInfoException {
        if (StringUtils.isEmpty(name))
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        return ResultUtil.success(GlobalErrorInfoEnum.SUCCESS,name);

    }
}




