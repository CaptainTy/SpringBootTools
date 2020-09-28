package com.ziroom.minsu.entity.guest;

import java.util.Date;

public class GuestSuggest {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑主键
     */
    private String fid;

    /**
     * 顾客标识
     */
    private String guestFid;

    /**
     * 场景标识（例如驿站订单fid OR 民宿订单fid）
     */
    private String sceneFid;

    /**
     * 意见建议
     */
    private String guestSuggest;

    /**
     * 来源(0 官方 1用户)
     */
    private Integer source;

    /**
     * 删除 0否 1是
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createFid;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新人
     */
    private String lastModifyFid;

    /**
     * 更新时间
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

    public String getGuestSuggest() {
        return guestSuggest;
    }

    public void setGuestSuggest(String guestSuggest) {
        this.guestSuggest = guestSuggest == null ? null : guestSuggest.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
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