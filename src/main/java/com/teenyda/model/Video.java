package com.teenyda.model;

import java.util.Date;

public class Video {
    private String videoId;

    private String authId;

    private String title;

    @com.google.gson.annotations.SerializedName("abstract")
    private String abstractX;

    private Boolean hasVideo;

    private String articleUrl;

    private Date publishTime;

    private String itemId;

    private String detailVideoLargeImage;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId == null ? null : authId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAbstract() {
        return abstractX;
    }

    public void setAbstract(String abstractX) {
        this.abstractX = abstractX == null ? null : abstractX.trim();
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public String getDetailVideoLargeImage() {
        return detailVideoLargeImage;
    }

    public void setDetailVideoLargeImage(String detailVideoLargeImage) {
        this.detailVideoLargeImage = detailVideoLargeImage == null ? null : detailVideoLargeImage.trim();
    }
}