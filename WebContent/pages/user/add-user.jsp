<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String result = request.getAttribute("result").toString();
	
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<!-- base href="basePath"-->
<meta charset="utf-8">
<script type="text/javascript" src="../../js/jquery.js"></script>
<script type="text/javascript" src="../../js/bootstrap.js"></script>
<script type="text/javascript"
	src="../../js/user/add-user.js?<%=Math.random() * 10%>"></script>
<link rel="stylesheet" type="text/css"
	href="../../css/user/add-user.css?<%=Math.random() * 10%>">
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
<title></title>
</head>
<body>
	<div class="top">
		<h1>添加用户</h1>
	</div>
	<div class="content">
		<form id="user" action="../../InsertUserServlet" method="POST">
			<div class="line"></div>
			<div class="form-group col-md-4">
				<label for="sysNo">系统账号</label> 
				<input type="text"	class="form-control" id="sysNo" name="userSystemNumber" placeholder="输入系统账号">
			</div>
			<div class="form-group col-md-4">
				<label for="userName">用户名</label> 
				<input type="text" class="form-control" id="userName" name="userName" placeholder="输入用户名">
			</div>
			<div class="form-group col-md-4">
				<label for="userIdCard">身份证号</label> 
				<input type="text"	class="form-control" id="userIdCard" name="userIdCard" placeholder="输入身份证号">
			</div>
			<div class="form-group col-md-4">
				<label for="userTellNumber">电话</label> 
				<input type="text"	class="form-control" id="userTellNumber" name="userTellNumber" placeholder="输入电话">
			</div>
			<div class="form-group col-md-4">
				<label for="userQq">QQ</label> 
				<input type="text"	class="form-control" id="userQq" name="userQq" placeholder="输入QQ">
			</div>
			
			<div class="form-group col-md-4">
				<label for="userMail">Email</label> 
				<input type="email"	class="form-control" id="userMail" name="userMail" placeholder="输入Email">
			</div>			
			<div class="form-group col-md-4">
				<label for="userStatus">用户状态</label> 
				<input type="text"	class="form-control" id="userStatus" name="userStatus" placeholder="输入用户状态">
			</div>
			<div class="form-group col-md-4">
				<label for="userAddress">联系地址</label> 
				<input type="text"	class="form-control" id="userAddress" name="userAddress" placeholder="输入联系地址">
			</div>
			<div class="form-group col-md-4">
				<label for="userBirthday">出生日期</label> 
				<input type="date"	class="form-control" id="userBirthday" name="userBirthday" placeholder="输入出生年月">
			</div>
			<div class="form-group col-md-4">
				<label for="userPassword">用户密码</label> 
				<input type="password"	class="form-control" id="userPassword" name="userPassword" placeholder="输入密码">
			</div>
			<div class="form-group col-md-4">
				<label for="userPassword">角色</label>
				<select class="form-control" name="limitId">
					<option value="5">普通员工</option>
					<option value="4">司机</option>
					<option value="3">承运方</option>					
					<option value="2">车站管理员</option>
				  	<option value="1">管理员</option>			  	
				</select>
			</div>
			<div class="form-group col-md-4">
				<label for="userSex">性别</label> 
				<label class="radio-inline"> 
				<input type="radio" name="userSex" id="userSex" value="男" checked>男
				</label> 
				<label class="radio-inline"> 
				<input type="radio" name="userSex" id="userSex" value="女">女
				</label>
			</div>
			<div class="line"></div>
			<div class="submit">
			<button type="submit" class="btn btn-primary ">添加用户</button>
			</div>		
		</form>
	</div>
</body>
</html>