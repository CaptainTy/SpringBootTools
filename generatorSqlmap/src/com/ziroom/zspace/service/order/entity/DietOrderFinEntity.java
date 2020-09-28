package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class DietOrderFinEntity {
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
     * 订单同步财务状态 1-成功 2-失败
     */
    private Integer ordSyncToFin;

    /**
     * 应收同步财务状态 1-成功 2-失败
     */
    private Integer recSyncToFin;

    /**
     * 收款同步财务状态 1-成功 2-失败
     */
    private Integer paySyncToFin;

    /**
     * 创建人
     */
    private String createCode;

    /**
     * 最后一次修改人
     */
    private String modifyCode;

    /**
     * 是否删除 0:false 1:true
     */
    private Integer isDel;

    /**
     * 最后更新时间
     */
    private Date lastModifyDate;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 备注
     */
    private String remark;

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

    public Integer getOrdSyncToFin() {
        return ordSyncToFin;
    }

    public void setOrdSyncToFin(Integer ordSyncToFin) {
        this.ordSyncToFin = ordSyncToFin;
    }

    public Integer getRecSyncToFin() {
        return recSyncToFin;
    }

    public void setRecSyncToFin(Integer recSyncToFin) {
        this.recSyncToFin = recSyncToFin;
    }

    public Integer getPaySyncToFin() {
        return paySyncToFin;
    }

    public void setPaySyncToFin(Integer paySyncToFin) {
        this.paySyncToFin = paySyncToFin;
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}