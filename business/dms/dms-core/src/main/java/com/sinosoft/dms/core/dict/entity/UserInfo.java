package com.sinosoft.dms.core.dict.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;
import javax.persistence.*;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-05 01:02:29.563 
 * userInfo实体操作对象
 */
@Entity
@Table(name = "userInfo")
@IdClass(UserInfoKey.class)
public class UserInfo extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性id/id */
	@Id
	@Column(name = "id")
	private String id ;	
	/** 属性usercode/usercode */
	@Column(name = "userCode")
	private String userCode ;
	/** 属性password/password */
	@Column(name = "password")
	private String password ;
	/** 属性username/username */
	@Column(name = "userName")
	private String userName ;

	/**
	 * 属性usercode/usercode的getter方法
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * 属性usercode/usercode的setter方法
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	} 	
	/**
	 * 属性password/password的getter方法
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 属性password/password的setter方法
	 */
	public void setPassword(String password) {
		this.password = password;
	} 	
	/**
	 * 属性username/username的getter方法
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 属性username/username的setter方法
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	} 	
	/**
	 * 属性id/id的getter方法
	 */
	public String getId() {
		return id;
	}
	/**
	 * 属性id/id的setter方法
	 */
	public void setId(String id) {
		this.id = id;
	} 	
}