package com.gfan.report.frame.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gfan.report.frame.dao.ReportDAO;
import com.gfan.report.frame.module.RepQuery;
import com.google.gson.Gson;

@Service("chartLineJDBCHandler")
public class ChartLineJDBCHandler extends JDBCEngineDesignHandler<String>{

	@Resource
	private ReportDAO reportDAO;
	
	@Override
	public String runAndRender(String design, Map<String, String> params) {
		RepQuery repQuery = getRepQuery(design);
		String reportSql = getReportSql(repQuery.getReportSql(),repQuery.getReplaceField(), params);
		List<List<String>> list = reportDAO.getLineChart(reportSql, getParamMap(repQuery.getQueryField(), params), getResultMap(repQuery));
		Map<String,List<String>> result = new HashMap<String,List<String>>();
		String[] titles = repQuery.getReportTitle().split(",");
		result.put("xline", list.get(0));
		for(int i=1;i<list.size();i++){
			result.put(titles[i], list.get(i));
		}
		Gson gson = new Gson();
		return gson.toJson(result);
	}

}
