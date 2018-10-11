package com.sinosoft.dms.core.model.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;
import javax.persistence.*;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-13 11:42:08.278 
 * 模板客户纳税人信息表实体操作对象
 */
@Entity
@Table(name = "PrpModelCustomerTaxPayInfoSub")
@IdClass(PrpModelCustomerTaxPayInfoSubKey.class)
public class PrpModelCustomerTaxPayInfoSub extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性模板号码/模板号码 */
	@Id
	@Column(name = "modelCode")
	private String modelCode ;	

	/** 属性客户代码/客户代码 */
	@Column(name = "customerCode")
	private String customerCode ;
	/** 属性客户名称/客户名称 */
	@Column(name = "customerName")
	private String customerName ;
	/** 属性客户类型/客户类型 */
	@Column(name = "customerType")
	private String customerType ;
	/** 属性纳税人身份/纳税人身份 */
	@Column(name = "taxpayerType")
	private String taxpayerType ;
	/** 属性纳税人识别号/纳税人识别号 */
	@Column(name = "taxpayerNo")
	private String taxpayerNo ;
	/** 属性地址/地址 */
	@Column(name = "address")
	private String address ;
	/** 属性电话/电话 */
	@Column(name = "phone")
	private String phone ;
	/** 属性开户银行名称/开户银行名称 */
	@Column(name = "accountBank")
	private String accountBank ;
	/** 属性开户银行帐号/开户银行帐号 */
	@Column(name = "accountNo")
	private String accountNo ;
	/** 属性开票对象/开票对象 */
	@Column(name = "payInfoObject")
	private String payInfoObject ;
	/** 属性发票类型/发票类型 */
	@Column(name = "invoiceType")
	private String invoiceType ;
	/** 属性邮寄地址/邮寄地址 */
	@Column(name = "postAddress")
	private String postAddress ;
	/** 属性收件人电话/收件人电话 */
	@Column(name = "postPhone")
	private String postPhone ;
	/** 属性收件人名称/收件人名称 */
	@Column(name = "postName")
	private String postName ;
	/** 属性备注/备注 */
	@Column(name = "remark")
	private String remark ;
	/**
	 * 属性模板号码/模板号码的getter方法
	 */
	public String getModelCode() {
		return modelCode;
	}
	/**
	 * 属性模板号码/模板号码的setter方法
	 */
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	} 	
	/**
	 * 属性客户代码/客户代码的getter方法
	 */
	public String getCustomerCode() {
		return customerCode;
	}
	/**
	 * 属性客户代码/客户代码的setter方法
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	} 	
	/**
	 * 属性客户名称/客户名称的getter方法
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 属性客户名称/客户名称的setter方法
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	} 	
	/**
	 * 属性客户类型/客户类型的getter方法
	 */
	public String getCustomerType() {
		return customerType;
	}
	/**
	 * 属性客户类型/客户类型的setter方法
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	} 	
	/**
	 * 属性纳税人身份/纳税人身份的getter方法
	 */
	public String getTaxpayerType() {
		return taxpayerType;
	}
	/**
	 * 属性纳税人身份/纳税人身份的setter方法
	 */
	public void setTaxpayerType(String taxpayerType) {
		this.taxpayerType = taxpayerType;
	} 	
	/**
	 * 属性纳税人识别号/纳税人识别号的getter方法
	 */
	public String getTaxpayerNo() {
		return taxpayerNo;
	}
	/**
	 * 属性纳税人识别号/纳税人识别号的setter方法
	 */
	public void setTaxpayerNo(String taxpayerNo) {
		this.taxpayerNo = taxpayerNo;
	} 	
	/**
	 * 属性地址/地址的getter方法
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 属性地址/地址的setter方法
	 */
	public void setAddress(String address) {
		this.address = address;
	} 	
	/**
	 * 属性电话/电话的getter方法
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 属性电话/电话的setter方法
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	} 	
	/**
	 * 属性开户银行名称/开户银行名称的getter方法
	 */
	public String getAccountBank() {
		return accountBank;
	}
	/**
	 * 属性开户银行名称/开户银行名称的setter方法
	 */
	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	} 	
	/**
	 * 属性开户银行帐号/开户银行帐号的getter方法
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * 属性开户银行帐号/开户银行帐号的setter方法
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	} 	
	/**
	 * 属性开票对象/开票对象的getter方法
	 */
	public String getPayInfoObject() {
		return payInfoObject;
	}
	/**
	 * 属性开票对象/开票对象的setter方法
	 */
	public void setPayInfoObject(String payInfoObject) {
		this.payInfoObject = payInfoObject;
	} 	
	/**
	 * 属性发票类型/发票类型的getter方法
	 */
	public String getInvoiceType() {
		return invoiceType;
	}
	/**
	 * 属性发票类型/发票类型的setter方法
	 */
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	} 	
	/**
	 * 属性邮寄地址/邮寄地址的getter方法
	 */
	public String getPostAddress() {
		return postAddress;
	}
	/**
	 * 属性邮寄地址/邮寄地址的setter方法
	 */
	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	} 	
	/**
	 * 属性收件人电话/收件人电话的getter方法
	 */
	public String getPostPhone() {
		return postPhone;
	}
	/**
	 * 属性收件人电话/收件人电话的setter方法
	 */
	public void setPostPhone(String postPhone) {
		this.postPhone = postPhone;
	} 	
	/**
	 * 属性收件人名称/收件人名称的getter方法
	 */
	public String getPostName() {
		return postName;
	}
	/**
	 * 属性收件人名称/收件人名称的setter方法
	 */
	public void setPostName(String postName) {
		this.postName = postName;
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