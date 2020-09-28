package com.ziroom.zrp.performance.entity;

import java.util.Date;

public class IncomeCostItemLevel {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 一级费用项code
     */
    private String businessCode1;

    /**
     * 一级费用项名称
     */
    private String businessName1;

    /**
     * 二级费用项code
     */
    private String businessCode2;

    /**
     * 二级费用项名称
     */
    private String businessName2;

    /**
     * 三级费用项code
     */
    private String businessCode3;

    /**
     * 三级费用项名称
     */
    private String businessName3;

    /**
     * 四级费用项code
     */
    private String businessCode4;

    /**
     * 四级费用项名称
     */
    private String businessName4;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改人
     */
    private String lastModifyBy;

    /**
     * 最后修改时间
     */
    private Date lastModifyTime;

    /**
     * 0-未删除，1-已删除
     */
    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessCode1() {
        return businessCode1;
    }

    public void setBusinessCode1(String businessCode1) {
        this.businessCode1 = businessCode1 == null ? null : businessCode1.trim();
    }

    public String getBusinessName1() {
        return businessName1;
    }

    public void setBusinessName1(String businessName1) {
        this.businessName1 = businessName1 == null ? null : businessName1.trim();
    }

    public String getBusinessCode2() {
        return businessCode2;
    }

    public void setBusinessCode2(String businessCode2) {
        this.businessCode2 = businessCode2 == null ? null : businessCode2.trim();
    }

    public String getBusinessName2() {
        return businessName2;
    }

    public void setBusinessName2(String businessName2) {
        this.businessName2 = businessName2 == null ? null : businessName2.trim();
    }

    public String getBusinessCode3() {
        return businessCode3;
    }

    public void setBusinessCode3(String businessCode3) {
        this.businessCode3 = businessCode3 == null ? null : businessCode3.trim();
    }

    public String getBusinessName3() {
        return businessName3;
    }

    public void setBusinessName3(String businessName3) {
        this.businessName3 = businessName3 == null ? null : businessName3.trim();
    }

    public String getBusinessCode4() {
        return businessCode4;
    }

    public void setBusinessCode4(String businessCode4) {
        this.businessCode4 = businessCode4 == null ? null : businessCode4.trim();
    }

    public String getBusinessName4() {
        return businessName4;
    }

    public void setBusinessName4(String businessName4) {
        this.businessName4 = businessName4 == null ? null : businessName4.trim();
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

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}