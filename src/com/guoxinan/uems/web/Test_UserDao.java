package com.guoxinan.uems.web;

import com.guoxinan.uems.dao.UserDao;
import com.guoxinan.uems.model.User;

public class Test_UserDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDao();
		
		/////////
		User user = userDao.getUserById(1);
		//System.out.println(user.getLimitId());
		//System.out.println(user.getUserBirthday());
		////////
		user.setUserId(4);
		System.out.println(userDao.insertUser(user));
		//userDao.deleteUserById(2);
		

	}

}
