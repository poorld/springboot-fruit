package com.teenyda.constant;

import com.teenyda.common.ErrorInfoInterface;

/**
 * @Author Administrator
 * @Date 2019-01-06.
 * @Email teenyda@gmail.com
 */
public enum CityErrorInfoEnum implements ErrorInfoInterface {

    /**
     * 参数错误
     */
    PARAMS_NO_COMPLETE(000001,"params no complete"),

    /**
     * 已存在
     */
    CITY_EXIT(000002,"city exit")

    ;

    private int code;

    private String message;

    CityErrorInfoEnum(int code , String message){
        this.code = code;
        this.message = message;
    }
    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
