package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class EvalFollowUpEntity {
    private Integer id;

    /**
     * 业务id
     */
    private String bid;

    /**
     * 低评业务标识
     */
    private String lowEvaluateBid;

    /**
     *  跟进内容
     */
    private String content;

    /**
     * 是否删除0-正常；1-删除；
     */
    private Integer isDel;

    /**
     * 是否有效0-无效；1-有效
     */
    private Integer isValid;

    /**
     * 创建人
     */
    private String createUserId;

    /**
     * 创建人姓名
     */
    private String createUserName;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public String getLowEvaluateBid() {
        return lowEvaluateBid;
    }

    public void setLowEvaluateBid(String lowEvaluateBid) {
        this.lowEvaluateBid = lowEvaluateBid == null ? null : lowEvaluateBid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}