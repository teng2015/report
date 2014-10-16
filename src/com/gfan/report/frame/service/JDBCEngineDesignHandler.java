package com.gfan.report.frame.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.gfan.report.frame.dao.RepQueryDAO;
import com.gfan.report.frame.module.RepQuery;
import com.gfan.report.frame.module.RepQueryExample;

public abstract class JDBCEngineDesignHandler<T> implements EngineDesignHandler<T>{

	@Resource
	private RepQueryDAO repQueryDAO;
	
	protected RepQuery getRepQuery(String reportName) {
		RepQueryExample example = new RepQueryExample();
		example.createCriteria().andReportNameEqualTo(reportName.split("\\.")[0]);
		List<RepQuery> list= repQueryDAO.selectByExample(example);
		if(list.size()!=0){
			return list.get(0);
		}
		return null;
	}
	
	protected String getReportSql(String reportSql,String replaceField,Map<String, String> params) {
		if(replaceField==null||replaceField.length()==0){
			return reportSql;
		}
		String[] replaceFields = replaceField.split(",");
		for(String field : replaceFields){
			String temp = params.get(field);
			if(temp==null){
				reportSql = reportSql.replaceAll("#"+field,"");
			}else{
				reportSql = reportSql.replaceAll("#"+field, params.get(field));
			}
		}
		return reportSql;
	}
	
	protected String[][] getResultMap(RepQuery repQuery){
		String s = repQuery.getReportResult();
		String[] s1 = s.split(",");
		String[][] ss = new String[s1.length][];
		for(int i=0;i<s1.length;i++){
			ss[i] = s1[i].split("=");
		}
		return ss;
	}
	
	protected Map<String,Object> getParamMap(String queryField,Map<String, String> params) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		if(queryField==null||queryField.equals("")){
			return paramMap;
		}
		String[] queryFields = queryField.split(",");
		for(String field : queryFields){
			String[] ss = field.split("=");
			if (ss[1].equals("String")) {
				paramMap.put(ss[0], params.get(ss[0]));
			} else if (ss[1].equals("Integer")) {
				paramMap.put(ss[0], Integer.parseInt(params.get(ss[0])));
			} else if (ss[1].equals("Double")) {
				paramMap.put(ss[0], Double.parseDouble(params.get(ss[0])));
			}
		}
		return paramMap;
	}
	
	
}
