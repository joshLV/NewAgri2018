package com.sinosoft.pms.core.kernel.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;
import javax.persistence.*;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-04 10:42:46.546 
 * PrpDriskComConfig主键操作对象
 */
public class PrpDriskComConfigKey extends BasePKImpl{
	private static final long serialVersionUID = 1L;
	public PrpDriskComConfigKey(){}
	public PrpDriskComConfigKey(java.util.Date id){
		this.id = id;
	}
	/** 属性id/id */
	@Column(name = "id")
	private java.util.Date id ;
	/**
	 * 属性id/id的getter方法
	 */
	public java.util.Date getId() {
    		return id;
	}
	/**
	 * 属性id/id的setter方法
	 */
	public void setId(java.util.Date id) {
		this.id = id;
	} 
}