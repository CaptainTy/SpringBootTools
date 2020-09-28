package com.zry.guest.entity;

import java.util.Date;

public class RemindTask {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 业务标识
     */
    private String fid;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型 1-生日提醒 2-保洁提醒
     */
    private Integer taskType;

    /**
     * 提醒详情
     */
    private String detail;

    /**
     * 场景标识
     */
    private String senceFid;

    /**
     * 提醒范围
     */
    private String range;

    /**
     * 是否删除 0-未删 1-已删
     */
    private Integer isDel;

    /**
     * 是否有效 1-有效 2-无效
     */
    private Integer isValid;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 最后修改人
     */
    private String lastModifyUser;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getSenceFid() {
        return senceFid;
    }

    public void setSenceFid(String senceFid) {
        this.senceFid = senceFid == null ? null : senceFid.trim();
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range == null ? null : range.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastModifyUser() {
        return lastModifyUser;
    }

    public void setLastModifyUser(String lastModifyUser) {
        this.lastModifyUser = lastModifyUser == null ? null : lastModifyUser.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}