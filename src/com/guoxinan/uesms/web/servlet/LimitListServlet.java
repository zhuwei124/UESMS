package com.guoxinan.uesms.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.catalina.Session;
import org.junit.Test;

import com.guoxinan.uesms.dao.LimitDao;
import com.guoxinan.uesms.dao.UserDao;
import com.guoxinan.uesms.model.Limitt;
import com.guoxinan.uesms.model.PageModel;
import com.guoxinan.uesms.model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/LimitListServlet")
public class LimitListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LimitListServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		LimitDao limitDao = new LimitDao();
		int pageNo = Integer.parseInt(request.getParameter("pageNo"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		PageModel pageModel = limitDao.getLimitList(pageNo,pageSize);
		JSONObject jsonObject = JSONObject.fromObject(pageModel);
		
		response.getWriter().print(jsonObject.toString());
	}

}
