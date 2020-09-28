package com.ziroom.zspace.service.card.entity;

import java.util.Date;

public class TzxActivityRulesEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务主键
     */
    private String fid;

    /**
     * 天子星券类id
     */
    private Integer classId;

    /**
     * 天子星券类code
     */
    private String classCode;

    /**
     * 天子星券类名称
     */
    private String className;

    /**
     * 天子星券属性，代金券=”coupons_deduct”，菜品券=”coupons_dish”
     */
    private String couponsPro;

    /**
     * 天子星券种id
     */
    private Integer couponsTypeId;

    /**
     * 天子星券种father_id
     */
    private Integer couponsTypeFatherId;

    /**
     * 天子星券面值 单位分
     */
    private Integer faceValue;

    /**
     * 售卖数量，该优惠套餐的发售数量
     */
    private Integer saleTotal;

    /**
     * 售卖金额 单位分
     */
    private Integer saleMoney;

    /**
     * 天子星券售卖积分
     */
    private Integer saleCredit;

    /**
     * 每个用户购买/领取次数限制，0=不限制
     */
    private Integer buyCount;

    /**
     * 开始使用日期，格式"2019-07-02"
     */
    private String startCoupon;

    /**
     * 结束使用日期，格式"2019-08-06"
     */
    private String endCoupon;

    /**
     * 使用周期，1=周一，2=周二，3=周三，4=周四，5=周五，6=周六，7=周日
     */
    private String useCycle;

    /**
     * 使用时段,开始时间,格式"01:00:00"
     */
    private String beginTime;

    /**
     * 每笔账单允许使用N张
     */
    private Integer billLimitNum;

    /**
     * 每笔账单满N分才能使用 单位分
     */
    private Integer billLimitMoney;

    /**
     * 使用时段，结束时间，格式"23:00:00"
     */
    private String endTime;

    /**
     * 是否与其它优惠券同时使用，0=否，1=是
     */
    private Integer usedOther;

    /**
     * 可使用渠道
     */
    private String useChanel;

    /**
     * 可使用门店
     */
    private String storeIds;

    /**
     * 创建人系统号
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 修改时间
     */
    private Date lastModifyDate;

    /**
     * 是否删除：0:false 1:true
     */
    private Integer isDel;

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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getCouponsPro() {
        return couponsPro;
    }

    public void setCouponsPro(String couponsPro) {
        this.couponsPro = couponsPro == null ? null : couponsPro.trim();
    }

    public Integer getCouponsTypeId() {
        return couponsTypeId;
    }

    public void setCouponsTypeId(Integer couponsTypeId) {
        this.couponsTypeId = couponsTypeId;
    }

    public Integer getCouponsTypeFatherId() {
        return couponsTypeFatherId;
    }

    public void setCouponsTypeFatherId(Integer couponsTypeFatherId) {
        this.couponsTypeFatherId = couponsTypeFatherId;
    }

    public Integer getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Integer faceValue) {
        this.faceValue = faceValue;
    }

    public Integer getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Integer saleTotal) {
        this.saleTotal = saleTotal;
    }

    public Integer getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(Integer saleMoney) {
        this.saleMoney = saleMoney;
    }

    public Integer getSaleCredit() {
        return saleCredit;
    }

    public void setSaleCredit(Integer saleCredit) {
        this.saleCredit = saleCredit;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public String getStartCoupon() {
        return startCoupon;
    }

    public void setStartCoupon(String startCoupon) {
        this.startCoupon = startCoupon == null ? null : startCoupon.trim();
    }

    public String getEndCoupon() {
        return endCoupon;
    }

    public void setEndCoupon(String endCoupon) {
        this.endCoupon = endCoupon == null ? null : endCoupon.trim();
    }

    public String getUseCycle() {
        return useCycle;
    }

    public void setUseCycle(String useCycle) {
        this.useCycle = useCycle == null ? null : useCycle.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public Integer getBillLimitNum() {
        return billLimitNum;
    }

    public void setBillLimitNum(Integer billLimitNum) {
        this.billLimitNum = billLimitNum;
    }

    public Integer getBillLimitMoney() {
        return billLimitMoney;
    }

    public void setBillLimitMoney(Integer billLimitMoney) {
        this.billLimitMoney = billLimitMoney;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getUsedOther() {
        return usedOther;
    }

    public void setUsedOther(Integer usedOther) {
        this.usedOther = usedOther;
    }

    public String getUseChanel() {
        return useChanel;
    }

    public void setUseChanel(String useChanel) {
        this.useChanel = useChanel == null ? null : useChanel.trim();
    }

    public String getStoreIds() {
        return storeIds;
    }

    public void setStoreIds(String storeIds) {
        this.storeIds = storeIds == null ? null : storeIds.trim();
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}