package com.guoxinan.uesms.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.utils.CommonUtils;

import com.guoxinan.uesms.dao.UserDao;
import com.guoxinan.uesms.model.User;


@WebServlet("/InsertUserServlet")
public class InsertUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertUserServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//得到表单数据
		Map<String,String[]> userMap = request.getParameterMap();		
		//转换成bean
		User user = CommonUtils.toBean(userMap, User.class);
		UserDao userDao = new UserDao();
		Boolean rs = userDao.insertUser(user);
		request.setAttribute("result", rs);
		response.sendRedirect("pages/user/add-user.jsp");
	}

}
