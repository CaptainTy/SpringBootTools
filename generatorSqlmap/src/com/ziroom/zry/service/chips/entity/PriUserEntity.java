package com.ziroom.zry.service.chips.entity;

import java.util.Date;

public class PriUserEntity {
    /**
     * 表自增主键
     */
    private Long id;

    private String veneto;

    private String area;

    private String store;

    /**
     * 中文名
     */
    private String name;

    /**
     * 员工号
     */
    private String username;

    private String password;

    private Integer isEnable;

    private Integer type;

    private Integer userType;

    private String orgId;

    private String orgName;

    private String groupName;

    private String roleNames;

    private Integer groupId;

    private Integer isDel;

    private String emplid;

    private Integer emplRcd;

    private Date effdt;

    private Integer effseq;

    private String hlStatus;

    private String name1;

    private String lastName;

    private String firstName;

    private String nameAc;

    private String country;

    private String hlAddress;

    private String city;

    private String county;

    private String state;

    private String postal;

    private String sex;

    private String marStatus;

    private Date marStatusDt;

    private Date birthdate;

    private String birthcountry;

    private String birthstate;

    private String countryCode;

    /**
     * 手机号
     */
    private String phoneMobile;

    private String phoneCompany;

    private String phoneHome;

    /**
     * 员工邮箱前缀
     */
    private String hlUser;

    private String emailAddr;

    private String phoneFax;

    private String action;

    private String actionReason;

    private String setidDept;

    private String setidJobcode;

    private String setidLocation;

    private String deptid;

    private String hlTreepath;

    private String jobcode;

    private String supervisorId;

    private String emplStatus;

    private String location;

    private String company;

    private String hlAppCheck;

    private String hlTemClose;

    private Date effdtFrom;

    private Date hlOutDt;

    private String hlGlsFlag;

    private Date createDate;

    private String deptidNew;

    private String hlTreepathNew;

    private String jobcodeNew;

    private Date lastModifyTimeSynchronous;

    private Integer territoryCode;

    private Long zcUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVeneto() {
        return veneto;
    }

