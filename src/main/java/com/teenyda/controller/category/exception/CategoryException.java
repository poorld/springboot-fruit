package com.teenyda.controller.category.exception;

import com.teenyda.common.ResponseInfoInterface;

public enum CategoryException implements ResponseInfoInterface {
    ERROR_PARAM(40001, "参数错误"),
    ERROR(ERROR_UNKNOW, ERROR_UNKNOW_DESC);

    private int code;
    private String messaeg;
    private String explain;

    CategoryException(int code, String messaeg) {
        this.code = code;
        this.messaeg = messaeg;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void setExplain(String explain) {

    }

    @Override
    public String getExplain() {
        return null;
    }
}
