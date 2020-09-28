package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcImpressEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 逻辑fid
     */
    private String fid;

    /**
     * 项目fid
     */
    private String projectFid;

    /**
     * 印象标题
     */
    private String impressTitle;

    /**
     * 是否删除 0：否，1：是
     */
    private Integer isDel;

    /**
     * 印象状态 0：初始状态，1：发布，2：屏蔽
     */
    private Integer impressStatus;

    /**
     * 创建人uid
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 最后更新时间
     */
    private Date lastModifyDate;

    /**
     * 印象内容
     */
    private byte[] impressContent;

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

    public String getProjectFid() {
        return projectFid;
    }

    public void setProjectFid(String projectFid) {
        this.projectFid = projectFid == null ? null : projectFid.trim();
    }

    public String getImpressTitle() {
        return impressTitle;
    }

    public void setImpressTitle(String impressTitle) {
        this.impressTitle = impressTitle == null ? null : impressTitle.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getImpressStatus() {
        return impressStatus;
    }

    public void setImpressStatus(Integer impressStatus) {
        this.impressStatus = impressStatus;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
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

    public byte[] getImpressContent() {
        return impressContent;
    }

    public void setImpressContent(byte[] impressContent) {
        this.impressContent = impressContent;
    }
}