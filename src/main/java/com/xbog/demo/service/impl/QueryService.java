package com.xbog.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.xbog.demo.service.IQueryService;
import com.xbog.framework.spring.annotation.GPService;

/**
 * 查询业务
 * @author Tom
 *
 */
@GPService
public class QueryService implements IQueryService {

	/**
	 * 查询
	 */
	public String query(String name) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(new Date());
		String json = "{name:\"" + name + "\",time:\"" + time + "\"}";
		return json;
	}

}