    public void setVeneto(String veneto) {
        this.veneto = veneto == null ? null : veneto.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store == null ? null : store.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(String roleNames) {
        this.roleNames = roleNames == null ? null : roleNames.trim();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getEmplid() {
        return emplid;
    }

    public void setEmplid(String emplid) {
        this.emplid = emplid == null ? null : emplid.trim();
    }

    public Integer getEmplRcd() {
        return emplRcd;
    }

    public void setEmplRcd(Integer emplRcd) {
        this.emplRcd = emplRcd;
    }

    public Date getEffdt() {
        return effdt;
    }

    public void setEffdt(Date effdt) {
        this.effdt = effdt;
    }

    public Integer getEffseq() {
        return effseq;
    }

    public void setEffseq(Integer effseq) {
        this.effseq = effseq;
    }

    public String getHlStatus() {
        return hlStatus;
    }

    public void setHlStatus(String hlStatus) {
        this.hlStatus = hlStatus == null ? null : hlStatus.trim();
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1 == null ? null : name1.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getNameAc() {
        return nameAc;
    }

    public void setNameAc(String nameAc) {
        this.nameAc = nameAc == null ? null : nameAc.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getHlAddress() {
        return hlAddress;
    }

    public void setHlAddress(String hlAddress) {
        this.hlAddress = hlAddress == null ? null : hlAddress.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal == null ? null : postal.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMarStatus() {
        return marStatus;
    }

    public void setMarStatus(String marStatus) {
        this.marStatus = marStatus == null ? null : marStatus.trim();
    }

    public Date getMarStatusDt() {
        return marStatusDt;
    }

    public void setMarStatusDt(Date marStatusDt) {
        this.marStatusDt = marStatusDt;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry == null ? null : birthcountry.trim();
    }

    public String getBirthstate() {
        return birthstate;
    }

    public void setBirthstate(String birthstate) {
        this.birthstate = birthstate == null ? null : birthstate.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile == null ? null : phoneMobile.trim();
    }

    public String getPhoneCompany() {
        return phoneCompany;
    }

    public void setPhoneCompany(String phoneCompany) {
        this.phoneCompany = phoneCompany == null ? null : phoneCompany.trim();
    }

    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome == null ? null : phoneHome.trim();
    }

    public String getHlUser() {
        return hlUser;
    }

    public void setHlUser(String hlUser) {
        this.hlUser = hlUser == null ? null : hlUser.trim();
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr == null ? null : emailAddr.trim();
    }

    public String getPhoneFax() {
        return phoneFax;
    }

    public void setPhoneFax(String phoneFax) {
        this.phoneFax = phoneFax == null ? null : phoneFax.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getActionReason() {
        return actionReason;
    }

    public void setActionReason(String actionReason) {
        this.actionReason = actionReason == null ? null : actionReason.trim();
    }

    public String getSetidDept() {
        return setidDept;
    }

    public void setSetidDept(String setidDept) {
        this.setidDept = setidDept == null ? null : setidDept.trim();
    }

    public String getSetidJobcode() {
        return setidJobcode;
    }

    public void setSetidJobcode(String setidJobcode) {
        this.setidJobcode = setidJobcode == null ? null : setidJobcode.trim();
    }

    public String getSetidLocation() {
        return setidLocation;
    }

    public void setSetidLocation(String setidLocation) {
        this.setidLocation = setidLocation == null ? null : setidLocation.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getHlTreepath() {
        return hlTreepath;
    }

    public void setHlTreepath(String hlTreepath) {
        this.hlTreepath = hlTreepath == null ? null : hlTreepath.trim();
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode == null ? null : jobcode.trim();
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(String supervisorId) {
        this.supervisorId = supervisorId == null ? null : supervisorId.trim();
    }

    public String getEmplStatus() {
        return emplStatus;
    }

    public void setEmplStatus(String emplStatus) {
        this.emplStatus = emplStatus == null ? null : emplStatus.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getHlAppCheck() {
        return hlAppCheck;
    }

    public void setHlAppCheck(String hlAppCheck) {
        this.hlAppCheck = hlAppCheck == null ? null : hlAppCheck.trim();
    }

    public String getHlTemClose() {
        return hlTemClose;
    }

    public void setHlTemClose(String hlTemClose) {
        this.hlTemClose = hlTemClose == null ? null : hlTemClose.trim();
    }

    public Date getEffdtFrom() {
        return effdtFrom;
    }

    public void setEffdtFrom(Date effdtFrom) {
        this.effdtFrom = effdtFrom;
    }

    public Date getHlOutDt() {
        return hlOutDt;
    }

    public void setHlOutDt(Date hlOutDt) {
        this.hlOutDt = hlOutDt;
    }

    public String getHlGlsFlag() {
        return hlGlsFlag;
    }

    public void setHlGlsFlag(String hlGlsFlag) {
        this.hlGlsFlag = hlGlsFlag == null ? null : hlGlsFlag.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDeptidNew() {
        return deptidNew;
    }

    public void setDeptidNew(String deptidNew) {
        this.deptidNew = deptidNew == null ? null : deptidNew.trim();
    }

    public String getHlTreepathNew() {
        return hlTreepathNew;
    }

    public void setHlTreepathNew(String hlTreepathNew) {
        this.hlTreepathNew = hlTreepathNew == null ? null : hlTreepathNew.trim();
    }

    public String getJobcodeNew() {
        return jobcodeNew;
    }

    public void setJobcodeNew(String jobcodeNew) {
        this.jobcodeNew = jobcodeNew == null ? null : jobcodeNew.trim();
    }

    public Date getLastModifyTimeSynchronous() {
        return lastModifyTimeSynchronous;
    }

    public void setLastModifyTimeSynchronous(Date lastModifyTimeSynchronous) {
        this.lastModifyTimeSynchronous = lastModifyTimeSynchronous;
    }

    public Integer getTerritoryCode() {
        return territoryCode;
    }

    public void setTerritoryCode(Integer territoryCode) {
        this.territoryCode = territoryCode;
    }

    public Long getZcUserId() {
        return zcUserId;
    }

    public void setZcUserId(Long zcUserId) {
        this.zcUserId = zcUserId;
    }
}