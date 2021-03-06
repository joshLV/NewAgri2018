package com.sinosoft.agriprpall.core.endorsemanage.queryendorse.dao;

import com.sinosoft.agriprpall.core.endorsemanage.queryendorse.entity.PrpPmainLoan;
import com.sinosoft.agriprpall.core.endorsemanage.queryendorse.entity.PrpPmainLoanKey;
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
 * @time  2017-11-27 08:22:16.508 
 * 贷款保险保单信息Dao数据操作对象
 */
@Repository
public interface PrpPmainLoanDao extends JpaBaseDao<PrpPmainLoan,PrpPmainLoanKey> {
    /**
     * 根据保单号删除PrpPmainLoan表数据
     * @author: 宋振振
     * @date: 2017/12/4 15:28
     * @param endorseNo
     * @throws Exception
     */
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM PrpPmainLoan p WHERE p.endorseNo=:endorseNo")
    public void cancelPrpPmainLoan(@Param("endorseNo") String endorseNo) throws Exception;
}