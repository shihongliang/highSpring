<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<link href="${pageContext.request.contextPath }/resources/css/Style.css"
	type="text/css" rel="stylesheet" />
<style type="text/css">
<!--
body {
	background-color: #FFFFFF;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

body,td,th {
	color: #000000;
}
-->
</style>
<style>
BODY {
	SCROLLBAR-FACE-COLOR: #cccccc;
	SCROLLBAR-HIGHLIGHT-COLOR: #ffffFF;
	SCROLLBAR-SHADOW-COLOR: #ffffff;
	SCROLLBAR-3DLIGHT-COLOR: #cccccc;
	SCROLLBAR-ARROW-COLOR: #ffffff;
	SCROLLBAR-TRACK-COLOR: #ffffFF;
	SCROLLBAR-DARKSHADOW-COLOR: #cccccc;
}
</style>

<!-- 浮动窗口样式css begin -->
<style type="text/css">
#msg_win {
	border: 1px solid #A67901;
	background: #EAEAEA;
	width: 240px;
	position: absolute;
	right: 0;
	font-size: 12px;
	font-family: Arial;
	margin: 0px;
	display: none;
	overflow: hidden;
	z-index: 99;
}

#msg_win .icos {
	position: absolute;
	top: 2px;
	*top: 0px;
	right: 2px;
	z-index: 9;
}

.icos a {
	float: left;
	color: #833B02;
	margin: 1px;
	text-align: center;
	font-weight: bold;
	width: 14px;
	height: 22px;
	line-height: 22px;
	padding: 1px;
	text-decoration: none;
	font-family: webdings;
}

.icos a:hover {
	color: #fff;
}

#msg_title {
	background: #BBDEF6;
	border-bottom: 1px solid #A67901;
	border-top: 1px solid #FFF;
	border-left: 1px solid #FFF;
	color: #000;
	height: 25px;
	line-height: 25px;
	text-indent: 5px;
}

#msg_content {
	margin: 5px;
	margin-right: 0;
	width: 230px;
	height: 126px;
	overflow: hidden;
}
</style>
<!-- 浮动窗口样式css end -->

<script language="javascript">
	function shiftiframe(value) {
		if (value == 1) {
			if (document.all.station.width == 500) {
				document.all.station.width = 1100;
				document.getElementById("devtd").style.display = "none";
			} else if (document.all.station.width == 1100) {
				document.all.station.width = 500;
				document.getElementById("devtd").style.display = "";
			}
		} else {
			if (document.all.dev.width == 500) {
				document.all.dev.width = 1100;
				document.getElementById("stationtd").style.display = "none";
			} else if (document.all.dev.width == 1100) {
				document.all.dev.width = 500;
				document.getElementById("stationtd").style.display = "";
			}
		}
	}
	/**添加10分钟后自动刷新页面，站点和设备运行的实时性*/
	window.onload = function() {
		setTimeout('refresh10()', 1000 * 60 * 60);//setTimeout是加载JSP页面后的一段时间之后执行这个方法 但是执行的方法是重新加载当前的页面  从而重新计时
	}
	function refresh10() {
		window.location.reload();
	}
</script>
<link href="${pageContext.request.contextPath }/resources/css/login.css"
	rel="stylesheet" type="text/css">
</head>

<body>



		<table width="100%" border="0" height="88" border="1"
			background="${pageContext.request.contextPath }/resources/images/back1.jpg">
		<%-- 	<tr>
				<td colspan=3 class="ta_01" align="center"
					background="${pageContext.request.contextPath }/resources/images/b-info.gif"><strong>系统首页</strong></td>
			</tr>--%>

			<tr> 
			

				<td width="100%" align="left" valign="top" id="devtd">
					<fieldset id="devset"
						style="width: 500px; height: 430px; padding: 1 background:${pageContext.request.contextPath }/resources/images/back1.JPG">
						<legend>
							<font color="#0000FF"> <img border="0"
								src="${pageContext.request.contextPath }/resources/images/zoom.gif"
								width="14" height="14"><a href="#"
								onclick="shiftiframe('2')">设备运行情况</a></font>
						</legend>
						<IFRAME
							src="${pageContext.request.contextPath }/device/newline"
							name="dev" id="dev" frameBorder="0" width="1400" scrolling="auto"
							height="400"></IFRAME>
					</fieldset>
				</td>
			</tr>
			<tr>
				<td height=2></td>
			</tr>

		</table>


	<!-- 浮动窗口html代码 begin  #request.taskSize==0-->
	<hr>
	


</body>

</html>

<!-- 浮动窗口js end-->

