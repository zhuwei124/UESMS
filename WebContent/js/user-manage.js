$(document).ready(function() {

	$.ajax({
		type:"GET",
		dateType:"json",
		url:"../../UserServlet",
		success:function(data){
			var limit = eval("(" + data + ")");
			alert(limit.limitId);
		}
	});

});