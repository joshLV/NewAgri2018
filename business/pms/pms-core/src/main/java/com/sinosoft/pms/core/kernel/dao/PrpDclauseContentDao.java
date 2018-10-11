package com.sinosoft.pms.core.kernel.dao;

import com.sinosoft.pms.core.kernel.entity.PrpDclauseContent;
import com.sinosoft.pms.core.kernel.entity.PrpDclauseContentKey;
import com.sinosoft.framework.core.dao.JpaBaseDao;
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
 * @time  2017-08-22 03:00:50.124 
 * 条款文档表Dao数据操作对象
 */
@Repository
public interface PrpDclauseContentDao extends JpaBaseDao<PrpDclauseContent,PrpDclauseContentKey> {
}