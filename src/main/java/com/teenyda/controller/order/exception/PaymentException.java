package com.teenyda.controller.order.exception;

import com.teenyda.common.ResponseInfoInterface;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-08-24 09:34
 * @description:
 **/
public enum PaymentException implements ResponseInfoInterface {

    LACK_OF_BABALCE(50001, "余额不足")
    ;

    private int code;
    private String messaeg;
    private String explain;

    PaymentException(int code, String messaeg) {
        this.code = code;
        this.messaeg = messaeg;
    }


    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return messaeg;
    }

    @Override
    public void setExplain(String explain) {
        this.explain = explain;
    }

    @Override
    public String getExplain() {
        return this.explain;
    }
}
