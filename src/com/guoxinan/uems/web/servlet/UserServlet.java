package com.guoxinan.uems.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.catalina.Session;
import org.junit.Test;

import com.guoxinan.uems.dao.LimitDao;
import com.guoxinan.uems.dao.UserDao;
import com.guoxinan.uems.model.Limit;
import com.guoxinan.uems.model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LimitDao limitDao = new LimitDao();
		Limit limit = limitDao.getLimitById(1);
		JSONObject jsonObject = JSONObject.fromObject(limit);
		response.getWriter().print(jsonObject.toString());
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
