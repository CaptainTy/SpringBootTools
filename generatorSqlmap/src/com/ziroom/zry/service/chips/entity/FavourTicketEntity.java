package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class FavourTicketEntity {
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
     * 批次编号
     */
    private String batchNumber;

    /**
     * 优惠券编号
     */
    private String ticketNumber;

    /**
     * 优惠券状态：0：初始态；1：可使用；2：已使用；3：已关闭
     */
    private Integer status;

    /**
     * 有效期开始时间
     */
    private Integer startDate;

    /**
     * 有效期结束时间
     */
    private Integer endDate;

    /**
     * 与手机绑定日期
     */
    private Integer bindTime;

    /**
     * 绑定后几天内有效
     */
    private Integer limitDate;

    /**
     * 领取方式：0：直接领取；1：兑换码领取
     */
    private Integer getWay;

    /**
     * 所属的活动的bid
     */
    private String activityBid;

    /**
     * 绑定预订人的手机号码
     */
    private String customerPhone;

    /**
     * 兑换码
     */
    private String redeemCode;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 使用时间
     */
    private Date applyTime;

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

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber == null ? null : ticketNumber.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getBindTime() {
        return bindTime;
    }

    public void setBindTime(Integer bindTime) {
        this.bindTime = bindTime;
    }

    public Integer getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Integer limitDate) {
        this.limitDate = limitDate;
    }

    public Integer getGetWay() {
        return getWay;
    }

    public void setGetWay(Integer getWay) {
        this.getWay = getWay;
    }

    public String getActivityBid() {
        return activityBid;
    }

    public void setActivityBid(String activityBid) {
        this.activityBid = activityBid == null ? null : activityBid.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getRedeemCode() {
        return redeemCode;
    }

    public void setRedeemCode(String redeemCode) {
        this.redeemCode = redeemCode == null ? null : redeemCode.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }
}