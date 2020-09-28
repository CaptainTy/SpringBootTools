package com.ziroom.zhumo.entity;

public class AfterAssessmentReportEntityKey {
    private Long id;

    /**
     * 会计区间(分区字段)
     */
    private String period;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }
}