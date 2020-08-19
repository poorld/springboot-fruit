package com.teenyda.model;

import java.util.Date;

public class Push {
    private Integer pushId;

    private String videoId;

    private Integer userId;

    private Date pushDate;

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getPushDate() {
        return pushDate;
    }

    public void setPushDate(Date pushDate) {
        this.pushDate = pushDate;
    }
}