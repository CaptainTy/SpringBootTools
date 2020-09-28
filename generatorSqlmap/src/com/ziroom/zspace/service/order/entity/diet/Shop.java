package com.ziroom.zspace.service.order.entity.diet;

import java.util.Date;

public class Shop {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑标识
     */
    private String fid;

    /**
     * 业务线类型 1：民宿 2：自如寓 3：驿站 4:zspace
     */
    private Integer serviceLine;

    /**
     * 天子星商户号
     */
    private String tenancyId;

    /**
     * 门店编码
     */
    private String organCode;

    /**
     * 门店简称
     */
    private String organShortName;

    /**
     * 门店全称
     */
    private String organFullName;

    /**
     * 门店类型：1:分公司 2:配送中心 3:门店
     */
    private Integer organType;

    /**
     * 是否删除 0:否 1:是
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
     * 创建日期
     */
    private Date createDate;

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

    public Integer getServiceLine() {
        return serviceLine;
    }

    public void setServiceLine(Integer serviceLine) {
        this.serviceLine = serviceLine;
    }

    public String getTenancyId() {
        return tenancyId;
    }

    public void setTenancyId(String tenancyId) {
        this.tenancyId = tenancyId == null ? null : tenancyId.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getOrganShortName() {
        return organShortName;
    }

    public void setOrganShortName(String organShortName) {
        this.organShortName = organShortName == null ? null : organShortName.trim();
    }

    public String getOrganFullName() {
        return organFullName;
    }

    public void setOrganFullName(String organFullName) {
        this.organFullName = organFullName == null ? null : organFullName.trim();
    }

    public Integer getOrganType() {
        return organType;
    }

    public void setOrganType(Integer organType) {
        this.organType = organType;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}