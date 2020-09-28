package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class ReceiptBillDetail {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 逻辑fid
     */
    private String fid;

    /**
     * 收款单编号/生成
     */
    private String receiptSn;

    /**
     * 关联单号 账单编号
     */
    private String billNum;

    /**
     * 城市code
     */
    private String cityCode;

    /**
     * 收款单来源类型 1：线上支付 2：同步数据
     */
    private Integer sourceType;

    /**
     * 收款状态-新财务（0已收款,1未收款 2打回
     */
    private Integer receiptStatus;

    /**
     * 付款渠道-新财务
     */
    private String receiptMethod;

    /**
     * 支付类型 1.银联支付 2.支付宝支付 41.微信IOS支付 42.微信Android支付 109:优惠券 110:优惠活动
     */
    private Integer paymentType;

    /**
     * 支付人uid
     */
    private String paymentUid;

    /**
     * 付款金额
     */
    private Integer amount;

    /**
     * 支付流水号/付款号码
     */
    private String tradeNo;

    /**
     * 实际同步时间
     */
    private Date actualSyncTime;

    /**
     * 是否已发送 0：否，1：是
     */
    private Integer isSend;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 执行时间
     */
    private Date runTime;

    /**
     * 是否删除 0：否，1：是
     */
    private Integer isDel;

    /**
     * 备注-新财务
     */
    private String remark;

    /**
     * 创建人
     */
    private String createCode;

    /**
     * 最后一次修改人
     */
    private String modifyCode;

    /**
     * 最后更新时间
     */
    private Date lastModifyDate;

    /**
     * 创建时间
     */
    private Date createDate;

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

    public String getReceiptSn() {
        return receiptSn;
    }

    public void setReceiptSn(String receiptSn) {
        this.receiptSn = receiptSn == null ? null : receiptSn.trim();
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum == null ? null : billNum.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(Integer receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public String getReceiptMethod() {
        return receiptMethod;
    }

    public void setReceiptMethod(String receiptMethod) {
        this.receiptMethod = receiptMethod == null ? null : receiptMethod.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentUid() {
        return paymentUid;
    }

    public void setPaymentUid(String paymentUid) {
        this.paymentUid = paymentUid == null ? null : paymentUid.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Date getActualSyncTime() {
        return actualSyncTime;
    }

    public void setActualSyncTime(Date actualSyncTime) {
        this.actualSyncTime = actualSyncTime;
    }

    public Integer getIsSend() {
        return isSend;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getRunTime() {
        return runTime;
    }

    public void setRunTime(Date runTime) {
        this.runTime = runTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode == null ? null : createCode.trim();
    }

    public String getModifyCode() {
        return modifyCode;
    }

    public void setModifyCode(String modifyCode) {
        this.modifyCode = modifyCode == null ? null : modifyCode.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}