package com.sinosoft.agriclaim.core.workflowmanage.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;
import javax.persistence.*;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-08 05:47:03.090 
 * 流程主表主键操作对象
 */
public class SwfFlowMainKey extends BasePKImpl{
	private static final long serialVersionUID = 1L;
	public SwfFlowMainKey(){}
	public SwfFlowMainKey(String flowId){
		this.flowId = flowId;
	}
	/** 属性流程编号/流程编号 */
	@Column(name = "flowId")
	private String flowId ;
	/**
	 * 属性流程编号/流程编号的getter方法
	 */
	public String getFlowId() {
    		return flowId;
	}
	/**
	 * 属性流程编号/流程编号的setter方法
	 */
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	} 
}