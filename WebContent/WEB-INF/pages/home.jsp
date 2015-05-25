<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>home</title>
    <link href="/css/home.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery-2.1.4.js"></script>
    <script type="text/javascript" src="js/home.js"></script>
</head>
<body>
<%=request.getAttribute("test") %>
    <div id="row_first">
        <div id="head_left">
            <h1>四川联盛</h1>
            <ul id="topMenu">
            <li><a href="#">关于联盛</a></li>
            <li><a href="#">联系我们</a></li>
            <li><a href="#">网站地图</a></li>
            <li><a href="#">登陆</a></li>
            <li><a href="#">注册</a></li>
        </ul>
        </div>
            <p>|speed safety service</p>
    </div>
    <div id="row_second">
        <hr/>
    </div>
    <div id="row_third">
        <hr />
    </div>
</body>
</html>
