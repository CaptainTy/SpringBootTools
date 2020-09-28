package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcCouponJobEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑标识
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
     * 用户标识
     */
    private String uid;

    /**
     * 任务状态 0:失败  1:成功
     */
    private Integer status;

    /**
     * 是否删除 0:否 1:是
     */
    private Integer isDel;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
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