package com.guoxinan.uesms.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guoxinan.uesms.dao.LimitDao;

@WebServlet("/GetLimitNameServlet")
public class GetLimitNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public GetLimitNameServlet() {
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
		LimitDao limitDao = new LimitDao();
		String result = limitDao.getLimitById(limitId).getLimitName();
		response.getWriter().print(result);
	}

}
