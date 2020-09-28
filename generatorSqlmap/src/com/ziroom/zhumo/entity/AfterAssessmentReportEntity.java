package com.ziroom.zhumo.entity;

public class AfterAssessmentReportEntity extends AfterAssessmentReportEntityKey {
    private String hireContractCode;

    /**
     * 业务线编号
     */
    private String businessLineCode;

    /**
     * 业务线名称
     */
    private String businessLineName;

    /**
     * 产品编号
     */
    private String productCode;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品线id
     */
    private String productLineId;

    /**
     * 产品线
     */
    private String productLine;

    /**
     * 产品版本id
     */
    private String productVersionId;

    /**
     * 产品版本
     */
    private String productVersion;

    /**
     * 月度
     */
    private String month;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 城市
     */
    private String city;

    /**
     * 战区编码
     */
    private String warZoneCode;

    /**
     * 战区
     */
    private String warZone;

    /**
     * 大区编码
     */
    private String regionCode;

    /**
     * 大区
     */
    private String region;

    /**
     * 业务组编码
     */
    private String businessGroupCode;

    /**
     * 业务组名称
     */
    private String businessGroup;

    /**
     * 楼盘id
     */
    private String resblockId;

    /**
     * 楼盘名称
     */
    private String resblockName;

    /**
     * 出租方式
     */
    private String rentType;

    /**
     * 收房渠道
     */
    private String hireChannel;

    /**
     * 装修程度id
     */
    private String finishedLevelId;

    /**
     * 装修程度
     */
    private String finishedLevel;

    /**
     * 改后卧室数量
     */
    private Integer disposeBedroomAmount;

    /**
     * 改后卧室数量描述
     */
    private String disposeBedroomDesc;

    /**
     * 收房持有天数
     */
    private Integer holdDays;

    /**
     * 收房持有天数段
     */
    private String holdDaysSegment;

    /**
     * 本期收房量
     */
    private Double amountOfHousingInThisPeriod;

    /**
     * 本期出房量
     */
    private Double amountOfHousingInThisIssue;

    /**
     * 在租间月数
     */
    private Double monthsInRent;

    /**
     * 房源间月数
     */
    private Double monthsBetweenListings;

    /**
     * 单量
     */
    private Double singleQuantity;

    /**
     * gmv
     */
    private Double gmv;

    /**
     * 减免前营业收入
     */
    private Double revenueBeforeDeduction;

    /**
     * 减免
     */
    private Double relief;

    /**
     * 减免后营业收入
     */
    private Double revenueAfterDeduction;

    /**
     * 业主端收入
     */
    private Double ownerIncome;

    /**
     * 房租收入
     */
    private Double rentIncome;

    /**
     * 房租支出
     */
    private Double rentExpenses;

    /**
     * 服务费收入
     */
    private Double serviceFeeIncome;

    /**
     * 出房服务费
     */
    private Double outOfServiceServiceFee;

    /**
     * 转租服务费
     */
    private Double subleaseServiceFee;

    /**
     * 违约金收入
     */
    private Double liquidatedDamages;

    /**
     * 业主解约
     */
    private Double ownerCancellation;

    /**
     * 违约金收入
     */
    private Double liquidatedDamages1;

    /**
     * 其他业务收入
     */
    private Double otherOperatingIncome;

    /**
     * 其他业务收入商品销售
     */
    private Double otherBusinessIncomeCommoditySales;

    /**
     * 其他业务收入直租装修
     */
    private Double otherBusinessIncomeDirectRentDecoration;

    /**
     * 其他业务收入手续费
     */
    private Double otherBusinessIncomeFee;

    /**
     * 其他业务收入赔偿金
     */
    private Double otherBusinessIncomeCompensation;

    /**
     * 其他业务收入其他
     */
    private Double otherBusinessIncomeOther;

    /**
     * 其他业务线收入
     */
    private Double otherBusinessLineIncome;

    /**
     * 平台服务费_保洁
     */
    private Double platformServiceFeeCleaning;

    /**
     * 平台服务费_搬家
     */
    private Double platformServiceFeeMoving;

    /**
     * 平台服务费_家修
     */
    private Double platformServiceFeeHomeRepair;

    /**
     * 平台服务费_优品
     */
    private Double platformServiceFeeExcellentProducts;

    /**
     * 平台服务费_民宿
     */
    private Double platformServiceFeeHomestay;

    /**
     * 优品自营
     */
    private Double excellentProductSelfEmployed;

    /**
     * 家修自营
     */
    private Double homeRepair;

    /**
     * 家装自营
     */
    private Double homeImprovement;

    /**
     * 金融服务费收入
     */
    private Double financialServiceFeeIncome;

    /**
     * 变动成本
     */
    private Double variableCosts;

    /**
     * 配置成本/工程成本
     */
    private Double configurationCostEngineeringCost;

    /**
     * 新增收房配置成本
     */
    private Double newHousingAllocationCost;

    /**
     * 租期配置成本
     */
    private Double leaseConfigurationCost;

    /**
     * 退租配置成本
     */
    private Double withdrawalConfigurationCost;

    /**
     * 转租配置成本
     */
    private Double subleaseConfigurationCost;

    /**
     * 解约配置成本
     */
    private Double releaseConfigurationCost;

    /**
     * 待租配置成本
     */
    private Double forRentLeaseConfigurationCost;

    /**
     * 续约配置成本
     */
    private Double renewalConfigurationCost;

    /**
     * nc直租装修成本
     */
    private Double ncDirectRentRenovationCost;

    /**
     * 直租自如成本
     */
    private Double directRentingCost;

    /**
     * 绩效工资
     */
    private Double performancePay;

    /**
     * 管家
     */
    private Double housekeeper;

    /**
     * 自如提佣_管家
     */
    private Double freeToOfferHousekeeper;

    /**
     * 奖金_管家
     */
    private Double bonusHousekeeper;

    /**
     * 配置
     */
    private Double configuration;

    /**
     * 自如提佣_配置
     */
    private Double freeToCommissionConfiguration;

    /**
     * 奖金_配置
     */
    private Double bonusConfiguration;

    /**
     * 保洁成本
     */
    private Double cleaningCost;

    /**
     * 双周_月度保洁
     */
    private Double biweeklyMonthlyCleaning;

    /**
     * 自如深度保洁成本
     */
    private Double freeDepthCleaningCosts;

    /**
     * 退租保洁
     */
    private Double withdrawalAndCleaning;

    /**
     * 开荒保洁
     */
    private Double wastelandCleaning;

    /**
     * 消杀保洁
     */
    private Double killingAndCleaning;

    /**
     * 原样返还
     */
    private Double returnAsItIs;

    /**
     * 紧急处理保洁
     */
    private Double emergencyCleaning;

    /**
     * 原样返还
     */
    private Double returnAsItIs1;

    /**
     * 维修后保洁
     */
    private Double cleaningAfterRepair;

    /**
     * 日常保洁
     */
    private Double dailyCleaning;

    /**
     * 维修成本
     */
    private Double maintenanceCosts;

    /**
     * 长租维修费
     */
    private Double longTermMaintenanceFee;

    /**
     * 维修基金支出
     */
    private Double maintenanceFundExpenditure;

    /**
     * 渠道佣金
     */
    private Double channelCommission;

    /**
     * 渠道成本
     */
    private Double channelCost;

    /**
     * 出房渠道佣金
     */
    private Double outboundChannelCommission;

    /**
     * 收房渠道佣金
     */
    private Double houseChannelCommission;

    /**
     * 品质成本
     */
    private Double qualityCost;

    /**
     * 预提售后服务费用
     */
    private Double withholdingServiceFee;

    /**
     * 友家财产险
     */
    private Double friendsPropertyInsurance;

    /**
     * 空气治理成本
     */
    private Double airTreatmentCost;

    /**
     * 空气质量检测成本
     */
    private Double airQualityTestingCost;

    /**
     * 材料检测费
     */
    private Double materialTestingFee;

    /**
     * 业主房租发票税金
     */
    private Double ownerRentInvoiceTax;

    /**
     * 其他业务线变动成本
     */
    private Double otherBusinessLineVariableCosts;

    /**
     * 边际收益
     */
    private Double marginalRevenue;

    /**
     * 固定成本
     */
    private Double fixedCost;

    /**
     * 基本工资
     */
    private Double basicWage;

    /**
     * 基本工资_管家
     */
    private Double basicSalaryHousekeeper;

    /**
     * 社会保险_管家
     */
    private Double socialInsuranceHousekeeper;

    /**
     * 住房公积金_管家
     */
    private Double housingProvidentFundHousekeeper;

    /**
     * 基本工资_配置
     */
    private Double basicSalaryConfiguration;

    /**
     * 社会保险_配置
     */
    private Double socialInsuranceConfiguration;

    /**
     * 住房公积金_配置
     */
    private Double housingProvidentFundConfiguration;

    /**
     * 工作站投资及运营成本
     */
    private Double workstationInvestmentAndOperatingCosts;

    /**
     * 工作站投资成本
     */
    private Double workstationInvestmentCost;

    /**
     * 工作站装修
     */
    private Double workstationDecoration;

    /**
     * 工作站办公家具
     */
    private Double workstationOfficeFurniture;

    /**
     * 工作站电脑设备
     */
    private Double workstationComputerEquipment;

    /**
     * 工作站办公设备
     */
    private Double workstationOfficeEquipment;

    /**
     * 工作站it配件
     */
    private Double workstationItAccessories;

    /**
     * 工作站环境软装
     */
    private Double workstationEnvironmentSoftcover;

    /**
     * 工作站消防物资
     */
    private Double workstationFirefightingSupplies;

    /**
     * 工作站设备租赁服务费
     */
    private Double workstationEquipmentRentalServiceFee;

    /**
     * 工作站渠道佣金
     */
    private Double workstationChannelCommission;

    /**
     * 工作站运营成本
     */
    private Double workstationOperatingCosts;

    /**
     * 工作站房租
     */
    private Double workstationRent;

    /**
     * 工作站电话费
     */
    private Double workstationPhoneFee;

    /**
     * 工作站水费
     */
    private Double workstationWaterFee;

    /**
     * 工作站电费
     */
    private Double workstationElectricityFee;

    /**
     * 工作站燃气费
     */
    private Double workstationGasFee;

    /**
     * 工作站供暖物业费
     */
    private Double workstationHeatingPropertyFee;

    /**
     * 工作站印刷喷绘
     */
    private Double workstationPrinting;

    /**
     * 工作站保洁成本
     */
    private Double workstationCleaningCost;

    /**
     * 工作站网络费
     */
    private Double workstationNetworkFee;

    /**
     * 工作站打印耗材
     */
    private Double workstationPrintingSupplies;

    /**
     * 工作站饮用水
     */
    private Double workstationDrinkingWater;

    /**
     * 工作站办公用品费
     */
    private Double workstationOfficeSupplies;

    /**
     * 工作站维修费用
     */
    private Double workstationRepairCosts;

    /**
     * 工作站搬运费
     */
    private Double workstationHandlingFee;

    /**
     * 工作站渠道佣金
     */
    private Double workstationChannelCommission1;

    /**
     * 其他业务成本
     */
    private Double otherOperatingCosts;

    /**
     * 违约金成本
     */
    private Double liquidatedDamagesCost;

    /**
     * 业主赔偿金
     */
    private Double ownerCompensation;

    /**
     * 安全事故处理费
     */
    private Double securityIncidentHandlingFee;

    /**
     * 行政处罚
     */
    private Double administrativePenalties;

    /**
     * 其他业务成本_其他
     */
    private Double otherBusinessCostsOther;

