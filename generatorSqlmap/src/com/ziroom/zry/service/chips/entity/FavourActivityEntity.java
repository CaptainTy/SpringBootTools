package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class FavourActivityEntity {
    private Integer id;

    /**
     * 业务id
     */
    private String bid;

    /**
     * 是否删除0-正常；1-删除；
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次修改人
     */
    private String lastModifyUserId;

    /**
     * 上次修改时间
     */
    private Date lastModifyTime;

    /**
     * 是否有效0-无效；1-有效
     */
    private Integer isValid;

    /**
     * 优惠活动编码
     */
    private String activityNumber;

    /**
     * 优惠活动名称
     */
    private String activityName;

    /**
     * 优惠活动开始时间
     */
    private Integer startDate;

    /**
     * 优惠活动结束时间
     */
    private Integer endDate;

    /**
     * 活动状态：0：未开启；1：进行中；2：已关闭；3：已结束
     */
    private Integer status;

    /**
     * 活动内容
     */
    private String activityContent;

    /**
     * 满多少钱才可用
     */
    private Double limitMoney;

    /**
     * 是否有限制条件：0：全部项目房型可使用；1：部分项目房型可使用
     */
    private Integer isLimitProject;

    /**
     * 使用条件
     */
    private String condition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getActivityNumber() {
        return activityNumber;
    }

    public void setActivityNumber(String activityNumber) {
        this.activityNumber = activityNumber == null ? null : activityNumber.trim();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    public Double getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(Double limitMoney) {
        this.limitMoney = limitMoney;
    }

    public Integer getIsLimitProject() {
        return isLimitProject;
    }

    public void setIsLimitProject(Integer isLimitProject) {
        this.isLimitProject = isLimitProject;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition == null ? null : condition.trim();
    }
}