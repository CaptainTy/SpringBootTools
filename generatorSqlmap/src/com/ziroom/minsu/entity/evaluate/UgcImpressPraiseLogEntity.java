package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcImpressPraiseLogEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 逻辑fid
     */
    private String fid;

    /**
     * 印象fid
     */
    private String impressFid;

    /**
     * 点赞人uid
     */
    private String operateUser;

    /**
     * 设备号
     */
    private String deviceNum;

    /**
     * 点赞状态 1：点赞，-1：取消点赞
     */
    private Integer operateStatus;

    /**
     * 创建人uid
     */
    private String createUser;

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

    public String getImpressFid() {
        return impressFid;
    }

    public void setImpressFid(String impressFid) {
        this.impressFid = impressFid == null ? null : impressFid.trim();
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    public String getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    public Integer getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
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
}