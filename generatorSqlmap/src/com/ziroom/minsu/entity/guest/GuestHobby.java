package com.ziroom.minsu.entity.guest;

import java.util.Date;

public class GuestHobby {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 喜好标识
     */
    private String fid;

    /**
     * 顾客标识
     */
    private String guestFid;

    /**
     * 顾客喜好描述
     */
    private String guestHobby;

    /**
     * 删除 0否 1是
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String createFid;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新人
     */
    private String lastModifyFid;

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

    public String getGuestFid() {
        return guestFid;
    }

    public void setGuestFid(String guestFid) {
        this.guestFid = guestFid == null ? null : guestFid.trim();
    }

    public String getGuestHobby() {
        return guestHobby;
    }

    public void setGuestHobby(String guestHobby) {
        this.guestHobby = guestHobby == null ? null : guestHobby.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getCreateFid() {
        return createFid;
    }

    public void setCreateFid(String createFid) {
        this.createFid = createFid == null ? null : createFid.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLastModifyFid() {
        return lastModifyFid;
    }

    public void setLastModifyFid(String lastModifyFid) {
        this.lastModifyFid = lastModifyFid == null ? null : lastModifyFid.trim();
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}