package com.ziroom.zspace.service.order.entity;

import java.util.Date;

public class DietOrderRefundEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务Id
     */
    private String fid;

    /**
     * 账单编号
     */
    private String billNum;

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
     * 退款状态 0：发起退款
1:退款失败
2:退款成功
     */
    private Integer refundStatus;

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

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum == null ? null : billNum.trim();
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

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
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