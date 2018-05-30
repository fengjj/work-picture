package com.sitech.market.dbo.destribution.impl;

import java.util.List;
import java.util.Map;
import com.sitech.market.busiobject.basicclass.dbclass.DBMysqlClass;
import com.sitech.market.dbo.destribution.inter.IMkCostbusiRel;

/**
 * 
* Create on 2015-4-2
* @author: dongyh
* @Title: MkCostbusiRel
* @Description： 成本关系
* @version 1.0 
* update_data:      update_author:      update_note:
 */
public class MkCostbusiRel extends DBMysqlClass implements IMkCostbusiRel {

	/**
	 * Create on 2015-7-16 
	 * @author: liuhaoa
	 * @Title: selectCostBusiRel 
	 * @Description: 查询成本业务关系表
	 * @param inParam
	 * @return 
	 * @version 1.0 
	 * update_data:       update_author:       update_note:
	 */
	@Override
	public List selectCostBusiRel(Map inMap) {
		List list = baseDao.queryForList("MkCostbusiRel.selectMkCostbusiRel", inMap);
		return list;
	}

	/**
	 * Create on 2015-7-16 
	 * @author: liuhaoa
	 * @Title: updateCostBusiRel 
	 * @Description: 修改成本业务关系表
	 * @param inParam
	 * @return 
	 * @version 1.0 
	 * update_data:       update_author:       update_note:
	 */
	@Override
	public void updateCostBusiRel(Map inMap) {
		baseDao.update("MkCostbusiRel.updateMkCostBusiRelById", inMap);
	}

	

}
