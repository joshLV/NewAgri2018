package com.sinosoft.txnlist.core.claiminsurancelist.dao;

import com.sinosoft.txnlist.core.claiminsurancelist.entity.LossRateItemList;
import com.sinosoft.txnlist.core.claiminsurancelist.entity.LossRateItemListKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2018-01-17 06:38:35.329 
 * 定损清单标的表Dao数据操作对象
 */
@Repository
public interface LossRateItemListDao extends JpaBaseDao<LossRateItemList,LossRateItemListKey> {

    /**
     * 根据清单号和序列号查询清单信息集合
     * @param lossListCode 清单号
     * @param serialNo 序列号
     * @return List<LossRateItemListDto>
     * @author 王心洋
     * @time 2018-01-19
     */
    @Transactional
    @Query(value = "select l from LossRateItemList l where l.lossListCode=:lossListCode and l.serialNo=:serialNo")
    List<LossRateItemList> queryBylossListCodeAndSerialNo(@Param(value="lossListCode")String lossListCode,
                                                          @Param(value="serialNo")Integer serialNo);
  /**
   * 根据清单号和序列号查询清单信息集合
   * @param lossListCode 清单号
   * @param serialNo 序列号
   * @return List<LossRateItemListDto>
   * @author 王心洋
   * @time 2018-01-19
   */

  @Transactional
  @Modifying
  @Query(value = "delete from LossRateItemList l where l.lossListCode=:lossListCode")
  void deleteByLossListCode(@Param("lossListCode") String lossListCode);

    @Transactional
    @Modifying
    @Query(value = "delete from LossRateItemList l where l.lossListCode in :lossListCode and l.serialNo=:serialNo ")
    void deleteByLossListCodeList(@Param("lossListCode") List<String> lossListCode, @Param(value="serialNo") int serialNo);

}