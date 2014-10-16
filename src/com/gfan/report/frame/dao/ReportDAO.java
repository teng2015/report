package com.gfan.report.frame.dao;

import java.util.List;
import java.util.Map;

public interface ReportDAO {

	List<List<String>> getBirtPage(String sql, Map<String, ?> paramMap,final String[][] resultMap) ;
	
	Integer getBirtCount(String sql, Map<String, ?> paramMap);
	
	List<List<String>> getLineChart(String sql, Map<String, ?> paramMap,final String[][] resultMap) ;
	
	List<Map<String,Object>> getPieChart(String sql, Map<String, ?> paramMap,final String[][] resultMap);
}
