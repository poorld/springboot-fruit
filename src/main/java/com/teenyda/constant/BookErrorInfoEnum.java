package com.teenyda.constant;

import com.teenyda.common.ErrorInfoInterface;
import com.teenyda.common.GlobalErrorInfoEnum;

public enum BookErrorInfoEnum implements ErrorInfoInterface {

    ERROR_PARAM(40001, "参数错误");

    private int code;

    private String message;

    BookErrorInfoEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
