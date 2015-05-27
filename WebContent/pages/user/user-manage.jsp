<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="basePath">
<meta charset="utf-8">
<script type="text/javascript" src="../../js/jquery.js"></script>
<script type="text/javascript" src="../../js/user-manage.js"></script>
<link rel="stylesheet" type="text/css" href="../../css/user-manage.css">
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
<title></title>
</head>
<body>
	<div class="top"><h1>用户管理</h1></div>
	<div class="content">
		<table class="table table-bordered">
			<thead>
				<tr>
					<td>用户编号</td>
					<td>系统账号</td>
					<td>用户姓名</td>
					<td>性别</td>
					<td>证件号</td>
					<td>电话</td>
					<td>出生年月</td>
					<td>E_mail</td>
					<td>联系地址</td>
					<td>QQ号</td>
					<td>用户状态</td>
					<td>密码</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td id="name"></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>