package com.teenyda.controller.test;

import com.teenyda.common.GlobalResponseInfoEnum;
import com.teenyda.common.GlobalErrorInfoException;
import com.teenyda.common.ResultBody;
import com.teenyda.common.ResultUtil;
import com.teenyda.constant.CityResponseInfoEnum;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
@RestController
@RequestMapping("/error")
public class TestErrorJsonController {

    @GetMapping(value = "/city")
    public ResultBody getCity(@RequestParam(value = "cityName" ,required = false)String name) throws GlobalErrorInfoException {
        if (StringUtils.isEmpty(name))
            throw new GlobalErrorInfoException(CityResponseInfoEnum.PARAMS_NO_COMPLETE);
        return ResultUtil.success(GlobalResponseInfoEnum.SUCCESS,name);

    }
}




