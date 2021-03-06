package io.hzcf.dao;

import java.util.List;

import io.hzcf.entity.SysMenuEntity;

/**
 * 菜单管理
 * 
 * @author FYP
 * @email fengyupeng@huizhongcf.com
 * @date 2016年9月18日 上午9:33:01
 */
public interface SysMenuDao extends BaseDao<SysMenuEntity> {
	
	/**
	 * 根据父菜单，查询子菜单
	 * @param parentId 父菜单ID
	 */
	List<SysMenuEntity> queryListParentId(Long parentId);
	
	/**
	 * 获取不包含按钮的菜单列表
	 */
	List<SysMenuEntity> queryNotButtonList();
}
