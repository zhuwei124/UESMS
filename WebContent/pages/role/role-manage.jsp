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
<!-- base href="basePath"-->
<meta charset="utf-8">
<script type="text/javascript" src="../../js/jquery.js"></script>
<script type="text/javascript" src="../../js/bootstrap.js"></script>
<script type="text/javascript"
	src="../../js/role/role-manage.js?<%=Math.random() * 10%>"></script>
<link rel="stylesheet" type="text/css"
	href="../../css/role/role-manage.css?<%=Math.random() * 10%>">
<link rel="stylesheet" type="text/css" href="../../css/bootstrap.css">
<title></title>
</head>
<body>
	<div class="top">
		<h1>权限管理</h1>
	</div>
	<div class="content">
		<table class="table table-bordered table-hover table-striped">
			<thead>
				<tr>
					<td>权限名称</td>
					<td>权限等级</td>
					<td>权限状态</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody></tbody>
		</table>
		<div class="paging">
			<nav>
				<ul class="pagination pagination-lg">
					<li id="previous"><span href="" aria-label="Previous">
							<span aria-hidden="true">上一页</span>
					</span></li>
					<li id="next"><span aria-label="Next"> <span
							aria-hidden="true">下一页</span>
					</span></li>
				</ul>
			</nav>
		</div>
		<div id="myModal" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title">详细信息</h4>
					</div>
					<div class="modal-body"></div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>