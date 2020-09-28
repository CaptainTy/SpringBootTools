package com.ziroom.zspace.service.order.entity;

public class RecoupJobEntity {
    /**
     * 补偿作业表ID
     */
    private Long id;

    /**
     * 执行补偿业务逻辑的类,全类名,必须实现IRecoup接口
     */
    private String jobClass;

    /**
     * 补偿任务名称,全英文
     */
    private String jobName;

    /**
     * 补偿任务描述
     */
    private String jobDesc;

    /**
     * 补偿任务执行类的json参数
     */
    private String jobJsonParam;

    /**
     * 补偿job状态,execute待执行，executing执行中，successed执行成功，failed执行失败, paused暂停
     */
    private String jobStatus;

    /**
     * 补偿job开始时间,到秒绝对时间如20160720121212
     */
    private Long startTime;

    /**
     * 补偿job完成时间,到秒绝对时间如20160720121212
     */
    private Long completeTime;

    /**
     * 补偿job创建时间,到秒绝对时间如20160720121212
     */
    private Long createTime;

    /**
     * 补偿截止时间,到秒绝对时间如20160720121212，超过该时间没成功放弃补偿
     */
    private Long effectTime;

    /**
     * 当前重试次数
     */
    private Integer retryCurTimes;

    /**
     * 重试总次数,超过该次数还没有补偿成功自动放弃补偿
     */
    private Integer retryTotalTimes;

    /**
     * 执行失败原因
     */
    private String failReason;

    /**
     * 是否开启异步执行,0同步执行 1异步执行
     */
    private Integer async;

    /**
     * 业务编码
     */
    private String busCode;

    /**
     * 执行失败报警标志，0未报警 1已报警
     */
    private Integer failAlarmFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass == null ? null : jobClass.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public String getJobJsonParam() {
        return jobJsonParam;
    }

    public void setJobJsonParam(String jobJsonParam) {
        this.jobJsonParam = jobJsonParam == null ? null : jobJsonParam.trim();
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus == null ? null : jobStatus.trim();
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Long completeTime) {
        this.completeTime = completeTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Long effectTime) {
        this.effectTime = effectTime;
    }

    public Integer getRetryCurTimes() {
        return retryCurTimes;
    }

    public void setRetryCurTimes(Integer retryCurTimes) {
        this.retryCurTimes = retryCurTimes;
    }

    public Integer getRetryTotalTimes() {
        return retryTotalTimes;
    }

    public void setRetryTotalTimes(Integer retryTotalTimes) {
        this.retryTotalTimes = retryTotalTimes;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }

    public Integer getAsync() {
        return async;
    }

    public void setAsync(Integer async) {
        this.async = async;
    }

    public String getBusCode() {
        return busCode;
    }

    public void setBusCode(String busCode) {
        this.busCode = busCode == null ? null : busCode.trim();
    }

    public Integer getFailAlarmFlag() {
        return failAlarmFlag;
    }

    public void setFailAlarmFlag(Integer failAlarmFlag) {
        this.failAlarmFlag = failAlarmFlag;
    }
}