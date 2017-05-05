<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>左侧菜单</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.7.2.min.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath }/resources/js/function.js"></script>
<script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/menuData.js"></script>
<script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/tree.js"></script>
<script language="JavaScript"
	src="${pageContext.request.contextPath }/resources/js/tree/jquery.ztree.core-3.5.min.js"></script>


<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/menu.css" />
<%-- <link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/ztree/zTreeStyle.css"
	type="text/css"> --%>
 <link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
 <link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/zTreeStyle/zTreeIcons.css"
	type="text/css">
<script type="text/javascript">
	
	$(function(){
		var setting={
			data:{
				simpleData:{
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: -1
				}
			},
			view: {
				dblClickExpand: false,
				selectedMulti: false
			},
			async:{
				enable: true,
				url:"treeAll"
			},
			mine:{
				listChild:1,
				srcElement:"#cc"
			},
			callback:{
				
			 	onAsyncSuccess:function(){
					if(t.expandAll)
						t.expandAll(true); 
				}
			
			}
		};
		
		var _mine=setting.mine;
		//alert(_mine.srcElement);
		var t=$.fn.zTree.init($("#menuTree"), setting);
		if(_mine.listChild)
		{
			setting.callback.onClick = listChild;
		}
		
		function listChild(event,treeId,treeNode) {
			$(_mine.srcElement).attr("src","target");
		}
		
		t.getCheckParentNodes=getCheckParentNodes;
		
		function getCheckParentNodes(treeNode,checked) {
			var ps = new Array();
			var pn;
			while((pn=treeNode.getParentNode())) {
				if(pn.checked==checked) ps.push(pn);
				treeNode = pn;
			}
			return ps;
		}
		
		t.getCheckChildNodes=getCheckChildNodes;
		//存储节点
		function getCheckChildNodes(treeNode,checked,cs) {
			var ccs;
			if((ccs=treeNode.children)) {
				for(var i=0;i<ccs.length;i++) {
					var c = ccs[i];
					if(c.checked==checked) {
						cs.push(c);
					}
					getCheckChildNodes(c,checked,cs);
				}
			}
		}
	});
</script>
	
</head>
<body style="margin: 0">

	
	<TABLE border=0 width="20">
		<TR>
			<TD width=340px align=center valign=top>
				<div class="zTreeDemoBackground">
					<ul id="menuTree" class="tree"></ul>
				</div></TD>
		</TR>
	</TABLE>
	
</body>
</html>