    /**
     * 其他业务线固定成本
     */
    private Double fixedCostOfOtherLinesOfBusiness;

    /**
     * 营业毛利
     */
    private Double operatingGrossProfit;

    /**
     * 营销费用
     */
    private Double marketingCosts;

    /**
     * 营销人工成本
     */
    private Double marketingLaborCost;

    /**
     * 基本工资_营销人员
     */
    private Double basicSalaryMarketer;

    /**
     * 绩效工资_营销人员
     */
    private Double performancePaymarketer;

    /**
     * 奖金_营销人员
     */
    private Double bonusMarketer;

    /**
     * 住房公积金_营销人员
     */
    private Double housingProvidentFundMarketers;

    /**
     * 社会保险_营销人员
     */
    private Double socialInsuranceMarketingStaff;

    /**
     * 精准营销费用
     */
    private Double precisionMarketingExpenses;

    /**
     * sem建设
     */
    private Double semConstruction;

    /**
     * app推广
     */
    private Double appPromotion;

    /**
     * 网络端口费
     */
    private Double networkPortFee;

    /**
     * 品牌营销费用
     */
    private Double brandMarketingExpenses;

    /**
     * 客端营销费用
     */
    private Double clientMarketingExpenses;

    /**
     * 客户用户运营
     */
    private Double customerUserOperation;

    /**
     * 客户业务运营
     */
    private Double customerBusinessOperations;

    /**
     * 客户品牌营销
     */
    private Double customerBrandMarketing;

    /**
     * 客户产品运营
     */
    private Double customerProductOperation;

    /**
     * 业主端营销费用
     */
    private Double ownershipMarketingExpenses;

    /**
     * 业主用户运营
     */
    private Double ownerUserOperation;

    /**
     * 业主业务运营
     */
    private Double ownerBusinessOperations;

    /**
     * 业主品牌营销
     */
    private Double ownerBrandMarketing;

    /**
     * 业主产品运营
     */
    private Double ownerProductOperation;

    /**
     * 优惠减免
     */
    private Double discountReduction;

    /**
     * 营销费用_其他
     */
    private Double marketingExpensesOther;

    /**
     * 职能费用
     */
    private Double functionalExpenses;

    /**
     * 职能人工成本
     */
    private Double functionalLaborCost;

    /**
     * 基本工资_职能人员
     */
    private Double basicSalaryFunctionalStaff;

    /**
     * 绩效工资_职能人员
     */
    private Double performancePayrollFunctionalStaff;

    /**
     * 奖金_职能人员
     */
    private Double bonusFunctionalStaff;

    /**
     * 住房公积金_职能人员
     */
    private Double housingProvidentFundFunctionalStaff;

    /**
     * 社会保险_职能人员
     */
    private Double socialInsuranceFunctionalStaff;

    /**
     * 经济补偿金
     */
    private Double monetaryCompensation;

    /**
     * 职能临时性用工成本
     */
    private Double functionalTemporaryLaborCosts;

    /**
     * 行政费用
     */
    private Double administrativeCosts;

    /**
     * 职能租金
     */
    private Double functionalRent;

    /**
     * 职能供暖物业费
     */
    private Double functionalHeatingPropertyFee;

    /**
     * 职能办公家具
     */
    private Double functionalOfficeFurniture;

    /**
     * 主体装修
     */
    private Double mainDecoration;

    /**
     * 设备维修费
     */
    private Double equipmentMaintenanceFee;

    /**
     * 维修物料费
     */
    private Double repairMaterialFee;

    /**
     * 维修劳务费
     */
    private Double repairLaborCosts;

    /**
     * 设备财产险
     */
    private Double equipmentPropertyInsurance;

    /**
     * 职能环境软装
     */
    private Double functionalEnvironment;

    /**
     * 职能设备租赁服务费
     */
    private Double functionalEquipmentRentalServiceFee;

    /**
     * 职能洗地毯费
     */
    private Double functionWashingCarpetFee;

    /**
     * 网络费
     */
    private Double networkFee;

    /**
     * 职能水费
     */
    private Double functionalWaterFee;

    /**
     * 职能电费
     */
    private Double functionalElectricityFee;

    /**
     * 职能保洁费
     */
    private Double functionalCleaningFee;

    /**
     * 职能饮用水
     */
    private Double functionalDrinkingWater;

    /**
     * 办公费用
     */
    private Double officeExpenses;

    /**
     * 职能办公用品
     */
    private Double functionalOfficeSupplies;

    /**
     * 快递费
     */
    private Double courierFee;

    /**
     * 职能办公杂费
     */
    private Double functionalOfficeMiscellaneousFees;

    /**
     * 职能it配件
     */
    private Double functionalItAccessories;

    /**
     * 职能电话费
     */
    private Double functionalTelephoneFee;

    /**
     * 运输工具
     */
    private Double transportation;

    /**
     * 职能印刷喷绘
     */
    private Double functionalPrinting;

    /**
     * 公司证照办理及年检
     */
    private Double companyLicenseProcessingAndAnnualInspection;

    /**
     * 仓储费
     */
    private Double warehousingFee;

    /**
     * 电脑设备
     */
    private Double computerEquipment;

    /**
     * 其他职能折旧摊销
     */
    private Double otherFunctionsDepreciationAndAmortization;

    /**
     * 培训类费用
     */
    private Double trainingFee;

    /**
     * 培训费
     */
    private Double trainingFees;

    /**
     * 博学争霸赛
     */
    private Double erudition;

    /**
     * 讲师团队建设
     */
    private Double lecturerTeamBuilding;

    /**
     * 培训实施费
     */
    private Double trainingImplementationFee;

    /**
     * 课程研发费
     */
    private Double courseDevelopmentFee;

    /**
     * 部门培训费
     */
    private Double departmentalTrainingFee;

    /**
     * 招聘类费用
     */
    private Double recruitmentFee;

    /**
     * 网络招聘费
     */
    private Double onlineRecruitmentFee;

    /**
     * 校园招聘_线下
     */
    private Double campusRecruitmentOffline;

    /**
     * 招聘费_猎头费
     */
    private Double recruitmentFeeHeadhuntingFee;

    /**
     * 招聘费_内部推荐
     */
    private Double recruitmentFeeInternalRecommendation;

    /**
     * 文化建设及福利费用
     */
    private Double culturalConstructionAndWelfareCosts;

    /**
     * 人文文化建设费
     */
    private Double humanitiesCultureConstructionFee;

    /**
     * 职工教育经费
     */
    private Double employeeEducationExpenses;

    /**
     * 图书资料费
     */
    private Double bookDataFee;

    /**
     * 高管福利费
     */
    private Double executiveWelfareFee;

    /**
     * 公司福利费用
     */
    private Double companyWelfareExpenses;

    /**
     * 补充医疗保险
     */
    private Double supplementaryMedicalInsurance;

    /**
     * 体检费
     */
    private Double medicalExaminationFee;

    /**
     * 拓展团队建设费
     */
    private Double expandTeamBuildingFees;

    /**
     * 公司团队建设费
     */
    private Double companyTeamBuildingFee;

    /**
     * 日常费用
     */
    private Double dailyExpenses;

    /**
     * 加班餐费
     */
    private Double overtimeMealPay;

    /**
     * 交通费
     */
    private Double transportationFee;

    /**
     * 业务办理交通费
     */
    private Double businessHandlingTransportationFee;

    /**
     * 差旅费
     */
    private Double travelExpenses;

    /**
     * 通信费
     */
    private Double communicationFee;

    /**
     * 内部会务费
     */
    private Double internalMeetingFee;

    /**
     * 外部会务费
     */
    private Double externalConferenceFee;

    /**
     * 交际应酬费
     */
    private Double socialInteractionFee;

    /**
     * 职能中心团队建设费
     */
    private Double functionCenterTeamConstructionFee;

    /**
     * 业务中心团队建设费
     */
    private Double businessCenterTeamBuildingFee;

    /**
     * 职能工装费
     */
    private Double functionalToolingFee;

    /**
     * 业务工装费
     */
    private Double businessToolingFee;

    /**
     * 咨询服务费用
     */
    private Double consultingServiceFee;

    /**
     * 咨询服务费
     */
    private Double consultingServiceFee1;

    /**
     * 商标注册费
     */
    private Double trademarkRegistrationFee;

    /**
     * 诉讼案件费
     */
    private Double litigationCaseFee;

    /**
     * 律师服务费
     */
    private Double lawyerServiceFee;

    /**
     * 产品研发费
     */
    private Double productDevelopmentFee;

    /**
     * 激励类费用
     */
    private Double incentiveFee;

    /**
     * 品质激励
     */
    private Double qualityIncentive;

    /**
     * 供应商激励
     */
    private Double supplierIncentive;

    /**
     * hpc活动费
     */
    private Double hpcActivityFee;

    /**
     * 团队激励费
     */
    private Double teamIncentiveFee;

    /**
     * 职能费用_其他
     */
    private Double functionalExpensesOther;

    /**
     * 研发费用
     */
    private Double researchAndDevelopmentExpenses;

    /**
     * 研发人工成本
     */
    private Double rdLaborCosts;

    /**
     * 基本工资_研发人员
     */
    private Double basicSalaryRdPersonnel;

    /**
     * 绩效工资_研发人员
     */
    private Double performanceSalaryRdPersonnel;

    /**
     * 奖金_研发人员
     */
    private Double bonusRdStaff;

    /**
     * 住房公积金_研发人员
     */
    private Double housingProvidentFundRdPersonnel;

    /**
     * 社会保险_研发人员
     */
    private Double socialInsuranceRdPersonnel;

    /**
     * 系统实施服务费用
     */
    private Double systemImplementationServiceFee;

    /**
     * 系统服务费
     */
    private Double systemServiceFee;

    /**
     * 系统实施费
     */
    private Double systemImplementationFee;

    /**
     * 短信平台信息费
     */
    private Double smsPlatformInformationFee;

    /**
     * 机房及设备费用
     */
    private Double machineRoomAndEquipmentCosts;

    /**
     * idc托管费用
     */
    private Double idcHostingFee;

    /**
     * 通讯设备
     */
    private Double communicationEquipment;

    /**
     * 安全设备
     */
    private Double safetyEquipment;

    /**
     * 存储设备
     */
    private Double storageDevice;

    /**
     * 服务器
     */
    private Double server;

    /**
     * 网络设备
     */
    private Double networkEquipment;

    /**
     * 软件
     */
    private Double software;

    /**
     * 其他研发折旧摊销
     */
    private Double otherDepreciationAndAmortization;

    /**
     * 财务费用
     */
    private Double financialExpenses;

    /**
     * 营业税金及附加
     */
    private Double businessTaxAndSurcharges;

    /**
     * 资产减值损失
     */
    private Double assetImpairmentLoss;

    /**
     * 投资损益
     */
    private Double investmentGainsAndLosses;

    /**
     * 营业利润
     */
    private Double operatingProfit;

    /**
     * 营业外收支净额
     */
    private Double netNonoperatingIncomeAndExpenses;

    /**
     * 营业外收入
     */
    private Double nonoperatingIncome;

    /**
     * 营业外支出
     */
    private Double operatingExpenses;

    /**
     * 利润总额
     */
    private Double totalProfit;

    /**
     * 所得税费用
     */
    private Double incomeTaxExpense;

    /**
     * 分摊前净利
     */
    private Double netProfitBeforeApportionment;

    /**
     * 分摊合计
     */
    private Double totalApportionment;

    /**
     * 业务线分摊
     */
    private Double businessLineAllocation;

