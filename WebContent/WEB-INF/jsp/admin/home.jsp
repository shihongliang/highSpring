<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>HighCharts展示平台</TITLE>
<LINK href="<%=request.getContextPath()%>/resources/css/Font.css" type="text/css" rel="stylesheet">

<STYLE>
BODY {
	SCROLLBAR-ARROW-COLOR: #ffffff;
	SCROLLBAR-BASE-COLOR: #dee3f7
}
</STYLE>

<SCRIPT type="text/javascript">
	function submitrequest(action) {
		eval("document.location='" + action + "'");
	}
</SCRIPT>
</HEAD>

<FRAMESET border=0 frameSpacing=0 rows=82,* frameBorder=0
	id="mainparent">
	<FRAME name=topFrame
		src="${pageContext.request.contextPath }/admin/title"
		noResize scrolling=no>
	<FRAMESET id="main" border="0" frameSpacing="0" frameBorder="0"
		cols="153,1%,*">
	    <FRAME name="leftFrame"
			src="${pageContext.request.contextPath }/admin/left"
			noResize>
		<frame name="changeButton"
			src="${pageContext.request.contextPath }/admin/change"
			frameBorder=0 marginHeight=0 marginWidth=0 scrolling=no noresize>
		<FRAME name="mainFrame"
			src="${pageContext.request.contextPath }/admin/menu">
	</FRAMESET>
</FRAMESET>


</HTML>
