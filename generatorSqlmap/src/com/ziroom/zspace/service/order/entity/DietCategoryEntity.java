package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class DietCategoryEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务Id
     */
    private String fid;

    /**
     * 类别名称
     */
    private String itemclassName;

    /**
     * 类别编码
     */
    private String itemclassCode;

    /**
     * 父类别名称
     */
    private String fatherName;

    /**
     * 父类别编码
     */
    private String fatherCode;

    /**
     * 类别第三方编号/财务编码
     */
    private String classThirdCode;

    /**
     * 渠道默认MD01
     */
    private String channel;

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

    public String getItemclassName() {
        return itemclassName;
    }

    public void setItemclassName(String itemclassName) {
        this.itemclassName = itemclassName == null ? null : itemclassName.trim();
    }

    public String getItemclassCode() {
        return itemclassCode;
    }

    public void setItemclassCode(String itemclassCode) {
        this.itemclassCode = itemclassCode == null ? null : itemclassCode.trim();
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName == null ? null : fatherName.trim();
    }

    public String getFatherCode() {
        return fatherCode;
    }

    public void setFatherCode(String fatherCode) {
        this.fatherCode = fatherCode == null ? null : fatherCode.trim();
    }

    public String getClassThirdCode() {
        return classThirdCode;
    }

    public void setClassThirdCode(String classThirdCode) {
        this.classThirdCode = classThirdCode == null ? null : classThirdCode.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
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