    /**
     * 业务线分摊_研发分摊
     */
    private Double businessLineAllocationRdAllocation;

    /**
     * 业务线分摊_营销分摊
     */
    private Double businessLineAllocationMarketingAllocation;

    /**
     * 业务线分摊_职能分摊
     */
    private Double businessLineAllocationFunctionAllocation;

    /**
     * 集团分摊
     */
    private Double groupSharing;

    /**
     * 集团分摊_研发分摊
     */
    private Double groupApportionmentRdAllocation;

    /**
     * 集团分摊_营销分摊
     */
    private Double groupAllocationMarketingAllocation;

    /**
     * 集团分摊_职能分摊
     */
    private Double groupApportionmentFunctionAllocation;

    /**
     * 分摊后净利
     */
    private Double netProfitAfterApportionment;

    /**
     * 待分摊金额
     */
    private Double assessedAmount;

    /**
     * 维修服务费
     */
    private Double repairServiceFee;

    /**
     * 营业成本
     */
    private Double operatingCost;

    /**
     * 直接人工成本
     */
    private Double directLaborCost;

    /**
     * 持有量（分租按间，整租按套）
     */
    private Double holdNum;

    /**
     * 持有单元天（分租按间，整租按套）
     */
    private Double holdNumDays;

    /**
     * 计算后持有单元天
     */
    private Double calculatedHoldNum;

    /**
     * 计算后持有单元天
     */
    private Double calculatedHoldNumDays;

    /**
     * 表彰会费
     */
    private Double commendationCost;

    /**
     * 建设经费
     */
    private Double constructionCost;

    public String getHireContractCode() {
        return hireContractCode;
    }

    public void setHireContractCode(String hireContractCode) {
        this.hireContractCode = hireContractCode == null ? null : hireContractCode.trim();
    }

    public String getBusinessLineCode() {
        return businessLineCode;
    }

    public void setBusinessLineCode(String businessLineCode) {
        this.businessLineCode = businessLineCode == null ? null : businessLineCode.trim();
    }

    public String getBusinessLineName() {
        return businessLineName;
    }

