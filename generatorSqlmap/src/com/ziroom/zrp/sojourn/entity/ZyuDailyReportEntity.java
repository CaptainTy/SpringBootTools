package com.ziroom.zrp.sojourn.entity;

import java.util.Date;

public class ZyuDailyReportEntity {
    /**
     * 业务线:1、自如寓;2、自如驿
     */
    private Integer serviceLine;

    /**
     * 项目fid
     */
    private String projectFid;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 城市code
     */
    private String cityCode;

    /**
     * 组织机构uid
     */
    private String organUid;

    /**
     * 当日 房源数(总库存)
     */
    private String houseCount;

    /**
     * 当日 间夜数
     */
    private Integer todayNightCount;

    /**
     * 当月1号至落库时间前一天 间夜数
     */
    private Integer tmonthNightCount;

    /**
     * 当日 出租率
     */
    private Double todayOccupancyRate;

    /**
     * 当月1号至落库时间前一天 出租率
     */
    private Double tmonthOccupancyRate;

    /**
     * 当日 在租房源平均价格
     */
    private Double todayTrentingHousePrice;

    /**
     * 当月1号至落库时间前一天 在租房源平均价格
     */
    private Double tmonthTrentingHousePrice;

    /**
     * 当日 实际收入
     */
    private Double todayActIncome;

    /**
     * 当月1号至落库时间前一天 实际收入
     */
    private Double tmonthActIncome;

    /**
     * 当日 预测GOP
     */
    private Double todayForecastGop;

    /**
     * 当月1号至落库时间前一天 预测GOP
     */
    private Double tmonthForecastGop;

    /**
     * 当日 预订数
     */
    private Integer todayBookCount;

    /**
     * 当月1号至落库时间前一天 预订数
     */
    private Integer tmonthBookCount;

    /**
     * 当日 新签数
     */
    private Integer todayNewSignCount;

    /**
     * 当月1号至落库时间前一天 新签数
     */
    private Integer tmonthNewSignCount;

    /**
     * 当日 续约数
     */
    private Integer todayRenewCount;

    /**
     * 当月1号至落库时间前一天 续约数
     */
    private Integer tmonthRenewCount;

    /**
     * 当日 解约数
     */
    private Integer todaySurrenderCount;

    /**
     * 当月1号至落库时间前一天 解约数
     */
    private Integer tmonthSurrenderCount;

    /**
     * 当日 续约率
     */
    private Double todayRenewRate;

    /**
     * 当月1号至落库时间前一天 续约率
     */
    private Double tmonthRenewRate;

    /**
     * 本月即将到期的合同数(次日至月底即将到期合同数量)
     */
    private Integer expiringContractMonth;

    /**
     * 当日 空置间夜数
     */
    private Integer todayVacantNight;

    /**
     * 当月1号至落库时间前一天 空置间夜数
     */
    private Integer tmonthVacantNight;

    /**
     * 落库日期(当日+1d)
     */
    private Date inDate;

    /**
     * 0：未删除  1：删除
     */
    private Integer isDel;

    /**
     * 创建时间（供刷新用）
     */
    private Date createTime;

    public Integer getServiceLine() {
        return serviceLine;
    }

    public void setServiceLine(Integer serviceLine) {
        this.serviceLine = serviceLine;
    }

    public String getProjectFid() {
        return projectFid;
    }

