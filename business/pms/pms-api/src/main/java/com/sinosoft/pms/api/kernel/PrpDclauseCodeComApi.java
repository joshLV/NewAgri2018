package com.sinosoft.pms.api.kernel;

import com.sinosoft.pms.api.PMSConstant;
import com.sinosoft.pms.api.kernel.dto. PrpDclauseCodeComDto;
import com.sinosoft.framework.dto.PageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-07 03:36:19.515 
 * @description 条款机构配置表Api接口
 */
@FeignClient(name = PMSConstant.PMS_SERVICE_NAME, path =  PrpDclauseCodeComApi.PATH)
public interface  PrpDclauseCodeComApi {

    public static final String PATH = " PrpDclauseCodeCom";

    /**
     *@description 新增
     *@param
     */
    @RequestMapping(value = "save",method = {RequestMethod.POST})
    void save( PrpDclauseCodeComDto  PrpDclauseCodeComDto);

    /**
     *@description 删除
     *@param
     */
    @RequestMapping(value = "remove",method = {RequestMethod.POST})
    void remove(String clauseCode,String comCode,String comName);
    /**
     *@description 修改
     *@param
     */
    @RequestMapping(value = "modify",method = {RequestMethod.POST})
    void modify( PrpDclauseCodeComDto  PrpDclauseCodeComDto);
    /**
     *@description 按主键查询实体
     *@param 
     */
    @RequestMapping(value = "queryByPK",method = {RequestMethod.POST})
     PrpDclauseCodeComDto queryByPK(String clauseCode,String comCode,String comName);
}