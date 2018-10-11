package com.sinosoft.agriclaim.core.claimmanage.dao;

import com.sinosoft.agriclaim.core.claimmanage.entity.PrpLDangerUnit;
import com.sinosoft.agriclaim.core.claimmanage.entity.PrpLDangerUnitKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2018-04-11 07:01:52.256 
 * 危险单位表Dao数据操作对象
 */
@Repository
public interface PrpLDangerUnitDao extends JpaBaseDao<PrpLDangerUnit,PrpLDangerUnitKey> {
    /**
     * （根据里案号删除共保信息）
     * @author: 王志文
     * @date: 2018/4/11 18:02
     * @param claimNo
     */
    @Modifying
    @Query("delete from PrpLDangerUnit p where p.certiNo=:claimNo ")
    @Transactional(rollbackFor = Exception.class)
    public void deleteByCertiNo(@Param("claimNo") String claimNo);


    @Query("select p from PrpLDangerUnit p where p.claimNo=:claimNo and p.dangerNo=:dangerNo")
    List<PrpLDangerUnit> queryAllByClaimNoAndDangerNo(@Param("claimNo") String claimNo,@Param("dangerNo")Integer dangerNo);

    @Query("select p from PrpLDangerUnit p where p.claimNo=:claimNo and p.dangerNo=:dangerNo and p.certiNo=:claimNo1")
    List<PrpLDangerUnit> queryAllByClaimNoAndDangerNo1(@Param("claimNo") String claimNo, @Param("dangerNo") Integer dangerNo, @Param("claimNo1") String claimNo1);
}