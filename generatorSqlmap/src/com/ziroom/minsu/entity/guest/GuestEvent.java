package com.ziroom.minsu.entity.guest;

import java.util.Date;

public class GuestEvent {
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
     * 场景名字
     */
    private String sceneName;

    /**
     * 事件内容
     */
    private String eventContent;

    /**
     * 类型 1-好评 2-差评
     */
    private Integer eventType;

    /**
     * 严重等级 0最轻
     */
    private Integer eventLevel;

    /**
     * 事件发生日期
     */
    private Date eventDate;

    /**
     * 删除标记 0-未删 1-已删
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createFid;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 最后修改人
     */
    private String lastModifyFid;

    /**
     * 最后修改日期
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

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent == null ? null : eventContent.trim();
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Integer getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
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