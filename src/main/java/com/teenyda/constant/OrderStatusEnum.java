package com.teenyda.constant;

public enum OrderStatusEnum {

    ToCart(0, "加入购物车/立即购买"),
    WaitingPayment(1, "等待支付"),
    HaveToPay(2, "已支付"),
    Distribution(3, "配送中"),
    DistributionComplete(4, "配送完成"),
    PayOvertime(5, "订单支付超时");

    int orderStatus;

    String desc;

    OrderStatusEnum(int orderStatus, String desc) {
        this.orderStatus = orderStatus;
        this.desc = desc;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
