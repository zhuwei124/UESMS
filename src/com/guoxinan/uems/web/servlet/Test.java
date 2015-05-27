package com.guoxinan.uems.web.servlet; 

import net.sf.json.JSONObject;

import com.guoxinan.uems.dao.LimitDao;
import com.guoxinan.uems.dao.UserDao;
import com.guoxinan.uems.model.Limit;
import com.guoxinan.uems.model.User;

/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月26日 下午4:43:39 
 * 类说明 
 */
public class Test {
	
public static void main(String[] args) {
	LimitDao limitDao = new LimitDao();
	Limit limit = limitDao.getLimitById(1);
	JSONObject jsonObject = JSONObject.fromObject(limit);
	System.err.println(jsonObject);
}

}
 