package com.guoxinan.uesms.web.test;

import com.guoxinan.uesms.dao.DrivinglicenseDao;
import com.guoxinan.uesms.model.Drivinglicense;
import com.guoxinan.uesms.model.User;

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
