package com.guoxinan.uems.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 下午22:30:00 
 * 类说明 
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.User;
import com.guoxinan.uems.util.SqlHelper;

public class UserDao {
	
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
	
	//通过id得到user
	public User getUserById(int id){
		User user = new User();
		String sql = "select * from user where user_id = ?";
		String [] paras = {id+""};
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		try {
			while(rs.next()){
				user.setUserId(rs.getInt("user_id"));				
				user.setPasswordQuestionId(rs.getInt("passwordQuestion_id"));
				user.setLimitId(rs.getInt("limit_id"));
				user.setUserSystemNumber(rs.getInt("user_systemNumber"));
				user.setUserName(rs.getString("user_name"));
				user.setUserSex(rs.getString("user_sex"));
				user.setUserIdCard(rs.getString("user_idCard"));
				user.setUserTellNumber(rs.getString("user_tellNumber"));
				user.setUserBirthday(rs.getDate("user_birthday"));
				user.setUserMail(rs.getString("user_mail"));
				user.setUserAddress(rs.getString("user_address"));
				user.setUserQq(rs.getString("user_qq"));
				user.setUserStatus(rs.getString("user_status"));
				user.setUserPassword(rs.getString("user_password"));
				user.setUserIsDeleted(rs.getBoolean("user_isDeleted"));				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return user;		
	}
	
	//插入user
	public Boolean insertUser(User user){
		Boolean rs = false;
		
		//如果已经存在则直接返回
		if(this.getUserById(user.getUserId()).getUserId() != null){
			return rs;
		}
		String isDeleted = "0";
		if(user.getUserIsDeleted()){
			isDeleted = "1";
		}
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String [] paras = {
				user.getUserId()+"",
				user.getPasswordQuestionId()+"",
				user.getLimitId()+"",
				user.getUserSystemNumber()+"",
				user.getUserName(),
				user.getUserSex(),
				user.getUserIdCard(),
				user.getUserTellNumber(),
				user.getUserBirthday().toString(),
				user.getUserMail(),
				user.getUserAddress(),
				user.getUserQq(),
				user.getUserStatus(),
				user.getUserPassword(),
				isDeleted,
		};
		
		if(sqlHelper.executeUpdate(sql, paras)>0){
			rs = true;
		}
		
		return rs;		
	}
	
	//通过id删除user
	public Boolean deleteUserById(int id){
		Boolean rs = false;
		
		String sql = "delete from user where user_id = ?";
		String [] paras = {id+""};
		
		if(sqlHelper.executeUpdate(sql, paras)>0){
			rs = true;
		}
		
		return rs;
	}
	
	//通过id更新user
		public Boolean updateUserById(int id,User user){
			Boolean rs = false;
			
			if(this.deleteUserById(id)){
				rs = this.insertUser(user);
			}
			
			return rs;
		}
	
}