package com.sinosoft.agriprpall.core.proposalmanage.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;
import javax.persistence.*;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-24 01:57:51.087 
 * 投保单隶属表实体操作对象
 */
@Entity
@Table(name = "PrpTmainSub")
@IdClass(PrpTmainSubKey.class)
public class PrpTmainSub extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性投保单号码/投保单号码 */
	@Id
	@Column(name = "proposalNo")
	private String proposalNo ;/** 属性主保单号码/主保单号码 */
	@Id
	@Column(name = "mainPolicyNo")
	private String mainPolicyNo ;	


	/** 属性标志字段/标志字段 */
	@Column(name = "flag")
	private String flag ;
	/** 属性备注/备注 */
	@Column(name = "remark")
	private String remark ;
	/** 属性交强险的起始日期/交强险的起始日期 */
	@Column(name = "startDate")
	private Date startDate ;
	/** 属性交强险的终止日期/交强险的终止日期 */
	@Column(name = "endDate")
	private Date endDate ;
	/** 属性balanceTimes/balanceTimes */
	@Column(name = "balanceTimes")
	private String balanceTimes ;
	/** 属性批次号/批次号 */
	@Column(name = "batchNo")
	private String batchNo ;
	/** 属性代理人描述/代理人描述 */
	@Column(name = "checkAgentDescription")
	private String checkAgentDescription ;
	/** 属性条款描述/条款描述 */
	@Column(name = "conditions")
	private String conditions ;
	/** 属性组别号/组别号 */
	@Column(name = "groupNo")
	private String groupNo ;
	/**
	 * 属性投保单号码/投保单号码的getter方法
	 */
	public String getProposalNo() {
		return proposalNo;
	}
	/**
	 * 属性投保单号码/投保单号码的setter方法
	 */
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	} 	
	/**
	 * 属性主保单号码/主保单号码的getter方法
	 */
	public String getMainPolicyNo() {
		return mainPolicyNo;
	}
	/**
	 * 属性主保单号码/主保单号码的setter方法
	 */
	public void setMainPolicyNo(String mainPolicyNo) {
		this.mainPolicyNo = mainPolicyNo;
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
	/**
	 * 属性交强险的起始日期/交强险的起始日期的getter方法
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 属性交强险的起始日期/交强险的起始日期的setter方法
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	} 	
	/**
	 * 属性交强险的终止日期/交强险的终止日期的getter方法
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 属性交强险的终止日期/交强险的终止日期的setter方法
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	} 	
	/**
	 * 属性balanceTimes/balanceTimes的getter方法
	 */
	public String getBalanceTimes() {
		return balanceTimes;
	}
	/**
	 * 属性balanceTimes/balanceTimes的setter方法
	 */
	public void setBalanceTimes(String balanceTimes) {
		this.balanceTimes = balanceTimes;
	} 	
	/**
	 * 属性批次号/批次号的getter方法
	 */
	public String getBatchNo() {
		return batchNo;
	}
	/**
	 * 属性批次号/批次号的setter方法
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	} 	
	/**
	 * 属性代理人描述/代理人描述的getter方法
	 */
	public String getCheckAgentDescription() {
		return checkAgentDescription;
	}
	/**
	 * 属性代理人描述/代理人描述的setter方法
	 */
	public void setCheckAgentDescription(String checkAgentDescription) {
		this.checkAgentDescription = checkAgentDescription;
	} 	
	/**
	 * 属性条款描述/条款描述的getter方法
	 */
	public String getConditions() {
		return conditions;
	}
	/**
	 * 属性条款描述/条款描述的setter方法
	 */
	public void setConditions(String conditions) {
		this.conditions = conditions;
	} 	
	/**
	 * 属性组别号/组别号的getter方法
	 */
	public String getGroupNo() {
		return groupNo;
	}
	/**
	 * 属性组别号/组别号的setter方法
	 */
	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	} 	
}