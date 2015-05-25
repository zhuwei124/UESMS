package com.guoxinan.uems.dao; 

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Passwordquestion;
import com.guoxinan.uems.util.SqlHelper;

/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月22日 下午12:21:00 
 * 类说明 ：处理密码问题数据与数据库之间的相互管理
 */
public class PasswordquestionDao {
	
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
	
	//通过id得到Passwordquestion
	public Passwordquestion getPasswordquestionById(int id){
		Passwordquestion passwordquestion = new Passwordquestion();
		
		String sql = "select * from passwordquestion where passwordQuestion_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				passwordquestion.setPasswordQuestionId(id);
				passwordquestion.setPasswordQuestionAnswer(rs.getString("passwordQuestion_answer"));
				passwordquestion.setPasswordQuestionContent(rs.getString("passwordQuestion_content"));
				passwordquestion.setPasswordQuestionIsDeleted(rs.getBoolean("passwordQuestion_isDeleted"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return passwordquestion;
	}

}
 