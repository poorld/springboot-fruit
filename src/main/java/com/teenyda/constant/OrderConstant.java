package com.teenyda.constant;

public interface OrderConstant {

    //微信
    public static final int PAYMENT_TYPE_WX = 1;
    public static final String PAYMENT_TYPE_WX_STR = "微信支付";
    //支付宝
    public static final int PAYMENT_TYPE_ZFB = 2;
    public static final String PAYMENT_TYPE_ZFB_STR = "支付宝支付";
    //余额
    public static final int PAYMENT_TYPE_YE = 3;
    public static final String PAYMENT_TYPE_YE_STR = "余额支付";

    //订单结束时间（分钟）
    public static final int ORDER_END_TIME = 10;
}
