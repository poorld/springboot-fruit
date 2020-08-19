package com.teenyda.model;

public class Subscription {
    private Integer subId;

    private Integer userId;

    private String authId;

    private Boolean sub;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId == null ? null : authId.trim();
    }

    public Boolean getSub() {
        return sub;
    }

    public void setSub(Boolean sub) {
        this.sub = sub;
    }
}