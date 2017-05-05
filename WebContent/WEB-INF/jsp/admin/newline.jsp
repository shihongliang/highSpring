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
				//朝xy轴放大
				 zoomType: 'xy'
			},
			title: {
				 text: null,
	                x: -20,
	                style: {
	                    color: '#3366cc',
	                    fontWeight: 'bold',
	                    fontSize: '16px',
	                    fontFamily: 'Trebuchet MS, Verdana, sans-serif'
	               }
			},
			 credits: {
			
	                enabled: false
	            },
			xAxis:{
				  categories: [],
				  title: {
	                    text: null,
	                    style: {
	                        color: '#3366cc',
	                        fontWeight: 'bold',
	                        fontSize: '12px',
	                        fontFamily: 'Trebuchet MS, Verdana, sans-serif'
	                    }
	                },
	                type:'datetime',
	                dateTimeLabelFormats: {
	                	millisecond: '%H:%M:%S.%L',
	                	second: '%H:%M:%S',
	                	minute: '%H:%M',
	                	hour: '%H:%M',
	                	day: '%e. %b',
	                	week: '%e. %b',
	                	month: '%b \'%y',
	                	year: '%Y'
	                },
	                labels:{
	                	overflow:'justify'
	                }
	                
			},
			yAxis: {
				 title: {
	                    text: null,
	                    style: {
	                        color: '#3366cc',
	                        fontWeight: 'bold',
	                        fontSize: '12px',
	                        fontFamily: 'Trebuchet MS, Verdana, sans-serif'
	                    }
	                },
				plotLines: [{
					value: 0,
					width: 1,
					color: '#808080'
				}]
			},
			series: [],
			tooltip: {
				//是否形成一条垂直的线
				  crosshairs: true,
				 //是否共享显示两个数据
				  shared:true,
	            /*     formatter: function() {
	                    return '<b>'+ this.series.name +'</b><br/>'+
	                        this.x +': '+ this.y;
	                } */
			},
		
			plotOptions: {
				spline:{
					dataLabels: {
						//是否在数据点上方显示数据
						enabled: false
					},
					animation:false,
				},
				  series: {
					  //是否显示数据的原点
		                marker: {
		                    enabled: false
		                }
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
			},30000);
		
			//停止刷新
			$("#addBtn").click(function(){
				clearInterval(timer);
			});
		});
		
	
		
		//Ajax 获取数据并解析创建Highcharts图表
		function queryData(index) {
			$.ajax({
				url:'line',
				type:'get',
				dataType:"json",
				success:function(data) {
			
					 var categories = data.categories;
					  var title = data.title;
			          var yTitle = data.yAxisTitle;
			          var xTitle = data.xAxisTitle;
	
					  options.title.text=title;
					  options.yAxis.title.text=yTitle;
					  options.xAxis.title.text=xTitle;
					  options.xAxis.categories=categories;
					  
			
					

			            $.each(data.series, function(i, seriesItem) {
			                console.log(seriesItem) ;
			         
			                var series = {
			                    data: []
			                };
			                series.name = seriesItem.name;
			                series.color = seriesItem.color;
			              	
			               $.each(seriesItem.device, function(j, seriesItemData) {
			            	  
			                    console.log("Data (" + j +"): "+seriesItemData) ;
			               	
			                    series.data.push(parseFloat(seriesItemData));
			                });
			               options.series[i]= series;
			       		
			            });
			
					chart = new Highcharts.Chart(options);
				} ,
				error: function (xhr, ajaxOptions, thrownError) {
		            alert(xhr.status);
		            alert(thrownError);
		        },
				error : function(e) {
					alert(e);
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