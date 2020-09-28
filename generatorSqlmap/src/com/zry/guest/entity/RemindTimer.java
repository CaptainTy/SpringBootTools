package com.zry.guest.entity;

import java.util.Date;

public class RemindTimer {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 业务标识
     */
    private String fid;

    /**
     * 任务标识
     */
    private String taskFid;

    /**
     * 运行时间
     */
    private Date runTime;

    /**
     * 是否确认 0-未确认 1-已确认
     */
    private Integer isConfirm;

    /**
     * 确认人(系统号)
     */
    private String confirmFid;

    /**
     * 确认时间
     */
    private Date confirmDate;

    /**
     * 处理描述
     */
    private String description;

    /**
     * 是否删除 0-未删除 1-已删除
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

    public String getTaskFid() {
        return taskFid;
    }

    public void setTaskFid(String taskFid) {
        this.taskFid = taskFid == null ? null : taskFid.trim();
    }

    public Date getRunTime() {
        return runTime;
    }

    public void setRunTime(Date runTime) {
        this.runTime = runTime;
    }

    public Integer getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Integer isConfirm) {
        this.isConfirm = isConfirm;
    }

    public String getConfirmFid() {
        return confirmFid;
    }

    public void setConfirmFid(String confirmFid) {
        this.confirmFid = confirmFid == null ? null : confirmFid.trim();
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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