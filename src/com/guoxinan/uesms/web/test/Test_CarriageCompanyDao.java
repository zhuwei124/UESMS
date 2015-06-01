package com.guoxinan.uesms.web.test;

import com.guoxinan.uesms.dao.CarriagecompanyDao;
import com.guoxinan.uesms.model.Carriagecompany;

public class Test_CarriageCompanyDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarriagecompanyDao carriagecompanyDao = new CarriagecompanyDao();
		
		System.out.println(carriagecompanyDao.getCarriagecompanyById(1));
		
		Carriagecompany carriagecompany = new Carriagecompany();
		//carriagecompany.setCarriageCompanyId(2);
		carriagecompany.setCarriageCompanyAddress("weqewrer");
		carriagecompany.setCarriageCompanyCorporateRepresentative("233fdsfs");
		carriagecompany.setCarriageCompanyIsDeleted(true);
		carriagecompany.setCarriageCompanyStatus("open");
		carriagecompany.setCarriageCompanyZipCode("erwrw");
		carriagecompany.setVehicleId(1);
		carriagecompanyDao.insertcarriagecompany(carriagecompany);

	}

}
