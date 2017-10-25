package io.hzcf.dao;

import java.util.Map;

import io.hzcf.entity.ScheduleJobEntity;

/**
 * 定时任务
 * 
 * @author FYP
 * @email fengyupeng@huizhongcf.com
 * @date 2016年12月1日 下午10:29:57
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {
	
	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
