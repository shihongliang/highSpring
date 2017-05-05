$(function(){

	$( "#startDate" ).datepicker({
		dateFormat:"yy-mm-dd",//设置日期的格式
		maxDate:0,//最大日期为1年后（2013-2-2具体日期）
		changeMonth:true,//可以选择一个月份
		changeYear:true//可以选择一个年份
	});

	$( "#endDate" ).datepicker({
		dateFormat:"yy-mm-dd",//设置日期的格式
		maxDate:0,//最大日期为1年后（2013-2-2具体日期）
		changeMonth:true,//可以选择一个月份
		changeYear:true//可以选择一个年份
	});

	var validate = $("#addForm").cmsvalidate();
	$("#addBtn").click(function(){
		if(validate.valid()) {
			$("#addForm").submit();
			$(this).attr("disabled");
		}
	});

	

})(jQuery)
