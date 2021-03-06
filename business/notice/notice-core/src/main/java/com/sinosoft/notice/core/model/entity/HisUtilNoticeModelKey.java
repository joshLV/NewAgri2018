package com.sinosoft.notice.core.model.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;

import javax.persistence.Column;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time 2017-11-30 07:15:42.402
 * 通知模板表主键操作对象
 */
public class HisUtilNoticeModelKey extends BasePKImpl {
    private static final long serialVersionUID = 1L;

    public HisUtilNoticeModelKey() {
    }

    public HisUtilNoticeModelKey(String noticeType, String noticeCode, String serialNo) {
        this.noticeType = noticeType;
        this.noticeCode = noticeCode;
        this.serialNo = serialNo;
    }

    /**
     * 属性通知类型：短信1,邮件2/通知类型：短信1,邮件2
     */
    @Column(name = "noticeType")
    private String noticeType;
    /**
     * 属性模板编号/模板编号
     */
    @Column(name = "noticeCode")
    private String noticeCode;
    @Column(name = "serialNo")
    private String serialNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * 属性通知类型：短信1,邮件2/通知类型：短信1,邮件2的getter方法
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * 属性通知类型：短信1,邮件2/通知类型：短信1,邮件2的setter方法
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * 属性模板编号/模板编号的getter方法
     */
    public String getNoticeCode() {
        return noticeCode;
    }

    /**
     * 属性模板编号/模板编号的setter方法
     */
    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }
}