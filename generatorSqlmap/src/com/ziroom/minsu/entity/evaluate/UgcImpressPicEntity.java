package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcImpressPicEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 逻辑fid
     */
    private String fid;

    /**
     * 图片服务器唯一标识
     */
    private String picServerUuid;

    /**
     * 印象fid
     */
    private String impressFid;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 图片访问基础地址
     */
    private String picBaseUrl;

    /**
     * 图片后缀
     */
    private String picSuffix;

    /**
     * 是否默认图片 0：否，1：是
     */
    private Integer isDefault;

    /**
     * 是否删除 0：否，1：是
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 最新修改时间
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

    public String getPicServerUuid() {
        return picServerUuid;
    }

    public void setPicServerUuid(String picServerUuid) {
        this.picServerUuid = picServerUuid == null ? null : picServerUuid.trim();
    }

    public String getImpressFid() {
        return impressFid;
    }

    public void setImpressFid(String impressFid) {
        this.impressFid = impressFid == null ? null : impressFid.trim();
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public String getPicBaseUrl() {
        return picBaseUrl;
    }

    public void setPicBaseUrl(String picBaseUrl) {
        this.picBaseUrl = picBaseUrl == null ? null : picBaseUrl.trim();
    }

    public String getPicSuffix() {
        return picSuffix;
    }

    public void setPicSuffix(String picSuffix) {
        this.picSuffix = picSuffix == null ? null : picSuffix.trim();
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
}