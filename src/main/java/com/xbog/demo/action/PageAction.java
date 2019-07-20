package com.xbog.demo.action;

import java.util.HashMap;
import java.util.Map;

import com.xbog.demo.service.IQueryService;
import com.xbog.framework.annotation.GPAutowired;
import com.xbog.framework.annotation.GPController;
import com.xbog.framework.annotation.GPRequestMapping;
import com.xbog.framework.annotation.GPRequestParam;
import com.xbog.framework.webmvc.GPModelAndView;

/**
 * 公布接口url
 * @author Tom
 *
 */
@GPController
@GPRequestMapping("/")
public class PageAction {

	@GPAutowired
    IQueryService queryService;
	
	@GPRequestMapping("/first.html")
	public GPModelAndView query(@GPRequestParam("teacher") String teacher){
		String result = queryService.query(teacher);
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("teacher", teacher);
		model.put("data", result);
		model.put("token", "123456");
		return new GPModelAndView("first.html",model);
	}
	
}
