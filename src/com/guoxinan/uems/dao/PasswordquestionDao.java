package com.guoxinan.uems.dao; 

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Driver;
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
	
	//通过ID删除Passwordquestion
	public Boolean deletePasswordquestion(int id){
		Boolean result = false;
		
		String sql = "delete from passwordquestion where passwordquestion_id = ?";
		String [] paras = {id + ""};
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}
	//插入passwordword
	public Boolean insertPasswordquestion (Passwordquestion passwordquestion){
		Boolean result = false;
		
		//判断是否存在
		if(this.getPasswordquestionById(passwordquestion.getPasswordQuestionId()).getPasswordQuestionId() != null){
			return result;
		}
		
		//处理是否删除的值
		String isDeleted = "0";
		if(passwordquestion.getPasswordQuestionIsDeleted()){
			isDeleted = "1";
		}
		
		String sql = "insert into passwordquestion values (?,?,?,?)";
		String [] paras = {
				passwordquestion.getPasswordQuestionId() + "",
				passwordquestion.getPasswordQuestionContent() + "",
				passwordquestion.getPasswordQuestionAnswer() + "",
				isDeleted
		};
		
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		return result;
	}

}
 