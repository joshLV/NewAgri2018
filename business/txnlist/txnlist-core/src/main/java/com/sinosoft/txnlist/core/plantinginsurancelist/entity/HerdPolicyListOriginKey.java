package com.sinosoft.txnlist.core.plantinginsurancelist.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;

import javax.persistence.Column;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time 2017-10-30 07:53:53.940
 * 养殖险保单清单最新数据表2主键操作对象
 */
public class HerdPolicyListOriginKey extends BasePKImpl {
    private static final long serialVersionUID = 1L;

    public HerdPolicyListOriginKey() {

    }


    /**
     * 属性投保清单编号/投保清单编号
     */
    @Column(name = "inusreListCode")
    private String inusreListCode;
    /**
     * 属性耳标号/耳标号
     */
    @Column(name = "earlAbel")
    private String earlAbel;
    /**
     * 属性险别序号/险别序号
     */
    @Column(name = "kindCode")
    private String kindCode;
    /**
     * 属性农户代码/农户代码
     */
    @Column(name = "fCode")
    private String fCode;

    public String getInusreListCode() {
        return inusreListCode;
    }

    public void setInusreListCode(String inusreListCode) {
        this.inusreListCode = inusreListCode;
    }

    /**
     * 属性耳标号/耳标号的getter方法
     */
    public String getEarlAbel() {
        return earlAbel;
    }

    /**
     * 属性耳标号/耳标号的setter方法
     */
    public void setEarlAbel(String earlAbel) {
        this.earlAbel = earlAbel;
    }

    /**
     * 属性险别序号/险别序号的getter方法
     */
    public String getKindCode() {
        return kindCode;
    }

    /**
     * 属性险别序号/险别序号的setter方法
     */
    public void setKindCode(String kindCode) {
        this.kindCode = kindCode;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public HerdPolicyListOriginKey(String inusreListCode, String earlAbel, String kindCode, String fCode) {
        this.inusreListCode = inusreListCode;
        this.earlAbel = earlAbel;
        this.kindCode = kindCode;
        this.fCode = fCode;
    }
}