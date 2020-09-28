package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class DietOrderDayCheckEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑标识
     */
    private String fid;

    /**
     * 结账日期
     */
    private String reportDate;

    /**
     * 门店编码
     */
    private String shopCode;

    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 订单数目
     */
    private Integer orderNum;

    /**
     * 订单任务获取状态 0:尚未同步 1:获取失败  2:获取成功
     */
    private Integer orderStatus;

    /**
     * 同步财务状态 0:尚未同步 1:获取失败  2:获取成功
     */
    private Integer finStatus;

    /**
     * 是否删除 0:否 1:是
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createCode;

    /**
     * 最后一次修改人
     */
    private String modifyCode;

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

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode == null ? null : shopCode.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getFinStatus() {
        return finStatus;
    }

    public void setFinStatus(Integer finStatus) {
        this.finStatus = finStatus;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode == null ? null : createCode.trim();
    }

    public String getModifyCode() {
        return modifyCode;
    }

    public void setModifyCode(String modifyCode) {
        this.modifyCode = modifyCode == null ? null : modifyCode.trim();
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