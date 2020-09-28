package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class DietOrderEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务Id
     */
    private String fid;

    /**
     * 日结fid
     */
    private String dayCheckFid;

    /**
     * 结账日期
     */
    private String reportDate;

    /**
     * 预订单号
     */
    private String orderNum;

    /**
     * 账单编号
     */
    private String billNum;

    /**
     * 来源 1：PC 2：APP 3：定时任务数据同步
     */
    private Integer orderSource;

    /**
     * 来源 0：不存在退款 1：存在退款
     */
    private Integer isRefund;

    /**
     * 支付状态 0：未支付
1：支付中
2：已支付
     */
    private Integer payStatus;

    /**
     * 同步财务状态 0：同步失败 1:同步成功
     */
    private Integer finStatus;

    /**
     * 账单应收
     */
    private Integer billAmount;

    /**
     * 账单实收
     */
    private Integer realAmount;

    /**
     * 消费流水
     */
    private Integer itemSale;

    /**
     * 服务费
     */
    private Integer serviceFeeIncome;

    /**
     * 退菜
     */
    private Integer backMoneyItem;

    /**
     * 折扣
     */
    private Integer discountMoney;

    /**
     * 折让
     */
    private Integer reductionMoney;

    /**
     * 奉送
     */
    private Integer freeMoney;

    /**
     * 抹零
     */
    private Integer molingMoney;

    /**
     * 多收礼券
     */
    private Integer couponsDs;

    /**
     * 收款公司编码
     */
    private String companyCode;

    /**
     * 备注
     */
    private String remark;

    /**
     * 结账时间
     */
    private Date paymentTime;

    /**
     * 收款员
     */
    private String cashierNum;

    /**
     * 创建人
     */
    private String createCode;

    /**
     * 最后一次修改人
     */
    private String modifyCode;

    /**
     * 是否删除 0:false 1:true
     */
    private Integer isDel;

    /**
     * 最后更新时间
     */
    private Date lastModifyDate;

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

    public String getDayCheckFid() {
        return dayCheckFid;
    }

    public void setDayCheckFid(String dayCheckFid) {
        this.dayCheckFid = dayCheckFid == null ? null : dayCheckFid.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum == null ? null : billNum.trim();
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getFinStatus() {
        return finStatus;
    }

    public void setFinStatus(Integer finStatus) {
        this.finStatus = finStatus;
    }

    public Integer getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Integer billAmount) {
        this.billAmount = billAmount;
    }

    public Integer getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Integer realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getItemSale() {
        return itemSale;
    }

    public void setItemSale(Integer itemSale) {
        this.itemSale = itemSale;
    }

    public Integer getServiceFeeIncome() {
        return serviceFeeIncome;
    }

    public void setServiceFeeIncome(Integer serviceFeeIncome) {
        this.serviceFeeIncome = serviceFeeIncome;
    }

    public Integer getBackMoneyItem() {
        return backMoneyItem;
    }

    public void setBackMoneyItem(Integer backMoneyItem) {
        this.backMoneyItem = backMoneyItem;
    }

    public Integer getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Integer discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Integer getReductionMoney() {
        return reductionMoney;
    }

    public void setReductionMoney(Integer reductionMoney) {
        this.reductionMoney = reductionMoney;
    }

    public Integer getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(Integer freeMoney) {
        this.freeMoney = freeMoney;
    }

    public Integer getMolingMoney() {
        return molingMoney;
    }

    public void setMolingMoney(Integer molingMoney) {
        this.molingMoney = molingMoney;
    }

    public Integer getCouponsDs() {
        return couponsDs;
    }

    public void setCouponsDs(Integer couponsDs) {
        this.couponsDs = couponsDs;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getCashierNum() {
        return cashierNum;
    }

    public void setCashierNum(String cashierNum) {
        this.cashierNum = cashierNum == null ? null : cashierNum.trim();
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}