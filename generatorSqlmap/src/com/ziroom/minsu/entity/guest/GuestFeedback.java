package com.ziroom.minsu.entity.guest;

import java.util.Date;

public class GuestFeedback {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 业务标识
     */
    private String fid;

    /**
     * 顾客标识
     */
    private String guestFid;

    /**
     * 场景标识
     */
    private String sceneFid;

    /**
     * 类型 1-获知渠道 2-出行目的 3-印象深刻 
     */
    private Integer feedbackType;

    /**
     * 标签CODE
     */
    private String code;

    /**
     * 是否删除 0否 1是
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createFid;

    /**
     * 创建人
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String lastModifyFid;

    /**
     * 修改时间
     */
    private Date lastModifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public String getGuestFid() {
        return guestFid;
    }

    public void setGuestFid(String guestFid) {
        this.guestFid = guestFid == null ? null : guestFid.trim();
    }

    public String getSceneFid() {
        return sceneFid;
    }

    public void setSceneFid(String sceneFid) {
        this.sceneFid = sceneFid == null ? null : sceneFid.trim();
    }

    public Integer getFeedbackType() {
        return feedbackType;
    }

    public void setFeedbackType(Integer feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateFid() {
        return createFid;
    }

    public void setCreateFid(String createFid) {
        this.createFid = createFid == null ? null : createFid.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastModifyFid() {
        return lastModifyFid;
    }

    public void setLastModifyFid(String lastModifyFid) {
        this.lastModifyFid = lastModifyFid == null ? null : lastModifyFid.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}