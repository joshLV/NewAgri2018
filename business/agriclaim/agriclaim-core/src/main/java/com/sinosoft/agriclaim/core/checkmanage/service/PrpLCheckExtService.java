package com.sinosoft.agriclaim.core.checkmanage.service;


import com.sinosoft.agriclaim.api.checkmanage.dto.PrpLCheckExtDto;
import com.sinosoft.framework.dto.PageInfo;

import java.util.List;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-08 05:38:49.324 
 * @description 查勘/代查勘扩展表Core接口
 */
public interface PrpLCheckExtService {

    /**
     *@description 新增
     *@param
     */
    void save(PrpLCheckExtDto prpLCheckExtDto);

    /**
     *@description 删除
     *@param
     */
    void remove(String registNo,java.lang.Integer serialNo,String columnName,java.lang.Integer referSerialNo);
    /**
     *@description 修改
     *@param
     */
    void modify(PrpLCheckExtDto prpLCheckExtDto);
    /**
     *@description 按主键查询实体
     *@param 
     */
    PrpLCheckExtDto queryByPK(String registNo,java.lang.Integer serialNo,String columnName,java.lang.Integer referSerialNo);
    /**
     * @description:方法功能简述: 根据报案号查询报案扩展信息
     * @author chong
     * @date 2017年11月9日下午4:39:03
     * @param registNo 报案号
     * @return checkExtDtoList
     */
    List<PrpLCheckExtDto> queryByRegistNo(String registNo);
}