package com.ziroom.minsu.entity.guest;

import java.util.Date;

public class Guest {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 顾客标识
     */
    private String fid;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 证件类型(0=其他 1=身份证 2=护照 3=军官证 4=通行证 5=驾驶证 6=台胞证 7=社保卡 8=省份证 9=社保卡 10=学生证 11=回乡证 12=营业执照 13=港澳通行证 14户口本 15=居住证 16=营业执照)
暂时只支持身份证
     */
    private Integer idType;

    /**
     * 证件号码
     */
    private String idNumber;

    /**
     * 性别 0女 1男 2未知
     */
    private Integer gender;

    /**
     * 出生日期 yyyy-MM-dd
     */
    private String birth;

    /**
     * 籍贯
     */
    private String birthplace;

    /**
     * 证件地址
     */
    private String idAddress;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 删除 0否 1是
     */
    private Integer isDel;

    /**
     * 创建人  （自如员工：系统号，平台进入：001）
     */
    private String createFid;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private String lastModifyFid;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress == null ? null : idAddress.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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