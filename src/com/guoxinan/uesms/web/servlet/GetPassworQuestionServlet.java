package com.guoxinan.uesms.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.guoxinan.uesms.dao.PasswordquestionDao;
import com.guoxinan.uesms.model.Passwordquestion;

@WebServlet("/GetPassworQuestionServlet")
public class GetPassworQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetPassworQuestionServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PasswordquestionDao passwordquestionDao = new PasswordquestionDao();
		Passwordquestion passwordquestion =  passwordquestionDao.getPasswordquestionById(Integer.parseInt(request.getParameter("passwordQuestionId")));
		JSONObject jsonObject = JSONObject.fromObject(passwordquestion);
		response.getWriter().print(jsonObject.toString());
	}

}
