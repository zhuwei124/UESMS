$(document).ready(function() {
	//声明变量总页数
	var totalPages;
	//声明变量当前页
	var pageNow;
	//声明变量结果集
	var result;
	
	//初始化表格
	getUserList(1, 8);
	paging(totalPages,pageNow);
	getParticularModal();
	getUpdateModal();
	deleteUser();
	
	//表格翻页
	var $lis = $(".pagination li");
	$.each($lis,function(index,li){
		$(li).click(function() {
			if (index == 0 && pageNow > 1) {
				$("tbody").empty();
				getUserList(pageNow - 1, 8);
				changeActive(pageNow);
				getParticularModal();
				getUpdateModal();
				deleteUser();
			}else if ((index + 1) == $lis.length && pageNow < ($lis.length - 2)) {
				$("tbody").empty();
				getUserList(pageNow - (-1) , 8);
				changeActive(pageNow);
				getParticularModal();
				getUpdateModal();
				deleteUser();
			}else if(index > 0 && index < ($lis.length - 1)){
				$("tbody").empty();
				getUserList($(li).text(), 8);
				changeActive($(li).text());
				getParticularModal();
				getUpdateModal();
				deleteUser();
			}			
		});
	});
	
	//详细信息
	function getParticularModal(){
		$("tbody .btn-primary").click(function(){
			var userId = $(this).attr("userId");
			$.each(result.list,function (index, user) {
				if (userId == user.userId) {
					$(".modal-body").empty();
					$(".modal-body").append(
							"系统账号：" + user.userSystemNumber + "<br>"+
							"姓名：" + user.userName + "<br>"+
							"角色：" + getLimitNameById(user.limitId) + "<br>"+
							"性别：" + user.userSex + "<br>"+
							"电话：" + user.userTellNumber + "<br>"+
							"QQ：" + user.userQq + "<br>"+
							"用户状态：" + user.userStatus + "<br>"+
							"地址：" + user.userAddress + "<br>" +
							"生日：" + user.userBirthday + "<br>" +
							"身份证：" + user.userIdCard + "<br>" +
							"邮箱：" + user.userMail + "<br>" +
							"密码：" + user.userPassword + "<br>"
							);
					$(".modal-dialog").addClass("modal-sm");
					$("#myModal").modal();
				}
			});
		});
	}
	
	//更改信息
	function getUpdateModal(){
		$("tbody .btn-warning").click(function(){
			var userId = $(this).attr("userId");
			$.each(result.list,function (index, user) {
				if (userId == user.userId) {
					$(".modal-body").empty();
					$(".modal-body").append(
							"系统账号：" + user.userSystemNumber + "<br>"+
							"姓名：" + user.userName + "<br>"+
							"角色：" + getLimitNameById(user.limitId) + "<br>"+
							"性别：" + user.userSex + "<br>"+
							"电话：" + user.userTellNumber + "<br>"+
							"QQ：" + user.userQq + "<br>"+
							"用户状态：" + user.userStatus + "<br>"+
							"地址：" + user.userAddress + "<br>" +
							"生日：" + user.userBirthday + "<br>" +
							"身份证：" + user.userIdCard + "<br>" +
							"邮箱：" + user.userMail + "<br>" +
							"密码：" + user.userPassword + "<br>"
							);
					if($(".modal-dialog").hasClass("modal-sm")){
						$(".modal-dialog").removeClass("modal-sm");
					}					
					$('#myModal').modal();
				}
			});
		});
	}
	
	//删除用户
	function deleteUser(){
		$("tbody .btn-danger").click(function(){
			if (!confirm("确定要删除该用户吗？")) {
				return;
			}
			var userId = $(this).attr("userId");
			$.each(result.list,function (index, user) {
				if (userId == user.userId) {
					$.ajax({
						type:"POST",
						dataType:"json",
						url:"../../UserDeleteServlet",
						data:{"userId":userId},
						success:function(data){
							var rs = eval("(" + data + ")");
							if (rs) {
								alert("删除成功！");								
							}
							//刷新页面
							window.location.reload(true);
						}
					});
				}
			});
		});
	}
	
	//ajax获取user数据
	function getUserList(pageNo,pageSize) {
		$.ajax({
			async:false,
			type:"POST",
			dataType:"json",
			data:{"pageNo":pageNo , "pageSize":pageSize},
			url:"../../UserListServlet",
			success:function(data){
				result = data;
				//var $result = eval("(" + data + ")");
				$.each(data.list,function (index, user) {
					$("tbody").append(
							"<tr><td>"
							+ user.userSystemNumber + "</td><td>"
							+ user.userName + "</td><td>"
							+ getLimitNameById(user.limitId) + "</td><td>"
							+ user.userSex + "</td><td>"
							+ user.userTellNumber + "</td><td>"
							+ user.userQq + "</td><td>"
							+ user.userStatus + "</td><td>"					
							+ "<button userId = "+user.userId+" type='button' class='btn btn-primary btn-xs' data-toggle='modal'>详细</button>"
							+ "<button userId = "+user.userId+" type='button' class='btn btn-warning btn-xs' data-toggle='modal'>更改</button>"
							+ "<button userId = "+user.userId+" type='button' class='btn btn-danger btn-xs'>删除</button>"
							+ "</td></tr>"
							);
				});
				pageNow = pageNo;
				totalPages = data.totalPages;
			}
		});
	}	
	
	//根据limitId得到角色名称
	function getLimitNameById(limitId){
		var limitName;
		$.ajax({
			async:false,
			type:"POST",
			dataType:"text",
			data:{"limitId":limitId},
			url:"../../GetLimitNameServlet",
			success:function(data){
				limitName =  data;
			}
		});
		return limitName;
	}
	//分页li处理
	function paging(totalPages,pageNow){
		for (var i = 1; i <= totalPages; i++) {					
			if (pageNow == i) {
				$("#next").before("<li class='active'><span>"+ i +"</span></li>");
			}else {
				$("#next").before("<li><span>"+ i +"</span></li>");
			}
		}
	}
	//改变页面active
	function changeActive(num){
		var $lis = $(".pagination li");
		$.each($lis,function(index,li){
			$(li).removeClass("active");
			if($(li).text() == num ){
				$(li).addClass("active");
			}
		});
	}

});