    public void setBusinessLineName(String businessLineName) {
        this.businessLineName = businessLineName == null ? null : businessLineName.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductLineId() {
        return productLineId;
    }

    public void setProductLineId(String productLineId) {
        this.productLineId = productLineId == null ? null : productLineId.trim();
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine == null ? null : productLine.trim();
    }

    public String getProductVersionId() {
        return productVersionId;
    }

    public void setProductVersionId(String productVersionId) {
        this.productVersionId = productVersionId == null ? null : productVersionId.trim();
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion == null ? null : productVersion.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getWarZoneCode() {
        return warZoneCode;
    }

    public void setWarZoneCode(String warZoneCode) {
        this.warZoneCode = warZoneCode == null ? null : warZoneCode.trim();
    }

    public String getWarZone() {
        return warZone;
    }

    public void setWarZone(String warZone) {
        this.warZone = warZone == null ? null : warZone.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getBusinessGroupCode() {
        return businessGroupCode;
    }

    public void setBusinessGroupCode(String businessGroupCode) {
        this.businessGroupCode = businessGroupCode == null ? null : businessGroupCode.trim();
    }

    public String getBusinessGroup() {
        return businessGroup;
    }

    public void setBusinessGroup(String businessGroup) {
        this.businessGroup = businessGroup == null ? null : businessGroup.trim();
    }

    public String getResblockId() {
        return resblockId;
    }

    public void setResblockId(String resblockId) {
        this.resblockId = resblockId == null ? null : resblockId.trim();
    }

    public String getResblockName() {
        return resblockName;
    }

    public void setResblockName(String resblockName) {
        this.resblockName = resblockName == null ? null : resblockName.trim();
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType == null ? null : rentType.trim();
    }

    public String getHireChannel() {
        return hireChannel;
    }

    public void setHireChannel(String hireChannel) {
        this.hireChannel = hireChannel == null ? null : hireChannel.trim();
    }

    public String getFinishedLevelId() {
        return finishedLevelId;
    }

    public void setFinishedLevelId(String finishedLevelId) {
        this.finishedLevelId = finishedLevelId == null ? null : finishedLevelId.trim();
    }

    public String getFinishedLevel() {
        return finishedLevel;
    }

    public void setFinishedLevel(String finishedLevel) {
        this.finishedLevel = finishedLevel == null ? null : finishedLevel.trim();
    }

    public Integer getDisposeBedroomAmount() {
        return disposeBedroomAmount;
    }

    public void setDisposeBedroomAmount(Integer disposeBedroomAmount) {
        this.disposeBedroomAmount = disposeBedroomAmount;
    }

    public String getDisposeBedroomDesc() {
        return disposeBedroomDesc;
    }

    public void setDisposeBedroomDesc(String disposeBedroomDesc) {
        this.disposeBedroomDesc = disposeBedroomDesc == null ? null : disposeBedroomDesc.trim();
    }

    public Integer getHoldDays() {
        return holdDays;
    }

    public void setHoldDays(Integer holdDays) {
        this.holdDays = holdDays;
    }

    public String getHoldDaysSegment() {
        return holdDaysSegment;
    }

    public void setHoldDaysSegment(String holdDaysSegment) {
        this.holdDaysSegment = holdDaysSegment == null ? null : holdDaysSegment.trim();
    }

    public Double getAmountOfHousingInThisPeriod() {
        return amountOfHousingInThisPeriod;
    }

    public void setAmountOfHousingInThisPeriod(Double amountOfHousingInThisPeriod) {
        this.amountOfHousingInThisPeriod = amountOfHousingInThisPeriod;
    }

    public Double getAmountOfHousingInThisIssue() {
        return amountOfHousingInThisIssue;
    }

    public void setAmountOfHousingInThisIssue(Double amountOfHousingInThisIssue) {
        this.amountOfHousingInThisIssue = amountOfHousingInThisIssue;
    }

    public Double getMonthsInRent() {
        return monthsInRent;
    }

    public void setMonthsInRent(Double monthsInRent) {
        this.monthsInRent = monthsInRent;
    }

    public Double getMonthsBetweenListings() {
        return monthsBetweenListings;
    }

    public void setMonthsBetweenListings(Double monthsBetweenListings) {
        this.monthsBetweenListings = monthsBetweenListings;
    }

    public Double getSingleQuantity() {
        return singleQuantity;
    }

    public void setSingleQuantity(Double singleQuantity) {
        this.singleQuantity = singleQuantity;
    }

    public Double getGmv() {
        return gmv;
    }

    public void setGmv(Double gmv) {
        this.gmv = gmv;
    }

    public Double getRevenueBeforeDeduction() {
        return revenueBeforeDeduction;
    }

    public void setRevenueBeforeDeduction(Double revenueBeforeDeduction) {
        this.revenueBeforeDeduction = revenueBeforeDeduction;
    }

    public Double getRelief() {
        return relief;
    }

    public void setRelief(Double relief) {
        this.relief = relief;
    }

    public Double getRevenueAfterDeduction() {
        return revenueAfterDeduction;
    }

    public void setRevenueAfterDeduction(Double revenueAfterDeduction) {
        this.revenueAfterDeduction = revenueAfterDeduction;
    }

    public Double getOwnerIncome() {
        return ownerIncome;
    }

    public void setOwnerIncome(Double ownerIncome) {
        this.ownerIncome = ownerIncome;
    }

    public Double getRentIncome() {
        return rentIncome;
    }

    public void setRentIncome(Double rentIncome) {
        this.rentIncome = rentIncome;
    }

    public Double getRentExpenses() {
        return rentExpenses;
    }

    public void setRentExpenses(Double rentExpenses) {
        this.rentExpenses = rentExpenses;
    }

    public Double getServiceFeeIncome() {
        return serviceFeeIncome;
    }

    public void setServiceFeeIncome(Double serviceFeeIncome) {
        this.serviceFeeIncome = serviceFeeIncome;
    }

    public Double getOutOfServiceServiceFee() {
        return outOfServiceServiceFee;
    }

    public void setOutOfServiceServiceFee(Double outOfServiceServiceFee) {
        this.outOfServiceServiceFee = outOfServiceServiceFee;
    }

    public Double getSubleaseServiceFee() {
        return subleaseServiceFee;
    }

    public void setSubleaseServiceFee(Double subleaseServiceFee) {
        this.subleaseServiceFee = subleaseServiceFee;
    }

    public Double getLiquidatedDamages() {
        return liquidatedDamages;
    }

    public void setLiquidatedDamages(Double liquidatedDamages) {
        this.liquidatedDamages = liquidatedDamages;
    }

    public Double getOwnerCancellation() {
        return ownerCancellation;
    }

    public void setOwnerCancellation(Double ownerCancellation) {
        this.ownerCancellation = ownerCancellation;
    }

    public Double getLiquidatedDamages1() {
        return liquidatedDamages1;
    }

    public void setLiquidatedDamages1(Double liquidatedDamages1) {
        this.liquidatedDamages1 = liquidatedDamages1;
    }

    public Double getOtherOperatingIncome() {
        return otherOperatingIncome;
    }

    public void setOtherOperatingIncome(Double otherOperatingIncome) {
        this.otherOperatingIncome = otherOperatingIncome;
    }

    public Double getOtherBusinessIncomeCommoditySales() {
        return otherBusinessIncomeCommoditySales;
    }

    public void setOtherBusinessIncomeCommoditySales(Double otherBusinessIncomeCommoditySales) {
        this.otherBusinessIncomeCommoditySales = otherBusinessIncomeCommoditySales;
    }

    public Double getOtherBusinessIncomeDirectRentDecoration() {
        return otherBusinessIncomeDirectRentDecoration;
    }

    public void setOtherBusinessIncomeDirectRentDecoration(Double otherBusinessIncomeDirectRentDecoration) {
        this.otherBusinessIncomeDirectRentDecoration = otherBusinessIncomeDirectRentDecoration;
    }

    public Double getOtherBusinessIncomeFee() {
        return otherBusinessIncomeFee;
    }

    public void setOtherBusinessIncomeFee(Double otherBusinessIncomeFee) {
        this.otherBusinessIncomeFee = otherBusinessIncomeFee;
    }

    public Double getOtherBusinessIncomeCompensation() {
        return otherBusinessIncomeCompensation;
    }

    public void setOtherBusinessIncomeCompensation(Double otherBusinessIncomeCompensation) {
        this.otherBusinessIncomeCompensation = otherBusinessIncomeCompensation;
    }

    public Double getOtherBusinessIncomeOther() {
        return otherBusinessIncomeOther;
    }

    public void setOtherBusinessIncomeOther(Double otherBusinessIncomeOther) {
        this.otherBusinessIncomeOther = otherBusinessIncomeOther;
    }

    public Double getOtherBusinessLineIncome() {
        return otherBusinessLineIncome;
    }

    public void setOtherBusinessLineIncome(Double otherBusinessLineIncome) {
        this.otherBusinessLineIncome = otherBusinessLineIncome;
    }

    public Double getPlatformServiceFeeCleaning() {
        return platformServiceFeeCleaning;
    }

    public void setPlatformServiceFeeCleaning(Double platformServiceFeeCleaning) {
        this.platformServiceFeeCleaning = platformServiceFeeCleaning;
    }

    public Double getPlatformServiceFeeMoving() {
        return platformServiceFeeMoving;
    }

    public void setPlatformServiceFeeMoving(Double platformServiceFeeMoving) {
        this.platformServiceFeeMoving = platformServiceFeeMoving;
    }

    public Double getPlatformServiceFeeHomeRepair() {
        return platformServiceFeeHomeRepair;
    }

    public void setPlatformServiceFeeHomeRepair(Double platformServiceFeeHomeRepair) {
        this.platformServiceFeeHomeRepair = platformServiceFeeHomeRepair;
    }

    public Double getPlatformServiceFeeExcellentProducts() {
        return platformServiceFeeExcellentProducts;
    }

    public void setPlatformServiceFeeExcellentProducts(Double platformServiceFeeExcellentProducts) {
        this.platformServiceFeeExcellentProducts = platformServiceFeeExcellentProducts;
    }

    public Double getPlatformServiceFeeHomestay() {
        return platformServiceFeeHomestay;
    }

    public void setPlatformServiceFeeHomestay(Double platformServiceFeeHomestay) {
        this.platformServiceFeeHomestay = platformServiceFeeHomestay;
    }

    public Double getExcellentProductSelfEmployed() {
        return excellentProductSelfEmployed;
    }

    public void setExcellentProductSelfEmployed(Double excellentProductSelfEmployed) {
        this.excellentProductSelfEmployed = excellentProductSelfEmployed;
    }

    public Double getHomeRepair() {
        return homeRepair;
    }

    public void setHomeRepair(Double homeRepair) {
        this.homeRepair = homeRepair;
    }

    public Double getHomeImprovement() {
        return homeImprovement;
    }

    public void setHomeImprovement(Double homeImprovement) {
        this.homeImprovement = homeImprovement;
    }

    public Double getFinancialServiceFeeIncome() {
        return financialServiceFeeIncome;
    }

    public void setFinancialServiceFeeIncome(Double financialServiceFeeIncome) {
        this.financialServiceFeeIncome = financialServiceFeeIncome;
    }

    public Double getVariableCosts() {
        return variableCosts;
    }

    public void setVariableCosts(Double variableCosts) {
        this.variableCosts = variableCosts;
    }

    public Double getConfigurationCostEngineeringCost() {
        return configurationCostEngineeringCost;
    }

    public void setConfigurationCostEngineeringCost(Double configurationCostEngineeringCost) {
        this.configurationCostEngineeringCost = configurationCostEngineeringCost;
    }

    public Double getNewHousingAllocationCost() {
        return newHousingAllocationCost;
    }

    public void setNewHousingAllocationCost(Double newHousingAllocationCost) {
        this.newHousingAllocationCost = newHousingAllocationCost;
    }

    public Double getLeaseConfigurationCost() {
        return leaseConfigurationCost;
    }

    public void setLeaseConfigurationCost(Double leaseConfigurationCost) {
        this.leaseConfigurationCost = leaseConfigurationCost;
    }

    public Double getWithdrawalConfigurationCost() {
        return withdrawalConfigurationCost;
    }

    public void setWithdrawalConfigurationCost(Double withdrawalConfigurationCost) {
        this.withdrawalConfigurationCost = withdrawalConfigurationCost;
    }

    public Double getSubleaseConfigurationCost() {
        return subleaseConfigurationCost;
    }

    public void setSubleaseConfigurationCost(Double subleaseConfigurationCost) {
        this.subleaseConfigurationCost = subleaseConfigurationCost;
    }

    public Double getReleaseConfigurationCost() {
        return releaseConfigurationCost;
    }

    public void setReleaseConfigurationCost(Double releaseConfigurationCost) {
        this.releaseConfigurationCost = releaseConfigurationCost;
    }

    public Double getForRentLeaseConfigurationCost() {
        return forRentLeaseConfigurationCost;
    }

    public void setForRentLeaseConfigurationCost(Double forRentLeaseConfigurationCost) {
        this.forRentLeaseConfigurationCost = forRentLeaseConfigurationCost;
    }

    public Double getRenewalConfigurationCost() {
        return renewalConfigurationCost;
    }

    public void setRenewalConfigurationCost(Double renewalConfigurationCost) {
        this.renewalConfigurationCost = renewalConfigurationCost;
    }

    public Double getNcDirectRentRenovationCost() {
        return ncDirectRentRenovationCost;
    }

    public void setNcDirectRentRenovationCost(Double ncDirectRentRenovationCost) {
        this.ncDirectRentRenovationCost = ncDirectRentRenovationCost;
    }

    public Double getDirectRentingCost() {
        return directRentingCost;
    }

    public void setDirectRentingCost(Double directRentingCost) {
        this.directRentingCost = directRentingCost;
    }

    public Double getPerformancePay() {
        return performancePay;
    }

    public void setPerformancePay(Double performancePay) {
        this.performancePay = performancePay;
    }

    public Double getHousekeeper() {
        return housekeeper;
    }

    public void setHousekeeper(Double housekeeper) {
        this.housekeeper = housekeeper;
    }

    public Double getFreeToOfferHousekeeper() {
        return freeToOfferHousekeeper;
    }

    public void setFreeToOfferHousekeeper(Double freeToOfferHousekeeper) {
        this.freeToOfferHousekeeper = freeToOfferHousekeeper;
    }

    public Double getBonusHousekeeper() {
        return bonusHousekeeper;
    }

    public void setBonusHousekeeper(Double bonusHousekeeper) {
        this.bonusHousekeeper = bonusHousekeeper;
    }

    public Double getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Double configuration) {
        this.configuration = configuration;
    }

    public Double getFreeToCommissionConfiguration() {
        return freeToCommissionConfiguration;
    }

    public void setFreeToCommissionConfiguration(Double freeToCommissionConfiguration) {
        this.freeToCommissionConfiguration = freeToCommissionConfiguration;
    }

    public Double getBonusConfiguration() {
        return bonusConfiguration;
    }

    public void setBonusConfiguration(Double bonusConfiguration) {
        this.bonusConfiguration = bonusConfiguration;
    }

    public Double getCleaningCost() {
        return cleaningCost;
    }

    public void setCleaningCost(Double cleaningCost) {
        this.cleaningCost = cleaningCost;
    }

    public Double getBiweeklyMonthlyCleaning() {
        return biweeklyMonthlyCleaning;
    }

    public void setBiweeklyMonthlyCleaning(Double biweeklyMonthlyCleaning) {
        this.biweeklyMonthlyCleaning = biweeklyMonthlyCleaning;
    }

    public Double getFreeDepthCleaningCosts() {
        return freeDepthCleaningCosts;
    }

    public void setFreeDepthCleaningCosts(Double freeDepthCleaningCosts) {
        this.freeDepthCleaningCosts = freeDepthCleaningCosts;
    }

    public Double getWithdrawalAndCleaning() {
        return withdrawalAndCleaning;
    }

    public void setWithdrawalAndCleaning(Double withdrawalAndCleaning) {
        this.withdrawalAndCleaning = withdrawalAndCleaning;
    }

    public Double getWastelandCleaning() {
        return wastelandCleaning;
    }

    public void setWastelandCleaning(Double wastelandCleaning) {
        this.wastelandCleaning = wastelandCleaning;
    }

    public Double getKillingAndCleaning() {
        return killingAndCleaning;
    }

    public void setKillingAndCleaning(Double killingAndCleaning) {
        this.killingAndCleaning = killingAndCleaning;
    }

    public Double getReturnAsItIs() {
        return returnAsItIs;
    }

    public void setReturnAsItIs(Double returnAsItIs) {
        this.returnAsItIs = returnAsItIs;
    }

    public Double getEmergencyCleaning() {
        return emergencyCleaning;
    }

    public void setEmergencyCleaning(Double emergencyCleaning) {
        this.emergencyCleaning = emergencyCleaning;
    }

    public Double getReturnAsItIs1() {
        return returnAsItIs1;
    }

    public void setReturnAsItIs1(Double returnAsItIs1) {
        this.returnAsItIs1 = returnAsItIs1;
    }

    public Double getCleaningAfterRepair() {
        return cleaningAfterRepair;
    }

    public void setCleaningAfterRepair(Double cleaningAfterRepair) {
        this.cleaningAfterRepair = cleaningAfterRepair;
    }

    public Double getDailyCleaning() {
        return dailyCleaning;
    }

    public void setDailyCleaning(Double dailyCleaning) {
        this.dailyCleaning = dailyCleaning;
    }

    public Double getMaintenanceCosts() {
        return maintenanceCosts;
    }

    public void setMaintenanceCosts(Double maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    public Double getLongTermMaintenanceFee() {
        return longTermMaintenanceFee;
    }

    public void setLongTermMaintenanceFee(Double longTermMaintenanceFee) {
        this.longTermMaintenanceFee = longTermMaintenanceFee;
    }

    public Double getMaintenanceFundExpenditure() {
        return maintenanceFundExpenditure;
    }

    public void setMaintenanceFundExpenditure(Double maintenanceFundExpenditure) {
        this.maintenanceFundExpenditure = maintenanceFundExpenditure;
    }

    public Double getChannelCommission() {
        return channelCommission;
    }

    public void setChannelCommission(Double channelCommission) {
        this.channelCommission = channelCommission;
    }

    public Double getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(Double channelCost) {
        this.channelCost = channelCost;
    }

    public Double getOutboundChannelCommission() {
        return outboundChannelCommission;
    }

    public void setOutboundChannelCommission(Double outboundChannelCommission) {
        this.outboundChannelCommission = outboundChannelCommission;
    }

    public Double getHouseChannelCommission() {
        return houseChannelCommission;
    }

    public void setHouseChannelCommission(Double houseChannelCommission) {
        this.houseChannelCommission = houseChannelCommission;
    }

    public Double getQualityCost() {
        return qualityCost;
    }

    public void setQualityCost(Double qualityCost) {
        this.qualityCost = qualityCost;
    }

    public Double getWithholdingServiceFee() {
        return withholdingServiceFee;
    }

    public void setWithholdingServiceFee(Double withholdingServiceFee) {
        this.withholdingServiceFee = withholdingServiceFee;
    }

    public Double getFriendsPropertyInsurance() {
        return friendsPropertyInsurance;
    }

    public void setFriendsPropertyInsurance(Double friendsPropertyInsurance) {
        this.friendsPropertyInsurance = friendsPropertyInsurance;
    }

    public Double getAirTreatmentCost() {
        return airTreatmentCost;
    }

    public void setAirTreatmentCost(Double airTreatmentCost) {
        this.airTreatmentCost = airTreatmentCost;
    }

    public Double getAirQualityTestingCost() {
        return airQualityTestingCost;
    }

    public void setAirQualityTestingCost(Double airQualityTestingCost) {
        this.airQualityTestingCost = airQualityTestingCost;
    }

    public Double getMaterialTestingFee() {
        return materialTestingFee;
    }

    public void setMaterialTestingFee(Double materialTestingFee) {
        this.materialTestingFee = materialTestingFee;
    }

    public Double getOwnerRentInvoiceTax() {
        return ownerRentInvoiceTax;
    }

    public void setOwnerRentInvoiceTax(Double ownerRentInvoiceTax) {
        this.ownerRentInvoiceTax = ownerRentInvoiceTax;
    }

    public Double getOtherBusinessLineVariableCosts() {
        return otherBusinessLineVariableCosts;
    }

    public void setOtherBusinessLineVariableCosts(Double otherBusinessLineVariableCosts) {
        this.otherBusinessLineVariableCosts = otherBusinessLineVariableCosts;
    }

    public Double getMarginalRevenue() {
        return marginalRevenue;
    }

    public void setMarginalRevenue(Double marginalRevenue) {
        this.marginalRevenue = marginalRevenue;
    }

    public Double getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(Double fixedCost) {
        this.fixedCost = fixedCost;
    }

    public Double getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(Double basicWage) {
        this.basicWage = basicWage;
    }

    public Double getBasicSalaryHousekeeper() {
        return basicSalaryHousekeeper;
    }

    public void setBasicSalaryHousekeeper(Double basicSalaryHousekeeper) {
        this.basicSalaryHousekeeper = basicSalaryHousekeeper;
    }

    public Double getSocialInsuranceHousekeeper() {
        return socialInsuranceHousekeeper;
    }

    public void setSocialInsuranceHousekeeper(Double socialInsuranceHousekeeper) {
        this.socialInsuranceHousekeeper = socialInsuranceHousekeeper;
    }

    public Double getHousingProvidentFundHousekeeper() {
        return housingProvidentFundHousekeeper;
    }

    public void setHousingProvidentFundHousekeeper(Double housingProvidentFundHousekeeper) {
        this.housingProvidentFundHousekeeper = housingProvidentFundHousekeeper;
    }

    public Double getBasicSalaryConfiguration() {
        return basicSalaryConfiguration;
    }

    public void setBasicSalaryConfiguration(Double basicSalaryConfiguration) {
        this.basicSalaryConfiguration = basicSalaryConfiguration;
    }

    public Double getSocialInsuranceConfiguration() {
        return socialInsuranceConfiguration;
    }

    public void setSocialInsuranceConfiguration(Double socialInsuranceConfiguration) {
        this.socialInsuranceConfiguration = socialInsuranceConfiguration;
    }

    public Double getHousingProvidentFundConfiguration() {
        return housingProvidentFundConfiguration;
    }

    public void setHousingProvidentFundConfiguration(Double housingProvidentFundConfiguration) {
        this.housingProvidentFundConfiguration = housingProvidentFundConfiguration;
    }

    public Double getWorkstationInvestmentAndOperatingCosts() {
        return workstationInvestmentAndOperatingCosts;
    }

    public void setWorkstationInvestmentAndOperatingCosts(Double workstationInvestmentAndOperatingCosts) {
        this.workstationInvestmentAndOperatingCosts = workstationInvestmentAndOperatingCosts;
    }

    public Double getWorkstationInvestmentCost() {
        return workstationInvestmentCost;
    }

    public void setWorkstationInvestmentCost(Double workstationInvestmentCost) {
        this.workstationInvestmentCost = workstationInvestmentCost;
    }

    public Double getWorkstationDecoration() {
        return workstationDecoration;
    }

    public void setWorkstationDecoration(Double workstationDecoration) {
        this.workstationDecoration = workstationDecoration;
    }

    public Double getWorkstationOfficeFurniture() {
        return workstationOfficeFurniture;
    }

    public void setWorkstationOfficeFurniture(Double workstationOfficeFurniture) {
        this.workstationOfficeFurniture = workstationOfficeFurniture;
    }

    public Double getWorkstationComputerEquipment() {
        return workstationComputerEquipment;
    }

    public void setWorkstationComputerEquipment(Double workstationComputerEquipment) {
        this.workstationComputerEquipment = workstationComputerEquipment;
    }

    public Double getWorkstationOfficeEquipment() {
        return workstationOfficeEquipment;
    }

    public void setWorkstationOfficeEquipment(Double workstationOfficeEquipment) {
        this.workstationOfficeEquipment = workstationOfficeEquipment;
    }

    public Double getWorkstationItAccessories() {
        return workstationItAccessories;
    }

    public void setWorkstationItAccessories(Double workstationItAccessories) {
        this.workstationItAccessories = workstationItAccessories;
    }

    public Double getWorkstationEnvironmentSoftcover() {
        return workstationEnvironmentSoftcover;
    }

    public void setWorkstationEnvironmentSoftcover(Double workstationEnvironmentSoftcover) {
        this.workstationEnvironmentSoftcover = workstationEnvironmentSoftcover;
    }

    public Double getWorkstationFirefightingSupplies() {
        return workstationFirefightingSupplies;
    }

    public void setWorkstationFirefightingSupplies(Double workstationFirefightingSupplies) {
        this.workstationFirefightingSupplies = workstationFirefightingSupplies;
    }

    public Double getWorkstationEquipmentRentalServiceFee() {
        return workstationEquipmentRentalServiceFee;
    }

    public void setWorkstationEquipmentRentalServiceFee(Double workstationEquipmentRentalServiceFee) {
        this.workstationEquipmentRentalServiceFee = workstationEquipmentRentalServiceFee;
    }

    public Double getWorkstationChannelCommission() {
        return workstationChannelCommission;
    }

    public void setWorkstationChannelCommission(Double workstationChannelCommission) {
        this.workstationChannelCommission = workstationChannelCommission;
    }

    public Double getWorkstationOperatingCosts() {
        return workstationOperatingCosts;
    }

    public void setWorkstationOperatingCosts(Double workstationOperatingCosts) {
        this.workstationOperatingCosts = workstationOperatingCosts;
    }

    public Double getWorkstationRent() {
        return workstationRent;
    }

    public void setWorkstationRent(Double workstationRent) {
        this.workstationRent = workstationRent;
    }

    public Double getWorkstationPhoneFee() {
        return workstationPhoneFee;
    }

    public void setWorkstationPhoneFee(Double workstationPhoneFee) {
        this.workstationPhoneFee = workstationPhoneFee;
    }

    public Double getWorkstationWaterFee() {
        return workstationWaterFee;
    }

    public void setWorkstationWaterFee(Double workstationWaterFee) {
        this.workstationWaterFee = workstationWaterFee;
    }

    public Double getWorkstationElectricityFee() {
        return workstationElectricityFee;
    }

    public void setWorkstationElectricityFee(Double workstationElectricityFee) {
        this.workstationElectricityFee = workstationElectricityFee;
    }

    public Double getWorkstationGasFee() {
        return workstationGasFee;
    }

    public void setWorkstationGasFee(Double workstationGasFee) {
        this.workstationGasFee = workstationGasFee;
    }

    public Double getWorkstationHeatingPropertyFee() {
        return workstationHeatingPropertyFee;
    }

    public void setWorkstationHeatingPropertyFee(Double workstationHeatingPropertyFee) {
        this.workstationHeatingPropertyFee = workstationHeatingPropertyFee;
    }

    public Double getWorkstationPrinting() {
        return workstationPrinting;
    }

    public void setWorkstationPrinting(Double workstationPrinting) {
        this.workstationPrinting = workstationPrinting;
    }

    public Double getWorkstationCleaningCost() {
        return workstationCleaningCost;
    }

    public void setWorkstationCleaningCost(Double workstationCleaningCost) {
        this.workstationCleaningCost = workstationCleaningCost;
    }

    public Double getWorkstationNetworkFee() {
        return workstationNetworkFee;
    }

    public void setWorkstationNetworkFee(Double workstationNetworkFee) {
        this.workstationNetworkFee = workstationNetworkFee;
    }

    public Double getWorkstationPrintingSupplies() {
        return workstationPrintingSupplies;
    }

    public void setWorkstationPrintingSupplies(Double workstationPrintingSupplies) {
        this.workstationPrintingSupplies = workstationPrintingSupplies;
    }

    public Double getWorkstationDrinkingWater() {
        return workstationDrinkingWater;
    }

    public void setWorkstationDrinkingWater(Double workstationDrinkingWater) {
        this.workstationDrinkingWater = workstationDrinkingWater;
    }

    public Double getWorkstationOfficeSupplies() {
        return workstationOfficeSupplies;
    }

    public void setWorkstationOfficeSupplies(Double workstationOfficeSupplies) {
        this.workstationOfficeSupplies = workstationOfficeSupplies;
    }

    public Double getWorkstationRepairCosts() {
        return workstationRepairCosts;
    }

    public void setWorkstationRepairCosts(Double workstationRepairCosts) {
        this.workstationRepairCosts = workstationRepairCosts;
    }

    public Double getWorkstationHandlingFee() {
        return workstationHandlingFee;
    }

    public void setWorkstationHandlingFee(Double workstationHandlingFee) {
        this.workstationHandlingFee = workstationHandlingFee;
    }

    public Double getWorkstationChannelCommission1() {
        return workstationChannelCommission1;
    }

    public void setWorkstationChannelCommission1(Double workstationChannelCommission1) {
        this.workstationChannelCommission1 = workstationChannelCommission1;
    }

    public Double getOtherOperatingCosts() {
        return otherOperatingCosts;
    }

    public void setOtherOperatingCosts(Double otherOperatingCosts) {
        this.otherOperatingCosts = otherOperatingCosts;
    }

    public Double getLiquidatedDamagesCost() {
        return liquidatedDamagesCost;
    }

    public void setLiquidatedDamagesCost(Double liquidatedDamagesCost) {
        this.liquidatedDamagesCost = liquidatedDamagesCost;
    }

    public Double getOwnerCompensation() {
        return ownerCompensation;
    }

    public void setOwnerCompensation(Double ownerCompensation) {
        this.ownerCompensation = ownerCompensation;
    }

    public Double getSecurityIncidentHandlingFee() {
        return securityIncidentHandlingFee;
    }

    public void setSecurityIncidentHandlingFee(Double securityIncidentHandlingFee) {
        this.securityIncidentHandlingFee = securityIncidentHandlingFee;
    }

    public Double getAdministrativePenalties() {
        return administrativePenalties;
    }

    public void setAdministrativePenalties(Double administrativePenalties) {
        this.administrativePenalties = administrativePenalties;
    }

    public Double getOtherBusinessCostsOther() {
        return otherBusinessCostsOther;
    }

    public void setOtherBusinessCostsOther(Double otherBusinessCostsOther) {
        this.otherBusinessCostsOther = otherBusinessCostsOther;
    }

    public Double getFixedCostOfOtherLinesOfBusiness() {
        return fixedCostOfOtherLinesOfBusiness;
    }

    public void setFixedCostOfOtherLinesOfBusiness(Double fixedCostOfOtherLinesOfBusiness) {
        this.fixedCostOfOtherLinesOfBusiness = fixedCostOfOtherLinesOfBusiness;
    }

    public Double getOperatingGrossProfit() {
        return operatingGrossProfit;
    }

    public void setOperatingGrossProfit(Double operatingGrossProfit) {
        this.operatingGrossProfit = operatingGrossProfit;
    }

    public Double getMarketingCosts() {
        return marketingCosts;
    }

    public void setMarketingCosts(Double marketingCosts) {
        this.marketingCosts = marketingCosts;
    }

    public Double getMarketingLaborCost() {
        return marketingLaborCost;
    }

    public void setMarketingLaborCost(Double marketingLaborCost) {
        this.marketingLaborCost = marketingLaborCost;
    }

    public Double getBasicSalaryMarketer() {
        return basicSalaryMarketer;
    }

    public void setBasicSalaryMarketer(Double basicSalaryMarketer) {
        this.basicSalaryMarketer = basicSalaryMarketer;
    }

    public Double getPerformancePaymarketer() {
        return performancePaymarketer;
    }

    public void setPerformancePaymarketer(Double performancePaymarketer) {
        this.performancePaymarketer = performancePaymarketer;
    }

    public Double getBonusMarketer() {
        return bonusMarketer;
    }

    public void setBonusMarketer(Double bonusMarketer) {
        this.bonusMarketer = bonusMarketer;
    }

    public Double getHousingProvidentFundMarketers() {
        return housingProvidentFundMarketers;
    }

    public void setHousingProvidentFundMarketers(Double housingProvidentFundMarketers) {
        this.housingProvidentFundMarketers = housingProvidentFundMarketers;
    }

    public Double getSocialInsuranceMarketingStaff() {
        return socialInsuranceMarketingStaff;
    }

    public void setSocialInsuranceMarketingStaff(Double socialInsuranceMarketingStaff) {
        this.socialInsuranceMarketingStaff = socialInsuranceMarketingStaff;
    }

    public Double getPrecisionMarketingExpenses() {
        return precisionMarketingExpenses;
    }

    public void setPrecisionMarketingExpenses(Double precisionMarketingExpenses) {
        this.precisionMarketingExpenses = precisionMarketingExpenses;
    }

    public Double getSemConstruction() {
        return semConstruction;
    }

    public void setSemConstruction(Double semConstruction) {
        this.semConstruction = semConstruction;
    }

    public Double getAppPromotion() {
        return appPromotion;
    }

    public void setAppPromotion(Double appPromotion) {
        this.appPromotion = appPromotion;
    }

    public Double getNetworkPortFee() {
        return networkPortFee;
    }

    public void setNetworkPortFee(Double networkPortFee) {
        this.networkPortFee = networkPortFee;
    }

    public Double getBrandMarketingExpenses() {
        return brandMarketingExpenses;
    }

    public void setBrandMarketingExpenses(Double brandMarketingExpenses) {
        this.brandMarketingExpenses = brandMarketingExpenses;
    }

    public Double getClientMarketingExpenses() {
        return clientMarketingExpenses;
    }

    public void setClientMarketingExpenses(Double clientMarketingExpenses) {
        this.clientMarketingExpenses = clientMarketingExpenses;
    }

    public Double getCustomerUserOperation() {
        return customerUserOperation;
    }

    public void setCustomerUserOperation(Double customerUserOperation) {
        this.customerUserOperation = customerUserOperation;
    }

    public Double getCustomerBusinessOperations() {
        return customerBusinessOperations;
    }

    public void setCustomerBusinessOperations(Double customerBusinessOperations) {
        this.customerBusinessOperations = customerBusinessOperations;
    }

    public Double getCustomerBrandMarketing() {
        return customerBrandMarketing;
    }

    public void setCustomerBrandMarketing(Double customerBrandMarketing) {
        this.customerBrandMarketing = customerBrandMarketing;
    }

    public Double getCustomerProductOperation() {
        return customerProductOperation;
    }

    public void setCustomerProductOperation(Double customerProductOperation) {
        this.customerProductOperation = customerProductOperation;
    }

    public Double getOwnershipMarketingExpenses() {
        return ownershipMarketingExpenses;
    }

    public void setOwnershipMarketingExpenses(Double ownershipMarketingExpenses) {
        this.ownershipMarketingExpenses = ownershipMarketingExpenses;
    }

    public Double getOwnerUserOperation() {
        return ownerUserOperation;
    }

    public void setOwnerUserOperation(Double ownerUserOperation) {
        this.ownerUserOperation = ownerUserOperation;
    }

    public Double getOwnerBusinessOperations() {
        return ownerBusinessOperations;
    }

    public void setOwnerBusinessOperations(Double ownerBusinessOperations) {
        this.ownerBusinessOperations = ownerBusinessOperations;
    }

    public Double getOwnerBrandMarketing() {
        return ownerBrandMarketing;
    }

    public void setOwnerBrandMarketing(Double ownerBrandMarketing) {
        this.ownerBrandMarketing = ownerBrandMarketing;
    }

    public Double getOwnerProductOperation() {
        return ownerProductOperation;
    }

    public void setOwnerProductOperation(Double ownerProductOperation) {
        this.ownerProductOperation = ownerProductOperation;
    }

    public Double getDiscountReduction() {
        return discountReduction;
    }

    public void setDiscountReduction(Double discountReduction) {
        this.discountReduction = discountReduction;
    }

    public Double getMarketingExpensesOther() {
        return marketingExpensesOther;
    }

    public void setMarketingExpensesOther(Double marketingExpensesOther) {
        this.marketingExpensesOther = marketingExpensesOther;
    }

    public Double getFunctionalExpenses() {
        return functionalExpenses;
    }

    public void setFunctionalExpenses(Double functionalExpenses) {
        this.functionalExpenses = functionalExpenses;
    }

    public Double getFunctionalLaborCost() {
        return functionalLaborCost;
    }

    public void setFunctionalLaborCost(Double functionalLaborCost) {
        this.functionalLaborCost = functionalLaborCost;
    }

    public Double getBasicSalaryFunctionalStaff() {
        return basicSalaryFunctionalStaff;
    }

    public void setBasicSalaryFunctionalStaff(Double basicSalaryFunctionalStaff) {
        this.basicSalaryFunctionalStaff = basicSalaryFunctionalStaff;
    }

    public Double getPerformancePayrollFunctionalStaff() {
        return performancePayrollFunctionalStaff;
    }

    public void setPerformancePayrollFunctionalStaff(Double performancePayrollFunctionalStaff) {
        this.performancePayrollFunctionalStaff = performancePayrollFunctionalStaff;
    }

    public Double getBonusFunctionalStaff() {
        return bonusFunctionalStaff;
    }

    public void setBonusFunctionalStaff(Double bonusFunctionalStaff) {
        this.bonusFunctionalStaff = bonusFunctionalStaff;
    }

    public Double getHousingProvidentFundFunctionalStaff() {
        return housingProvidentFundFunctionalStaff;
    }

    public void setHousingProvidentFundFunctionalStaff(Double housingProvidentFundFunctionalStaff) {
        this.housingProvidentFundFunctionalStaff = housingProvidentFundFunctionalStaff;
    }

    public Double getSocialInsuranceFunctionalStaff() {
        return socialInsuranceFunctionalStaff;
    }

    public void setSocialInsuranceFunctionalStaff(Double socialInsuranceFunctionalStaff) {
        this.socialInsuranceFunctionalStaff = socialInsuranceFunctionalStaff;
    }

    public Double getMonetaryCompensation() {
        return monetaryCompensation;
    }

    public void setMonetaryCompensation(Double monetaryCompensation) {
        this.monetaryCompensation = monetaryCompensation;
    }

    public Double getFunctionalTemporaryLaborCosts() {
        return functionalTemporaryLaborCosts;
    }

    public void setFunctionalTemporaryLaborCosts(Double functionalTemporaryLaborCosts) {
        this.functionalTemporaryLaborCosts = functionalTemporaryLaborCosts;
    }

    public Double getAdministrativeCosts() {
        return administrativeCosts;
    }

    public void setAdministrativeCosts(Double administrativeCosts) {
        this.administrativeCosts = administrativeCosts;
    }

    public Double getFunctionalRent() {
        return functionalRent;
    }

    public void setFunctionalRent(Double functionalRent) {
        this.functionalRent = functionalRent;
    }

    public Double getFunctionalHeatingPropertyFee() {
        return functionalHeatingPropertyFee;
    }

    public void setFunctionalHeatingPropertyFee(Double functionalHeatingPropertyFee) {
        this.functionalHeatingPropertyFee = functionalHeatingPropertyFee;
    }

    public Double getFunctionalOfficeFurniture() {
        return functionalOfficeFurniture;
    }

    public void setFunctionalOfficeFurniture(Double functionalOfficeFurniture) {
        this.functionalOfficeFurniture = functionalOfficeFurniture;
    }

    public Double getMainDecoration() {
        return mainDecoration;
    }

    public void setMainDecoration(Double mainDecoration) {
        this.mainDecoration = mainDecoration;
    }

    public Double getEquipmentMaintenanceFee() {
        return equipmentMaintenanceFee;
    }

    public void setEquipmentMaintenanceFee(Double equipmentMaintenanceFee) {
        this.equipmentMaintenanceFee = equipmentMaintenanceFee;
    }

    public Double getRepairMaterialFee() {
        return repairMaterialFee;
    }

    public void setRepairMaterialFee(Double repairMaterialFee) {
        this.repairMaterialFee = repairMaterialFee;
    }

    public Double getRepairLaborCosts() {
        return repairLaborCosts;
    }

    public void setRepairLaborCosts(Double repairLaborCosts) {
        this.repairLaborCosts = repairLaborCosts;
    }

    public Double getEquipmentPropertyInsurance() {
        return equipmentPropertyInsurance;
    }

    public void setEquipmentPropertyInsurance(Double equipmentPropertyInsurance) {
        this.equipmentPropertyInsurance = equipmentPropertyInsurance;
    }

    public Double getFunctionalEnvironment() {
        return functionalEnvironment;
    }

    public void setFunctionalEnvironment(Double functionalEnvironment) {
        this.functionalEnvironment = functionalEnvironment;
    }

    public Double getFunctionalEquipmentRentalServiceFee() {
        return functionalEquipmentRentalServiceFee;
    }

    public void setFunctionalEquipmentRentalServiceFee(Double functionalEquipmentRentalServiceFee) {
        this.functionalEquipmentRentalServiceFee = functionalEquipmentRentalServiceFee;
    }

    public Double getFunctionWashingCarpetFee() {
        return functionWashingCarpetFee;
    }

    public void setFunctionWashingCarpetFee(Double functionWashingCarpetFee) {
        this.functionWashingCarpetFee = functionWashingCarpetFee;
    }

    public Double getNetworkFee() {
        return networkFee;
    }

    public void setNetworkFee(Double networkFee) {
        this.networkFee = networkFee;
    }

    public Double getFunctionalWaterFee() {
        return functionalWaterFee;
    }

    public void setFunctionalWaterFee(Double functionalWaterFee) {
        this.functionalWaterFee = functionalWaterFee;
    }

    public Double getFunctionalElectricityFee() {
        return functionalElectricityFee;
    }

    public void setFunctionalElectricityFee(Double functionalElectricityFee) {
        this.functionalElectricityFee = functionalElectricityFee;
    }

    public Double getFunctionalCleaningFee() {
        return functionalCleaningFee;
    }

    public void setFunctionalCleaningFee(Double functionalCleaningFee) {
        this.functionalCleaningFee = functionalCleaningFee;
    }

    public Double getFunctionalDrinkingWater() {
        return functionalDrinkingWater;
    }

    public void setFunctionalDrinkingWater(Double functionalDrinkingWater) {
        this.functionalDrinkingWater = functionalDrinkingWater;
    }

    public Double getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(Double officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public Double getFunctionalOfficeSupplies() {
        return functionalOfficeSupplies;
    }

    public void setFunctionalOfficeSupplies(Double functionalOfficeSupplies) {
        this.functionalOfficeSupplies = functionalOfficeSupplies;
    }

    public Double getCourierFee() {
        return courierFee;
    }

    public void setCourierFee(Double courierFee) {
        this.courierFee = courierFee;
    }

    public Double getFunctionalOfficeMiscellaneousFees() {
        return functionalOfficeMiscellaneousFees;
    }

    public void setFunctionalOfficeMiscellaneousFees(Double functionalOfficeMiscellaneousFees) {
        this.functionalOfficeMiscellaneousFees = functionalOfficeMiscellaneousFees;
    }

    public Double getFunctionalItAccessories() {
        return functionalItAccessories;
    }

    public void setFunctionalItAccessories(Double functionalItAccessories) {
        this.functionalItAccessories = functionalItAccessories;
    }

    public Double getFunctionalTelephoneFee() {
        return functionalTelephoneFee;
    }

    public void setFunctionalTelephoneFee(Double functionalTelephoneFee) {
        this.functionalTelephoneFee = functionalTelephoneFee;
    }

    public Double getTransportation() {
        return transportation;
    }

    public void setTransportation(Double transportation) {
        this.transportation = transportation;
    }

    public Double getFunctionalPrinting() {
        return functionalPrinting;
    }

    public void setFunctionalPrinting(Double functionalPrinting) {
        this.functionalPrinting = functionalPrinting;
    }

    public Double getCompanyLicenseProcessingAndAnnualInspection() {
        return companyLicenseProcessingAndAnnualInspection;
    }

    public void setCompanyLicenseProcessingAndAnnualInspection(Double companyLicenseProcessingAndAnnualInspection) {
        this.companyLicenseProcessingAndAnnualInspection = companyLicenseProcessingAndAnnualInspection;
    }

    public Double getWarehousingFee() {
        return warehousingFee;
    }

    public void setWarehousingFee(Double warehousingFee) {
        this.warehousingFee = warehousingFee;
    }

    public Double getComputerEquipment() {
        return computerEquipment;
    }

    public void setComputerEquipment(Double computerEquipment) {
        this.computerEquipment = computerEquipment;
    }

    public Double getOtherFunctionsDepreciationAndAmortization() {
        return otherFunctionsDepreciationAndAmortization;
    }

    public void setOtherFunctionsDepreciationAndAmortization(Double otherFunctionsDepreciationAndAmortization) {
        this.otherFunctionsDepreciationAndAmortization = otherFunctionsDepreciationAndAmortization;
    }

    public Double getTrainingFee() {
        return trainingFee;
    }

    public void setTrainingFee(Double trainingFee) {
        this.trainingFee = trainingFee;
    }

    public Double getTrainingFees() {
        return trainingFees;
    }

    public void setTrainingFees(Double trainingFees) {
        this.trainingFees = trainingFees;
    }

    public Double getErudition() {
        return erudition;
    }

    public void setErudition(Double erudition) {
        this.erudition = erudition;
    }

    public Double getLecturerTeamBuilding() {
        return lecturerTeamBuilding;
    }

    public void setLecturerTeamBuilding(Double lecturerTeamBuilding) {
        this.lecturerTeamBuilding = lecturerTeamBuilding;
    }

    public Double getTrainingImplementationFee() {
        return trainingImplementationFee;
    }

    public void setTrainingImplementationFee(Double trainingImplementationFee) {
        this.trainingImplementationFee = trainingImplementationFee;
    }

    public Double getCourseDevelopmentFee() {
        return courseDevelopmentFee;
    }

    public void setCourseDevelopmentFee(Double courseDevelopmentFee) {
        this.courseDevelopmentFee = courseDevelopmentFee;
    }

    public Double getDepartmentalTrainingFee() {
        return departmentalTrainingFee;
    }

    public void setDepartmentalTrainingFee(Double departmentalTrainingFee) {
        this.departmentalTrainingFee = departmentalTrainingFee;
    }

    public Double getRecruitmentFee() {
        return recruitmentFee;
    }

    public void setRecruitmentFee(Double recruitmentFee) {
        this.recruitmentFee = recruitmentFee;
    }

    public Double getOnlineRecruitmentFee() {
        return onlineRecruitmentFee;
    }

    public void setOnlineRecruitmentFee(Double onlineRecruitmentFee) {
        this.onlineRecruitmentFee = onlineRecruitmentFee;
    }

    public Double getCampusRecruitmentOffline() {
        return campusRecruitmentOffline;
    }

    public void setCampusRecruitmentOffline(Double campusRecruitmentOffline) {
        this.campusRecruitmentOffline = campusRecruitmentOffline;
    }

    public Double getRecruitmentFeeHeadhuntingFee() {
        return recruitmentFeeHeadhuntingFee;
    }

    public void setRecruitmentFeeHeadhuntingFee(Double recruitmentFeeHeadhuntingFee) {
        this.recruitmentFeeHeadhuntingFee = recruitmentFeeHeadhuntingFee;
    }

    public Double getRecruitmentFeeInternalRecommendation() {
        return recruitmentFeeInternalRecommendation;
    }

    public void setRecruitmentFeeInternalRecommendation(Double recruitmentFeeInternalRecommendation) {
        this.recruitmentFeeInternalRecommendation = recruitmentFeeInternalRecommendation;
    }

    public Double getCulturalConstructionAndWelfareCosts() {
        return culturalConstructionAndWelfareCosts;
    }

    public void setCulturalConstructionAndWelfareCosts(Double culturalConstructionAndWelfareCosts) {
        this.culturalConstructionAndWelfareCosts = culturalConstructionAndWelfareCosts;
    }

    public Double getHumanitiesCultureConstructionFee() {
        return humanitiesCultureConstructionFee;
    }

    public void setHumanitiesCultureConstructionFee(Double humanitiesCultureConstructionFee) {
        this.humanitiesCultureConstructionFee = humanitiesCultureConstructionFee;
    }

    public Double getEmployeeEducationExpenses() {
        return employeeEducationExpenses;
    }

    public void setEmployeeEducationExpenses(Double employeeEducationExpenses) {
        this.employeeEducationExpenses = employeeEducationExpenses;
    }

    public Double getBookDataFee() {
        return bookDataFee;
    }

    public void setBookDataFee(Double bookDataFee) {
        this.bookDataFee = bookDataFee;
    }

    public Double getExecutiveWelfareFee() {
        return executiveWelfareFee;
    }

    public void setExecutiveWelfareFee(Double executiveWelfareFee) {
        this.executiveWelfareFee = executiveWelfareFee;
    }

    public Double getCompanyWelfareExpenses() {
        return companyWelfareExpenses;
    }

    public void setCompanyWelfareExpenses(Double companyWelfareExpenses) {
        this.companyWelfareExpenses = companyWelfareExpenses;
    }

    public Double getSupplementaryMedicalInsurance() {
        return supplementaryMedicalInsurance;
    }

    public void setSupplementaryMedicalInsurance(Double supplementaryMedicalInsurance) {
        this.supplementaryMedicalInsurance = supplementaryMedicalInsurance;
    }

    public Double getMedicalExaminationFee() {
        return medicalExaminationFee;
    }

    public void setMedicalExaminationFee(Double medicalExaminationFee) {
        this.medicalExaminationFee = medicalExaminationFee;
    }

    public Double getExpandTeamBuildingFees() {
        return expandTeamBuildingFees;
    }

    public void setExpandTeamBuildingFees(Double expandTeamBuildingFees) {
        this.expandTeamBuildingFees = expandTeamBuildingFees;
    }

    public Double getCompanyTeamBuildingFee() {
        return companyTeamBuildingFee;
    }

    public void setCompanyTeamBuildingFee(Double companyTeamBuildingFee) {
        this.companyTeamBuildingFee = companyTeamBuildingFee;
    }

    public Double getDailyExpenses() {
        return dailyExpenses;
    }

    public void setDailyExpenses(Double dailyExpenses) {
        this.dailyExpenses = dailyExpenses;
    }

    public Double getOvertimeMealPay() {
        return overtimeMealPay;
    }

    public void setOvertimeMealPay(Double overtimeMealPay) {
        this.overtimeMealPay = overtimeMealPay;
    }

    public Double getTransportationFee() {
        return transportationFee;
    }

    public void setTransportationFee(Double transportationFee) {
        this.transportationFee = transportationFee;
    }

    public Double getBusinessHandlingTransportationFee() {
        return businessHandlingTransportationFee;
    }

    public void setBusinessHandlingTransportationFee(Double businessHandlingTransportationFee) {
        this.businessHandlingTransportationFee = businessHandlingTransportationFee;
    }

    public Double getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(Double travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    public Double getCommunicationFee() {
        return communicationFee;
    }

    public void setCommunicationFee(Double communicationFee) {
        this.communicationFee = communicationFee;
    }

    public Double getInternalMeetingFee() {
        return internalMeetingFee;
    }

    public void setInternalMeetingFee(Double internalMeetingFee) {
        this.internalMeetingFee = internalMeetingFee;
    }

    public Double getExternalConferenceFee() {
        return externalConferenceFee;
    }

    public void setExternalConferenceFee(Double externalConferenceFee) {
        this.externalConferenceFee = externalConferenceFee;
    }

    public Double getSocialInteractionFee() {
        return socialInteractionFee;
    }

    public void setSocialInteractionFee(Double socialInteractionFee) {
        this.socialInteractionFee = socialInteractionFee;
    }

    public Double getFunctionCenterTeamConstructionFee() {
        return functionCenterTeamConstructionFee;
    }

    public void setFunctionCenterTeamConstructionFee(Double functionCenterTeamConstructionFee) {
        this.functionCenterTeamConstructionFee = functionCenterTeamConstructionFee;
    }

    public Double getBusinessCenterTeamBuildingFee() {
        return businessCenterTeamBuildingFee;
    }

    public void setBusinessCenterTeamBuildingFee(Double businessCenterTeamBuildingFee) {
        this.businessCenterTeamBuildingFee = businessCenterTeamBuildingFee;
    }

    public Double getFunctionalToolingFee() {
        return functionalToolingFee;
    }

    public void setFunctionalToolingFee(Double functionalToolingFee) {
        this.functionalToolingFee = functionalToolingFee;
    }

    public Double getBusinessToolingFee() {
        return businessToolingFee;
    }

    public void setBusinessToolingFee(Double businessToolingFee) {
        this.businessToolingFee = businessToolingFee;
    }

    public Double getConsultingServiceFee() {
        return consultingServiceFee;
    }

    public void setConsultingServiceFee(Double consultingServiceFee) {
        this.consultingServiceFee = consultingServiceFee;
    }

    public Double getConsultingServiceFee1() {
        return consultingServiceFee1;
    }

    public void setConsultingServiceFee1(Double consultingServiceFee1) {
        this.consultingServiceFee1 = consultingServiceFee1;
    }

    public Double getTrademarkRegistrationFee() {
        return trademarkRegistrationFee;
    }

    public void setTrademarkRegistrationFee(Double trademarkRegistrationFee) {
        this.trademarkRegistrationFee = trademarkRegistrationFee;
    }

    public Double getLitigationCaseFee() {
        return litigationCaseFee;
    }

    public void setLitigationCaseFee(Double litigationCaseFee) {
        this.litigationCaseFee = litigationCaseFee;
    }

    public Double getLawyerServiceFee() {
        return lawyerServiceFee;
    }

    public void setLawyerServiceFee(Double lawyerServiceFee) {
        this.lawyerServiceFee = lawyerServiceFee;
    }

    public Double getProductDevelopmentFee() {
        return productDevelopmentFee;
    }

    public void setProductDevelopmentFee(Double productDevelopmentFee) {
        this.productDevelopmentFee = productDevelopmentFee;
    }

    public Double getIncentiveFee() {
        return incentiveFee;
    }

    public void setIncentiveFee(Double incentiveFee) {
        this.incentiveFee = incentiveFee;
    }

    public Double getQualityIncentive() {
        return qualityIncentive;
    }

    public void setQualityIncentive(Double qualityIncentive) {
        this.qualityIncentive = qualityIncentive;
    }

    public Double getSupplierIncentive() {
        return supplierIncentive;
    }

    public void setSupplierIncentive(Double supplierIncentive) {
        this.supplierIncentive = supplierIncentive;
    }

    public Double getHpcActivityFee() {
        return hpcActivityFee;
    }

    public void setHpcActivityFee(Double hpcActivityFee) {
        this.hpcActivityFee = hpcActivityFee;
    }

    public Double getTeamIncentiveFee() {
        return teamIncentiveFee;
    }

    public void setTeamIncentiveFee(Double teamIncentiveFee) {
        this.teamIncentiveFee = teamIncentiveFee;
    }

    public Double getFunctionalExpensesOther() {
        return functionalExpensesOther;
    }

    public void setFunctionalExpensesOther(Double functionalExpensesOther) {
        this.functionalExpensesOther = functionalExpensesOther;
    }

    public Double getResearchAndDevelopmentExpenses() {
        return researchAndDevelopmentExpenses;
    }

    public void setResearchAndDevelopmentExpenses(Double researchAndDevelopmentExpenses) {
        this.researchAndDevelopmentExpenses = researchAndDevelopmentExpenses;
    }

    public Double getRdLaborCosts() {
        return rdLaborCosts;
    }

    public void setRdLaborCosts(Double rdLaborCosts) {
        this.rdLaborCosts = rdLaborCosts;
    }

    public Double getBasicSalaryRdPersonnel() {
        return basicSalaryRdPersonnel;
    }

    public void setBasicSalaryRdPersonnel(Double basicSalaryRdPersonnel) {
        this.basicSalaryRdPersonnel = basicSalaryRdPersonnel;
    }

    public Double getPerformanceSalaryRdPersonnel() {
        return performanceSalaryRdPersonnel;
    }

    public void setPerformanceSalaryRdPersonnel(Double performanceSalaryRdPersonnel) {
        this.performanceSalaryRdPersonnel = performanceSalaryRdPersonnel;
    }

    public Double getBonusRdStaff() {
        return bonusRdStaff;
    }

    public void setBonusRdStaff(Double bonusRdStaff) {
        this.bonusRdStaff = bonusRdStaff;
    }

    public Double getHousingProvidentFundRdPersonnel() {
        return housingProvidentFundRdPersonnel;
    }

    public void setHousingProvidentFundRdPersonnel(Double housingProvidentFundRdPersonnel) {
        this.housingProvidentFundRdPersonnel = housingProvidentFundRdPersonnel;
    }

    public Double getSocialInsuranceRdPersonnel() {
        return socialInsuranceRdPersonnel;
    }

    public void setSocialInsuranceRdPersonnel(Double socialInsuranceRdPersonnel) {
        this.socialInsuranceRdPersonnel = socialInsuranceRdPersonnel;
    }

    public Double getSystemImplementationServiceFee() {
        return systemImplementationServiceFee;
    }

    public void setSystemImplementationServiceFee(Double systemImplementationServiceFee) {
        this.systemImplementationServiceFee = systemImplementationServiceFee;
    }

    public Double getSystemServiceFee() {
        return systemServiceFee;
    }

    public void setSystemServiceFee(Double systemServiceFee) {
        this.systemServiceFee = systemServiceFee;
    }

    public Double getSystemImplementationFee() {
        return systemImplementationFee;
    }

    public void setSystemImplementationFee(Double systemImplementationFee) {
        this.systemImplementationFee = systemImplementationFee;
    }

    public Double getSmsPlatformInformationFee() {
        return smsPlatformInformationFee;
    }

    public void setSmsPlatformInformationFee(Double smsPlatformInformationFee) {
        this.smsPlatformInformationFee = smsPlatformInformationFee;
    }

    public Double getMachineRoomAndEquipmentCosts() {
        return machineRoomAndEquipmentCosts;
    }

    public void setMachineRoomAndEquipmentCosts(Double machineRoomAndEquipmentCosts) {
        this.machineRoomAndEquipmentCosts = machineRoomAndEquipmentCosts;
    }

    public Double getIdcHostingFee() {
        return idcHostingFee;
    }

    public void setIdcHostingFee(Double idcHostingFee) {
        this.idcHostingFee = idcHostingFee;
    }

    public Double getCommunicationEquipment() {
        return communicationEquipment;
    }

    public void setCommunicationEquipment(Double communicationEquipment) {
        this.communicationEquipment = communicationEquipment;
    }

    public Double getSafetyEquipment() {
        return safetyEquipment;
    }

    public void setSafetyEquipment(Double safetyEquipment) {
        this.safetyEquipment = safetyEquipment;
    }

    public Double getStorageDevice() {
        return storageDevice;
    }

    public void setStorageDevice(Double storageDevice) {
        this.storageDevice = storageDevice;
    }

    public Double getServer() {
        return server;
    }

    public void setServer(Double server) {
        this.server = server;
    }

    public Double getNetworkEquipment() {
        return networkEquipment;
    }

    public void setNetworkEquipment(Double networkEquipment) {
        this.networkEquipment = networkEquipment;
    }

    public Double getSoftware() {
        return software;
    }

    public void setSoftware(Double software) {
        this.software = software;
    }

    public Double getOtherDepreciationAndAmortization() {
        return otherDepreciationAndAmortization;
    }

    public void setOtherDepreciationAndAmortization(Double otherDepreciationAndAmortization) {
        this.otherDepreciationAndAmortization = otherDepreciationAndAmortization;
    }

    public Double getFinancialExpenses() {
        return financialExpenses;
    }

    public void setFinancialExpenses(Double financialExpenses) {
        this.financialExpenses = financialExpenses;
    }

    public Double getBusinessTaxAndSurcharges() {
        return businessTaxAndSurcharges;
    }

    public void setBusinessTaxAndSurcharges(Double businessTaxAndSurcharges) {
        this.businessTaxAndSurcharges = businessTaxAndSurcharges;
    }

    public Double getAssetImpairmentLoss() {
        return assetImpairmentLoss;
    }

    public void setAssetImpairmentLoss(Double assetImpairmentLoss) {
        this.assetImpairmentLoss = assetImpairmentLoss;
    }

    public Double getInvestmentGainsAndLosses() {
        return investmentGainsAndLosses;
    }

    public void setInvestmentGainsAndLosses(Double investmentGainsAndLosses) {
        this.investmentGainsAndLosses = investmentGainsAndLosses;
    }

    public Double getOperatingProfit() {
        return operatingProfit;
    }

    public void setOperatingProfit(Double operatingProfit) {
        this.operatingProfit = operatingProfit;
    }

    public Double getNetNonoperatingIncomeAndExpenses() {
        return netNonoperatingIncomeAndExpenses;
    }

    public void setNetNonoperatingIncomeAndExpenses(Double netNonoperatingIncomeAndExpenses) {
        this.netNonoperatingIncomeAndExpenses = netNonoperatingIncomeAndExpenses;
    }

    public Double getNonoperatingIncome() {
        return nonoperatingIncome;
    }

    public void setNonoperatingIncome(Double nonoperatingIncome) {
        this.nonoperatingIncome = nonoperatingIncome;
    }

    public Double getOperatingExpenses() {
        return operatingExpenses;
    }

    public void setOperatingExpenses(Double operatingExpenses) {
        this.operatingExpenses = operatingExpenses;
    }

    public Double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Double getIncomeTaxExpense() {
        return incomeTaxExpense;
    }

    public void setIncomeTaxExpense(Double incomeTaxExpense) {
        this.incomeTaxExpense = incomeTaxExpense;
    }

    public Double getNetProfitBeforeApportionment() {
        return netProfitBeforeApportionment;
    }

    public void setNetProfitBeforeApportionment(Double netProfitBeforeApportionment) {
        this.netProfitBeforeApportionment = netProfitBeforeApportionment;
    }

    public Double getTotalApportionment() {
        return totalApportionment;
    }

    public void setTotalApportionment(Double totalApportionment) {
        this.totalApportionment = totalApportionment;
    }

    public Double getBusinessLineAllocation() {
        return businessLineAllocation;
    }

    public void setBusinessLineAllocation(Double businessLineAllocation) {
        this.businessLineAllocation = businessLineAllocation;
    }

    public Double getBusinessLineAllocationRdAllocation() {
        return businessLineAllocationRdAllocation;
    }

    public void setBusinessLineAllocationRdAllocation(Double businessLineAllocationRdAllocation) {
        this.businessLineAllocationRdAllocation = businessLineAllocationRdAllocation;
    }

    public Double getBusinessLineAllocationMarketingAllocation() {
        return businessLineAllocationMarketingAllocation;
    }

    public void setBusinessLineAllocationMarketingAllocation(Double businessLineAllocationMarketingAllocation) {
        this.businessLineAllocationMarketingAllocation = businessLineAllocationMarketingAllocation;
    }

    public Double getBusinessLineAllocationFunctionAllocation() {
        return businessLineAllocationFunctionAllocation;
    }

    public void setBusinessLineAllocationFunctionAllocation(Double businessLineAllocationFunctionAllocation) {
        this.businessLineAllocationFunctionAllocation = businessLineAllocationFunctionAllocation;
    }

    public Double getGroupSharing() {
        return groupSharing;
    }

    public void setGroupSharing(Double groupSharing) {
        this.groupSharing = groupSharing;
    }

    public Double getGroupApportionmentRdAllocation() {
        return groupApportionmentRdAllocation;
    }

    public void setGroupApportionmentRdAllocation(Double groupApportionmentRdAllocation) {
        this.groupApportionmentRdAllocation = groupApportionmentRdAllocation;
    }

    public Double getGroupAllocationMarketingAllocation() {
        return groupAllocationMarketingAllocation;
    }

    public void setGroupAllocationMarketingAllocation(Double groupAllocationMarketingAllocation) {
        this.groupAllocationMarketingAllocation = groupAllocationMarketingAllocation;
    }

    public Double getGroupApportionmentFunctionAllocation() {
        return groupApportionmentFunctionAllocation;
    }

    public void setGroupApportionmentFunctionAllocation(Double groupApportionmentFunctionAllocation) {
        this.groupApportionmentFunctionAllocation = groupApportionmentFunctionAllocation;
    }

    public Double getNetProfitAfterApportionment() {
        return netProfitAfterApportionment;
    }

    public void setNetProfitAfterApportionment(Double netProfitAfterApportionment) {
        this.netProfitAfterApportionment = netProfitAfterApportionment;
    }

    public Double getAssessedAmount() {
        return assessedAmount;
    }

    public void setAssessedAmount(Double assessedAmount) {
        this.assessedAmount = assessedAmount;
    }

    public Double getRepairServiceFee() {
        return repairServiceFee;
    }

    public void setRepairServiceFee(Double repairServiceFee) {
        this.repairServiceFee = repairServiceFee;
    }

    public Double getOperatingCost() {
        return operatingCost;
    }

    public void setOperatingCost(Double operatingCost) {
        this.operatingCost = operatingCost;
    }

    public Double getDirectLaborCost() {
        return directLaborCost;
    }

    public void setDirectLaborCost(Double directLaborCost) {
        this.directLaborCost = directLaborCost;
    }

    public Double getHoldNum() {
        return holdNum;
    }

    public void setHoldNum(Double holdNum) {
        this.holdNum = holdNum;
    }

    public Double getHoldNumDays() {
        return holdNumDays;
    }

    public void setHoldNumDays(Double holdNumDays) {
        this.holdNumDays = holdNumDays;
    }

    public Double getCalculatedHoldNum() {
        return calculatedHoldNum;
    }

    public void setCalculatedHoldNum(Double calculatedHoldNum) {
        this.calculatedHoldNum = calculatedHoldNum;
    }

    public Double getCalculatedHoldNumDays() {
        return calculatedHoldNumDays;
    }

    public void setCalculatedHoldNumDays(Double calculatedHoldNumDays) {
        this.calculatedHoldNumDays = calculatedHoldNumDays;
    }

    public Double getCommendationCost() {
        return commendationCost;
    }

    public void setCommendationCost(Double commendationCost) {
        this.commendationCost = commendationCost;
    }

    public Double getConstructionCost() {
        return constructionCost;
    }

    public void setConstructionCost(Double constructionCost) {
        this.constructionCost = constructionCost;
    }
}