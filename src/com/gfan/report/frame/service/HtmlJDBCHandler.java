package com.gfan.report.frame.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public abstract class HtmlJDBCHandler<T> extends JDBCEngineDesignHandler<T>{

	protected String getHtmlString(List<List<String>> list,String  reportTitle){
		String[] titles = reportTitle.split(",");
		Gson gson = new Gson();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("titles", titles);
		map.put("list", list);
		return gson.toJson(map);
	}

}
