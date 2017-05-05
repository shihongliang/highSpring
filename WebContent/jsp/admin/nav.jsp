<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用甘肃省国网电力系统</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/css/admin/main.css"/>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resources/js/core/jquery.cms.core.js"></script>
<script type="text/javascript">
$(function(){
	$("#left").myaccordion();
});
</script>
</head>
<body>
<div id="left">
<c:if test="${isAdmin }">
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">状态总览</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/user/users" target="content">用户管理</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/channel/audits" target="content">设备大事记</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/group/groups" target="content">带电检验</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/role/roles" target="content">停电实验</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/channel/channels" target="content">台账信息</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/role/#" target="content">在线监测</a>
	</li>
</ul>
</c:if>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">监测预警</span>
	</h3>
	<c:if test="${isAdmin }">
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/channel/channels" target="content">监测预警</a>
	</li>
	</c:if>
</ul>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">状态评价</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/topic/audits" target="content">状态评价</a>
	</li>
</ul>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">故障监测</span>
	</h3>
	
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/fdetection/channels" target="content">故障监测</a>
	</li>
</ul>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">风险评估</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/topic/audits" target="content">风险评估</a>
	</li>
</ul>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">检修决策</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/topic/audits" target="content">检修决策</a>
	</li>
</ul>
<ul class="navMenu navSelected">
		<h3 class="navTitle ">
			<span class="navTilteTxt">查询统计</span>
		</h3>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/cmsLink/links" target="content">状态评价查询统计</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/system/baseinfo" target="content">故障状态查询统计</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/pic/indexPics" target="content">风险评估查询统计</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/backup/sqls" target="content">油设备查询统计</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/system/cleans" target="content">超实验查询统计</a>
		</li>
</ul>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">专业管理</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/user/users" target="content">缺陷管理</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/group/groups" target="content">标准案例库管理</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/role/roles" target="content">专家库管理</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/channel/channels" target="content">专业报告查询</a>
	</li>
	
</ul>
<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">技术服务</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/fconsult/channels" target="content">远程专家服务</a>
	</li>
</ul>



<c:if test="${isAdmin }">
	<ul class="navMenu navSelected">
		<h3 class="navTitle ">
			<span class="navTilteTxt">信息管理</span>
		</h3>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/cmsLink/links" target="content">实验管理</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/system/baseinfo" target="content">参数管理</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/pic/indexPics" target="content">基础信息管理</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/backup/sqls" target="content">设备管理</a>
		</li>
		<li class="navChild">
			<a href="<%=request.getContextPath() %>/admin/system/cleans" target="content">故障模式管理管理</a>
		</li>
	</ul>
</c:if>

<ul class="navMenu navSelected">
	<h3 class="navTitle">
		<span class="navTilteTxt">系统管理</span>
	</h3>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/user/users" target="content">用户管理</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/group/groups" target="content">角色管理</a>
	</li>
	<li class="navChild">
		<a href="<%=request.getContextPath() %>/admin/role/roles" target="content">日志管理</a>
	</li>

</ul>


</div>
</body>
</html>