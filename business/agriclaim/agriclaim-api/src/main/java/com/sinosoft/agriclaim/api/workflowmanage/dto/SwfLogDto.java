package com.sinosoft.agriclaim.api.workflowmanage.dto;

import com.sinosoft.framework.dto.BaseRequest;

import java.io.Serializable;
import java.util.List;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time 2017-11-08 05:47:03.090 工作流日志表Api操作对象
 */
public class SwfLogDto extends BaseRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	/** 属性流程编号/流程编号 */
	private String flowId;
	/** 属性序号/序号 */
	private java.lang.Integer logNo;
	/** 属性模板号/模板号 */
	private java.lang.Integer modelNo;
	/** 属性当前节点号/当前节点号 */
	private java.lang.Integer nodeNo;
	/** 属性当前节点名称/当前节点名称 */
	private String nodeName;
	/** 属性业务号/业务号 */
	private String businessNo;
	/** 属性处理部门/处理部门 */
	private String handleDept;
	/** 属性处理人员代码/处理人员代码 */
	private String handlerCode;
	/** 属性处理人员名称/处理人员名称 */
	private String handlerName;
	/** 属性流入时间/流入时间 */
	private String flowInTime;
	/** 属性处理时限/处理时限 */
	private java.lang.Integer timeLimit;
	/** 属性处理时间/处理时间 */
	private String handleTime;
	/** 属性提交时间/提交时间 */
	private String submitTime;
	/** 属性节点状态/节点状态 */
	private String nodeStatus;
	/** 属性流状态/流状态 */
	private String flowStatus;
	/** 属性明细信息包ID/明细信息包ID */
	private String packageId;
	/** 属性备用标志/备用标志 */
	private String flag;
	/** 属性任务编号/任务编号 */
	private java.lang.Integer taskNo;
	/** 属性任务类型/任务类型 */
	private String taskType;
	/** 属性节点类型/节点类型 */
	private String nodeType;
	/** 属性任务备注/任务备注 */
	private String titleStr;
	/** 属性业务类型/业务类型 */
	private String businessType;
	/** 属性险种代码/险种代码 */
	private String riskCode;
	/** 属性任务接收载体键值/任务接收载体键值 */
	private String keyIn;
	/** 属性记录流出时的业务编码/记录流出时的业务编码 */
	private String keyOut;
	/** 属性部门名称/部门名称 */
	private String deptName;
	/** 属性主流程编号/主流程编号 */
	private String mainFlowId;
	/** 属性子流程编号/子流程编号 */
	private String subFlowId;
	/** 属性节点X坐标/节点X坐标 */
	private java.lang.Integer posx;
	/** 属性节点Y坐标/节点Y坐标 */
	private java.lang.Integer posy;
	/** 属性结束标志/结束标志 */
	private String endFlag;
	/** 属性上个处理人员代码/上个处理人员代码 */
	private String beforeHandlerCode;
	/** 属性上个处理人员名称/上个处理人员名称 */
	private String beforeHandlerName;
	/** 属性保单号码/保单号码 */
	private String policyNo;
	/** 属性类型标志/类型标志 */
	private String typeFlag;
	/** 属性归属机构/归属机构 */
	private String comCode;
	/** 属性调度号码/调度号码 */
	private java.lang.Integer scheduleId = 0;
	/** 属性标的序号/标的序号 */
	private String lossitemCode;
	/** 属性车牌号码/车牌号码 */
	private String lossitemName;
	/** 属性是否为本保单车辆/是否为本保单车辆 */
	private String insurecarFlag;
	/** 属性可操作/处理的级别/可操作/处理的级别 */
	private String handlerRange;
	/** 属性紧急程度/紧急程度 */
	private String exigenceGree;
	/** 属性被保险人名称/被保险人名称 */
	private String insuredName;
	/** 属性报案号码/报案号码 */
	private String registNo;
	/** 属性新老系统数据标志 1：新系统数据 null：表示老系统数据/新老系统数据标志 1：新系统数据 null：表示老系统数据 */
	private String dataFlag;
	/** 属性医疗/医疗 */
	private String medicalTransitFlag;

	private String systemFlag;

	private String claimNo;
	/** 属性修改人/修改人 */
	private String updateBy;
	/** 属性修改时间/修改时间 */
	private java.util.Date updateDate;
	/** 属性空表示电脑端，2表示手机端/空表示电脑端，2表示手机端 */
	private String workPlatForm;
	private String nextBusinessNo;
	private Integer treeLayer = 0; // 节点树所在的层
	private Integer startNodeNo = 0; // 起始节点
	private Integer endNodeNo = 0; // 终止节点
	private Integer countNode = 0; // 每层的节点个数
	private Integer nodePosLayer = 0; // 同一层节点所处的位置
	private long stopTime = 0; // 计算流入和流出时间差
	private String stopTimeDesc; // 时间差描述
	private String nodeStatusName;// 节点状态中文名
	/** 调度拓展-新部门 */
	private String newHandleDept;
	/** 调度拓展-新部门名称 */
	private String newDeptName;
	/** 查勘定损提交拓展-条件业务号 */
	private String conditionBusinessNo;
	private List<SwfLogDto> swfLogList ;
	private String nextNodeListType = "";

	public List<SwfLogDto> getSwfLogList() {
		return swfLogList;
	}

	public void setSwfLogList(List<SwfLogDto> swfLogList) {
		this.swfLogList = swfLogList;
	}

	public String getNextNodeListType() {
		return nextNodeListType;
	}

	public void setNextNodeListType(String nextNodeListType) {
		this.nextNodeListType = nextNodeListType;
	}

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

	/**
	 * 属性序号/序号的getter方法
	 */
	public java.lang.Integer getLogNo() {
		return logNo;
	}

	/**
	 * 属性序号/序号的setter方法
	 */
	public void setLogNo(java.lang.Integer logNo) {
		this.logNo = logNo;
	}

	/**
	 * 属性模板号/模板号的getter方法
	 */
	public java.lang.Integer getModelNo() {
		return modelNo;
	}

	/**
	 * 属性模板号/模板号的setter方法
	 */
	public void setModelNo(java.lang.Integer modelNo) {
		this.modelNo = modelNo;
	}

	/**
	 * 属性当前节点号/当前节点号的getter方法
	 */
	public java.lang.Integer getNodeNo() {
		return nodeNo;
	}

	/**
	 * 属性当前节点号/当前节点号的setter方法
	 */
	public void setNodeNo(java.lang.Integer nodeNo) {
		this.nodeNo = nodeNo;
	}

	/**
	 * 属性当前节点名称/当前节点名称的getter方法
	 */
	public String getNodeName() {
		return nodeName;
	}

	/**
	 * 属性当前节点名称/当前节点名称的setter方法
	 */
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	/**
	 * 属性业务号/业务号的getter方法
	 */
	public String getBusinessNo() {
		return businessNo;
	}

	/**
	 * 属性业务号/业务号的setter方法
	 */
	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	/**
	 * 属性处理部门/处理部门的getter方法
	 */
	public String getHandleDept() {
		return handleDept;
	}

	/**
	 * 属性处理部门/处理部门的setter方法
	 */
	public void setHandleDept(String handleDept) {
		this.handleDept = handleDept;
	}

	/**
	 * 属性处理人员代码/处理人员代码的getter方法
	 */
	public String getHandlerCode() {
		return handlerCode;
	}

	/**
	 * 属性处理人员代码/处理人员代码的setter方法
	 */
	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	/**
	 * 属性处理人员名称/处理人员名称的getter方法
	 */
	public String getHandlerName() {
		return handlerName;
	}

	/**
	 * 属性处理人员名称/处理人员名称的setter方法
	 */
	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	/**
	 * 属性流入时间/流入时间的getter方法
	 */
	public String getFlowInTime() {
		return flowInTime;
	}

	/**
	 * 属性流入时间/流入时间的setter方法
	 */
	public void setFlowInTime(String flowInTime) {
		this.flowInTime = flowInTime;
	}

	/**
	 * 属性处理时限/处理时限的getter方法
	 */
	public java.lang.Integer getTimeLimit() {
		return timeLimit;
	}

	/**
	 * 属性处理时限/处理时限的setter方法
	 */
	public void setTimeLimit(java.lang.Integer timeLimit) {
		this.timeLimit = timeLimit;
	}

	/**
	 * 属性处理时间/处理时间的getter方法
	 */
	public String getHandleTime() {
		return handleTime;
	}

	/**
	 * 属性处理时间/处理时间的setter方法
	 */
	public void setHandleTime(String handleTime) {
		this.handleTime = handleTime;
	}

	/**
	 * 属性提交时间/提交时间的getter方法
	 */
	public String getSubmitTime() {
		return submitTime;
	}

	/**
	 * 属性提交时间/提交时间的setter方法
	 */
	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * 属性节点状态/节点状态的getter方法
	 */
	public String getNodeStatus() {
		return nodeStatus;
	}

	/**
	 * 属性节点状态/节点状态的setter方法
	 */
	public void setNodeStatus(String nodeStatus) {
		this.nodeStatus = nodeStatus;
	}

	/**
	 * 属性流状态/流状态的getter方法
	 */
	public String getFlowStatus() {
		return flowStatus;
	}

	/**
	 * 属性流状态/流状态的setter方法
	 */
	public void setFlowStatus(String flowStatus) {
		this.flowStatus = flowStatus;
	}

	/**
	 * 属性明细信息包ID/明细信息包ID的getter方法
	 */
	public String getPackageId() {
		return packageId;
	}

	/**
	 * 属性明细信息包ID/明细信息包ID的setter方法
	 */
	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	/**
	 * 属性备用标志/备用标志的getter方法
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * 属性备用标志/备用标志的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * 属性任务编号/任务编号的getter方法
	 */
	public java.lang.Integer getTaskNo() {
		return taskNo;
	}

	/**
	 * 属性任务编号/任务编号的setter方法
	 */
	public void setTaskNo(java.lang.Integer taskNo) {
		this.taskNo = taskNo;
	}

	/**
	 * 属性任务类型/任务类型的getter方法
	 */
	public String getTaskType() {
		return taskType;
	}

	/**
	 * 属性任务类型/任务类型的setter方法
	 */
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	/**
	 * 属性节点类型/节点类型的getter方法
	 */
	public String getNodeType() {
		return nodeType;
	}

	/**
	 * 属性节点类型/节点类型的setter方法
	 */
	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	/**
	 * 属性任务备注/任务备注的getter方法
	 */
	public String getTitleStr() {
		return titleStr;
	}

	/**
	 * 属性任务备注/任务备注的setter方法
	 */
	public void setTitleStr(String titleStr) {
		this.titleStr = titleStr;
	}

	/**
	 * 属性业务类型/业务类型的getter方法
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * 属性业务类型/业务类型的setter方法
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
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
	 * 属性任务接收载体键值/任务接收载体键值的getter方法
	 */
	public String getKeyIn() {
		return keyIn;
	}

	/**
	 * 属性任务接收载体键值/任务接收载体键值的setter方法
	 */
	public void setKeyIn(String keyIn) {
		this.keyIn = keyIn;
	}

	/**
	 * 属性记录流出时的业务编码/记录流出时的业务编码的getter方法
	 */
	public String getKeyOut() {
		return keyOut;
	}

	/**
	 * 属性记录流出时的业务编码/记录流出时的业务编码的setter方法
	 */
	public void setKeyOut(String keyOut) {
		this.keyOut = keyOut;
	}

	/**
	 * 属性部门名称/部门名称的getter方法
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * 属性部门名称/部门名称的setter方法
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * 属性主流程编号/主流程编号的getter方法
	 */
	public String getMainFlowId() {
		return mainFlowId;
	}

	/**
	 * 属性主流程编号/主流程编号的setter方法
	 */
	public void setMainFlowId(String mainFlowId) {
		this.mainFlowId = mainFlowId;
	}

	/**
	 * 属性子流程编号/子流程编号的getter方法
	 */
	public String getSubFlowId() {
		return subFlowId;
	}

	/**
	 * 属性子流程编号/子流程编号的setter方法
	 */
	public void setSubFlowId(String subFlowId) {
		this.subFlowId = subFlowId;
	}

	/**
	 * 属性节点X坐标/节点X坐标的getter方法
	 */
	public java.lang.Integer getPosx() {
		return posx;
	}

	/**
	 * 属性节点X坐标/节点X坐标的setter方法
	 */
	public void setPosx(java.lang.Integer posx) {
		this.posx = posx;
	}

	/**
	 * 属性节点Y坐标/节点Y坐标的getter方法
	 */
	public java.lang.Integer getPosy() {
		return posy;
	}

	/**
	 * 属性节点Y坐标/节点Y坐标的setter方法
	 */
	public void setPosy(java.lang.Integer posy) {
		this.posy = posy;
	}

	/**
	 * 属性结束标志/结束标志的getter方法
	 */
	public String getEndFlag() {
		return endFlag;
	}

	/**
	 * 属性结束标志/结束标志的setter方法
	 */
	public void setEndFlag(String endFlag) {
		this.endFlag = endFlag;
	}

	/**
	 * 属性上个处理人员代码/上个处理人员代码的getter方法
	 */
	public String getBeforeHandlerCode() {
		return beforeHandlerCode;
	}

	/**
	 * 属性上个处理人员代码/上个处理人员代码的setter方法
	 */
	public void setBeforeHandlerCode(String beforeHandlerCode) {
		this.beforeHandlerCode = beforeHandlerCode;
	}

	/**
	 * 属性上个处理人员名称/上个处理人员名称的getter方法
	 */
	public String getBeforeHandlerName() {
		return beforeHandlerName;
	}

	/**
	 * 属性上个处理人员名称/上个处理人员名称的setter方法
	 */
	public void setBeforeHandlerName(String beforeHandlerName) {
		this.beforeHandlerName = beforeHandlerName;
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
	 * 属性类型标志/类型标志的getter方法
	 */
	public String getTypeFlag() {
		return typeFlag;
	}

	/**
	 * 属性类型标志/类型标志的setter方法
	 */
	public void setTypeFlag(String typeFlag) {
		this.typeFlag = typeFlag;
	}

	/**
	 * 属性归属机构/归属机构的getter方法
	 */
	public String getComCode() {
		return comCode;
	}

	/**
	 * 属性归属机构/归属机构的setter方法
	 */
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	/**
	 * 属性调度号码/调度号码的getter方法
	 */
	public java.lang.Integer getScheduleId() {
		return scheduleId;
	}

	/**
	 * 属性调度号码/调度号码的setter方法
	 */
	public void setScheduleId(java.lang.Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	/**
	 * 属性标的序号/标的序号的getter方法
	 */
	public String getLossitemCode() {
		return lossitemCode;
	}

	/**
	 * 属性标的序号/标的序号的setter方法
	 */
	public void setLossitemCode(String lossitemCode) {
		this.lossitemCode = lossitemCode;
	}

	/**
	 * 属性车牌号码/车牌号码的getter方法
	 */
	public String getLossitemName() {
		return lossitemName;
	}

	/**
	 * 属性车牌号码/车牌号码的setter方法
	 */
	public void setLossitemName(String lossitemName) {
		this.lossitemName = lossitemName;
	}

	/**
	 * 属性是否为本保单车辆/是否为本保单车辆的getter方法
	 */
	public String getInsurecarFlag() {
		return insurecarFlag;
	}

	/**
	 * 属性是否为本保单车辆/是否为本保单车辆的setter方法
	 */
	public void setInsurecarFlag(String insurecarFlag) {
		this.insurecarFlag = insurecarFlag;
	}

	/**
	 * 属性可操作/处理的级别/可操作/处理的级别的getter方法
	 */
	public String getHandlerRange() {
		return handlerRange;
	}

	/**
	 * 属性可操作/处理的级别/可操作/处理的级别的setter方法
	 */
	public void setHandlerRange(String handlerRange) {
		this.handlerRange = handlerRange;
	}

	/**
	 * 属性紧急程度/紧急程度的getter方法
	 */
	public String getExigenceGree() {
		return exigenceGree;
	}

	/**
	 * 属性紧急程度/紧急程度的setter方法
	 */
	public void setExigenceGree(String exigenceGree) {
		this.exigenceGree = exigenceGree;
	}

	/**
	 * 属性被保险人名称/被保险人名称的getter方法
	 */
	public String getInsuredName() {
		return insuredName;
	}

	/**
	 * 属性被保险人名称/被保险人名称的setter方法
	 */
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	/**
	 * 属性报案号码/报案号码的getter方法
	 */
	public String getRegistNo() {
		return registNo;
	}

	/**
	 * 属性报案号码/报案号码的setter方法
	 */
	public void setRegistNo(String registNo) {
		this.registNo = registNo;
	}

	/**
	 * 属性新老系统数据标志 1：新系统数据 null：表示老系统数据/新老系统数据标志 1：新系统数据 null：表示老系统数据的getter方法
	 */
	public String getDataFlag() {
		return dataFlag;
	}

	/**
	 * 属性新老系统数据标志 1：新系统数据 null：表示老系统数据/新老系统数据标志 1：新系统数据 null：表示老系统数据的setter方法
	 */
	public void setDataFlag(String dataFlag) {
		this.dataFlag = dataFlag;
	}

	/**
	 * 属性医疗/医疗的getter方法
	 */
	public String getMedicalTransitFlag() {
		return medicalTransitFlag;
	}

	/**
	 * 属性医疗/医疗的setter方法
	 */
	public void setMedicalTransitFlag(String medicalTransitFlag) {
		this.medicalTransitFlag = medicalTransitFlag;
	}

	/**
	 * 属性修改人/修改人的getter方法
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * 属性修改人/修改人的setter方法
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * 属性修改时间/修改时间的getter方法
	 */
	public java.util.Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * 属性修改时间/修改时间的setter方法
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * 属性空表示电脑端，2表示手机端/空表示电脑端，2表示手机端的getter方法
	 */
	public String getWorkPlatForm() {
		return workPlatForm;
	}

	/**
	 * 属性空表示电脑端，2表示手机端/空表示电脑端，2表示手机端的setter方法
	 */
	public void setWorkPlatForm(String workPlatForm) {
		this.workPlatForm = workPlatForm;
	}

	public Integer getTreeLayer() {
		return treeLayer;
	}

	public void setTreeLayer(Integer treeLayer) {
		this.treeLayer = treeLayer;
	}

	public Integer getStartNodeNo() {
		return startNodeNo;
	}

	public void setStartNodeNo(Integer startNodeNo) {
		this.startNodeNo = startNodeNo;
	}

	public Integer getEndNodeNo() {
		return endNodeNo;
	}

	public void setEndNodeNo(Integer endNodeNo) {
		this.endNodeNo = endNodeNo;
	}

	public Integer getCountNode() {
		return countNode;
	}

	public void setCountNode(Integer countNode) {
		this.countNode = countNode;
	}

	public Integer getNodePosLayer() {
		return nodePosLayer;
	}

	public void setNodePosLayer(Integer nodePosLayer) {
		this.nodePosLayer = nodePosLayer;
	}

	public long getStopTime() {
		return stopTime;
	}

	public void setStopTime(long stopTime) {
		this.stopTime = stopTime;
	}

	public String getStopTimeDesc() {
		return stopTimeDesc;
	}

	public void setStopTimeDesc(String stopTimeDesc) {
		this.stopTimeDesc = stopTimeDesc;
	}

	public String getNodeStatusName() {
		return nodeStatusName;
	}

	public void setNodeStatusName(String nodeStatusName) {
		this.nodeStatusName = nodeStatusName;
	}

	public String getNextBusinessNo() {
		return nextBusinessNo;
	}

	public void setNextBusinessNo(String nextBusinessNo) {
		this.nextBusinessNo = nextBusinessNo;
	}

	public String getNewHandleDept() {
		return newHandleDept;
	}

	public void setNewHandleDept(String newHandleDept) {
		this.newHandleDept = newHandleDept;
	}

	public String getNewDeptName() {
		return newDeptName;
	}

	public void setNewDeptName(String newDeptName) {
		this.newDeptName = newDeptName;
	}

	public String getConditionBusinessNo() {
		return conditionBusinessNo;
	}

	public void setConditionBusinessNo(String conditionBusinessNo) {
		this.conditionBusinessNo = conditionBusinessNo;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}

	public String getSystemFlag() {
		return systemFlag;
	}

	public void setSystemFlag(String systemFlag) {
		this.systemFlag = systemFlag;
	}
}
