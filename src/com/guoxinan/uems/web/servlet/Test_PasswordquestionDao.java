package com.guoxinan.uems.web.servlet;

import com.guoxinan.uems.dao.PasswordquestionDao;
import com.guoxinan.uems.model.Passwordquestion;

public class Test_PasswordquestionDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordquestionDao passwordquestionDao = new PasswordquestionDao();
//		Boolean r = passwordquestionDao.deletePasswordquestion(1);
//		System.out.println(r);
		Passwordquestion passwordquestion = passwordquestionDao.getPasswordquestionById(1);
		passwordquestion.setPasswordQuestionId(2);
		
		System.out.println(passwordquestionDao.insertPasswordquestion(passwordquestion));
		
	}

}
