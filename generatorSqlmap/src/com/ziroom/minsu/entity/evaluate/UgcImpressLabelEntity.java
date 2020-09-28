package com.ziroom.minsu.entity.evaluate;

import java.util.Date;

public class UgcImpressLabelEntity {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标识
     */
    private String fid;

    /**
     * 印象fid
     */
    private String impressFid;

    /**
     * 标签fid
     */
    private String labelFid;

    /**
     * 标签快照
     */
    private String labelNameSnap;

    /**
     * 是否删除 0否 1是 
     */
    private Integer isDel;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
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

    public String getImpressFid() {
        return impressFid;
    }

    public void setImpressFid(String impressFid) {
        this.impressFid = impressFid == null ? null : impressFid.trim();
    }

    public String getLabelFid() {
        return labelFid;
    }

    public void setLabelFid(String labelFid) {
        this.labelFid = labelFid == null ? null : labelFid.trim();
    }

    public String getLabelNameSnap() {
        return labelNameSnap;
    }

    public void setLabelNameSnap(String labelNameSnap) {
        this.labelNameSnap = labelNameSnap == null ? null : labelNameSnap.trim();
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