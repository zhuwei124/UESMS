package com.guoxinan.uems.web.servlet;

import com.guoxinan.uems.dao.LimitDao;
import com.guoxinan.uems.model.Limit;

public class Test_LimitDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LimitDao limitDao = new LimitDao();
		Limit limit = limitDao.getLimitById(1);
		System.out.println(limit.getLimitName());
	}

}
