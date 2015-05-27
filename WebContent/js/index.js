$(document).ready(function(){

    //菜单折叠
		$(".menu2").click(function(){ 
			$(this).next("div").slideToggle("slow")  
			.siblings(".menu3:visible").slideUp("slow");
		});

    //网站主页
    $("#home").click(function(){
      $("iframe").attr("src","pages/home/home.jsp");
    });

    $("#about").click(function(){
      $("iframe").attr("src","pages/home/about.jsp");
    });

    $("#contact-us").click(function(){
      $("iframe").attr("src","pages/home/contact-us.jsp");
    });

    //用户管理
    $("#user-manage").click(function(){
      $("iframe").attr("src","pages/user/user-manage.jsp");
    });

    $("#add-user").click(function(){
      $("iframe").attr("src","pages/user/add-user.jsp");
    });

    $("#search-user").click(function(){
      $("iframe").attr("src","pages/user/search-user.jsp");
    });


    //角色管理
     $("#role-manage").click(function(){
      $("iframe").attr("src","pages/role/role-manage.jsp");
    });

     $("#add-role").click(function(){
      $("iframe").attr("src","pages/role/add-role.jsp");
    });

     $("#search-role").click(function(){
      $("iframe").attr("src","pages/role/search-role.jsp");
    });

     //车站管理
     $("#station-manage").click(function(){
      $("iframe").attr("src","pages/station/station-manage.jsp");
    });

     $("#add-station").click(function(){
      $("iframe").attr("src","pages/station/add-station.jsp");
    });

     $("#search-station").click(function(){
      $("iframe").attr("src","pages/station/search-station.jsp");
    });

     //车辆管理
     $("#vehicle-manage").click(function(){
      $("iframe").attr("src","pages/vehicle/vehicle-manage.jsp");
    });

     $("#add-vehicle").click(function(){
      $("iframe").attr("src","pages/vehicle/add-vehicle.jsp");
    });

     $("#search-vehicle").click(function(){
      $("iframe").attr("src","pages/vehicle/search-vehicle.jsp");
    });

     //承运方管理
     $("#carriagecompany-manage").click(function(){
      $("iframe").attr("src","pages/carriagecompany/carriagecompany-manage.jsp");
    });

     $("#add-carriagecompany").click(function(){
      $("iframe").attr("src","pages/carriagecompany/add-carriagecompany.jsp");
    });

     $("#search-carriagecompany").click(function(){
      $("iframe").attr("src","pages/carriagecompany/search-carriagecompany.jsp");
    });

     //驾驶员管理
     $("#driver-manage").click(function(){
      $("iframe").attr("src","pages/driver/driver-manage.jsp");
    });

     $("#add-driver").click(function(){
      $("iframe").attr("src","pages/driver/add-driver.jsp");
    });

     $("#search-driver").click(function(){
      $("iframe").attr("src","pages/driver/search-driver.jsp");
    });

	});