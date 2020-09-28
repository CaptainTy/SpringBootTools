package com.ziroom.zspace.service.card.entity;

import java.util.Date;

public class CardLottery {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 业务主键 业务主键
     */
    private String fid;

    /**
     * 会员卡编号  支付成功回掉生成
     */
    private String cardSn;

    /**
     * 会员卡类fid
     */
    private String cardCategoryFid;

    /**
     * 持卡人uid
     */
    private String ownerUid;

    /**
     * 已经抽奖？：0:false 1:true
     */
    private Integer isHave;

    /**
     * 持卡人电话
     */
    private String ownerPhone;

    /**
     * 创建人系统号
     */
    private String createCode;

    /**
     * 是否删除：0:false 1:true
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
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

    public String getCardSn() {
        return cardSn;
    }

    public void setCardSn(String cardSn) {
        this.cardSn = cardSn == null ? null : cardSn.trim();
    }

    public String getCardCategoryFid() {
        return cardCategoryFid;
    }

    public void setCardCategoryFid(String cardCategoryFid) {
        this.cardCategoryFid = cardCategoryFid == null ? null : cardCategoryFid.trim();
    }

    public String getOwnerUid() {
        return ownerUid;
    }

    public void setOwnerUid(String ownerUid) {
        this.ownerUid = ownerUid == null ? null : ownerUid.trim();
    }

    public Integer getIsHave() {
        return isHave;
    }

    public void setIsHave(Integer isHave) {
        this.isHave = isHave;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone == null ? null : ownerPhone.trim();
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode == null ? null : createCode.trim();
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

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}