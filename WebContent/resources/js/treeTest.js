var menu={
		setting:{
			isSimpleData:true,
			treeNodeKey:"mid",
			treeNodeKey:"pid",
			showLine:true,
			root:{
				isRoot:true,
				nodes:[]
			}
		},
		//要获取什么数据（显示什么模块）
		loadMenuTree:function(){
			$.post("channel",{
				"jctID":"123"
			},function(data){
				$("#menuTree").zTree(menu.setting,data);
				
			})
			
		}
		
		
};

$().ready(function(){
	menu.loadMenuTree();s
})











