
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">



<HTML>
<HEAD>
<TITLE>Top</TITLE>

<STYLE type=text/css>BODY {
	FONT-SIZE: 12px; MARGIN: 0px; COLOR: #000000; BACKGROUND-COLOR: #ffffff
}
TD {
	FONT-SIZE: 12px; COLOR: #000000
}
TH {
	FONT-SIZE: 12px; COLOR: #000000
}
</STYLE>
<SCRIPT type="text/javascript">
function submitrequest(action){
eval("document.location='"+action+"'");
}

</SCRIPT>
<style type="text/css">
	#title{

	font-size:20px;


	}
</style>
</HEAD>
<BODY>

<FORM id="Form1" name="Form1"  method="post">

<table border="0" width="100%" height="9" cellspacing="0" cellpadding="0">
  <tr>
    <td width="100%" colspan="4" background="${pageContext.request.contextPath }/resources/images/titl.jpg" height="58"><p id="title">${title}</p></td>
  </tr>
  <tr>
    <td width="100%" height="1" bgcolor="#66C89C" colspan="4"><img border="0" src="${pageContext.request.contextPath }/resources/images/titleline.jpg" width="100%" height="3"></td>
  </tr>
  <tr>
    <td width="20%" height="19" bgcolor="#0965CA">

    <table border="0" width="100%" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15%" align="center"><font color="#FFFFFF"><b>|</b></font></td>
        <td width="70%" align="center">
        <FONT color=#FFFFFF>
            <b>
            <SCRIPT language=JavaScript>
										
										tmpDate = new Date();
										date = tmpDate.getDate();
										month= tmpDate.getMonth() + 1 ;
										year= tmpDate.getFullYear();
										document.write(year);
										document.write("年");
										document.write(month);
										document.write("月");
										document.write(date);
										document.write("日 ");

										myArray=new Array(6);
										myArray[0]="星期日"
										myArray[1]="星期一"
										myArray[2]="星期二"
										myArray[3]="星期三"
										myArray[4]="星期四"
										myArray[5]="星期五"
										myArray[6]="星期六"
										weekday=tmpDate.getDay();
										if (weekday==0 | weekday==6)
										{
										document.write(myArray[weekday])
										}
										else
										{document.write(myArray[weekday])
										};
									
										</SCRIPT>
            </b>
            </FONT></td>
        <td width="15%" align="center"><font color="#FFFFFF"><b>|</b></font></td>
      </tr>
    </table>
   
    <td width="16%" height="19" bgcolor="#0965CA">
    <table cellSpacing="2" height="19" cellPadding="0" width="100%" border="0" ><tr><td valign="top">
    <b><font color="#FFFFFF">欢迎您!&nbsp;&nbsp;&nbsp;
  <!--   <s:property value="#session.logonUser.userName"/> -->
    </font></b>
    </td></tr></table>
    </td>
    <td width="46%" height="19" bgcolor="#0965CA">　</td>
    <td width="18%" height="19" bgcolor="#0965CA" align="center">
      <table border="0" width="100%" cellspacing="0" cellpadding="0">
        <tr>
          <td width="100%" align="center">
          <A href="${pageContext.request.contextPath }/admin/loading" target="mainFrame"><font color="#FFFFFF"><b>返回首页</b></font></a>
          <font color="#FFFFFF"><b>|</b></font>
          <A href="${pageContext.request.contextPath }/admin/logout"  target="_top"> <font color="#FFFFFF"><b>重新登录</b></font></A>
          <font color="#FFFFFF"><b>|</b></font>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</FORM>
</BODY>
</HTML>
