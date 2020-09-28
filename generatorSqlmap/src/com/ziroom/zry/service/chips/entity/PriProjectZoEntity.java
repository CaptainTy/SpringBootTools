package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class PriProjectZoEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 项目id即bed_project表bid
     */
    private String projectId;

    /**
     * 员工系统号
     */
    private String userzoid;

    /**
     * 创建时间
     */
    private Date fcreatetime;

    /**
     * 创建人
     */
    private String createrid;

    /**
     * 修改时间
     */
    private Date fupdatetime;

    /**
     * 修改人
     */
    private String updaterid;

    /**
     * 删除标记：1-是，0-否
     */
    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getUserzoid() {
        return userzoid;
    }

    public void setUserzoid(String userzoid) {
        this.userzoid = userzoid == null ? null : userzoid.trim();
    }

    public Date getFcreatetime() {
        return fcreatetime;
    }

    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    public String getCreaterid() {
        return createrid;
    }

    public void setCreaterid(String createrid) {
        this.createrid = createrid == null ? null : createrid.trim();
    }

    public Date getFupdatetime() {
        return fupdatetime;
    }

    public void setFupdatetime(Date fupdatetime) {
        this.fupdatetime = fupdatetime;
    }

    public String getUpdaterid() {
        return updaterid;
    }

    public void setUpdaterid(String updaterid) {
        this.updaterid = updaterid == null ? null : updaterid.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}