package com.sinosoft.pms.core.productrule.entity;

import com.sinosoft.framework.core.dao.BasePK;
import com.sinosoft.framework.core.dao.BasePKImpl;

import java.util.Date;
/**
 * @author codegen@研发中心
 * @mail handongwei@sinosoft.com.cn
 * @time  2016-09-18 20:27:00.111 
 * UtiFactorRelaship 主键操作类
 */
public class UtiFactorRelashipKey extends BasePKImpl {
	private static final long serialVersionUID = 1L;
	/** 属性RiskCode/ */
	private String riskCode ;
	/** 属性FactorCode/ */
	private String factorCode ;
	/** 属性ClauseCode/ */
	private String clauseCode ;
	/** 属性KindCode/ */
	private String kindCode ;
	/** 属性ComCode/ */
	private String comCode ;
	/**
	 * 属性RiskCode/的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性RiskCode/的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	} 
	/**
	 * 属性FactorCode/的getter方法
	 */
	public String getFactorCode() {
		return factorCode;
	}
	/**
	 * 属性FactorCode/的setter方法
	 */
	public void setFactorCode(String factorCode) {
		this.factorCode = factorCode;
	} 
	/**
	 * 属性ClauseCode/的getter方法
	 */
	public String getClauseCode() {
		return clauseCode;
	}
	/**
	 * 属性ClauseCode/的setter方法
	 */
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	} 
	/**
	 * 属性KindCode/的getter方法
	 */
	public String getKindCode() {
		return kindCode;
	}
	/**
	 * 属性KindCode/的setter方法
	 */
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	} 
	/**
	 * 属性ComCode/的getter方法
	 */
	public String getComCode() {
		return comCode;
	}
	/**
	 * 属性ComCode/的setter方法
	 */
	public void setComCode(String comCode) {
		this.comCode = comCode;
	} 
}