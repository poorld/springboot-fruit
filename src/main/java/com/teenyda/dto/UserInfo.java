package com.teenyda.dto;

/**
 * 头条作者
 * @Author Administrator
 * @Date 2020-08-18.
 * @Email teenyda@gmail.com
 */
public class UserInfo {

    /**
     * media_id : 1639018098290699
     * description : 世界未知面，新的观点古老的故事。
     * following_count : 3
     * verified_content : 优质教育领域创作者
     * follow : false
     * user_verified : true
     *
     * auth_type : 0
     * auth_info : 优质教育领域创作者
     *
     * video_live_auth : 1
     * user_id : 4076588298929316
     * name : 独孤轩辕策
     * ban_status : 0
     * followers_count : 2071116
     * share_url : http://m.365yg.com/video/app/user/home/?to_user_id=4076588298929316&iid=0&device_id=0&format=html&app=video_article
     * ugc_publish_media_id : 1639018098290699
     * avatar_url : https://sf6-ttcdn-tos.pstatp.com/img/mosaic-legacy/fe4b00009f6e042e713e~120x256.image
     * video_total_count : 30
     */

    private String media_id;
    private String description;
    private int following_count;
    private String verified_content;
    private boolean follow;
    private boolean user_verified;

//    private UserAuthInfoBean user_auth_info;
    private String auth_type;
    private String auth_info;

    private int video_live_auth;
    private String user_id;
    private String name;
    private int ban_status;
    private int followers_count;
    private String share_url;
    private long ugc_publish_media_id;
    private String avatar_url;
    private int video_total_count;

    public VideoDetailInfo videoDetailInfo;

    public VideoDetailInfo getVideoDetailInfo() {
        return videoDetailInfo;
    }

    public void setVideoDetailInfo(VideoDetailInfo videoDetailInfo) {
        this.videoDetailInfo = videoDetailInfo;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(int following_count) {
        this.following_count = following_count;
    }

    public String getVerified_content() {
        return verified_content;
    }

    public void setVerified_content(String verified_content) {
        this.verified_content = verified_content;
    }

    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
    }

    public boolean isUser_verified() {
        return user_verified;
    }

    public void setUser_verified(boolean user_verified) {
        this.user_verified = user_verified;
    }

//    public UserAuthInfoBean getUser_auth_info() {
//        return user_auth_info;
//    }
//
//    public void setUser_auth_info(UserAuthInfoBean user_auth_info) {
//        this.user_auth_info = user_auth_info;
//    }

    public int getVideo_live_auth() {
        return video_live_auth;
    }

    public void setVideo_live_auth(int video_live_auth) {
        this.video_live_auth = video_live_auth;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan_status() {
        return ban_status;
    }

    public void setBan_status(int ban_status) {
        this.ban_status = ban_status;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public long getUgc_publish_media_id() {
        return ugc_publish_media_id;
    }

    public void setUgc_publish_media_id(long ugc_publish_media_id) {
        this.ugc_publish_media_id = ugc_publish_media_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public int getVideo_total_count() {
        return video_total_count;
    }

    public void setVideo_total_count(int video_total_count) {
        this.video_total_count = video_total_count;
    }

    public static class UserAuthInfoBean {
        /**
         * auth_type : 0
         * other_auth : {"interest":"优质教育领域创作者"}
         * auth_info : 优质教育领域创作者
         */

        private String auth_type;
        private OtherAuthBean other_auth;
        private String auth_info;

        public String getAuth_type() {
            return auth_type;
        }

        public void setAuth_type(String auth_type) {
            this.auth_type = auth_type;
        }

        public OtherAuthBean getOther_auth() {
            return other_auth;
        }

        public void setOther_auth(OtherAuthBean other_auth) {
            this.other_auth = other_auth;
        }

        public String getAuth_info() {
            return auth_info;
        }

        public void setAuth_info(String auth_info) {
            this.auth_info = auth_info;
        }

        public static class OtherAuthBean {
            /**
             * interest : 优质教育领域创作者
             */

            private String interest;

            public String getInterest() {
                return interest;
            }

            public void setInterest(String interest) {
                this.interest = interest;
            }
        }
    }
}
