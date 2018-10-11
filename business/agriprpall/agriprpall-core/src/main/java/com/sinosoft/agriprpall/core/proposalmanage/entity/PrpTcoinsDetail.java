package com.sinosoft.agriprpall.core.proposalmanage.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;

import javax.persistence.*;

/**
 * @author codegen@研发中心
 * @mail codegen@sinosoft.com.cn
 * @time  2017-10-21 05:54:45.680 
 * 共保明细信息表实体操作对象
 */
@Entity
@Table(name = "PrpTcoinsDetail")
@IdClass(PrpTcoinsDetailKey.class)
public class PrpTcoinsDetail extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性proposalNo/proposalNo */
	@Id
	@Column(name = "proposalNo")
	private String proposalNo ;/** 属性serialNo/serialNo */
	@Id
	@Column(name = "serialNo")
	private Integer serialNo ;/** 属性currency/currency */
	@Id
	@Column(name = "currency")
	private String currency ;	


	/** 属性coinsCode/coinsCode */
	@Column(name = "coinsCode")
	private String coinsCode ;
	/** 属性coinsName/coinsName */
	@Column(name = "coinsName")
	private String coinsName ;

	/** 属性coinsAmount/coinsAmount */
	@Column(name = "coinsAmount")
	private Double coinsAmount ;
	/** 属性coinsPremium/coinsPremium */
	@Column(name = "coinsPremium")
	private Double coinsPremium ;
	/** 属性agentFee/agentFee */
	@Column(name = "agentFee")
	private Double agentFee ;
	/** 属性operateFee/operateFee */
	@Column(name = "operateFee")
	private Double operateFee ;
	/** 属性flag/flag */
	@Column(name = "flag")
	private String flag ;
	/** 属性middleCostFee/middleCostFee */
	@Column(name = "middleCostFee")
	private Double middleCostFee ;
	/** 属性签单币种/签单币种 */
	@Column(name = "currency2")
	private String currency2 ;
	/** 属性签单币种与本位币种的兑换率/签单币种与本位币种的兑换率 */
	@Column(name = "exchangeRateCNY")
	private Double exchangeRateCNY ;
	/** 属性签单币种下的费用/签单币种下的费用 */
	@Column(name = "planFee2")
	private Double planFee2 ;
	/** 属性手续费比例/手续费比例 */
	@Column(name = "proportionFee")
	private Double proportionFee ;
	/** 属性共保总不含税保费/共保总不含税保费 */
	@Column(name = "coinsNoTaxPremium")
	private Double coinsNoTaxPremium ;
	/** 属性共保总税额/共保总税额 */
	@Column(name = "coinsTaxFee")
	private Double coinsTaxFee ;
	/** 属性共保不含税出单费/共保不含税出单费 */
	@Column(name = "operateNoTaxPremium")
	private Double operateNoTaxPremium ;
	/** 属性共保出单费税率/共保出单费税率 */
	@Column(name = "operateTaxRate")
	private Double operateTaxRate ;
	/** 属性共保不含税出单费税额/共保不含税出单费税额 */
	@Column(name = "operateTaxFee")
	private Double operateTaxFee ;
	/** 属性共保不含税手续费/共保不含税手续费 */
	@Column(name = "agentNoTaxPremium")
	private Double agentNoTaxPremium ;
	/** 属性共保不含税手续费税额/共保不含税手续费税额 */
	@Column(name = "agentTaxFee")
	private Double agentTaxFee ;
	/**
	 * 属性proposalNo/proposalNo的getter方法
	 */
	public String getProposalNo() {
		return proposalNo;
	}
	/**
	 * 属性proposalNo/proposalNo的setter方法
	 */
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	} 	
	/**
	 * 属性serialNo/serialNo的getter方法
	 */
	public Integer getSerialNo() {
		return serialNo;
	}
	/**
	 * 属性serialNo/serialNo的setter方法
	 */
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	} 	
	/**
	 * 属性coinsCode/coinsCode的getter方法
	 */
	public String getCoinsCode() {
		return coinsCode;
	}
	/**
	 * 属性coinsCode/coinsCode的setter方法
	 */
	public void setCoinsCode(String coinsCode) {
		this.coinsCode = coinsCode;
	} 	
	/**
	 * 属性coinsName/coinsName的getter方法
	 */
	public String getCoinsName() {
		return coinsName;
	}
	/**
	 * 属性coinsName/coinsName的setter方法
	 */
	public void setCoinsName(String coinsName) {
		this.coinsName = coinsName;
	} 	
	/**
	 * 属性currency/currency的getter方法
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 属性currency/currency的setter方法
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	} 	
	/**
	 * 属性coinsAmount/coinsAmount的getter方法
	 */
	public Double getCoinsAmount() {
		return coinsAmount;
	}
	/**
	 * 属性coinsAmount/coinsAmount的setter方法
	 */
	public void setCoinsAmount(Double coinsAmount) {
		this.coinsAmount = coinsAmount;
	} 	
	/**
	 * 属性coinsPremium/coinsPremium的getter方法
	 */
	public Double getCoinsPremium() {
		return coinsPremium;
	}
	/**
	 * 属性coinsPremium/coinsPremium的setter方法
	 */
	public void setCoinsPremium(Double coinsPremium) {
		this.coinsPremium = coinsPremium;
	} 	
	/**
	 * 属性agentFee/agentFee的getter方法
	 */
	public Double getAgentFee() {
		return agentFee;
	}
	/**
	 * 属性agentFee/agentFee的setter方法
	 */
	public void setAgentFee(Double agentFee) {
		this.agentFee = agentFee;
	} 	
	/**
	 * 属性operateFee/operateFee的getter方法
	 */
	public Double getOperateFee() {
		return operateFee;
	}
	/**
	 * 属性operateFee/operateFee的setter方法
	 */
	public void setOperateFee(Double operateFee) {
		this.operateFee = operateFee;
	} 	
	/**
	 * 属性flag/flag的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性flag/flag的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	} 	
	/**
	 * 属性middleCostFee/middleCostFee的getter方法
	 */
	public Double getMiddleCostFee() {
		return middleCostFee;
	}
	/**
	 * 属性middleCostFee/middleCostFee的setter方法
	 */
	public void setMiddleCostFee(Double middleCostFee) {
		this.middleCostFee = middleCostFee;
	} 	
	/**
	 * 属性签单币种/签单币种的getter方法
	 */
	public String getCurrency2() {
		return currency2;
	}
	/**
	 * 属性签单币种/签单币种的setter方法
	 */
	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	} 	
	/**
	 * 属性签单币种与本位币种的兑换率/签单币种与本位币种的兑换率的getter方法
	 */
	public Double getExchangeRateCNY() {
		return exchangeRateCNY;
	}
	/**
	 * 属性签单币种与本位币种的兑换率/签单币种与本位币种的兑换率的setter方法
	 */
	public void setExchangeRateCNY(Double exchangeRateCNY) {
		this.exchangeRateCNY = exchangeRateCNY;
	}

	public Double getPlanFee2() {
		return planFee2;
	}

	public void setPlanFee2(Double planFee2) {
		this.planFee2 = planFee2;
	}

	/**
	 * 属性手续费比例/手续费比例的getter方法
	 */
	public Double getProportionFee() {
		return proportionFee;
	}
	/**
	 * 属性手续费比例/手续费比例的setter方法
	 */
	public void setProportionFee(Double proportionFee) {
		this.proportionFee = proportionFee;
	} 	
	/**
	 * 属性共保总不含税保费/共保总不含税保费的getter方法
	 */
	public Double getCoinsNoTaxPremium() {
		return coinsNoTaxPremium;
	}
	/**
	 * 属性共保总不含税保费/共保总不含税保费的setter方法
	 */
	public void setCoinsNoTaxPremium(Double coinsNoTaxPremium) {
		this.coinsNoTaxPremium = coinsNoTaxPremium;
	} 	
	/**
	 * 属性共保总税额/共保总税额的getter方法
	 */
	public Double getCoinsTaxFee() {
		return coinsTaxFee;
	}
	/**
	 * 属性共保总税额/共保总税额的setter方法
	 */
	public void setCoinsTaxFee(Double coinsTaxFee) {
		this.coinsTaxFee = coinsTaxFee;
	} 	
	/**
	 * 属性共保不含税出单费/共保不含税出单费的getter方法
	 */
	public Double getOperateNoTaxPremium() {
		return operateNoTaxPremium;
	}
	/**
	 * 属性共保不含税出单费/共保不含税出单费的setter方法
	 */
	public void setOperateNoTaxPremium(Double operateNoTaxPremium) {
		this.operateNoTaxPremium = operateNoTaxPremium;
	} 	
	/**
	 * 属性共保出单费税率/共保出单费税率的getter方法
	 */
	public Double getOperateTaxRate() {
		return operateTaxRate;
	}
	/**
	 * 属性共保出单费税率/共保出单费税率的setter方法
	 */
	public void setOperateTaxRate(Double operateTaxRate) {
		this.operateTaxRate = operateTaxRate;
	} 	
	/**
	 * 属性共保不含税出单费税额/共保不含税出单费税额的getter方法
	 */
	public Double getOperateTaxFee() {
		return operateTaxFee;
	}
	/**
	 * 属性共保不含税出单费税额/共保不含税出单费税额的setter方法
	 */
	public void setOperateTaxFee(Double operateTaxFee) {
		this.operateTaxFee = operateTaxFee;
	} 	
	/**
	 * 属性共保不含税手续费/共保不含税手续费的getter方法
	 */
	public Double getAgentNoTaxPremium() {
		return agentNoTaxPremium;
	}
	/**
	 * 属性共保不含税手续费/共保不含税手续费的setter方法
	 */
	public void setAgentNoTaxPremium(Double agentNoTaxPremium) {
		this.agentNoTaxPremium = agentNoTaxPremium;
	} 	
	/**
	 * 属性共保不含税手续费税额/共保不含税手续费税额的getter方法
	 */
	public Double getAgentTaxFee() {
		return agentTaxFee;
	}
	/**
	 * 属性共保不含税手续费税额/共保不含税手续费税额的setter方法
	 */
	public void setAgentTaxFee(Double agentTaxFee) {
		this.agentTaxFee = agentTaxFee;
	} 	
}