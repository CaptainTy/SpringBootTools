package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class ReceiBillDetailEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务Id
     */
    private String fid;

    /**
     * 账单编号
     */
    private String billNum;

    /**
     * 单据类型
     */
    private String fDocumenttype;

    /**
     * 自如客uid
     */
    private String fUid;

    /**
     * 用户姓名
     */
    private String fUsername;

    /**
     * 预计收款日-当天
     */
    private String fPrecollectiondate;

    /**
     * 账单开始日期：入住时间
     */
    private String fStartTime;

    /**
     * 账单结束日期：退房时间
     */
    private String fEndTime;

    /**
     * 房源编号：默认（00000）
     */
    private String fHousecode;

    /**
     * 费用项编号比如fz
     */
    private String fCostcode;

    /**
     * 应付金额
     */
    private Integer fDocumentamount;

    /**
     * 订单编号
     */
    private String fOrdercode;

    /**
     * 财务账单号
     */
    private String fBillNum;

    /**
     * 财务应收账单类型
     */
    private String fBillType;

    /**
     * 财务失败信息
     */
    private String fFailMsg;

    /**
     * 是否删除 0:false 1:true
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

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum == null ? null : billNum.trim();
    }

    public String getfDocumenttype() {
        return fDocumenttype;
    }

    public void setfDocumenttype(String fDocumenttype) {
        this.fDocumenttype = fDocumenttype == null ? null : fDocumenttype.trim();
    }

    public String getfUid() {
        return fUid;
    }

    public void setfUid(String fUid) {
        this.fUid = fUid == null ? null : fUid.trim();
    }

    public String getfUsername() {
        return fUsername;
    }

    public void setfUsername(String fUsername) {
        this.fUsername = fUsername == null ? null : fUsername.trim();
    }

    public String getfPrecollectiondate() {
        return fPrecollectiondate;
    }

    public void setfPrecollectiondate(String fPrecollectiondate) {
        this.fPrecollectiondate = fPrecollectiondate == null ? null : fPrecollectiondate.trim();
    }

    public String getfStartTime() {
        return fStartTime;
    }

    public void setfStartTime(String fStartTime) {
        this.fStartTime = fStartTime == null ? null : fStartTime.trim();
    }

    public String getfEndTime() {
        return fEndTime;
    }

    public void setfEndTime(String fEndTime) {
        this.fEndTime = fEndTime == null ? null : fEndTime.trim();
    }

    public String getfHousecode() {
        return fHousecode;
    }

    public void setfHousecode(String fHousecode) {
        this.fHousecode = fHousecode == null ? null : fHousecode.trim();
    }

    public String getfCostcode() {
        return fCostcode;
    }

    public void setfCostcode(String fCostcode) {
        this.fCostcode = fCostcode == null ? null : fCostcode.trim();
    }

    public Integer getfDocumentamount() {
        return fDocumentamount;
    }

    public void setfDocumentamount(Integer fDocumentamount) {
        this.fDocumentamount = fDocumentamount;
    }

    public String getfOrdercode() {
        return fOrdercode;
    }

    public void setfOrdercode(String fOrdercode) {
        this.fOrdercode = fOrdercode == null ? null : fOrdercode.trim();
    }

    public String getfBillNum() {
        return fBillNum;
    }

    public void setfBillNum(String fBillNum) {
        this.fBillNum = fBillNum == null ? null : fBillNum.trim();
    }

    public String getfBillType() {
        return fBillType;
    }

    public void setfBillType(String fBillType) {
        this.fBillType = fBillType == null ? null : fBillType.trim();
    }

    public String getfFailMsg() {
        return fFailMsg;
    }

    public void setfFailMsg(String fFailMsg) {
        this.fFailMsg = fFailMsg == null ? null : fFailMsg.trim();
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