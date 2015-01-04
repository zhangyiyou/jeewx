package weixin.guanjia.base.service;

import java.io.Serializable;

import org.jeecgframework.core.common.service.CommonService;

import weixin.guanjia.base.entity.Subscribe;

public interface SubscribeServiceI extends CommonService{
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(Subscribe t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(Subscribe t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(Subscribe t);
 	
}
