package com.teenyda.controller.order.exception;

import com.teenyda.common.ResponseInfoInterface;

/**
 * @program: springboottemplate
 * @author: Teenyda
 * @create: 2019-08-24 09:34
 * @description:
 **/
public enum OrderException implements ResponseInfoInterface {

    ERROR_ORDER_NUMBER(60001, "订单号不存在")
    ;

    private int code;
    private String messaeg;
    private String explain;

    OrderException(int code, String messaeg) {
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
