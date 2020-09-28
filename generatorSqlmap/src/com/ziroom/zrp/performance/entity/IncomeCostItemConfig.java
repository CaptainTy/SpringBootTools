package com.ziroom.zrp.performance.entity;

import java.util.Date;

public class IncomeCostItemConfig {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 组织机构根FID
     */
    private String orgFid;

    /**
     * 项目标识
     */
    private String projectFid;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 费用项code
     */
    private String configInfo;

    /**
     * 归属日期(目前按年份划分)
     */
    private Date vestingDate;

    /**
     * 0-未删除，1-已删除
     */
    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgFid() {
        return orgFid;
    }

    public void setOrgFid(String orgFid) {
        this.orgFid = orgFid == null ? null : orgFid.trim();
    }

    public String getProjectFid() {
        return projectFid;
    }

    public void setProjectFid(String projectFid) {
        this.projectFid = projectFid == null ? null : projectFid.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo == null ? null : configInfo.trim();
    }

    public Date getVestingDate() {
        return vestingDate;
    }

    public void setVestingDate(Date vestingDate) {
        this.vestingDate = vestingDate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}