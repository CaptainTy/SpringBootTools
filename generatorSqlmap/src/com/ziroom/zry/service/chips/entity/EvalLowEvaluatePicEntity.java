package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class EvalLowEvaluatePicEntity {
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
     * 7.星级 4.标签 5.图片
     */
    private Integer questionType;

    /**
     *  类型解释
     */
    private String questionContent;

    /**
     *  具体各个选项描述
     */
    private String answerContent;

    /**
     * 分数
     */
    private String answerScore;

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

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    public String getAnswerScore() {
        return answerScore;
    }

    public void setAnswerScore(String answerScore) {
        this.answerScore = answerScore == null ? null : answerScore.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}