package com.sinosoft.pms.api.kernel.dto;

import java.io.Serializable;

import com.sinosoft.framework.dto.BaseRequest;
/**
 * @author codegen@研发中心
 * @mail sucong13146@sinosoft.com.cn
 * @time  2017-09-12 12:28:14.022 
 * 动态生成特约内容规则表Api操作对象
 */
public class PrpDautoClauseContentDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性机构代码/机构代码 */
	private String comCode ;
	/** 属性险种代码/险种代码 */
	private String riskCode ;
	/** 属性特约代码/特约代码 */
	private String clauseCode ;
	/** 属性顺序号/顺序号 */
	private String serialNo ;
	/** 属性属性模块/属性模块 */
	private String module ;
	/** 属性带入属性/带入属性 */
	private String property ;
	/** 属性属性类型/属性类型 */
	private String propertyType ;
	/** 属性带入类型/带入类型 */
	private String valueType ;
	/** 属性辅助值/辅助值 */
	private String propertySub ;
	/** 属性有效性标识/有效性标识 */
	private String validStatus ;
	/** 属性备注/备注 */
	private String remark ;
	/**
	 * 属性机构代码/机构代码的getter方法
	 */
	public String getComCode() {
		return comCode;
	}
	/**
	 * 属性机构代码/机构代码的setter方法
	 */
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	/**
	 * 属性险种代码/险种代码的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性险种代码/险种代码的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	/**
	 * 属性特约代码/特约代码的getter方法
	 */
	public String getClauseCode() {
		return clauseCode;
	}
	/**
	 * 属性特约代码/特约代码的setter方法
	 */
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}
	/**
	 * 属性顺序号/顺序号的getter方法
	 */
	public String getSerialNo() {
		return serialNo;
	}
	/**
	 * 属性顺序号/顺序号的setter方法
	 */
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	/**
	 * 属性属性模块/属性模块的getter方法
	 */
	public String getModule() {
		return module;
	}
	/**
	 * 属性属性模块/属性模块的setter方法
	 */
	public void setModule(String module) {
		this.module = module;
	}
	/**
	 * 属性带入属性/带入属性的getter方法
	 */
	public String getProperty() {
		return property;
	}
	/**
	 * 属性带入属性/带入属性的setter方法
	 */
	public void setProperty(String property) {
		this.property = property;
	}
	/**
	 * 属性属性类型/属性类型的getter方法
	 */
	public String getPropertyType() {
		return propertyType;
	}
	/**
	 * 属性属性类型/属性类型的setter方法
	 */
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	/**
	 * 属性带入类型/带入类型的getter方法
	 */
	public String getValueType() {
		return valueType;
	}
	/**
	 * 属性带入类型/带入类型的setter方法
	 */
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	/**
	 * 属性辅助值/辅助值的getter方法
	 */
	public String getPropertySub() {
		return propertySub;
	}
	/**
	 * 属性辅助值/辅助值的setter方法
	 */
	public void setPropertySub(String propertySub) {
		this.propertySub = propertySub;
	}
	/**
	 * 属性有效性标识/有效性标识的getter方法
	 */
	public String getValidStatus() {
		return validStatus;
	}
	/**
	 * 属性有效性标识/有效性标识的setter方法
	 */
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}
	/**
	 * 属性备注/备注的getter方法
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 属性备注/备注的setter方法
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
