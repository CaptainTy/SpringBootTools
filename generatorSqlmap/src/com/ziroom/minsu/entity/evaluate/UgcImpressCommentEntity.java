package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcImpressCommentEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标识
     */
    private String fid;

    /**
     * 印象fid
     */
    private String impressFid;

    /**
     * 一级评论fid
     */
    private String aLevelCommentFid;

    /**
     * 评论父fid
     */
    private String commentParentFid;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 回复人fid
     */
    private String replyUser;

    /**
     * 发表人fid
     */
    private String postUser;

    /**
     * 回复人类型 0官方回复 1 用户回复
     */
    private Integer replyType;

    /**
     * 评论状态 0:已屏蔽 1:未屏蔽
     */
    private Integer commentStatus;

    /**
     * 是否删除  0否 1是
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 更新时间
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

    public String getImpressFid() {
        return impressFid;
    }

    public void setImpressFid(String impressFid) {
        this.impressFid = impressFid == null ? null : impressFid.trim();
    }

    public String getaLevelCommentFid() {
        return aLevelCommentFid;
    }

    public void setaLevelCommentFid(String aLevelCommentFid) {
        this.aLevelCommentFid = aLevelCommentFid == null ? null : aLevelCommentFid.trim();
    }

    public String getCommentParentFid() {
        return commentParentFid;
    }

    public void setCommentParentFid(String commentParentFid) {
        this.commentParentFid = commentParentFid == null ? null : commentParentFid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser == null ? null : replyUser.trim();
    }

    public String getPostUser() {
        return postUser;
    }

    public void setPostUser(String postUser) {
        this.postUser = postUser == null ? null : postUser.trim();
    }

    public Integer getReplyType() {
        return replyType;
    }

    public void setReplyType(Integer replyType) {
        this.replyType = replyType;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
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