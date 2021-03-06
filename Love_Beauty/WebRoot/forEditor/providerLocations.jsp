<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>获取商城的地址</title>

		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<style type="text/css">
table {
	text-align: center;
	font-size: 15px;
	color: red;
	border: 1px solid purple;
}

table td {
	border: 1px solid blue;
}

table b {
	border: 1px solid blue;
}

table b input {
	width: 10px;
}
</style>
		<script src="jquery1.4.2.js" type="text/javascript">
</script>
		<script type="text/javascript">
var level = 1;
function GetProviderLocation(pid) {
	var url = BASE_SERVER + "/provider_getProviderLocations";
	//parameter name undefined
	//这里判断level从而得知相关数据
	var params;
	switch (level) {
	case 3:
		params = {
			"pid" : pid,
			"plevel" : level,
			"location1" : $('#location1').val(),
			"location2" : $('#location2').val()
		};
		break;
	case 2:
		params = {
			"pid" : pid,
			"plevel" : level,
			"location1" : $('#location1').val()
		};
		break;
	default:
		params = {
			"pid" : pid,
			"plevel" : level
		};
	}
	//alert(level);
	var providerLocations = "";
	//var topic="";
	$.ajax( {
		type : "POST",
		data : params,
		dataType : "json",
		url : url,
		success : function(json) {
			if (json == null) {
				alert("json null");
			} else {
				providerLocations += "<option value=' '> </option>";
				switch (level) {
				case 2:
					for ( var i = 0; i < json.length; i++) {
						providerLocations += "<option value='"
								+ json[i]['value'] + "'>" + json[i]['value']
								+ "</option>";
					}
					$('#location2').html(providerLocations.toString());
					break;
				case 3:
					for ( var i = 0; i < json.length; i++) {
						providerLocations += "<option value='"
								+ json[i]['value'] + " " + json[i]['id'] + "'>"
								+ json[i]['value'] + "</option>";
					}
					$('#location3').html(providerLocations.toString());
					break;
				default:
					for ( var i = 0; i < json.length; i++) {

						providerLocations += "<option value='"
								+ json[i]['value'] + "'>" + json[i]['value']
								+ "</option>";
					}
					$('#location1').html(providerLocations.toString());
					break;
				}
			}
		}
	});
}
function validate() {//判断条件进行修改
	if (locationForm.newlocation1.value != ""
			|| locationForm.newlocation2.value != ""
			|| locationForm.newlocation3.value != "") {
		locationForm.submit();
	} else {
		alert("至少一个有非空啊");
	}

}
function delete_confirm() {
	var r = confirm("确认删除");
	if (r == true) {
		//删除操作
		alert("删除");
		locationForm.submit();
	} else {

	}
}
$(document).ready(function() {
	GetProviderLocation($('#providerId').val());
	$('#providerId').change(function() {
		GetProviderLocation($('#providerId').val());
	});
	$('#location1').change(function() {
		level = 2;
		GetProviderLocation($('#providerId').val());
	});
	$('#location2').change(function() {
		level = 3;
		GetProviderLocation($('#providerId').val());
	});
});
</script>
	</head>
	<body>
		<%@include file="/top.jsp"%>
		<form name="locationForm" action="provider_handleProviderLocations"
			enctype="application/x-www-form-urlencoded" method="post">
			<select id="providerId" name="pid">
				<option value="1">
					NO5时尚广场
				</option>
				<option value="2">
					乐蜂网
				</option>
				<option value="3">
					聚美网
				</option>
				<option value="4">
					京东商城
				</option>
				<option value="5">
					当当网
				</option>
				<option value="6">
					卓越网
				</option>
			</select>
			<table border="1">
				<tr>
					<td>
						省
						<select id="location1" name="location1"></select>
					</td>
					<td>
						自定义
						<input type="text" name="newlocation1">
					</td>
				</tr>
				<tr>
					<td>
						市
						<select id="location2" name="location2"></select>
					</td>
					<td>
						自定义
						<input type="text" name="newlocation2">
					</td>
				</tr>
				<tr>
					<td>
						区/县
						<select id="location3" name="location3"></select>
					</td>
					<td>
						自定义
						<input type="text" name="newlocation3">
					</td>
				</tr>
			</table>
			<button name="submit" value="update" onclick="validate()">
				更新
			</button>
			<button name="submit" value="add" onclick="validate()">
				增加
			</button>
			<button name="submit" value="delete" onclick="delete_confirm()">
				删除
			</button>
		</form>
	</body>
</html>