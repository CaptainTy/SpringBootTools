package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class FavourActivityProjectEntity {
    private Integer id;

    /**
     * 业务id
     */
    private String bid;

    /**
     * 是否删除0-正常；1-删除；
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次修改人
     */
    private String lastModifyUserId;

    /**
     * 上次修改时间
     */
    private Date lastModifyTime;

    /**
     * 是否有效0-无效；1-有效
     */
    private Integer isValid;

    /**
     * 此项目所绑定的优惠活动bid
     */
    private String activityBid;

    /**
     * 项目bid
     */
    private String projectBid;

    /**
     * 优惠活动限定的项目下的房型bid
     */
    private String houseTypeBid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId == null ? null : lastModifyUserId.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getActivityBid() {
        return activityBid;
    }

    public void setActivityBid(String activityBid) {
        this.activityBid = activityBid == null ? null : activityBid.trim();
    }

    public String getProjectBid() {
        return projectBid;
    }

    public void setProjectBid(String projectBid) {
        this.projectBid = projectBid == null ? null : projectBid.trim();
    }

    public String getHouseTypeBid() {
        return houseTypeBid;
    }

    public void setHouseTypeBid(String houseTypeBid) {
        this.houseTypeBid = houseTypeBid == null ? null : houseTypeBid.trim();
    }
}