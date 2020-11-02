package com.teenyda.entity;

import java.io.Serializable;

/**
 * (Members)实体类
 *
 * @author makejava
 * @since 2020-11-02 12:50:08
 */
public class Members implements Serializable {
    private static final long serialVersionUID = 353332748889910292L;

    private Integer membersId;

    private String name;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 价格/月
     */
    private Integer price;


    public Integer getMembersId() {
        return membersId;
    }

    public void setMembersId(Integer membersId) {
        this.membersId = membersId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}