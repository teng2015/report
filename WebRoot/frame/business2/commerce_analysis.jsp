<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.gfan.report.frame.util.DateUtil"%>
<%@include file="/commons/taglibs.jsp"%>
<%@ taglib uri="http://www.waally.com" prefix="wl" %>
<link href="${base}/frame/table/css/style.css" rel="stylesheet" type="text/css"/>
<style type="text/css" >
input[type="text"]{width:110px;height:18px;padding: 2px;margin-bottom:4px;line-height:normal;}
</style>
<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption" style="height: 20px;">
			<i class="icon-reorder"></i>分商务
		</div>
		<div class="tools">
			<button class="btn blue mini" style="margin-bottom:6px;" onclick="downExcelFile()">
				导出数据
				<i class="m-icon-swapright m-icon-white" style="margin: 0px;"></i>
			</button>
			<a href="javascript:;" class="collapse"></a>
		</div>
	</div>
	<div class="portlet-body flip-scroll">
		<div style="text-align: right;">
			商务：
			<wl:dwrite dictType="COMMERCE_NAME" id="commerceName" style="height:20px;padding:0px;margin-bottom: 4px;width:110px" nullStr="全部"/>
			<select style="height:20px;width: auto;padding:0px;margin-bottom: 4px;"
			id="time" name="time" onchange="changedate()">
				<option value="1" selected="selected">日报</option>
		        <option value="2" >周报</option>
		        <option value="3" >月报</option>
			</select>
			<input type="text" id="startTime1" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="tabledate Wdate" value="<%=DateUtil.getStringDate(-1)%>" class="Wdate" style="width:110px;height:18px;padding: 2px;margin-bottom:4px;line-height:normal;"/> 
			<input type="text" id="startTime2" onfocus="WdatePicker({isShowWeek:true,disabledDays:[0,2,3,4,5,6]})" class="Wdate tabledate" value="<%=DateUtil.getStringWeek(-1)%>" style="display: none;" class="Wdate" style="width:110px;height:18px;padding: 2px;margin-bottom:4px;line-height:normal;"/> 
			<input type="text" id="startTime3" onfocus="WdatePicker({dateFmt:'yyyy-MM'})" class="Wdate tabledate" value="<%=DateUtil.getStringMonth(-1)%>" style="display: none;" class="Wdate"/> 
			<button class="btn green mini" style="margin-bottom: 6px;margin-right:16px;" onclick="query()">
				查询 
				<i class="m-icon-swapright m-icon-white" style="margin: 0px;"></i>
			</button>
		</div>
		<div class="chart_cont" style="height:310px;position: relative;">
			<jsp:include page="/frame/base/girdbirt01.jsp"/>
		</div>
	</div>
</div>

<script>
var dateType = '1';
var startTime = '';
function refresh(){
	var type = $("#time").find("option:selected").val();
	startTime = $('#startTime'+type).val();
	if(type=='2'){
		dateType = '4';
	}else if(type=='3'){
		dateType = '2';
		startTime+="-01";
	}else{
		dateType = '1';
	}
}
function changedate(){
	var type = $("#time").find("option:selected").val();
	for(var i=1;i<=3;i++){
		$('#startTime'+i).css({ display: "none"});
	}
	$('#startTime'+type).css({ display: "inline"});
}
//查询并下载birt报表
function downExcelFile(){
	//构造ajax后台数据查询的参数
	refresh();
	var rtpparams = {};
	rtpparams.start_time=startTime;
	rtpparams.data_type = dateType;
	rtpparams.start_index = 0;
	rtpparams.end_index = 100;
	if($("#commerceName").val()!=''){
		rtpparams.commerce_id = 'AND COMMERCE_ID = '+$("#commerceName").val();
	}
	RptManager.genReportFile(rtpparams,'commerce1.rptdisger',{
        callback:function(data){
            dwr.engine.openInDownload(data);
        },
        async : false
    })
}			
function query(){
	refresh();
	querygirdPartPage(1);
}
//跳转到订单详细
function skipDetail(commerceId,commerceName){
	var loadURL = '/frame/business2/commerce_detail_analysis.jsp?';
	var urlParam = "commerceId="+commerceId+"&commerceName="+commerceName;
	jQuery.ajax({
		type : "POST",
		url : "${base}" + loadURL+"&" + urlParam,
		dataType : 'text',
		data : {
		},
		success : function(response) {
			$("#vf_content").empty();
			$("#vf_content").append(response);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
		}
	});
}
//查询birt数据并展示报表
function querygirdPartPage(currentPage){
	if(currentPage==null){
		parampage.currentPage=parampage.getNewPage();
	}else{
		parampage.currentPage = currentPage;
	}
	//构造ajax后台数据查询的参数
	var rtpparams = {};
	rtpparams.start_time=startTime;
	rtpparams.data_type = dateType;
	rtpparams.start_index = parampage.length*(parampage.currentPage-1);
	rtpparams.end_index = parampage.length;
	if($("#commerceName").val()!=''){
		rtpparams.commerce_id = 'AND COMMERCE_ID = '+$("#commerceName").val();
	}
	//通过ajax查询后台数据
	RptManager.genReportDataToHtmlAndCount(rtpparams,'commerce1.rptdisger', function(content){
		parampage.count=parseInt(content[1]);
		//构造报表模板参数，并展示模板
		var param = new girdbirt01param(content[0],parampage);
		param.showLink={0:{name:'skipDetail',arg:[0,1]}};
// 		param.tdw=['70px','70px','110px','70px','90px','90px','70px','90px','90px','90px','90px','90px'];
		showgirdbirt01(param);
	});
}
$(document).ready(function() {
	if('${param.dataTime}'!=''){
		$('#startTime1').val('${param.dataTime}');
	}
	if('${param.orderName}'!=''){
		$('#appName').val('${param.orderName}');
	}
    parampage = new page();
    parampage.buttonfun=querygirdPartPage;
    query();
});
</script>
