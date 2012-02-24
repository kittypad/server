<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="main.com.yourantao.aimeili.bean.Brand" %>
<%@ page import="main.com.yourantao.aimeili.bean.BrandDAO" %>
<%@ page import="org.hibernate.classic.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>专题插入</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="jquery1.4.2.js" type="text/javascript"></script>
	<script type="text/javascript">
   
	function GetTopic(){
			var url="http://192.168.14.24:8080/Love_Beauty/topic_getTopic";
			var params = {"action":"get"};
			$.ajax({
				type:"POST",
				data:params,
				dataType: "json",
				url: url,
				success: function(data) {
					if(json==null){
						alert("json null");
					}else{
						alert(json.toString());
					}
				}
			});
	}
	
	
	$(document).ready(function(){
	
			   GetTopic();
			   $('#topicname').change(function(){
				   SetupTopic();
				   
			   });
       });
	</script>
  </head>
  
  <body>
  <form action="topic">
  	新专题名：<input type="text" name="newtopic"/> 图片上传：
  	</form>
 <table border="1">
 <tbody>
 <tr>
 <td>专题名：</td><td><select id="topicname" name="newtopic"/></td>
 </tr>
  <tr>
 <td>图片上传：</td><td><input name="newtopic" type="text"/></td>
 </tr>
 </tbody>
 </table>
  </body>
</html>