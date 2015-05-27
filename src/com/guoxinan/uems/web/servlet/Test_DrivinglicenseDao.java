package com.guoxinan.uems.web.servlet;

import com.guoxinan.uems.dao.DrivinglicenseDao;
import com.guoxinan.uems.dao.UserDao;
import com.guoxinan.uems.model.Drivinglicense;
import com.guoxinan.uems.model.User;

public class Test_DrivinglicenseDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrivinglicenseDao drivinglicenseDao  = new DrivinglicenseDao();
		
		/////////
		Drivinglicense drivinglicense = drivinglicenseDao.getDrivinglicenseById(1);
		System.out.println(drivinglicense.getDriveId());
		drivinglicense.setDrivingLicenseId(2);
		
		System.out.println(drivinglicenseDao.insertDrivinglicense(drivinglicense));

		
		

	}

}
