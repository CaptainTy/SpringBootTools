package com.ziroom.zspace.service.card.entity;

import java.util.Date;

public class TzxActivityEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务主键
     */
    private String fid;

    /**
     * 天子星商城券活动ID
     */
    private Integer activityId;

    /**
     * 是否有效，1=有效，0=无效
     */
    private Integer isValid;

    /**
     * 活动执行状态，1=执行中，2=终止，0=未发布
     */
    private Integer runningState;

    /**
     * 活动名称/活动主题
     */
    private String subject;

    /**
     * 活动开始时间，格式：”2019-07-02”
     */
    private Date startTime;

    /**
     * 活动结束时间，格式：”2019-07-22”
     */
    private Date endTime;

    /**
     * 活动总面值    单位分
     */
    private Integer budgetMoney;

    /**
     * 活动场景：1=固定活动券发售数量，2=活动券发售数量随机调整
     */
    private Integer deductionType;

    /**
     * 活动原因
     */
    private String reason;

    /**
     * 活动备注
     */
    private String remark;

    /**
     * 活动介绍
     */
    private String introduction;

    /**
     * 推广渠道
     */
    private String chanel;

    /**
     * 创建人系统号
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 修改时间
     */
    private Date lastModifyDate;

    /**
     * 是否删除：0:false 1:true
     */
    private Integer isDel;

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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getRunningState() {
        return runningState;
    }

    public void setRunningState(Integer runningState) {
        this.runningState = runningState;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getBudgetMoney() {
        return budgetMoney;
    }

    public void setBudgetMoney(Integer budgetMoney) {
        this.budgetMoney = budgetMoney;
    }

    public Integer getDeductionType() {
        return deductionType;
    }

    public void setDeductionType(Integer deductionType) {
        this.deductionType = deductionType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getChanel() {
        return chanel;
    }

    public void setChanel(String chanel) {
        this.chanel = chanel == null ? null : chanel.trim();
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

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}