<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<base href="basePath">
<meta charset="utf-8">
<title>联盛小件快运</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/index.js"></script>
<link rel="stylesheet" type="text/css" href="css/index.css">
<link rel="stylesheet" type="text/css" href="css/boostrap.css">
</head>
<body>
<div class="top">
  <div class="top-left">
    <h1>联盛物流</h1>
  </div>
  <div class="top-right">
      <h1>联盛小件物流管理系统</h1>
  </div>
</div>
<div class="left">
  <div class="menu1">
    <div class="left_top">
    <img src="images/bbb_01.jpg">
    <img src="images/bbb_02.jpg" id="2">
    <img src="images/bbb_03.jpg">
    <img src="images/bbb_04.jpg"> 
    </div>
    <div class="menu2" id="home"><div class="website-index"> </div>网站主页</div>
      <div class="menu3">
          <ul>
            <li id="about"> 关于</li>
            <li id="contact-us"> 联系我们</li>
          </ul>
      </div>
    <div class="menu2" id="user-manage"><div class="user-manage"> </div>用户管理</div>
      <div class="menu3">
          <ul>
  		      <li id="add-user"> 添加用户</li>
  		      <li id="search-user"> 查找用户</li>
          </ul>
      </div>
      <div class="menu2" id="role-manage"><div class="role-manage"> </div>角色管理</div>
        <div class="menu3">
          <ul>
            <li id="add-role"> 添加角色</li>
            <li id="search-role"> 查找角色</li>
          </ul>
      </div>
      <div class="menu2" id="station-manage"><div class="station-manage"> </div>车站管理</div>
        <div class="menu3">
          <ul>
  		      <li id="add-station"> 添加车站</li>
  		      <li id="search-station"> 查找车站</li>
          </ul>
      </div>
      <div class="menu2" id="vehicle-manage"><div class="vehicle-manage"> </div>车辆管理</div>
        <div class="menu3">
          <ul>
    		    <li id="add-vehicle"> 添加车辆</li>
    		    <li id="search-vehicle"> 查找车辆</li>
          </ul>
        </div>
    <div class="menu2" id="carriagecompany-manage"><div class="carriagecompany-manage"> </div> 承运方管理</div>
        <div class="menu3">
          <ul>
    		    <li id="add-carriagecompany"> 添加承运方</li>
    		    <li id="search-carriagecompany"> 查找承运方</li>
           </ul>
        </div>
  </div>
  <div class="menu2" id="driver-manage"><div class="driver-manage"> </div>驾驶员管理</div>
        <div class="menu3">
          <ul>
            <li id="add-driver"> 添加驾驶员</li>
            <li id="search-driver"> 查找驾驶员</li>
          </ul>
      </div>
</div>
<div class="right">
	<iframe name="myframe" src="pages/home/home.jsp" frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no" allowtransparency="yes"></iframe>
</div>
</body>
</html>

