package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcCouponDetailEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 标识
     */
    private String fid;

    /**
     * UGC标识
     */
    private String ugcFid;

    /**
     * UGC类型标识
     */
    private String ugcCategoryFid;

    /**
     * 券包标识
     */
    private String packageFid;

    /**
     * 券包名字
     */
    private String packageName;

    /**
     * 券标识
     */
    private String couponFid;

    /**
     * 券名字
     */
    private String couponName;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 用户uid
     */
    private String userUid;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 状态 1:未激活 2:未使用 3:已使用 4:已过期
     */
    private Integer status;

    /**
     * 删除标记 0:否，1:是
     */
    private Integer isDel;

    /**
     * 核销人
     */
    private String operateUser;

    /**
     * 核销时间
     */
    private Date operateTime;

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

    public String getUgcFid() {
        return ugcFid;
    }

    public void setUgcFid(String ugcFid) {
        this.ugcFid = ugcFid == null ? null : ugcFid.trim();
    }

    public String getUgcCategoryFid() {
        return ugcCategoryFid;
    }

    public void setUgcCategoryFid(String ugcCategoryFid) {
        this.ugcCategoryFid = ugcCategoryFid == null ? null : ugcCategoryFid.trim();
    }

    public String getPackageFid() {
        return packageFid;
    }

    public void setPackageFid(String packageFid) {
        this.packageFid = packageFid == null ? null : packageFid.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getCouponFid() {
        return couponFid;
    }

    public void setCouponFid(String couponFid) {
        this.couponFid = couponFid == null ? null : couponFid.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
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