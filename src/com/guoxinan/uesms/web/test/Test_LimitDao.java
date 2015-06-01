package com.guoxinan.uesms.web.test;

import com.guoxinan.uesms.dao.LimitDao;
import com.guoxinan.uesms.model.Limitt;

public class Test_LimitDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LimitDao limitDao = new LimitDao();
		Limitt limit = limitDao.getLimitById(1);
		System.out.println(limit.getLimitName());
	}

}
