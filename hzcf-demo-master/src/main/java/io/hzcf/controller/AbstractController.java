package io.hzcf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.hzcf.entity.SysUserEntity;
import io.hzcf.utils.ShiroUtils;

/**
 * Controller公共组件
 * 
 * @author FYP
 * @email fengyupeng@huizhongcf.com
 * @date 2016年11月9日 下午9:42:26
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}
	protected Long getUserId() {
		return getUser().getUserId();
	}
}
