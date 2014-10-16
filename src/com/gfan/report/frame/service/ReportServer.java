package com.gfan.report.frame.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import javax.annotation.Resource;

import org.directwebremoting.io.FileTransfer;
import org.springframework.stereotype.Service;

@Service("reportServer")
public class ReportServer {

	@Resource
	private ExcelJDBCHandler excelJDBCHandler;
	@Resource
	private HtmlPageJDBCHandler htmlPageJDBCHandler;
	@Resource
	private HtmlNoPageJDBCHandler htmlNoPageJDBCHandler;
	@Resource
	private ChartLineJDBCHandler chartLineJDBCHandler;
	@Resource
	private ChartPieJDBCHandler chartPieJDBCHandler;
	
	public String genReportDataToHtml(Map<String, String> params,String designName){
		return htmlNoPageJDBCHandler.runAndRender(designName, params);
	}
	public String[] genReportDataToHtmlAndCount(Map<String, String> params,String designName){
		return htmlPageJDBCHandler.runAndRender(designName, params);
	}
	
	public String genReportData(Map<String, String> params,String designName){
		return chartLineJDBCHandler.runAndRender(designName, params);
	}
	public String genReportData2(Map<String, String> params,String designName){
		return chartPieJDBCHandler.runAndRender(designName, params);
	}
	
	public FileTransfer genReportFile(Map<String, String> params,String designName) throws Exception {
		return new FileTransfer(designName.split("\\.")[0]+".xlsx", "application/msexcel", excelJDBCHandler.runAndRender(designName, params).toByteArray());
	}
	
}
