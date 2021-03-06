package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcImpressCommentLogEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 逻辑fid
     */
    private String fid;

    /**
     * 评论fid
     */
    private String commentFid;

    /**
     * 初始状态
     */
    private Integer fromStatus;

    /**
     * 改变后状态
     */
    private Integer toStatus;

    /**
     * 是否删除 0：否，1：是
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

    public String getCommentFid() {
        return commentFid;
    }

    public void setCommentFid(String commentFid) {
        this.commentFid = commentFid == null ? null : commentFid.trim();
    }

    public Integer getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(Integer fromStatus) {
        this.fromStatus = fromStatus;
    }

    public Integer getToStatus() {
        return toStatus;
    }

    public void setToStatus(Integer toStatus) {
        this.toStatus = toStatus;
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
}