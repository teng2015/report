<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.gfan.report.frame.util.DateUtil"%>
<%@include file="/commons/taglibs.jsp"%>

<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption">
			<i class="icon-reorder"></i>业务概况
		</div>
		<div class="tools">
			<a href="javascript:;" class="collapse"></a>
		</div>
	</div>
	<div class="portlet-body flip-scroll">
		<jsp:include page="/frame/base/girdbirt02.jsp?chartname=total"/>
	</div>
</div>

<div class="portlet box blue">
	<div class="portlet-title">
		<div class="caption">
			<i class="icon-reorder"></i>昨日数据
		</div>
		<div class="tools">
			<a href="javascript:;" class="collapse"></a>
		</div>
	</div>
	
	<div class="portlet-body flip-scroll">
		<jsp:include page="/frame/base/girdbirt02.jsp?chartname=yesterday"/>
	</div>
</div>

<div class="portlet box blue tabbable">
	<div class="portlet-title">
		<div class="caption">
			<i class="icon-reorder"></i>昨日下降Top20
		</div>
	</div>
	<div class="portlet-body">
		<div class="tabbable portlet-tabs">
			<ul class="nav nav-tabs">
				<li><a href="#portlet_tab2" data-toggle="tab">媒介</a></li>
				<li class="active"><a href="#portlet_tab1" data-toggle="tab">渠道</a></li>
			</ul>
			<div class="tab-content">
				<div class="tab-pane active" id="portlet_tab1">
					<jsp:include page="/frame/base/girdbirt02.jsp?chartname=yesterdaydown"/>
				</div>
				<div class="tab-pane" id="portlet_tab2">
					<jsp:include page="/frame/base/girdbirt02.jsp?chartname=yesterdaydown2"/>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
	var yesterday = '<%=DateUtil.getStringDate(-1)%>';
	var byesterday = '<%=DateUtil.getStringDate(-2)%>';
	var rtpparams = {};
	rtpparams.start_time=yesterday;
	rtpparams.end_time=byesterday;
	
	//跳转到分订单数据
	function skipOrder(date){
		var form = $('#3_lk_fm');
		var urlstr = "dataTime="+date;
		form.find("input[name='urlParam']").val(urlstr);
		form.submit();
	}
	//跳转到分渠道数据
	function skipChannel(date){
		var form = $('#4_lk_fm');
		var urlstr = "dataTime="+date;
		form.find("input[name='urlParam']").val(urlstr);
		form.submit();
	}
	//跳转到业务明细
	function skipChannelDetail(channelId,channelName){
		var loadURL = '/frame/business2/channel_detail_analysis.jsp?';
		var urlParam = "channelId="+channelId+"&channelName="+channelName;
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
	//查询业务概况
	function queryTotal(){
		RptManager.genReportDataToHtml(rtpparams,'business1.rptdisger', function(content){
			var param = new girdbirt02param(content);
			param.tdw = ["90px","90px","100px","90px","100px","100px","110px","140px","110px"];
			showgirdbirt02(param,'total');
		});
	}
	//查询昨日数据
	function queryYesterday(){
		RptManager.genReportDataToHtml(rtpparams,'business2.rptdisger', function(content){
			var param = new girdbirt02param(content);
			param.showLink={1:{name:'skipOrder',arg:0},2:{name:'skipChannel',arg:0}};
			param.tdw = ["90px","90px","90px","110px","90px","110px","110px","120px","110px","110px"];
			showgirdbirt02(param,'yesterday');
		});
	}
	//查询渠道下降
	function queryChannel(){
		RptManager.genReportDataToHtml(rtpparams,'business3.rptdisger', function(content){
			var param = new girdbirt02param(content);
			param.showSort = '序号';
			param.showLink={0:{name:'skipChannelDetail',arg:[0,1]}};
			showgirdbirt02(param,'yesterdaydown');
		});
	}
	//查询媒介下降
	function queryMedium(){
		RptManager.genReportDataToHtml(rtpparams,'business4.rptdisger', function(content){
			var param = new girdbirt02param(content);
			param.showSort = '序号';
			showgirdbirt02(param,'yesterdaydown2');
		});
	}
	//默认执行查询
	$(document).ready(function() {
	     queryYesterday();
	     queryTotal();
	     queryChannel();
	     queryMedium();
	});
</script>
