package com.teenyda.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Comments)实体类
 *
 * @author makejava
 * @since 2020-10-09 17:10:37
 */
public class Comments implements Serializable {
    private static final long serialVersionUID = -25444406065751623L;

    private Integer commentsId;

    private Integer userId;

    private Integer productId;

    private String content;

    private String img1;

    private String img2;

    private String img3;
    /**
     * 0未审核 1审核通过
     */
    private Integer audit;
    /**
     * 商家回复
     */
    private String reply;

    private Date createTime;


    public Integer getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(Integer commentsId) {
        this.commentsId = commentsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}