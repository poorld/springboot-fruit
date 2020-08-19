package com.teenyda.model;

public class Author {
    private String authId;

    private String name;

    private String mediaId;

    private String description;

    private Integer followingCount;

    private String verifiedContent;

    private Boolean follow;

    private Boolean userVerified;

    private Integer authType;

    private String authInfo;

    private Integer videoLiveAuth;

    private Integer banStatus;

    private Integer followersCount;

    private String shareUrl;

    private String ugcPublishMediaId;

    private String avatarUrl;

    private Video video;

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId == null ? null : authId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public String getVerifiedContent() {
        return verifiedContent;
    }

    public void setVerifiedContent(String verifiedContent) {
        this.verifiedContent = verifiedContent == null ? null : verifiedContent.trim();
    }

    public Boolean getFollow() {
        return follow;
    }

    public void setFollow(Boolean follow) {
        this.follow = follow;
    }

    public Boolean getUserVerified() {
        return userVerified;
    }

    public void setUserVerified(Boolean userVerified) {
        this.userVerified = userVerified;
    }

    public Integer getAuthType() {
        return authType;
    }

    public void setAuthType(Integer authType) {
        this.authType = authType;
    }

    public String getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo == null ? null : authInfo.trim();
    }

    public Integer getVideoLiveAuth() {
        return videoLiveAuth;
    }

    public void setVideoLiveAuth(Integer videoLiveAuth) {
        this.videoLiveAuth = videoLiveAuth;
    }

    public Integer getBanStatus() {
        return banStatus;
    }

    public void setBanStatus(Integer banStatus) {
        this.banStatus = banStatus;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl == null ? null : shareUrl.trim();
    }

    public String getUgcPublishMediaId() {
        return ugcPublishMediaId;
    }

    public void setUgcPublishMediaId(String ugcPublishMediaId) {
        this.ugcPublishMediaId = ugcPublishMediaId == null ? null : ugcPublishMediaId.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Video getVideo(Video video) {
        return video;
    }
}