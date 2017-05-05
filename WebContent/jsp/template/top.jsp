<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="top">
<div id="flash">
<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=7,0,0,0" width="1009" height="190" id="Untitled-1" align="center">
<param name="allowScriptAccess" value="sameDomain" />
<param name="movie" value="<%=request.getContextPath()%>/resources/img/wzbt2.swf" />
<param name="quality" value="high" />
<embed src="<%=request.getContextPath()%>/resources/img/wzbt2.swf" quality="high" width="1009"  height="190" name="mymovie" align="center" allowScriptAccess="sameDomain"  type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />
</object>
</div>
<div id="nav">
	<div id="nav_parent">
		<ul>
			<li style="border-left: 1px solid #fff;">
				<a href="<%=request.getContextPath()%>/index" class="nav_parent_link">网站首页</a>
	<ul id=nav_child_first class="child_hide_ul">
			<li><a href="<%=request.getContextPath()%>/channel/32" class="nav_child_link">领导名录</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/33" class="nav_child_link">综合管理</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/34" class="nav_child_link">人事信息</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/35" class="nav_child_link">政策法规</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/36" class="nav_child_link">行政许可</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/40" class="nav_child_link">检验检测</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/45" class="nav_child_link">质监动态</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/46" class="nav_child_link">执法打假</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/47" class="nav_child_link">质监讲座</a></li>
	</ul>
			</li>
				<li id="nav_1">
				<a href="#" class="nav_parent_link">政务公开</a>
	<ul  class="child_hide_ul">
			<li><a href="<%=request.getContextPath()%>/channel/31" class="nav_child_link">机构介绍</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/34" class="nav_child_link">人事信息</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/32" class="nav_child_link">领导名录</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/33" class="nav_child_link">综合管理</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/35" class="nav_child_link">政策法规</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/36" class="nav_child_link">行政许可</a></li>
	</ul>
				</li>
				<li id="nav_7">
				<a href="#" class="nav_parent_link">办事中心</a>
	<ul  class="child_hide_ul">
			<li><a href="<%=request.getContextPath()%>/channel/37" class="nav_child_link">办事中心</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/38" class="nav_child_link">表格下载</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/39" class="nav_child_link">收费标准</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/40" class="nav_child_link">检验检测</a></li>
	</ul>
				</li>
				<li id="nav_13">
				<a href="#" class="nav_parent_link">互动查询</a>
	<ul  class="child_hide_ul">
			<li><a href="mailto:xxx@169.com" class="nav_child_link">局长信箱</a></li>
			<li><a href="<%=request.getContextPath()%>/building" class="nav_child_link">信息查询</a></li>
			<li><a href="<%=request.getContextPath()%>/building" class="nav_child_link">12365投诉举报</a></li>
	</ul>
				</li>
				<li id="nav_19">
				<a href="#" class="nav_parent_link">质检信息</a>
	<ul  class="child_hide_ul">
			<li><a href="<%=request.getContextPath()%>/channel/44" class="nav_child_link">通知公告</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/45" class="nav_child_link">质监动态</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/46" class="nav_child_link">执法打假</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/47" class="nav_child_link">质监讲座</a></li>
			<li><a href="<%=request.getContextPath()%>/channel/48" class="nav_child_link">质监文化</a></li>
	</ul>
				</li>
		</ul>
	</div>	
	<div id="nav_child">
		<ul id="nav_child_ul">
		</ul>
	</div>
	<div id="nav_info">
		<span id="nav_info_date">
			<span>2012年5月16日 &nbsp;&nbsp;&nbsp;星期三</span>
		</span>	
		<input id="contextPath" value="<%=request.getContextPath()%>" type="hidden"/>
		<span id="nav_info_search">
			<span>
			全文检索:&nbsp;<input id="searchText" type="text" size="20" value="${qs}" /><input id="search" type="button" value="检索" />
			</span>
		</span>				
	</div>
	<div id="nav_welcome">
		<span id="w1">您好，欢迎进入昭通市昭阳区质量技术监督局!</span>
		<span id="w2">地址：昭通市昭阳区xxxx号 电话：0870-xxxxxx,0870-xxxxxx   邮政编码：657000</span>
	</div>		
</div>
</div>