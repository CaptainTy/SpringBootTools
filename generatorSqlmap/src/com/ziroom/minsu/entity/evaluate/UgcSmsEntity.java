package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcSmsEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑fid
     */
    private String fid;

    /**
     * 印象fid
     */
    private String impressFid;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 短信内容
     */
    private String content;

    /**
     * 二维码地址
     */
    private String codeAddress;

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

    public String getImpressFid() {
        return impressFid;
    }

    public void setImpressFid(String impressFid) {
        this.impressFid = impressFid == null ? null : impressFid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCodeAddress() {
        return codeAddress;
    }

    public void setCodeAddress(String codeAddress) {
        this.codeAddress = codeAddress == null ? null : codeAddress.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}