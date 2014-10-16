<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.gfan.report.frame.util.DateUtil"%>
<%@include file="/commons/taglibs.jsp"%>
<link href="${base}/frame/table/css/style.css" rel="stylesheet" type="text/css"/>
<style type="text/css" >
input[type="text"]{width:110px;height:18px;padding: 2px;margin-bottom:4px;line-height:normal;}
</style>
<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption" style="height: 20px;">
			<i class="icon-reorder"></i>业务明细
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
			<select id="queryType" style="height:20px;width: auto;padding:0px;margin-bottom: 4px;">
				 <option value="PRODUCT_ID" selected="selected">游戏ID</option>
		         <option value="APP_NAME" >游戏名称</option>
		         <option value="CHANNEL_NAME" >渠道名称</option>
		         <option value="COMMERCE_NAME" >商务</option>
		         <option value="MEDIUM_NAME" >媒介</option>
			</select>
			<input type="text" id="queryValue" style="width:110px;height:18px;padding: 2px;margin-bottom:4px;line-height:normal;">
			
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
		<div class="chart_cont" style="height:340px;position: relative;">
			<jsp:include page="/frame/base/girdbirt01b.jsp"/>
		</div>
	</div>
</div>
<script>
var dateType = '1';
var startTime = '';
var endTime = '';
var queryLike = '';
function refresh(){
	var type = $("#time").find("option:selected").val();
	startTime = $('#startTime'+type).val();
	if(type=='2'){
		dateType = '4';
		endTime=getlastday(startTime,7);
	}else if(type=='3'){
		dateType = '2';
		startTime+="-01";
		endTime=getlastmonth(startTime,1);
	}else{
		dateType = '1';
		endTime=getlastday(startTime,1);
	}
	if($('#queryValue').val()!=''){
		var queryType = $("#queryType").find("option:selected").val();
		queryLike = ' AND '+queryType+' like \''+$('#queryValue').val()+'%\'';
	}else{
		queryLike = '';
	}
}
function getlastmonth(day,lastmonth){
	var ss = day.split('-');
	var d2 = new Date();
	d2.setYear(ss[0]);
	d2.setMonth(ss[1]-1-lastmonth);
	d2.setDate(1);
	var d1 = new Date();
	d1.setTime(d2.getTime());
	return d1.getFullYear()+'-'+(d1.getMonth()<9?('0'+(d1.getMonth()+1)):d1.getMonth()+1)+'-'+(d1.getDate()<10?('0'+d1.getDate()):d1.getDate());
}
function getlastday(day,lastday){
	var ss = day.split('-');
	var d2 = new Date();
	d2.setYear(ss[0]);
	d2.setMonth(ss[1]-1);
	d2.setDate(ss[2]);
	var d1 = new Date();
	d1.setTime(d2.getTime()-lastday*1000*60*60*24);
	return d1.getFullYear()+'-'+(d1.getMonth()<9?('0'+(d1.getMonth()+1)):d1.getMonth()+1)+'-'+(d1.getDate()<10?('0'+d1.getDate()):d1.getDate());
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
	rtpparams.end_time=endTime;
	rtpparams.data_type = dateType;
	rtpparams.start_index = 0;
	rtpparams.end_index = 100;
	rtpparams.query_like = queryLike;
	RptManager.genReportFile(rtpparams,'distribution1.rptdisger',{
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
	rtpparams.end_time=endTime;
	rtpparams.data_type = dateType;
	rtpparams.start_index = parampage.length*(parampage.currentPage-1);
	rtpparams.end_index = parampage.length;
	rtpparams.query_like = queryLike;
	//通过ajax查询后台数据
	RptManager.genReportDataToHtmlAndCount(rtpparams,'distribution1.rptdisger', function(content){
		parampage.count=parseInt(content[1]);
		//构造报表模板参数，并展示模板
		var param = new girdbirt01param(content[0],parampage);
		param.tdw=['50px','110px','50px','70px','140px','70px','50px','90px','70px','90px','90px','70px','80px','90px','80px','90px','90px','70px','90px','140px','140px','90px','90px'];
		showgirdbirt01(param);
	});
}
$(document).ready(function() {
	if('${param.dataTime}'!=''){
		$('#startTime1').val('${param.dataTime}');
	}
	if('${param.channelName}'!=''){
		$("#queryType").val("CHANNEL_NAME");
		$('#queryValue').val('${param.channelName}');
	}
	if('${param.mediumName}'!=''){
		$("#queryType").val("MEDIUM_NAME");
		$('#queryValue').val('${param.mediumName}');
	}
    parampage = new page();
    parampage.buttonfun=querygirdPartPage;
    query();
});
</script>
