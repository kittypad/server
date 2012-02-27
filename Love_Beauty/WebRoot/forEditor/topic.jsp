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
    
    <title>编辑专题页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	.tabel{
		text-align: center;
		font-size: 15px;
		color: red;
		border: 1px solid purple;
	}
	.tabel td{
		border: 1px solid blue;
	}
	
	</style>
	<script src="jquery1.4.2.js" type="text/javascript"></script>
	<script type="text/javascript">
   
 /*  /*
    *通过大分类获得专题名称
    
	function GetTopic(cla){
			var url="http://192.168.14.24:8080/Love_Beauty/topic_getTopic";
			var params = {"cla":cla};
			var topic="";
			$.ajax({
				type:"POST",
				data:params,
				dataType: "json",
				url: url,
				success: function(json) {
				if(json == null){
					alert("json null");
				}else{
					for(var i=0;i<json.length;i++){
						topic+="<option value='+json[i]['topic_name']+'>"+json[i]['topic_name']+"</option>";
					}
				}
				$('#topicname').html(topic.toString());
				}
			});
	}*/
	
	/*
    *通过大分类获得专题详细信息
    */
	function GetTopic_Detail(cla){
			var url="http://192.168.14.24:8080/Love_Beauty/topic_getTopic";
			var params = {"cla":cla};
			var topic="";
			$.ajax({
				type:"POST",
				data:params,
				dataType: "json",
				url: url,
				success: function(json) {
				if(json == null){
					alert("json null");
				}else{
				 topic+="<tbody>";
					for(var i=0;i<json.length;i++){
					topic+="<tr><form action='topic_updateTopic' enctype='multipart/form-data'>";
						topic+="<td><input type='hidden' name='topic_id' value='"+json[i]['topic_id']+"'/>专题名: <input name='topic_name' value='"+json[i]['topic_name']+"'/></td><td>专题关键词：<input name='topic_keywords' value='"+json[i]['topic_keywords']+"'/></td><td>专题缩略图：<img src='"+json[i]['topic_thumb']+"'/>更改：<input type='file' name='newtopic_thumb'></td> <td>专题大图：<img src='"+json[i]['topic_images']+"'/>更改：<input type='file' name='newtopic_image'></td><td><input name='submit' type='submit' value='前移'/><input name='submit' type='submit' value='后移'/><input name='submit' type='submit' value='删除'/><input name='submit' type='submit' value='更改'/><a href='forEditor/topic_goods.jsp?id="+json[i]['topic_id']+"&name="+json[i]['topic_name']+"'>对应商品</a></td>" ;
						
					topic+="</form></tr>";
					}
				}
				 topic+="</tbody>";
				$('#topic_detail').html(topic.toString());
				}
			});
	}
	
	
	$(document).ready(function(){
	
			   GetTopic_Detail($('#maincla').val());
			   $('#maincla').change(function(){
				GetTopic_Detail($('#maincla').val());
			   });
			   
       });
	</script>
  </head>
  
  <body>
  <%@include file="/top.jsp"%>
 <table class="tabel" >
 <tbody>
   <tr>
 <td><a href="forEditor/newTopic.jsp">新加专题</a></td>
 </tr>
 <tr>
 <td>大分类：<select id="maincla">
 <option value="1">护肤</option>
  <option value="2">妆扮</option>
   <option value="3">美体</option>
    <option value="4">美发</option>
 </select></td>
 </tr>
  </tbody>
 </table>
 
 <table class="tabel"  id="topic_detail">
 
 </table>
 
  </body>
</html>
