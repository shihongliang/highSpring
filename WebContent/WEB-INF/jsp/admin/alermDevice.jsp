<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>load</title>
    <link href="${pageContext.request.contextPath }/resources/css/Style.css" type="text/css" rel="stylesheet" />
    <script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.7.2.min.js"></script>
    <script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/highcharts.js"></script>
	<script>
		
		//图表属性，不包含数据
		var options = {
			chart: {
				renderTo:'container',
				type:'spline',
			},
			title: {
				text: '武大计算机运行数量',
				x: -20 //center
			},
			 credits: {
	                enabled: false
	            },
			xAxis:{
			},
			yAxis: {
				title: {
					text: '万台'
				},
				plotLines: [{
					value: 0,
					width: 1,
					color: '#808080'
				}]
			},
			series: [{
				name:'台数',
			}],
			tooltip: {
				valueSuffix: '万',
				
			},
		
			plotOptions: {
				spline:{
					dataLabels: {
						enabled: true
					},
					animation:false,
				}
				
			},
		};

		//初始函数，设置定时器，定时取数据
		$(function () {
			queryData(0);
		
			var i=0;
			var timer = setInterval(function(){
				i++;
				if(i>=3) {i=0;}
				queryData(i);
			},3000);
		
			//停止刷新
			$("#addBtn").click(function(){
				clearInterval(timer);
			});
		});
		
		var categories = [];
		var datas = [];
		
		//Ajax 获取数据并解析创建Highcharts图表
		function queryData(index) {
			$.ajax({
				url:'chart',
				type:'get',
				dataType:"json",
				success:function(data) {
				
						
					$.each(data,function(i,n){
						categories[i] = n["startdate"];
						datas[i] = n["data"];
					});
					
					options.xAxis.categories = categories;
					options.series[0].data = datas;
					
					chart = new Highcharts.Chart(options);
				} ,
				error: function (xhr, ajaxOptions, thrownError) {
		            alert(xhr.status);
		            alert(thrownError);
		        },
		        cache: false
			});
		}
		
	
	</script>
   </head>
  
  <body>
  
  	<div id="container"  style="min-width:300px;height:340px; "></div>
  	<p align=center><input type="button" id="addBtn" value="停止刷新"/></p>
<!--  <table width="100%" border="0" id="table8">
    
	
				<tr>
					<td align="left" valign="middle"  style="word-break: break-all">
					<span class="style1">
			
					</span></td>
				</tr>		
	
				<tr>
					<td align="left" valign="middle"  style="word-break: break-all">
					<span class="style1">
					<font color="red">2016-1-1</font>
					</span></td>
				</tr>		
	
	
				
	</table>   -->
  </body>
</html>