    public void setProjectFid(String projectFid) {
        this.projectFid = projectFid == null ? null : projectFid.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getOrganUid() {
        return organUid;
    }

    public void setOrganUid(String organUid) {
        this.organUid = organUid == null ? null : organUid.trim();
    }

    public String getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(String houseCount) {
        this.houseCount = houseCount == null ? null : houseCount.trim();
    }

    public Integer getTodayNightCount() {
        return todayNightCount;
    }

    public void setTodayNightCount(Integer todayNightCount) {
        this.todayNightCount = todayNightCount;
    }

    public Integer getTmonthNightCount() {
        return tmonthNightCount;
    }

    public void setTmonthNightCount(Integer tmonthNightCount) {
        this.tmonthNightCount = tmonthNightCount;
    }

    public Double getTodayOccupancyRate() {
        return todayOccupancyRate;
    }

    public void setTodayOccupancyRate(Double todayOccupancyRate) {
        this.todayOccupancyRate = todayOccupancyRate;
    }

    public Double getTmonthOccupancyRate() {
        return tmonthOccupancyRate;
    }

    public void setTmonthOccupancyRate(Double tmonthOccupancyRate) {
        this.tmonthOccupancyRate = tmonthOccupancyRate;
    }

    public Double getTodayTrentingHousePrice() {
        return todayTrentingHousePrice;
    }

    public void setTodayTrentingHousePrice(Double todayTrentingHousePrice) {
        this.todayTrentingHousePrice = todayTrentingHousePrice;
    }

    public Double getTmonthTrentingHousePrice() {
        return tmonthTrentingHousePrice;
    }

    public void setTmonthTrentingHousePrice(Double tmonthTrentingHousePrice) {
        this.tmonthTrentingHousePrice = tmonthTrentingHousePrice;
    }

    public Double getTodayActIncome() {
        return todayActIncome;
    }

    public void setTodayActIncome(Double todayActIncome) {
        this.todayActIncome = todayActIncome;
    }

    public Double getTmonthActIncome() {
        return tmonthActIncome;
    }

    public void setTmonthActIncome(Double tmonthActIncome) {
        this.tmonthActIncome = tmonthActIncome;
    }

    public Double getTodayForecastGop() {
        return todayForecastGop;
    }

    public void setTodayForecastGop(Double todayForecastGop) {
        this.todayForecastGop = todayForecastGop;
    }

    public Double getTmonthForecastGop() {
        return tmonthForecastGop;
    }

    public void setTmonthForecastGop(Double tmonthForecastGop) {
        this.tmonthForecastGop = tmonthForecastGop;
    }

    public Integer getTodayBookCount() {
        return todayBookCount;
    }

    public void setTodayBookCount(Integer todayBookCount) {
        this.todayBookCount = todayBookCount;
    }

    public Integer getTmonthBookCount() {
        return tmonthBookCount;
    }

    public void setTmonthBookCount(Integer tmonthBookCount) {
        this.tmonthBookCount = tmonthBookCount;
    }

    public Integer getTodayNewSignCount() {
        return todayNewSignCount;
    }

    public void setTodayNewSignCount(Integer todayNewSignCount) {
        this.todayNewSignCount = todayNewSignCount;
    }

    public Integer getTmonthNewSignCount() {
        return tmonthNewSignCount;
    }

    public void setTmonthNewSignCount(Integer tmonthNewSignCount) {
        this.tmonthNewSignCount = tmonthNewSignCount;
    }

    public Integer getTodayRenewCount() {
        return todayRenewCount;
    }

    public void setTodayRenewCount(Integer todayRenewCount) {
        this.todayRenewCount = todayRenewCount;
    }

    public Integer getTmonthRenewCount() {
        return tmonthRenewCount;
    }

    public void setTmonthRenewCount(Integer tmonthRenewCount) {
        this.tmonthRenewCount = tmonthRenewCount;
    }

    public Integer getTodaySurrenderCount() {
        return todaySurrenderCount;
    }

    public void setTodaySurrenderCount(Integer todaySurrenderCount) {
        this.todaySurrenderCount = todaySurrenderCount;
    }

    public Integer getTmonthSurrenderCount() {
        return tmonthSurrenderCount;
    }

    public void setTmonthSurrenderCount(Integer tmonthSurrenderCount) {
        this.tmonthSurrenderCount = tmonthSurrenderCount;
    }

    public Double getTodayRenewRate() {
        return todayRenewRate;
    }

    public void setTodayRenewRate(Double todayRenewRate) {
        this.todayRenewRate = todayRenewRate;
    }

    public Double getTmonthRenewRate() {
        return tmonthRenewRate;
    }

    public void setTmonthRenewRate(Double tmonthRenewRate) {
        this.tmonthRenewRate = tmonthRenewRate;
    }

    public Integer getExpiringContractMonth() {
        return expiringContractMonth;
    }

    public void setExpiringContractMonth(Integer expiringContractMonth) {
        this.expiringContractMonth = expiringContractMonth;
    }

    public Integer getTodayVacantNight() {
        return todayVacantNight;
    }

    public void setTodayVacantNight(Integer todayVacantNight) {
        this.todayVacantNight = todayVacantNight;
    }

    public Integer getTmonthVacantNight() {
        return tmonthVacantNight;
    }

    public void setTmonthVacantNight(Integer tmonthVacantNight) {
        this.tmonthVacantNight = tmonthVacantNight;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}