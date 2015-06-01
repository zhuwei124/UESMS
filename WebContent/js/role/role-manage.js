$(document).ready(function() {
	//声明变量总页数
	var totalPages;
	//声明变量当前页
	var pageNow;
	//声明变量结果集
	var result;
	
	//初始化表格
	getLimitList(1, 8);
	paging(totalPages,pageNow);
	getParticularModal();
	getUpdateModal();
	deleteLimit();
	
	//表格翻页
	var $lis = $(".pagination li");
	$.each($lis,function(index,li){
		$(li).click(function() {
			if (index == 0 && pageNow > 1) {
				$("tbody").empty();
				getLimitList(pageNow - 1, 8);
				changeActive(pageNow);
				getParticularModal();
				getUpdateModal();
				deleteLimit();
			}else if ((index + 1) == $lis.length && pageNow < ($lis.length - 2)) {
				$("tbody").empty();
				getLimitList(pageNow - (-1) , 8);
				changeActive(pageNow);
				getParticularModal();
				getUpdateModal();
				deleteLimit();
			}else if(index > 0 && index < ($lis.length - 1)){
				$("tbody").empty();
				getLimitList($(li).text(), 8);
				changeActive($(li).text());
				getParticularModal();
				getUpdateModal();
				deleteLimit();
			}			
		});
	});
	
	//详细信息
	function getParticularModal(){
		$("tbody .btn-primary").click(function(){
			var limitId = $(this).attr("limitId");
			$.each(result.list,function (index, limit) {
				if (limitId == limit.limitId) {
					$(".modal-body").empty();
					$(".modal-body").append(
							"权限名称：" + limit.limitName + "<br>"+
							"权限等级：" + limit.limitLevel + "<br>"+
							"权限状态：" + limit.limitStatus + "<br>"
							);
					$(".modal-dialog").addClass("modal-sm");
					$('#myModal').modal();
				}
			});
		});
	}
	
	//更改信息
	function getUpdateModal(){
		$("tbody .btn-warning").click(function(){
			var limitId = $(this).attr("limitId");
			$.each(result.list,function (index, limit) {
				if (limitId == limit.limitId) {
					$(".modal-body").empty();
					$(".modal-body").append(
							"权限名称：" + limit.limitName + "<br>"+
							"权限等级：" + limit.limitLevel + "<br>"+
							"权限状态：" + limit.limitStatus + "<br>"
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
	function deleteLimit(){
		$("tbody .btn-danger").click(function(){
			if (!confirm("确定要删除该用户吗？")) {
				return;
			}
			var limitId = $(this).attr("limitId");
			$.each(result.list,function (index, limit) {
				if (limitId == limit.limitId) {
					$.ajax({
						type:"POST",
						dataType:"json",
						url:"../../LimitDeleteServlet",
						data:{"limitId":limitId},
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
	function getLimitList(pageNo,pageSize) {
		$.ajax({
			async:false,
			type:"POST",
			dataType:"json",
			data:{"pageNo":pageNo , "pageSize":pageSize},
			url:"../../LimitListServlet",
			success:function(data){
				result = data;
				//var $result = eval("(" + data + ")");
				$.each(data.list,function (index, limit) {
					$("tbody").append(
							"<tr><td>"
							+ limit.limitName + "</td><td>"
							+ limit.limitLevel + "</td><td>"
							+ limit.limitStatus + "</td><td>"					
							+ "<button limitId = "+limit.limitId+" type='button' class='btn btn-primary btn-xs' data-toggle='modal'>详细</button>"
							+ "<button limitId = "+limit.limitId+" type='button' class='btn btn-warning btn-xs' data-toggle='modal'>更改</button>"
							+ "<button limitId = "+limit.limitId+" type='button' class='btn btn-danger btn-xs'>删除</button>"
							+ "</td></tr>"
							);
				});
				pageNow = pageNo;
				totalPages = data.totalPages;
			}
		});
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