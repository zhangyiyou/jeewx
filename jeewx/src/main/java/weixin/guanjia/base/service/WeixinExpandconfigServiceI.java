package weixin.guanjia.base.service;

import org.jeecgframework.core.common.service.CommonService;

import weixin.guanjia.base.entity.WeixinExpandconfigEntity;

public interface WeixinExpandconfigServiceI extends CommonService{
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(WeixinExpandconfigEntity t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(WeixinExpandconfigEntity t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(WeixinExpandconfigEntity t);
}
