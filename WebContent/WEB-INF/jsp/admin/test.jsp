<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <link href="${pageContext.request.contextPath }/resources/css/Style.css" type="text/css" rel="stylesheet" />
    <script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.7.2.min.js"></script>
    <script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/highcharts.js"></script>
	 <script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/charts.js"></script>

  <link rel="stylesheet" href="css/highcharts/highslide.min.css" type="text/css" />
  <link rel="stylesheet" href="css/highcharts/bootstrap.min.css" type="text/css" />
  <link rel="stylesheet" href="css/highcharts/source-sans-pro.css" type="text/css" />
  <link rel="stylesheet" href="css/highcharts/font-awesome.css" type="text/css" />
  <link rel="stylesheet" href="css/highcharts/template.css" type="text/css" />


<script type="text/javascript">
	var chart;

	$(document).ready(function() {
		$.ajax({
			type : "Post",
			url : 'hiChartsServlet',
			success : function(seriesDatas) {
				
				var options = getOptions({
					chartType: "spline",
					chartTitle: "状态报告统计图111",
					yAxisTitle: "数量 (个)",
					valueSuffix: "个",
					showValue: true
				});

				var obj = getSeriesByData(seriesDatas);
				
				options.series = obj.series;
				options.xAxis.categories = obj.categories;
				
				//设置数据
				chart = new Highcharts.Chart(options);

			},
			error : function(e) {
				alert(e);
			}
		});

	});
</script>

</head>
<body>

	<div id="container"
		style="min-width: 400px; height: 300px;  margin: 0 auto"></div>

</body>
</html>