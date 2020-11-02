package com.teenyda.constant;

public enum OrderTypeEnum {

    Order(0, "订单"),
    Cart(1, "购物车");

    int orderType;

    String desc;

    OrderTypeEnum(int orderType, String desc) {
        this.orderType = orderType;
        this.desc = desc;
    }

    public int getOrderType() {
        return orderType;
    }

    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
