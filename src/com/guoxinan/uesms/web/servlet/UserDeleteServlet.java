package com.guoxinan.uesms.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoxinan.uesms.dao.UserDao;


@WebServlet("/UserDeleteServlet")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserDeleteServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		//得到userId
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		//通过userDao删除user
		UserDao userDao = new UserDao();
		Boolean result = userDao.logicDeleteUserById(userId);
		
		//返回result到前台
		response.getWriter().print(result.toString());
	}

}
