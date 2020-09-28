package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcCategoryEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 业务标识
     */
    private String fid;

    /**
     * 业务线类型 1:民宿 2:自如寓 3:驿站 4:zspace
     */
    private String serviceLine;

    /**
     * 项目标识
     */
    private String projectFid;

    /**
     * 模块类型 1:印象
     */
    private Integer moduleType;

    /**
     * 券包标识
     */
    private String packageFid;

    /**
     * 状态 1:待发行 2:已发行 3:暂停发行
     */
    private Integer status;

    /**
     * 删除标记 0:否，1:是
     */
    private Integer isDel;

    /**
     * 创建人
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
     * 最后修改时间
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

    public String getServiceLine() {
        return serviceLine;
    }

    public void setServiceLine(String serviceLine) {
        this.serviceLine = serviceLine == null ? null : serviceLine.trim();
    }

    public String getProjectFid() {
        return projectFid;
    }

    public void setProjectFid(String projectFid) {
        this.projectFid = projectFid == null ? null : projectFid.trim();
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public String getPackageFid() {
        return packageFid;
    }

    public void setPackageFid(String packageFid) {
        this.packageFid = packageFid == null ? null : packageFid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
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
}