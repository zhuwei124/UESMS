package com.guoxinan.uesms.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoxinan.uesms.dao.LimitDao;
import com.guoxinan.uesms.dao.UserDao;
import com.guoxinan.uesms.model.Limitt;


@WebServlet("/LimitDeleteServlet")
public class LimitDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LimitDeleteServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//得到limitId
		int limitId = Integer.parseInt(request.getParameter("limitId"));
		//通过limitDao删除limit
		LimitDao limitDao = new LimitDao();
		Boolean result = limitDao.logicDeleteLimitById(limitId);
		
		//返回result到前台
		response.getWriter().print(result.toString());
	}

}
