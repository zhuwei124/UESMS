$(document).ready(function(){
	
	$.ajax({
		type:"get",//请求方式  
        url:"UserServlet",//发送请求地址  
        dataType:"json",  
        data:{//发送给数据库的数据  
        },  
        //请求成功后的回调函数有两个参数  
        success:function(data,textStatus){  
            var objs=eval(data); //解析json对象  
            alert(objs[0].Attr);  
              
        }
    });  

});