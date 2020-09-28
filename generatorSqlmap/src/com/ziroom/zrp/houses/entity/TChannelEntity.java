package com.ziroom.zrp.houses.entity;

import java.util.Date;

public class TChannelEntity {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 逻辑主键
     */
    private String fid;

    /**
     * 模块fid  房型fid，项目fid
     */
    private String moduleFid;

    /**
     * 渠道code 大首页：dsy
     */
    private String channelCode;

    /**
     * 渠道状态;0:开启 1:关闭
     */
    private Integer channelStatus;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String lastModifyBy;

    /**
     * 最后更新时间
     */
    private Date lastModifyTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 删除标记;0:未删除 1:删除
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

    public String getModuleFid() {
        return moduleFid;
    }

    public void setModuleFid(String moduleFid) {
        this.moduleFid = moduleFid == null ? null : moduleFid.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public Integer getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(Integer channelStatus) {
        this.channelStatus = channelStatus;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy == null ? null : lastModifyBy.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}