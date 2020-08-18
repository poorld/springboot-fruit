package com.teenyda.dto;

/**
 * 视频信息
 * @Author Administrator
 * @Date 2020-08-18.
 * @Email teenyda@gmail.com
 */
public class VideoDetailInfo {

    /**
     * abstract : 我们的记忆并不总是完整的，它们很容易被遗忘，如果成百上千的人都拥有相同的记忆，并且都记得一样的详细细节，但事实上却从来没有发生过...
     * title : 是我们的记忆出错了还是现实被改变了？探索曼德拉效应的秘密
     * has_video : true
     * article_url : http://toutiao.com/group/6860057653821997580/
     * publish_time : 1597231639
     * item_id : 6860057653821997580
     * video_detail_info : {"video_id":"v030046a0000bspss1qrddq5ns1jmnv0","detail_video_large_image":"http://p9-xg.byteimg.com/video1609/tos-cn-i-0004/7af712854f2843a59edc789e6bf91b74"}
     */

    /**
     * video_id : v030046a0000bspss1qrddq5ns1jmnv0
     * detail_video_large_image : http://p9-xg.byteimg.com/video1609/tos-cn-i-0004/7af712854f2843a59edc789e6bf91b74
     */

    @com.google.gson.annotations.SerializedName("abstract")
    private String abstractX;
    private String title;
    private boolean has_video;
    private String article_url;
    private int publish_time;
    private String item_id;
//    private VideoDetailInfoBean video_detail_info;
    private String video_id;
    private String detail_video_large_image;

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getDetail_video_large_image() {
        return detail_video_large_image;
    }

    public void setDetail_video_large_image(String detail_video_large_image) {
        this.detail_video_large_image = detail_video_large_image;
    }
    public String getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(String abstractX) {
        this.abstractX = abstractX;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public void setHas_video(boolean has_video) {
        this.has_video = has_video;
    }

    public String getArticle_url() {
        return article_url;
    }

    public void setArticle_url(String article_url) {
        this.article_url = article_url;
    }

    public int getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(int publish_time) {
        this.publish_time = publish_time;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }


//    public static class VideoDetailInfoBean {
//
//
//
//    }
}
