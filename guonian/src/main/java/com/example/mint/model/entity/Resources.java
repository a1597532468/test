package com.example.mint.model.entity;

import java.util.Date;

/**
 * @Author: Niuys
 * @Date: 2020/1/16 09:36
 * @Describe: 提交资料的实体类
 */
public class Resources {
    private Integer resId;//id
    private String resName;//文件名称
    private String resLink;//链接地址
    private Integer resOwner;//资源的所有者ID
    private Date createdTime;//创建时间
    private Date updatedTime;//修改时间
    private String resComment;//备注（可不填写）
    private Integer resStatus;//文件状态  1：正常 0：失效

    public Resources(Integer resId, String resName, String resLink, Integer resOwner, Date createdTime, Date updatedTime, String resComment, Integer resStatus) {
        this.resId = resId;
        this.resName = resName;
        this.resLink = resLink;
        this.resOwner = resOwner;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.resComment = resComment;
        this.resStatus = resStatus;
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResLink() {
        return resLink;
    }

    public void setResLink(String resLink) {
        this.resLink = resLink;
    }

    public Integer getResOwner() {
        return resOwner;
    }

    public void setResOwner(Integer resOwner) {
        this.resOwner = resOwner;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getResComment() {
        return resComment;
    }

    public void setResComment(String resComment) {
        this.resComment = resComment;
    }

    public Integer getResStatus() {
        return resStatus;
    }

    public void setResStatus(Integer resStatus) {
        this.resStatus = resStatus;
    }

    public Resources() {
    }
}
