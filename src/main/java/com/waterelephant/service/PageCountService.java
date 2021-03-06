/******************************************************************************
 * Copyright (C) 2016 Wuhan Water Elephant Co.Ltd All Rights Reserved. 
 * 本软件为武汉水象科技有限公司开发研制。 未经本公司正式书面同意，其他任何个人、
 * 团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.waterelephant.service;

import com.waterelephant.entity.PageCount;

/**
 * 页面访问统计
 * 
 * 
 * Module:
 * 
 * PageCountService.java
 * 
 * @author 程盼
 * @since JDK 1.8
 * @version 1.0
 * @description: <描述>
 */
public interface PageCountService extends BaseCommonService<PageCount, Long> {

	/**
	 * 获取最后一次访问记录
	 * 
	 * @param sessionId
	 * @param ip
	 * @return
	 */
	PageCount getLatestPageCount(String sessionId, String ip);

	/**
	 * 统计PV
	 * 
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public int getPV(String startTime, String endTime);

	/**
	 * 统计UV
	 * 
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public int getUV(String startTime, String endTime);

}
