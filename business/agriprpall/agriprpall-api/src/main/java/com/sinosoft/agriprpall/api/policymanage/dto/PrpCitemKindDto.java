package com.sinosoft.agriprpall.api.policymanage.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sinosoft.framework.dto.BaseRequest;

import java.io.Serializable;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-24 07:46:04.010 
 * 标的子险信息Api操作对象
 */
public class PrpCitemKindDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性保单号码/保单号码 */
	private String policyNo ;		
	/** 属性险种代码 /险种代码  */
	private String riskCode ;		
	/** 属性序号/序号 */
	private Integer itemKindNo ;
	/** 属性分户序号/分户序号 */
	private Integer familyNo ;
	/** 属性分户名称(仅用于集体家财险)/分户名称(仅用于集体家财险) */
	private String familyName ;		
	/** 属性rationType/rationType */
	private String rationType ;		
	/** 属性险别代码 /险别代码  */
	private String kindCode ;		
	/** 属性险别名称/险别名称 */
	private String kindName ;		
	/** 属性标的序号/标的序号 */
	private Integer itemNo ;
	/** 属性标的项目类别代码/标的项目类别代码 */
	private String itemCode ;		
	/** 属性标的项目明细名称/标的项目明细名称 */
	private String itemDetailName ;		
	/** 属性投保方式代码/投保方式代码 */
	private String modeCode ;		
	/** 属性投保方式名称/投保方式名称 */
	private String modeName ;		
	/** 属性起保日期/起保日期 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private java.util.Date startDate ;		
	/** 属性起保小时/起保小时 */
	private Integer startHour ;
	/** 属性终保日期/终保日期 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private java.util.Date endDate ;		
	/** 属性终保小时/终保小时 */
	private Integer endHour ;
	/** 属性规格型号/规格型号 */
	private String model ;		
	/** 属性购买日期/购买日期 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private java.util.Date buyDate ;		
	/** 属性地址序号/地址序号 */
	private Integer addressNo ;
	/** 属性是否计算保额标志(Y/N)/是否计算保额标志(Y/N) */
	private String calculateFlag ;		
	/** 属性币别/币别 */
	private String currency ;		
	/** 属性单位保险金额（赔偿限额）/单位保险金额（赔偿限额） */
	private Double unitAmount ;
	/** 属性数量/数量 */
	private Double quantity ;
	/** 属性数量单位/数量单位 */
	private String unit ;		
	/** 属性保险价值/保险价值 */
	private Double value ;
	/** 属性保险金额/保险金额 */
	private Double amount ;
	/** 属性适应费率期数/适应费率期数 */
	private Integer ratePeriod ;
	/** 属性费率/费率 */
	private Double rate ;
	/** 属性短期费率标志/短期费率标志 */
	private String shortRateFlag ;		
	/** 属性短期费率/短期费率 */
	private Double shortRate ;
	/** 属性基准保费/基准保费 */
	private Double basePremium ;
	/** 属性标准保费/标准保费 */
	private Double benchmarkPremium ;
	/** 属性折扣率/折扣率 */
	private Double discount ;
	/** 属性保费调整比率/保费调整比率 */
	private Double adjustRate ;
	/** 属性保费/保费 */
	private Double premium ;
	/** 属性免赔率/免赔率 */
	private Double deductibleRate ;
	/** 属性免赔额/免赔额 */
	private Double deductible ;
	/** 属性标志字段/标志字段 */
	private String flag ="";
	/** 属性地区费率因子: 0-不浮动, 1-上浮30%/地区费率因子: 0-不浮动, 1-上浮30% */
	private String regionRate ;		
	/** 属性饮酒费率因子：饮酒驾驶违法次数/饮酒费率因子：饮酒驾驶违法次数 */
	private Integer drinkRate ;
	/** 属性醉酒费率因子：醉酒驾驶违法次数/醉酒费率因子：醉酒驾驶违法次数 */
	private Integer drunkRate ;
	/** 属性肉牛类型/肉牛类型 */
	private String cattleType ;		
	/** 属性每次事故每人赔偿限额/每次事故每人赔偿限额 */
	private Double unitPersonLimitAmount ;
	/** 属性每人赔偿限额0123用到/每人赔偿限额0123用到 */
	private Double unitPersonAmount ;
	/** 属性日额：每人日额（元）/日额：每人日额（元） */
	private Double unitDayAmountSub ;
	/** 属性天数/天数 */
	private Integer daySub ;
	/** 属性人员类别/人员类别 */
	private String personType ;		
	/** 属性起赔点/起赔点 */
	private Double triggerPoint ;
	/** 属性全损损失率/全损损失率 */
	private Double totalLossRatio ;
	/** 属性诉讼费限额/诉讼费限额 */
	private Double lawsuitAmount ;
	/** 属性病床数/病床数 */
	private Integer bedNum ;
	/** 属性每张床位保险费/每张床位保险费 */
	private Double bedPremium ;
	/** 属性医疗机构保费/医疗机构保费 */
	private Double hospitalPremium ;
	/** 属性各类医务人员人数/各类医务人员人数 */
	private Integer kindWorkerNum ;
	/** 属性各类医务人员每人保费/各类医务人员每人保费 */
	private Double kindWorkerPremium ;
	/** 属性临床手术科室医师人数/临床手术科室医师人数 */
	private Integer clinicNum ;
	/** 属性临床手术科室医师每人保费/临床手术科室医师每人保费 */
	private Double clinicPremium ;
	/** 属性临床非手术科室医师人数/临床非手术科室医师人数 */
	private Integer nClinicNum ;
	/** 属性临床非手术科室医师每人保费/临床非手术科室医师每人保费 */
	private Double nClinicPremium ;
	/** 属性医技科室人数/医技科室人数 */
	private Integer roomNum ;
	/** 属性医技科室每人保费/医技科室每人保费 */
	private Double roomPremium ;
	/** 属性护士人数/护士人数 */
	private Integer nurseNum ;
	/** 属性护士每人保费/护士每人保费 */
	private Double nursePremium ;
	/** 属性医务人员保费/医务人员保费 */
	private Double workerPremium ;
	/** 属性医务人员人数/医务人员人数 */
	private Integer workerNum ;
	/** 属性大病医疗保险新生儿数量/大病医疗保险新生儿数量 */
	private Double quantityNewborn ;
	/** 属性大病医疗保险新生儿是否收费标志/大病医疗保险新生儿是否收费标志 */
	private String chargeNewbornFlag ;		
	/** 属性单位保费/单位保费 */
	private Double unitPremium ;
	/** 属性住院病人手术人次/住院病人手术人次 */
	private Integer operationNum ;
	/** 属性住院病人手术人次基准保险费/住院病人手术人次基准保险费 */
	private Double operationPremium ;
	/** 属性医疗机构类别系数/医疗机构类别系数 */
	private Double medicalRate ;
	/** 属性岗位系数/岗位系数 */
	private Double postRate ;
	/** 属性benefitRate/benefitRate */
	private Double benefitRate ;
	/** 属性deductibleValue/deductibleValue */
	private Double deductibleValue ;
	/** 属性deductibleDiscount/deductibleDiscount */
	private Double deductibleDiscount ;
	/** 属性kindBenchMarkPremiumm/kindBenchmarkPremiumm */
	private Double kindBenchmarkPremiumm ;
	/** 属性guestAmount/guestAmount */
	private Double guestAmount ;
	/** 属性driverAmount/driverAmount */
	private Double driverAmount ;
	/** 属性thirdPeopleAmount/thirdPeopleAmount */
	private Double thirdPeopleAmount ;
	/** 属性isspecGlass/isSpecGlass */
	private String isSpecGlass ;		
	/** 属性clauseCode/clauseCode */
	private String clauseCode ;		
	/** 属性compensationdays/compensationDays */
	private String compensationDays ;		
	/** 属性currency2/currency2 */
	private String currency2 ;		
	/** 属性deductibledesc/deductibleDesc */
	private String deductibleDesc ;		
	/** 属性discountcharge/discountCharge */
	private Double discountCharge ;
	/** 属性endorType/endorType */
	private String endorType ;		
	/** 属性exchangeRate2/exchangeRate2 */
	private Double exchangeRate2 ;
	/** 属性exchangeRateCny/exchangeRatecny */
	private Double exchangeRateCNY ;
	/** 属性insuredValueType/insuredValueType */
	private String insuredValueType ;		
	/** 属性insuredValueTypeName/insuredValueTypeName */
	private String insuredValueTypeName ;		
	/** 属性kindPremiumm/kindPremiumm */
	private Double kindPremiumm ;
	/** 属性lastPurePremium/lastPurePremium */
	private Double lastPurePremium ;
	/** 属性lowerRate/lowerRate */
	private String lowerRate ;		
	/** 属性manageCharge/manageCharge */
	private Double manageCharge ;
	/** 属性motorRate/motorRate */
	private Double motorRate ;
	/** 属性newEndDate/newEndDate */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private java.util.Date newEndDate ;		
	/** 属性newStartDate/newStartDate */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private java.util.Date newStartDate ;		
	/** 属性paymentRate/paymentRate */
	private Double paymentRate ;
	/** 属性premium2/premium2 */
	private Double premium2 ;
	/** 属性premiumCny/premiumCNY */
	private Double premiumCNY ;
	/** 属性productCode/productCode */
	private String productCode ;		
	/** 属性profitScale/profitsCale */
	private Double profitScale ;
	/** 属性purePremium/purePremium */
	private Double purePremium ;
	/** 属性rate1/rate1 */
	private Double rate1 ;
	/** 属性rateType/rateType */
	private String rateType ;		
	/** 属性rateValidDate/ratevalidDate */
	private String rateValidDate ;
	/** 属性relieffund/reliefFund */
	private Double reliefFund ;
	/** 属性relieffundRate/reliefFundRate */
	private Double reliefFundRate ;
	/** 属性replyNo/replyNo */
	private String replyNo ;		
	/** 属性specialCharge/specialCharge */
	private Double specialCharge ;
	/** 属性stabilityFund/stabilityFund */
	private Double stabilityFund ;
	/** 属性stabilityFundRate/stabilityFundRate */
	private Double stabilityFundRate ;
	/** 属性storageRate/storageRate */
	private String storageRate ;		
	/** 属性structureNo/structureNo */
	private Integer structureNo ;
	/** 属性costPrem/costPrem */
	private Integer costPrem ;
	/** 属性costDiscount/costDiscount */
	private Integer costDiscount ;
	/** 属性recommenDiscount/recommenDiscount */
	private Integer recommenDiscount ;
	/** 属性expDiscount/expDiscount */
	private Integer expDiscount ;
	/** 属性uwritingDiscount/uwritingDiscount */
	private Integer uwritingDiscount ;
	/** 属性修改人/修改人 */
	private String update_By ;
	/** 属性修改时间/修改时间 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private java.util.Date update_Date ;
	/** 属性不含税保费/不含税保费 */
	private Double noTaxPremium ;
	/** 属性应/免税标识，1-应税，2-免税/应/免税标识，1-应税，2-免税 */
	private String taxFlag ;		
	/** 属性税率/税率 */
	private Double taxRate ;
	/** 属性税额/税额 */
	private Double taxFee ;
	/** 属性保费计算方式/保费计算方式 */
	private String premiumCalMethod ;		
	/** 属性林木用途/林木用途 */
	private String forestUse ;
	/** 属性中央政策性农险分户计算短期费率标志(并不对应表中字段) */
	private String equalFlag;

	/** add by 王心洋 2017-11-17 */
	//保额置为0
	private String Validity ;
	private Double sumAmount ;
	private Double centralPremium ;
	private Double provincePremium ;
	private Double cityPremium ;
	private Double townPremium ;
	private Double otherPremium ;
	private Double fPremium ;
	private Double sumPremium ;
	private Double insureArea ;

	/**
	 *
	 * 返回保单的hashCode（请不要误删此方法）
	 * @return policyNo的hashCode
	 */
	@Override
	public int hashCode() {
		String kindItem = (kindCode == null ? "" : kindCode) + (itemCode == null ? "" : itemCode);
		return kindItem.hashCode();
	}

	/**
	 * 险别，标的一致且不为null返回true（请不要误删此方法）
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof PrpCitemKindDto) {
			if (this.policyNo == null || this.kindCode == null || this.itemCode == null) {
				return false;
			} else {
				PrpCitemKindDto prpCitemKindDto = (PrpCitemKindDto) obj;
				return this.kindCode.equals(prpCitemKindDto.kindCode)
						&& this.itemCode.equals(prpCitemKindDto.itemCode);
			}
		} else {
			return false;
		}
	}


	public Double getSumPremium() {
		return sumPremium;
	}

	public void setSumPremium(Double sumPremium) {
		this.sumPremium = sumPremium;
	}

	public Double getInsureArea() {
		return insureArea;
	}

	public void setInsureArea(Double insureArea) {
		this.insureArea = insureArea;
	}

	public String getValidity() {
		return Validity;
	}

	public void setValidity(String validity) {
		Validity = validity;
	}

	public Double getSumAmount() {
		return sumAmount;
	}

	public void setSumAmount(Double sumAmount) {
		this.sumAmount = sumAmount;
	}

	public Double getCentralPremium() {
		return centralPremium;
	}

	public void setCentralPremium(Double centralPremium) {
		this.centralPremium = centralPremium;
	}

	public Double getProvincePremium() {
		return provincePremium;
	}

	public void setProvincePremium(Double provincePremium) {
		this.provincePremium = provincePremium;
	}

	public Double getCityPremium() {
		return cityPremium;
	}

	public void setCityPremium(Double cityPremium) {
		this.cityPremium = cityPremium;
	}

	public Double getTownPremium() {
		return townPremium;
	}

	public void setTownPremium(Double townPremium) {
		this.townPremium = townPremium;
	}

	public Double getOtherPremium() {
		return otherPremium;
	}

	public void setOtherPremium(Double otherPremium) {
		this.otherPremium = otherPremium;
	}

	public Double getfPremium() {
		return fPremium;
	}

	public void setfPremium(Double fPremium) {
		this.fPremium = fPremium;
	}

	/**
	 * 属性保单号码/保单号码的getter方法
	 */
	public String getPolicyNo() {
		return policyNo;
	}
	/**
	 * 属性保单号码/保单号码的setter方法
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}	
	/**
	 * 属性险种代码 /险种代码 的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性险种代码 /险种代码 的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}	
	/**
	 * 属性序号/序号的getter方法
	 */
	public Integer getItemKindNo() {
		return itemKindNo;
	}
	/**
	 * 属性序号/序号的setter方法
	 */
	public void setItemKindNo(Integer itemKindNo) {
		this.itemKindNo = itemKindNo;
	}	
	/**
	 * 属性分户序号/分户序号的getter方法
	 */
	public Integer getFamilyNo() {
		return familyNo;
	}
	/**
	 * 属性分户序号/分户序号的setter方法
	 */
	public void setFamilyNo(Integer familyNo) {
		this.familyNo = familyNo;
	}	
	/**
	 * 属性分户名称(仅用于集体家财险)/分户名称(仅用于集体家财险)的getter方法
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * 属性分户名称(仅用于集体家财险)/分户名称(仅用于集体家财险)的setter方法
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}	
	/**
	 * 属性rationType/rationType的getter方法
	 */
	public String getRationType() {
		return rationType;
	}
	/**
	 * 属性rationType/rationType的setter方法
	 */
	public void setRationType(String rationType) {
		this.rationType = rationType;
	}	
	/**
	 * 属性险别代码 /险别代码 的getter方法
	 */
	public String getKindCode() {
		return kindCode;
	}
	/**
	 * 属性险别代码 /险别代码 的setter方法
	 */
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}	
	/**
	 * 属性险别名称/险别名称的getter方法
	 */
	public String getKindName() {
		return kindName;
	}
	/**
	 * 属性险别名称/险别名称的setter方法
	 */
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}	
	/**
	 * 属性标的序号/标的序号的getter方法
	 */
	public Integer getItemNo() {
		return itemNo;
	}
	/**
	 * 属性标的序号/标的序号的setter方法
	 */
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}	
	/**
	 * 属性标的项目类别代码/标的项目类别代码的getter方法
	 */
	public String getItemCode() {
		return itemCode;
	}
	/**
	 * 属性标的项目类别代码/标的项目类别代码的setter方法
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}	
	/**
	 * 属性标的项目明细名称/标的项目明细名称的getter方法
	 */
	public String getItemDetailName() {
		return itemDetailName;
	}
	/**
	 * 属性标的项目明细名称/标的项目明细名称的setter方法
	 */
	public void setItemDetailName(String itemDetailName) {
		this.itemDetailName = itemDetailName;
	}	
	/**
	 * 属性投保方式代码/投保方式代码的getter方法
	 */
	public String getModeCode() {
		return modeCode;
	}
	/**
	 * 属性投保方式代码/投保方式代码的setter方法
	 */
	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}	
	/**
	 * 属性投保方式名称/投保方式名称的getter方法
	 */
	public String getModeName() {
		return modeName;
	}
	/**
	 * 属性投保方式名称/投保方式名称的setter方法
	 */
	public void setModeName(String modeName) {
		this.modeName = modeName;
	}	
	/**
	 * 属性起保日期/起保日期的getter方法
	 */
	public java.util.Date getStartDate() {
		return startDate;
	}
	/**
	 * 属性起保日期/起保日期的setter方法
	 */
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
	}	
	/**
	 * 属性起保小时/起保小时的getter方法
	 */
	public Integer getStartHour() {
		return startHour;
	}
	/**
	 * 属性起保小时/起保小时的setter方法
	 */
	public void setStartHour(Integer startHour) {
		this.startHour = startHour;
	}	
	/**
	 * 属性终保日期/终保日期的getter方法
	 */
	public java.util.Date getEndDate() {
		return endDate;
	}
	/**
	 * 属性终保日期/终保日期的setter方法
	 */
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}	
	/**
	 * 属性终保小时/终保小时的getter方法
	 */
	public Integer getEndHour() {
		return endHour;
	}
	/**
	 * 属性终保小时/终保小时的setter方法
	 */
	public void setEndHour(Integer endHour) {
		this.endHour = endHour;
	}	
	/**
	 * 属性规格型号/规格型号的getter方法
	 */
	public String getModel() {
		return model;
	}
	/**
	 * 属性规格型号/规格型号的setter方法
	 */
	public void setModel(String model) {
		this.model = model;
	}	
	/**
	 * 属性购买日期/购买日期的getter方法
	 */
	public java.util.Date getBuyDate() {
		return buyDate;
	}
	/**
	 * 属性购买日期/购买日期的setter方法
	 */
	public void setBuyDate(java.util.Date buyDate) {
		this.buyDate = buyDate;
	}	
	/**
	 * 属性地址序号/地址序号的getter方法
	 */
	public Integer getAddressNo() {
		return addressNo;
	}
	/**
	 * 属性地址序号/地址序号的setter方法
	 */
	public void setAddressNo(Integer addressNo) {
		this.addressNo = addressNo;
	}	
	/**
	 * 属性是否计算保额标志(Y/N)/是否计算保额标志(Y/N)的getter方法
	 */
	public String getCalculateFlag() {
		return calculateFlag;
	}
	/**
	 * 属性是否计算保额标志(Y/N)/是否计算保额标志(Y/N)的setter方法
	 */
	public void setCalculateFlag(String calculateFlag) {
		this.calculateFlag = calculateFlag;
	}	
	/**
	 * 属性币别/币别的getter方法
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 属性币别/币别的setter方法
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}	
	/**
	 * 属性单位保险金额（赔偿限额）/单位保险金额（赔偿限额）的getter方法
	 */
	public Double getUnitAmount() {
		return unitAmount;
	}
	/**
	 * 属性单位保险金额（赔偿限额）/单位保险金额（赔偿限额）的setter方法
	 */
	public void setUnitAmount(Double unitAmount) {
		this.unitAmount = unitAmount;
	}	
	/**
	 * 属性数量/数量的getter方法
	 */
	public Double getQuantity() {
		return quantity;
	}
	/**
	 * 属性数量/数量的setter方法
	 */
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}	
	/**
	 * 属性数量单位/数量单位的getter方法
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * 属性数量单位/数量单位的setter方法
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}	
	/**
	 * 属性保险价值/保险价值的getter方法
	 */
	public Double getValue() {
		return value;
	}
	/**
	 * 属性保险价值/保险价值的setter方法
	 */
	public void setValue(Double value) {
		this.value = value;
	}	
	/**
	 * 属性保险金额/保险金额的getter方法
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * 属性保险金额/保险金额的setter方法
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}	
	/**
	 * 属性适应费率期数/适应费率期数的getter方法
	 */
	public Integer getRatePeriod() {
		return ratePeriod;
	}
	/**
	 * 属性适应费率期数/适应费率期数的setter方法
	 */
	public void setRatePeriod(Integer ratePeriod) {
		this.ratePeriod = ratePeriod;
	}	
	/**
	 * 属性费率/费率的getter方法
	 */
	public Double getRate() {
		return rate;
	}
	/**
	 * 属性费率/费率的setter方法
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}	
	/**
	 * 属性短期费率标志/短期费率标志的getter方法
	 */
	public String getShortRateFlag() {
		return shortRateFlag;
	}
	/**
	 * 属性短期费率标志/短期费率标志的setter方法
	 */
	public void setShortRateFlag(String shortRateFlag) {
		this.shortRateFlag = shortRateFlag;
	}	
	/**
	 * 属性短期费率/短期费率的getter方法
	 */
	public Double getShortRate() {
		return shortRate;
	}
	/**
	 * 属性短期费率/短期费率的setter方法
	 */
	public void setShortRate(Double shortRate) {
		this.shortRate = shortRate;
	}	
	/**
	 * 属性基准保费/基准保费的getter方法
	 */
	public Double getBasePremium() {
		return basePremium;
	}
	/**
	 * 属性基准保费/基准保费的setter方法
	 */
	public void setBasePremium(Double basePremium) {
		this.basePremium = basePremium;
	}	
	/**
	 * 属性标准保费/标准保费的getter方法
	 */
	public Double getBenchmarkPremium() {
		return benchmarkPremium;
	}
	/**
	 * 属性标准保费/标准保费的setter方法
	 */
	public void setBenchmarkPremium(Double benchmarkPremium) {
		this.benchmarkPremium = benchmarkPremium;
	}	
	/**
	 * 属性折扣率/折扣率的getter方法
	 */
	public Double getDiscount() {
		return discount;
	}
	/**
	 * 属性折扣率/折扣率的setter方法
	 */
	public void setDiscount(Double discount) {
		this.discount = discount;
	}	
	/**
	 * 属性保费调整比率/保费调整比率的getter方法
	 */
	public Double getAdjustRate() {
		return adjustRate;
	}
	/**
	 * 属性保费调整比率/保费调整比率的setter方法
	 */
	public void setAdjustRate(Double adjustRate) {
		this.adjustRate = adjustRate;
	}	
	/**
	 * 属性保费/保费的getter方法
	 */
	public Double getPremium() {
		return premium;
	}
	/**
	 * 属性保费/保费的setter方法
	 */
	public void setPremium(Double premium) {
		this.premium = premium;
	}	
	/**
	 * 属性免赔率/免赔率的getter方法
	 */
	public Double getDeductibleRate() {
		return deductibleRate;
	}
	/**
	 * 属性免赔率/免赔率的setter方法
	 */
	public void setDeductibleRate(Double deductibleRate) {
		this.deductibleRate = deductibleRate;
	}	
	/**
	 * 属性免赔额/免赔额的getter方法
	 */
	public Double getDeductible() {
		return deductible;
	}
	/**
	 * 属性免赔额/免赔额的setter方法
	 */
	public void setDeductible(Double deductible) {
		this.deductible = deductible;
	}	
	/**
	 * 属性标志字段/标志字段的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性标志字段/标志字段的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}	
	/**
	 * 属性地区费率因子: 0-不浮动, 1-上浮30%/地区费率因子: 0-不浮动, 1-上浮30%的getter方法
	 */
	public String getRegionRate() {
		return regionRate;
	}
	/**
	 * 属性地区费率因子: 0-不浮动, 1-上浮30%/地区费率因子: 0-不浮动, 1-上浮30%的setter方法
	 */
	public void setRegionRate(String regionRate) {
		this.regionRate = regionRate;
	}	
	/**
	 * 属性饮酒费率因子：饮酒驾驶违法次数/饮酒费率因子：饮酒驾驶违法次数的getter方法
	 */
	public Integer getDrinkRate() {
		return drinkRate;
	}
	/**
	 * 属性饮酒费率因子：饮酒驾驶违法次数/饮酒费率因子：饮酒驾驶违法次数的setter方法
	 */
	public void setDrinkRate(Integer drinkRate) {
		this.drinkRate = drinkRate;
	}	
	/**
	 * 属性醉酒费率因子：醉酒驾驶违法次数/醉酒费率因子：醉酒驾驶违法次数的getter方法
	 */
	public Integer getDrunkRate() {
		return drunkRate;
	}
	/**
	 * 属性醉酒费率因子：醉酒驾驶违法次数/醉酒费率因子：醉酒驾驶违法次数的setter方法
	 */
	public void setDrunkRate(Integer drunkRate) {
		this.drunkRate = drunkRate;
	}	
	/**
	 * 属性肉牛类型/肉牛类型的getter方法
	 */
	public String getCattleType() {
		return cattleType;
	}
	/**
	 * 属性肉牛类型/肉牛类型的setter方法
	 */
	public void setCattleType(String cattleType) {
		this.cattleType = cattleType;
	}	
	/**
	 * 属性每次事故每人赔偿限额/每次事故每人赔偿限额的getter方法
	 */
	public Double getUnitPersonLimitAmount() {
		return unitPersonLimitAmount;
	}
	/**
	 * 属性每次事故每人赔偿限额/每次事故每人赔偿限额的setter方法
	 */
	public void setUnitPersonLimitAmount(Double unitPersonLimitAmount) {
		this.unitPersonLimitAmount = unitPersonLimitAmount;
	}	
	/**
	 * 属性每人赔偿限额0123用到/每人赔偿限额0123用到的getter方法
	 */
	public Double getUnitPersonAmount() {
		return unitPersonAmount;
	}
	/**
	 * 属性每人赔偿限额0123用到/每人赔偿限额0123用到的setter方法
	 */
	public void setUnitPersonAmount(Double unitPersonAmount) {
		this.unitPersonAmount = unitPersonAmount;
	}	
	/**
	 * 属性日额：每人日额（元）/日额：每人日额（元）的getter方法
	 */
	public Double getUnitDayAmountSub() {
		return unitDayAmountSub;
	}
	/**
	 * 属性日额：每人日额（元）/日额：每人日额（元）的setter方法
	 */
	public void setUnitDayAmountSub(Double unitDayAmountSub) {
		this.unitDayAmountSub = unitDayAmountSub;
	}	
	/**
	 * 属性天数/天数的getter方法
	 */
	public Integer getDaySub() {
		return daySub;
	}
	/**
	 * 属性天数/天数的setter方法
	 */
	public void setDaySub(Integer daySub) {
		this.daySub = daySub;
	}	
	/**
	 * 属性人员类别/人员类别的getter方法
	 */
	public String getPersonType() {
		return personType;
	}
	/**
	 * 属性人员类别/人员类别的setter方法
	 */
	public void setPersonType(String personType) {
		this.personType = personType;
	}	
	/**
	 * 属性起赔点/起赔点的getter方法
	 */
	public Double getTriggerPoint() {
		return triggerPoint;
	}
	/**
	 * 属性起赔点/起赔点的setter方法
	 */
	public void setTriggerPoint(Double triggerPoint) {
		this.triggerPoint = triggerPoint;
	}	
	/**
	 * 属性全损损失率/全损损失率的getter方法
	 */
	public Double getTotalLossRatio() {
		return totalLossRatio;
	}
	/**
	 * 属性全损损失率/全损损失率的setter方法
	 */
	public void setTotalLossRatio(Double totalLossRatio) {
		this.totalLossRatio = totalLossRatio;
	}	
	/**
	 * 属性诉讼费限额/诉讼费限额的getter方法
	 */
	public Double getLawsuitAmount() {
		return lawsuitAmount;
	}
	/**
	 * 属性诉讼费限额/诉讼费限额的setter方法
	 */
	public void setLawsuitAmount(Double lawsuitAmount) {
		this.lawsuitAmount = lawsuitAmount;
	}	
	/**
	 * 属性病床数/病床数的getter方法
	 */
	public Integer getBedNum() {
		return bedNum;
	}
	/**
	 * 属性病床数/病床数的setter方法
	 */
	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}	
	/**
	 * 属性每张床位保险费/每张床位保险费的getter方法
	 */
	public Double getBedPremium() {
		return bedPremium;
	}
	/**
	 * 属性每张床位保险费/每张床位保险费的setter方法
	 */
	public void setBedPremium(Double bedPremium) {
		this.bedPremium = bedPremium;
	}	
	/**
	 * 属性医疗机构保费/医疗机构保费的getter方法
	 */
	public Double getHospitalPremium() {
		return hospitalPremium;
	}
	/**
	 * 属性医疗机构保费/医疗机构保费的setter方法
	 */
	public void setHospitalPremium(Double hospitalPremium) {
		this.hospitalPremium = hospitalPremium;
	}	
	/**
	 * 属性各类医务人员人数/各类医务人员人数的getter方法
	 */
	public Integer getKindWorkerNum() {
		return kindWorkerNum;
	}
	/**
	 * 属性各类医务人员人数/各类医务人员人数的setter方法
	 */
	public void setKindWorkerNum(Integer kindWorkerNum) {
		this.kindWorkerNum = kindWorkerNum;
	}	
	/**
	 * 属性各类医务人员每人保费/各类医务人员每人保费的getter方法
	 */
	public Double getKindWorkerPremium() {
		return kindWorkerPremium;
	}
	/**
	 * 属性各类医务人员每人保费/各类医务人员每人保费的setter方法
	 */
	public void setKindWorkerPremium(Double kindWorkerPremium) {
		this.kindWorkerPremium = kindWorkerPremium;
	}	
	/**
	 * 属性临床手术科室医师人数/临床手术科室医师人数的getter方法
	 */
	public Integer getClinicNum() {
		return clinicNum;
	}
	/**
	 * 属性临床手术科室医师人数/临床手术科室医师人数的setter方法
	 */
	public void setClinicNum(Integer clinicNum) {
		this.clinicNum = clinicNum;
	}	
	/**
	 * 属性临床手术科室医师每人保费/临床手术科室医师每人保费的getter方法
	 */
	public Double getClinicPremium() {
		return clinicPremium;
	}
	/**
	 * 属性临床手术科室医师每人保费/临床手术科室医师每人保费的setter方法
	 */
	public void setClinicPremium(Double clinicPremium) {
		this.clinicPremium = clinicPremium;
	}	

	/**
	 * 属性医技科室人数/医技科室人数的getter方法
	 */
	public Integer getRoomNum() {
		return roomNum;
	}
	/**
	 * 属性医技科室人数/医技科室人数的setter方法
	 */
	public void setRoomNum(Integer roomNum) {
		this.roomNum = roomNum;
	}	
	/**
	 * 属性医技科室每人保费/医技科室每人保费的getter方法
	 */
	public Double getRoomPremium() {
		return roomPremium;
	}
	/**
	 * 属性医技科室每人保费/医技科室每人保费的setter方法
	 */
	public void setRoomPremium(Double roomPremium) {
		this.roomPremium = roomPremium;
	}	
	/**
	 * 属性护士人数/护士人数的getter方法
	 */
	public Integer getNurseNum() {
		return nurseNum;
	}
	/**
	 * 属性护士人数/护士人数的setter方法
	 */
	public void setNurseNum(Integer nurseNum) {
		this.nurseNum = nurseNum;
	}	
	/**
	 * 属性护士每人保费/护士每人保费的getter方法
	 */
	public Double getNursePremium() {
		return nursePremium;
	}
	/**
	 * 属性护士每人保费/护士每人保费的setter方法
	 */
	public void setNursePremium(Double nursePremium) {
		this.nursePremium = nursePremium;
	}	
	/**
	 * 属性医务人员保费/医务人员保费的getter方法
	 */
	public Double getWorkerPremium() {
		return workerPremium;
	}
	/**
	 * 属性医务人员保费/医务人员保费的setter方法
	 */
	public void setWorkerPremium(Double workerPremium) {
		this.workerPremium = workerPremium;
	}	
	/**
	 * 属性医务人员人数/医务人员人数的getter方法
	 */
	public Integer getWorkerNum() {
		return workerNum;
	}
	/**
	 * 属性医务人员人数/医务人员人数的setter方法
	 */
	public void setWorkerNum(Integer workerNum) {
		this.workerNum = workerNum;
	}	
	/**
	 * 属性大病医疗保险新生儿数量/大病医疗保险新生儿数量的getter方法
	 */
	public Double getQuantityNewborn() {
		return quantityNewborn;
	}
	/**
	 * 属性大病医疗保险新生儿数量/大病医疗保险新生儿数量的setter方法
	 */
	public void setQuantityNewborn(Double quantityNewborn) {
		this.quantityNewborn = quantityNewborn;
	}	
	/**
	 * 属性大病医疗保险新生儿是否收费标志/大病医疗保险新生儿是否收费标志的getter方法
	 */
	public String getChargeNewbornFlag() {
		return chargeNewbornFlag;
	}
	/**
	 * 属性大病医疗保险新生儿是否收费标志/大病医疗保险新生儿是否收费标志的setter方法
	 */
	public void setChargeNewbornFlag(String chargeNewbornFlag) {
		this.chargeNewbornFlag = chargeNewbornFlag;
	}	
	/**
	 * 属性单位保费/单位保费的getter方法
	 */
	public Double getUnitPremium() {
		return unitPremium;
	}
	/**
	 * 属性单位保费/单位保费的setter方法
	 */
	public void setUnitPremium(Double unitPremium) {
		this.unitPremium = unitPremium;
	}	
	/**
	 * 属性住院病人手术人次/住院病人手术人次的getter方法
	 */
	public Integer getOperationNum() {
		return operationNum;
	}
	/**
	 * 属性住院病人手术人次/住院病人手术人次的setter方法
	 */
	public void setOperationNum(Integer operationNum) {
		this.operationNum = operationNum;
	}	
	/**
	 * 属性住院病人手术人次基准保险费/住院病人手术人次基准保险费的getter方法
	 */
	public Double getOperationPremium() {
		return operationPremium;
	}
	/**
	 * 属性住院病人手术人次基准保险费/住院病人手术人次基准保险费的setter方法
	 */
	public void setOperationPremium(Double operationPremium) {
		this.operationPremium = operationPremium;
	}	
	/**
	 * 属性医疗机构类别系数/医疗机构类别系数的getter方法
	 */
	public Double getMedicalRate() {
		return medicalRate;
	}
	/**
	 * 属性医疗机构类别系数/医疗机构类别系数的setter方法
	 */
	public void setMedicalRate(Double medicalRate) {
		this.medicalRate = medicalRate;
	}	
	/**
	 * 属性岗位系数/岗位系数的getter方法
	 */
	public Double getPostRate() {
		return postRate;
	}
	/**
	 * 属性岗位系数/岗位系数的setter方法
	 */
	public void setPostRate(Double postRate) {
		this.postRate = postRate;
	}	
	/**
	 * 属性benefitRate/benefitRate的getter方法
	 */
	public Double getBenefitRate() {
		return benefitRate;
	}
	/**
	 * 属性benefitRate/benefitRate的setter方法
	 */
	public void setBenefitRate(Double benefitRate) {
		this.benefitRate = benefitRate;
	}	
	/**
	 * 属性deductibleValue/deductibleValue的getter方法
	 */
	public Double getDeductibleValue() {
		return deductibleValue;
	}
	/**
	 * 属性deductibleValue/deductibleValue的setter方法
	 */
	public void setDeductibleValue(Double deductibleValue) {
		this.deductibleValue = deductibleValue;
	}	
	/**
	 * 属性deductibleDiscount/deductibleDiscount的getter方法
	 */
	public Double getDeductibleDiscount() {
		return deductibleDiscount;
	}
	/**
	 * 属性deductibleDiscount/deductibleDiscount的setter方法
	 */
	public void setDeductibleDiscount(Double deductibleDiscount) {
		this.deductibleDiscount = deductibleDiscount;
	}	
	/**
	 * 属性kindBenchMarkPremiumm/kindBenchMarkPremiumm的getter方法
	 */
	public Double getKindBenchmarkPremiumm() {
		return kindBenchmarkPremiumm;
	}
	/**
	 * 属性kindBenchMarkPremiumm/kindBenchMarkPremiumm的setter方法
	 */
	public void setKindBenchmarkPremiumm(Double kindBenchmarkPremiumm) {
		this.kindBenchmarkPremiumm = kindBenchmarkPremiumm;
	}	
	/**
	 * 属性guestAmount/guestAmount的getter方法
	 */
	public Double getGuestAmount() {
		return guestAmount;
	}
	/**
	 * 属性guestAmount/guestAmount的setter方法
	 */
	public void setGuestAmount(Double guestAmount) {
		this.guestAmount = guestAmount;
	}	
	/**
	 * 属性driverAmount/driverAmount的getter方法
	 */
	public Double getDriverAmount() {
		return driverAmount;
	}
	/**
	 * 属性driverAmount/driverAmount的setter方法
	 */
	public void setDriverAmount(Double driverAmount) {
		this.driverAmount = driverAmount;
	}	
	/**
	 * 属性thirdPeopleAmount/thirdPeopleAmount的getter方法
	 */
	public Double getThirdPeopleAmount() {
		return thirdPeopleAmount;
	}
	/**
	 * 属性thirdPeopleAmount/thirdPeopleAmount的setter方法
	 */
	public void setThirdPeopleAmount(Double thirdPeopleAmount) {
		this.thirdPeopleAmount = thirdPeopleAmount;
	}	
	/**
	 * 属性isspecGlass/isspecGlass的getter方法
	 */
	public String getIsSpecGlass() {
		return isSpecGlass;
	}
	/**
	 * 属性isspecGlass/isspecGlass的setter方法
	 */
	public void setIsSpecGlass(String isSpecGlass) {
		this.isSpecGlass = isSpecGlass;
	}	
	/**
	 * 属性clauseCode/clauseCode的getter方法
	 */
	public String getClauseCode() {
		return clauseCode;
	}
	/**
	 * 属性clauseCode/clauseCode的setter方法
	 */
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}	
	/**
	 * 属性compensationdays/compensationdays的getter方法
	 */
	public String getCompensationDays() {
		return compensationDays;
	}
	/**
	 * 属性compensationdays/compensationdays的setter方法
	 */
	public void setCompensationDays(String compensationDays) {
		this.compensationDays = compensationDays;
	}	
	/**
	 * 属性currency2/currency2的getter方法
	 */
	public String getCurrency2() {
		return currency2;
	}
	/**
	 * 属性currency2/currency2的setter方法
	 */
	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}	
	/**
	 * 属性deductibledesc/deductibledesc的getter方法
	 */
	public String getDeductibleDesc() {
		return deductibleDesc;
	}
	/**
	 * 属性deductibledesc/deductibledesc的setter方法
	 */
	public void setDeductibleDesc(String deductibleDesc) {
		this.deductibleDesc = deductibleDesc;
	}	
	/**
	 * 属性discountcharge/discountcharge的getter方法
	 */
	public Double getDiscountCharge() {
		return discountCharge;
	}
	/**
	 * 属性discountcharge/discountcharge的setter方法
	 */
	public void setDiscountCharge(Double discountCharge) {
		this.discountCharge = discountCharge;
	}	
	/**
	 * 属性endorType/endorType的getter方法
	 */
	public String getEndorType() {
		return endorType;
	}
	/**
	 * 属性endorType/endorType的setter方法
	 */
	public void setEndorType(String endorType) {
		this.endorType = endorType;
	}	
	/**
	 * 属性exchangeRate2/exchangeRate2的getter方法
	 */
	public Double getExchangeRate2() {
		return exchangeRate2;
	}
	/**
	 * 属性exchangeRate2/exchangeRate2的setter方法
	 */
	public void setExchangeRate2(Double exchangeRate2) {
		this.exchangeRate2 = exchangeRate2;
	}	

	/**
	 * 属性insuredValueType/insuredValueType的getter方法
	 */
	public String getInsuredValueType() {
		return insuredValueType;
	}
	/**
	 * 属性insuredValueType/insuredValueType的setter方法
	 */
	public void setInsuredValueType(String insuredValueType) {
		this.insuredValueType = insuredValueType;
	}	
	/**
	 * 属性insuredValueTypeName/insuredValueTypeName的getter方法
	 */
	public String getInsuredValueTypeName() {
		return insuredValueTypeName;
	}
	/**
	 * 属性insuredValueTypeName/insuredValueTypeName的setter方法
	 */
	public void setInsuredValueTypeName(String insuredValueTypeName) {
		this.insuredValueTypeName = insuredValueTypeName;
	}	
	/**
	 * 属性kindPremiumm/kindPremiumm的getter方法
	 */
	public Double getKindPremiumm() {
		return kindPremiumm;
	}
	/**
	 * 属性kindPremiumm/kindPremiumm的setter方法
	 */
	public void setKindPremiumm(Double kindPremiumm) {
		this.kindPremiumm = kindPremiumm;
	}	
	/**
	 * 属性lastPurePremium/lastPurePremium的getter方法
	 */
	public Double getLastPurePremium() {
		return lastPurePremium;
	}
	/**
	 * 属性lastPurePremium/lastPurePremium的setter方法
	 */
	public void setLastPurePremium(Double lastPurePremium) {
		this.lastPurePremium = lastPurePremium;
	}	
	/**
	 * 属性lowerRate/lowerRate的getter方法
	 */
	public String getLowerRate() {
		return lowerRate;
	}
	/**
	 * 属性lowerRate/lowerRate的setter方法
	 */
	public void setLowerRate(String lowerRate) {
		this.lowerRate = lowerRate;
	}	
	/**
	 * 属性manageCharge/manageCharge的getter方法
	 */
	public Double getManageCharge() {
		return manageCharge;
	}
	/**
	 * 属性manageCharge/manageCharge的setter方法
	 */
	public void setManageCharge(Double manageCharge) {
		this.manageCharge = manageCharge;
	}	
	/**
	 * 属性motorRate/motorRate的getter方法
	 */
	public Double getMotorRate() {
		return motorRate;
	}
	/**
	 * 属性motorRate/motorRate的setter方法
	 */
	public void setMotorRate(Double motorRate) {
		this.motorRate = motorRate;
	}	
	/**
	 * 属性newEndDate/newEndDate的getter方法
	 */
	public java.util.Date getNewEndDate() {
		return newEndDate;
	}
	/**
	 * 属性newEndDate/newEndDate的setter方法
	 */
	public void setNewEndDate(java.util.Date newEndDate) {
		this.newEndDate = newEndDate;
	}	
	/**
	 * 属性newStartDate/newStartDate的getter方法
	 */
	public java.util.Date getNewStartDate() {
		return newStartDate;
	}
	/**
	 * 属性newStartDate/newStartDate的setter方法
	 */
	public void setNewStartDate(java.util.Date newStartDate) {
		this.newStartDate = newStartDate;
	}	
	/**
	 * 属性paymentRate/paymentRate的getter方法
	 */
	public Double getPaymentRate() {
		return paymentRate;
	}
	/**
	 * 属性paymentRate/paymentRate的setter方法
	 */
	public void setPaymentRate(Double paymentRate) {
		this.paymentRate = paymentRate;
	}	
	/**
	 * 属性premium2/premium2的getter方法
	 */
	public Double getPremium2() {
		return premium2;
	}
	/**
	 * 属性premium2/premium2的setter方法
	 */
	public void setPremium2(Double premium2) {
		this.premium2 = premium2;
	}	
	/**
	 * 属性premiumCny/premiumCny的getter方法
	 */
	public Double getPremiumCNY() {
		return premiumCNY;
	}
	/**
	 * 属性premiumCny/premiumCny的setter方法
	 */
	public void setPremiumCNY(Double premiumCNY) {
		this.premiumCNY = premiumCNY;
	}	
	/**
	 * 属性productCode/productCode的getter方法
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * 属性productCode/productCode的setter方法
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getnClinicNum() {
		return nClinicNum;
	}

	public void setnClinicNum(Integer nClinicNum) {
		this.nClinicNum = nClinicNum;
	}

	public Double getnClinicPremium() {
		return nClinicPremium;
	}

	public void setnClinicPremium(Double nClinicPremium) {
		this.nClinicPremium = nClinicPremium;
	}

	public Double getExchangeRateCNY() {
		return exchangeRateCNY;
	}

	public void setExchangeRateCNY(Double exchangeRateCNY) {
		this.exchangeRateCNY = exchangeRateCNY;
	}

	public Double getProfitScale() {
		return profitScale;
	}

	public void setProfitScale(Double profitScale) {
		this.profitScale = profitScale;
	}

	public String getRateValidDate() {
		return rateValidDate;
	}

	public void setRateValidDate(String rateValidDate) {
		this.rateValidDate = rateValidDate;
	}

	/**
	 * 属性purePremium/purePremium的getter方法
	 */
	public Double getPurePremium() {
		return purePremium;
	}
	/**
	 * 属性purePremium/purePremium的setter方法
	 */
	public void setPurePremium(Double purePremium) {
		this.purePremium = purePremium;
	}	
	/**
	 * 属性rate1/rate1的getter方法
	 */
	public Double getRate1() {
		return rate1;
	}
	/**
	 * 属性rate1/rate1的setter方法
	 */
	public void setRate1(Double rate1) {
		this.rate1 = rate1;
	}	
	/**
	 * 属性rateType/rateType的getter方法
	 */
	public String getRateType() {
		return rateType;
	}
	/**
	 * 属性rateType/rateType的setter方法
	 */
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}	

	/**
	 * 属性relieffund/relieffund的getter方法
	 */
	public Double getReliefFund() {
		return reliefFund;
	}
	/**
	 * 属性relieffund/relieffund的setter方法
	 */
	public void setReliefFund(Double reliefFund) {
		this.reliefFund = reliefFund;
	}	
	/**
	 * 属性relieffundRate/relieffundRate的getter方法
	 */
	public Double getReliefFundRate() {
		return reliefFundRate;
	}
	/**
	 * 属性relieffundRate/relieffundRate的setter方法
	 */
	public void setReliefFundRate(Double reliefFundRate) {
		this.reliefFundRate = reliefFundRate;
	}	
	/**
	 * 属性replyNo/replyNo的getter方法
	 */
	public String getReplyNo() {
		return replyNo;
	}
	/**
	 * 属性replyNo/replyNo的setter方法
	 */
	public void setReplyNo(String replyNo) {
		this.replyNo = replyNo;
	}	
	/**
	 * 属性specialCharge/specialCharge的getter方法
	 */
	public Double getSpecialCharge() {
		return specialCharge;
	}
	/**
	 * 属性specialCharge/specialCharge的setter方法
	 */
	public void setSpecialCharge(Double specialCharge) {
		this.specialCharge = specialCharge;
	}	
	/**
	 * 属性stabilityFund/stabilityFund的getter方法
	 */
	public Double getStabilityFund() {
		return stabilityFund;
	}
	/**
	 * 属性stabilityFund/stabilityFund的setter方法
	 */
	public void setStabilityFund(Double stabilityFund) {
		this.stabilityFund = stabilityFund;
	}	
	/**
	 * 属性stabilityFundRate/stabilityFundRate的getter方法
	 */
	public Double getStabilityFundRate() {
		return stabilityFundRate;
	}
	/**
	 * 属性stabilityFundRate/stabilityFundRate的setter方法
	 */
	public void setStabilityFundRate(Double stabilityFundRate) {
		this.stabilityFundRate = stabilityFundRate;
	}	
	/**
	 * 属性storageRate/storageRate的getter方法
	 */
	public String getStorageRate() {
		return storageRate;
	}
	/**
	 * 属性storageRate/storageRate的setter方法
	 */
	public void setStorageRate(String storageRate) {
		this.storageRate = storageRate;
	}	
	/**
	 * 属性structureNo/structureNo的getter方法
	 */
	public Integer getStructureNo() {
		return structureNo;
	}
	/**
	 * 属性structureNo/structureNo的setter方法
	 */
	public void setStructureNo(Integer structureNo) {
		this.structureNo = structureNo;
	}	
	/**
	 * 属性costPrem/costPrem的getter方法
	 */
	public Integer getCostPrem() {
		return costPrem;
	}
	/**
	 * 属性costPrem/costPrem的setter方法
	 */
	public void setCostPrem(Integer costPrem) {
		this.costPrem = costPrem;
	}	
	/**
	 * 属性costDiscount/costDiscount的getter方法
	 */
	public Integer getCostDiscount() {
		return costDiscount;
	}
	/**
	 * 属性costDiscount/costDiscount的setter方法
	 */
	public void setCostDiscount(Integer costDiscount) {
		this.costDiscount = costDiscount;
	}	
	/**
	 * 属性recommenDiscount/recommenDiscount的getter方法
	 */
	public Integer getRecommenDiscount() {
		return recommenDiscount;
	}
	/**
	 * 属性recommenDiscount/recommenDiscount的setter方法
	 */
	public void setRecommenDiscount(Integer recommenDiscount) {
		this.recommenDiscount = recommenDiscount;
	}	
	/**
	 * 属性expDiscount/expDiscount的getter方法
	 */
	public Integer getExpDiscount() {
		return expDiscount;
	}
	/**
	 * 属性expDiscount/expDiscount的setter方法
	 */
	public void setExpDiscount(Integer expDiscount) {
		this.expDiscount = expDiscount;
	}	
	/**
	 * 属性uwritingDiscount/uwritingDiscount的getter方法
	 */
	public Integer getUwritingDiscount() {
		return uwritingDiscount;
	}
	/**
	 * 属性uwritingDiscount/uwritingDiscount的setter方法
	 */
	public void setUwritingDiscount(Integer uwritingDiscount) {
		this.uwritingDiscount = uwritingDiscount;
	}	
	/**
	 * 属性修改人/修改人的getter方法
	 */
	public String getUpdate_By() {
		return update_By;
	}
	/**
	 * 属性修改人/修改人的setter方法
	 */
	public void setUpdate_By(String update_By) {
		this.update_By = update_By;
	}	
	/**
	 * 属性修改时间/修改时间的getter方法
	 */
	public java.util.Date getUpdate_Date() {
		return update_Date;
	}
	/**
	 * 属性修改时间/修改时间的setter方法
	 */
	public void setUpdate_Date(java.util.Date update_Date) {
		this.update_Date = update_Date;
	}	
	/**
	 * 属性不含税保费/不含税保费的getter方法
	 */
	public Double getNoTaxPremium() {
		return noTaxPremium;
	}
	/**
	 * 属性不含税保费/不含税保费的setter方法
	 */
	public void setNoTaxPremium(Double noTaxPremium) {
		this.noTaxPremium = noTaxPremium;
	}	
	/**
	 * 属性应/免税标识，1-应税，2-免税/应/免税标识，1-应税，2-免税的getter方法
	 */
	public String getTaxFlag() {
		return taxFlag;
	}
	/**
	 * 属性应/免税标识，1-应税，2-免税/应/免税标识，1-应税，2-免税的setter方法
	 */
	public void setTaxFlag(String taxFlag) {
		this.taxFlag = taxFlag;
	}	
	/**
	 * 属性税率/税率的getter方法
	 */
	public Double getTaxRate() {
		return taxRate;
	}
	/**
	 * 属性税率/税率的setter方法
	 */
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}	
	/**
	 * 属性税额/税额的getter方法
	 */
	public Double getTaxFee() {
		return taxFee;
	}
	/**
	 * 属性税额/税额的setter方法
	 */
	public void setTaxFee(Double taxFee) {
		this.taxFee = taxFee;
	}	
	/**
	 * 属性保费计算方式/保费计算方式的getter方法
	 */
	public String getPremiumCalMethod() {
		return premiumCalMethod;
	}
	/**
	 * 属性保费计算方式/保费计算方式的setter方法
	 */
	public void setPremiumCalMethod(String premiumCalMethod) {
		this.premiumCalMethod = premiumCalMethod;
	}	
	/**
	 * 属性林木用途/林木用途的getter方法
	 */
	public String getForestUse() {
		return forestUse;
	}
	/**
	 * 属性林木用途/林木用途的setter方法
	 */
	public void setForestUse(String forestUse) {
		this.forestUse = forestUse;
	}

	public String getEqualFlag() {
		return equalFlag;
	}

	public void setEqualFlag(String equalFlag) {
		this.equalFlag = equalFlag;
	}
}
