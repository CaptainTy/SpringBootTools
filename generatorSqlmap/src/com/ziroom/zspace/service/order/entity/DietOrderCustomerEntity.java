package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class DietOrderCustomerEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务Id
     */
    private String fid;

    /**
     * 天子星账单编号
     */
    private String tzxBillNum;

    /**
     * 天子星会员ID
     */
    private Integer customerId;

    /**
     * 会员编码
     */
    private String customerCode;

    /**
     * 手机号码
     */
    private String mobil;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String alias;

    /**
     * 会员等级名称
     */
    private String levelName;

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

    public String getTzxBillNum() {
        return tzxBillNum;
    }

    public void setTzxBillNum(String tzxBillNum) {
        this.tzxBillNum = tzxBillNum == null ? null : tzxBillNum.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil == null ? null : mobil.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
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
}