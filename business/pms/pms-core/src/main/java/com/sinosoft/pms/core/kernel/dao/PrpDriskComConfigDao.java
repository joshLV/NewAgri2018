package com.sinosoft.pms.core.kernel.dao;

import com.sinosoft.framework.core.dao.JpaBaseDao;
import com.sinosoft.pms.core.kernel.entity.PrpDriskComConfig;
import com.sinosoft.pms.core.kernel.entity.PrpDriskComConfigKey;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-04 10:42:46.546 
 * PrpDriskComConfigDao数据操作对象
 */
@Repository
public interface PrpDriskComConfigDao extends JpaBaseDao<PrpDriskComConfig,PrpDriskComConfigKey> {
}