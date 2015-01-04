package weixin.guanjia.message.service;

import org.jeecgframework.core.common.service.CommonService;

import weixin.guanjia.message.entity.AutoResponse;

public interface AutoResponseServiceI extends CommonService{
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(AutoResponse t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(AutoResponse t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(AutoResponse t);
 	
}
