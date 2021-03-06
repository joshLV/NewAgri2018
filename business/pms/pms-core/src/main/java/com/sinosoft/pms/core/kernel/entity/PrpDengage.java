package com.sinosoft.pms.core.kernel.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;
import javax.persistence.*;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-09-15 09:19:57.041 
 * 特别约定表实体操作对象
 */
@Entity
@Table(name = "PrpDengage")
@IdClass(PrpDengageKey.class)
public class PrpDengage extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性特别约定代码/特别约定代码 */
        @Id
        @Column(name = "engageCode")
	private String engageCode ;	

	/** 属性旧特别约定代码/旧特别约定代码 */
	private String oldEngageCode ;
	/** 属性特别约定中文名称/特别约定中文名称 */
	private String engageCName ;
	/** 属性特别约定英文名称/特别约定英文名称 */
	private String engageEName ;
	/** 属性语种标示/语种标示 */
	private String language ;
	/** 属性特别约定描述/特别约定描述 */
	private String engageDesc ;
	/** 属性承保是否可改/承保是否可改 */
	private String changeAble ;
	/** 属性审核标志/审核标志 */
	private String auditFlag ;
	/** 属性适用区域层级/适用区域层级 */
	private String areaLevel ;
	/** 属性适用区域代码/适用区域代码 */
	private String areaCode ;
	/** 属性适用区域名称/适用区域名称 */
	private String areaName ;
	/** 属性生效日期/生效日期 */
	private java.util.Date validDate ;
	/** 属性失效日期/失效日期 */
	private java.util.Date invalidDate ;
	/** 属性有效标志/有效标志 */
	private String validInd ;
	/** 属性预留字段1/预留字段1 */
	private String tcol1 ;
	/** 属性预留字段2/预留字段2 */
	private String tcol2 ;
	/** 属性预留字段3/预留字段3 */
	private String tcol3 ;
	/** 属性备注/备注 */
	private String remark ;
	/** 属性标志字段/标志字段 */
	private String flag ;




	/** 属性机构/机构 */
	private String comcode ;
	/** 属性险种/险种 */
	private String riskCode ;
	/** 属性条款代码/条款代码 */
	private String clauseCode ;
	/** 属性条款名称/条款名称 */
	private String clauseName ;
	/** 属性默认值/默认值 */
	private String defaultFlag ;
	/** 属性状态/状态 */
	private String validStatus ;
	/** 属性特别约定内容/特别约定内容 */
	private String contents ;
	/**
	 * 属性特别约定代码/特别约定代码的getter方法
	 */
	public String getEngageCode() {
		return engageCode;
	}
	/**
	 * 属性特别约定代码/特别约定代码的setter方法
	 */
	public void setEngageCode(String engageCode) {
		this.engageCode = engageCode;
	} 	
	/**
	 * 属性旧特别约定代码/旧特别约定代码的getter方法
	 */
	public String getOldEngageCode() {
		return oldEngageCode;
	}
	/**
	 * 属性旧特别约定代码/旧特别约定代码的setter方法
	 */
	public void setOldEngageCode(String oldEngageCode) {
		this.oldEngageCode = oldEngageCode;
	} 	
	/**
	 * 属性特别约定中文名称/特别约定中文名称的getter方法
	 */
	public String getEngageCName() {
		return engageCName;
	}
	/**
	 * 属性特别约定中文名称/特别约定中文名称的setter方法
	 */
	public void setEngageCName(String engageCName) {
		this.engageCName = engageCName;
	} 	
	/**
	 * 属性特别约定英文名称/特别约定英文名称的getter方法
	 */
	public String getEngageEName() {
		return engageEName;
	}
	/**
	 * 属性特别约定英文名称/特别约定英文名称的setter方法
	 */
	public void setEngageEName(String engageEName) {
		this.engageEName = engageEName;
	} 	
	/**
	 * 属性语种标示/语种标示的getter方法
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * 属性语种标示/语种标示的setter方法
	 */
	public void setLanguage(String language) {
		this.language = language;
	} 	
	/**
	 * 属性特别约定描述/特别约定描述的getter方法
	 */
	public String getEngageDesc() {
		return engageDesc;
	}
	/**
	 * 属性特别约定描述/特别约定描述的setter方法
	 */
	public void setEngageDesc(String engageDesc) {
		this.engageDesc = engageDesc;
	} 	
	/**
	 * 属性承保是否可改/承保是否可改的getter方法
	 */
	public String getChangeAble() {
		return changeAble;
	}
	/**
	 * 属性承保是否可改/承保是否可改的setter方法
	 */
	public void setChangeAble(String changeAble) {
		this.changeAble = changeAble;
	} 	
	/**
	 * 属性审核标志/审核标志的getter方法
	 */
	public String getAuditFlag() {
		return auditFlag;
	}
	/**
	 * 属性审核标志/审核标志的setter方法
	 */
	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	} 	
	/**
	 * 属性适用区域层级/适用区域层级的getter方法
	 */
	public String getAreaLevel() {
		return areaLevel;
	}
	/**
	 * 属性适用区域层级/适用区域层级的setter方法
	 */
	public void setAreaLevel(String areaLevel) {
		this.areaLevel = areaLevel;
	} 	
	/**
	 * 属性适用区域代码/适用区域代码的getter方法
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 属性适用区域代码/适用区域代码的setter方法
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	} 	
	/**
	 * 属性适用区域名称/适用区域名称的getter方法
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * 属性适用区域名称/适用区域名称的setter方法
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	} 	
	/**
	 * 属性生效日期/生效日期的getter方法
	 */
	public java.util.Date getValidDate() {
		return validDate;
	}
	/**
	 * 属性生效日期/生效日期的setter方法
	 */
	public void setValidDate(java.util.Date validDate) {
		this.validDate = validDate;
	} 	
	/**
	 * 属性失效日期/失效日期的getter方法
	 */
	public java.util.Date getInvalidDate() {
		return invalidDate;
	}
	/**
	 * 属性失效日期/失效日期的setter方法
	 */
	public void setInvalidDate(java.util.Date invalidDate) {
		this.invalidDate = invalidDate;
	} 	
	/**
	 * 属性有效标志/有效标志的getter方法
	 */
	public String getValidInd() {
		return validInd;
	}
	/**
	 * 属性有效标志/有效标志的setter方法
	 */
	public void setValidInd(String validInd) {
		this.validInd = validInd;
	} 	
	/**
	 * 属性预留字段1/预留字段1的getter方法
	 */
	public String getTcol1() {
		return tcol1;
	}
	/**
	 * 属性预留字段1/预留字段1的setter方法
	 */
	public void setTcol1(String tcol1) {
		this.tcol1 = tcol1;
	} 	
	/**
	 * 属性预留字段2/预留字段2的getter方法
	 */
	public String getTcol2() {
		return tcol2;
	}
	/**
	 * 属性预留字段2/预留字段2的setter方法
	 */
	public void setTcol2(String tcol2) {
		this.tcol2 = tcol2;
	} 	
	/**
	 * 属性预留字段3/预留字段3的getter方法
	 */
	public String getTcol3() {
		return tcol3;
	}
	/**
	 * 属性预留字段3/预留字段3的setter方法
	 */
	public void setTcol3(String tcol3) {
		this.tcol3 = tcol3;
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
	 * 属性机构/机构的getter方法
	 */
	public String getComcode() {
		return comcode;
	}
	/**
	 * 属性机构/机构的setter方法
	 */
	public void setComcode(String comcode) {
		this.comcode = comcode;
	} 	
	/**
	 * 属性险种/险种的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性险种/险种的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	} 	
	/**
	 * 属性条款代码/条款代码的getter方法
	 */
	public String getClauseCode() {
		return clauseCode;
	}
	/**
	 * 属性条款代码/条款代码的setter方法
	 */
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	} 	
	/**
	 * 属性条款名称/条款名称的getter方法
	 */
	public String getClauseName() {
		return clauseName;
	}
	/**
	 * 属性条款名称/条款名称的setter方法
	 */
	public void setClauseName(String clauseName) {
		this.clauseName = clauseName;
	} 	
	/**
	 * 属性默认值/默认值的getter方法
	 */
	public String getDefaultFlag() {
		return defaultFlag;
	}
	/**
	 * 属性默认值/默认值的setter方法
	 */
	public void setDefaultFlag(String defaultFlag) {
		this.defaultFlag = defaultFlag;
	} 	
	/**
	 * 属性状态/状态的getter方法
	 */
	public String getValidStatus() {
		return validStatus;
	}
	/**
	 * 属性状态/状态的setter方法
	 */
	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	} 	
	/**
	 * 属性特别约定内容/特别约定内容的getter方法
	 */
	public String getContents() {
		return contents;
	}
	/**
	 * 属性特别约定内容/特别约定内容的setter方法
	 */
	public void setContents(String contents) {
		this.contents = contents;
	} 	
}