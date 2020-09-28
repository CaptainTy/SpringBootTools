package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class PaymentBillDetailEntity {
    private Integer id;

    /**
     * 业务id
     */
    private String fid;

    /**
     * 退款业务Id
     */
    private String refundFid;

    /**
     * 账单编号
     */
    private String billNum;

    /**
     * 业务系统关联号-必须保证唯一
     */
    private String busId;

    /**
     * 1-未打款；2-打款成功；3-打款失败
     */
    private Integer remitStatus;

    /**
     * 打款失败原因
     */
    private String failReason;

    /**
     * 付款单付款时的支付时间
     */
    private Date payTime;

    /**
     * 是否删除0-正常；1-删除；
     */
    private Integer isDel;

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

    public String getRefundFid() {
        return refundFid;
    }

    public void setRefundFid(String refundFid) {
        this.refundFid = refundFid == null ? null : refundFid.trim();
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum == null ? null : billNum.trim();
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId == null ? null : busId.trim();
    }

    public Integer getRemitStatus() {
        return remitStatus;
    }

    public void setRemitStatus(Integer remitStatus) {
        this.remitStatus = remitStatus;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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