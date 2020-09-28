package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class EvalLowEvaluateEntity {
    private Integer id;

    /**
     * 业务id
     */
    private String bid;

    /**
     * 评价bid
     */
    private String logicCode;

    /**
     * 项目bid
     */
    private String evaluateSceneCode;

    /**
     * 订单号
     */
    private String businessCode;

    /**
     * 总分
     */
    private Double customerAvgStarLevel;

    /**
     * 评价内容
     */
    private String customerSuggestion;

    /**
     * 用户uid
     */
    private String evaluatePersonCode;

    /**
     * 用户名称
     */
    private String evaluatePersonName;

    /**
     * 用户手机号
     */
    private String evaluatePersonPhone;

    /**
     * 评价时间
     */
    private Date evaluateTime;

    /**
     * 跟进状态0-未操作；1-已提醒； 2-跟进中； 3-已完结
     */
    private Integer followUpStatus;

    /**
     * 是否删除0-正常；1-删除；
     */
    private Integer isDel;

    /**
     * 是否有效0-无效；1-有效
     */
    private Integer isValid;

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

    public String getLogicCode() {
        return logicCode;
    }

    public void setLogicCode(String logicCode) {
        this.logicCode = logicCode == null ? null : logicCode.trim();
    }

    public String getEvaluateSceneCode() {
        return evaluateSceneCode;
    }

    public void setEvaluateSceneCode(String evaluateSceneCode) {
        this.evaluateSceneCode = evaluateSceneCode == null ? null : evaluateSceneCode.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public Double getCustomerAvgStarLevel() {
        return customerAvgStarLevel;
    }

    public void setCustomerAvgStarLevel(Double customerAvgStarLevel) {
        this.customerAvgStarLevel = customerAvgStarLevel;
    }

    public String getCustomerSuggestion() {
        return customerSuggestion;
    }

    public void setCustomerSuggestion(String customerSuggestion) {
        this.customerSuggestion = customerSuggestion == null ? null : customerSuggestion.trim();
    }

    public String getEvaluatePersonCode() {
        return evaluatePersonCode;
    }

    public void setEvaluatePersonCode(String evaluatePersonCode) {
        this.evaluatePersonCode = evaluatePersonCode == null ? null : evaluatePersonCode.trim();
    }

    public String getEvaluatePersonName() {
        return evaluatePersonName;
    }

    public void setEvaluatePersonName(String evaluatePersonName) {
        this.evaluatePersonName = evaluatePersonName == null ? null : evaluatePersonName.trim();
    }

    public String getEvaluatePersonPhone() {
        return evaluatePersonPhone;
    }

    public void setEvaluatePersonPhone(String evaluatePersonPhone) {
        this.evaluatePersonPhone = evaluatePersonPhone == null ? null : evaluatePersonPhone.trim();
    }

    public Date getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(Date evaluateTime) {
        this.evaluateTime = evaluateTime;
    }

    public Integer getFollowUpStatus() {
        return followUpStatus;
    }

    public void setFollowUpStatus(Integer followUpStatus) {
        this.followUpStatus = followUpStatus;
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
}