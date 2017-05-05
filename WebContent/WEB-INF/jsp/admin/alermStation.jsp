<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
	</style>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=3kZz5aNEMjKeuvkVkif2gDZu"></script>
	
	<script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript">
		window.onload=initialize;
		function initialize(){
				// 百度地图API功能
			var map = new BMap.Map("allmap");
			var point = new BMap.Point(114.316001,30.58108413);
			map.centerAndZoom(point,12);
			map.enableScrollWheelZoom();   //启用滚轮放大缩小，默认禁用
			map.enableContinuousZoom();    //启用地图惯性拖拽，默认禁用
			var geolocation = new BMap.Geolocation();
			geolocation.getCurrentPosition(function(r){
			if(this.getStatus() == BMAP_STATUS_SUCCESS){
				var mk = new BMap.Marker(r.point);
				map.addOverlay(mk);
				map.panTo(r.point);
				//alert('您的位置：'+r.point.lng+','+r.point.lat);
			}
			else {
				alert('failed'+this.getStatus());
			}        
		},{enableHighAccuracy: true});
			}
		
	</script>
	<title>浏览器定位</title>
</head>
<body>
	<div id="allmap"> </div>
</body>
</html>
