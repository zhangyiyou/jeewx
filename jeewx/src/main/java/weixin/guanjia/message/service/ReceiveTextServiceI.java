package weixin.guanjia.message.service;

import java.io.Serializable;

import org.jeecgframework.core.common.service.CommonService;

import weixin.guanjia.message.entity.ReceiveText;

public interface ReceiveTextServiceI extends CommonService{
 	
 	/**
	 * 默认按钮-sql增强-新增操作
	 * @param id
	 * @return
	 */
 	public boolean doAddSql(ReceiveText t);
 	/**
	 * 默认按钮-sql增强-更新操作
	 * @param id
	 * @return
	 */
 	public boolean doUpdateSql(ReceiveText t);
 	/**
	 * 默认按钮-sql增强-删除操作
	 * @param id
	 * @return
	 */
 	public boolean doDelSql(ReceiveText t);
 	
}