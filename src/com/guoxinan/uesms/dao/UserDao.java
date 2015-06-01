package com.guoxinan.uesms.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 下午22:30:00 
 * 类说明 
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.guoxinan.uesms.model.PageModel;
import com.guoxinan.uesms.model.User;
import com.guoxinan.uesms.util.SqlHelper;

public class UserDao {
	
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
	
	//分页查询,得到全部user
	public PageModel getUserList(int pageNo,int pageSize){
		PageModel pageModel = new PageModel();
		ArrayList<User> userList = new ArrayList<User>();
		
		String sql = "select * from user where user_isDeleted = ? limit ? , ?";
		String [] paras = {
				"0",
				((pageNo-1) * pageSize) + "",
				(pageNo * pageSize) + ""
				};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				User user = new User();  
				user.setUserId(rs.getInt("user_id"));
				user.setLimitId(rs.getInt("limit_id"));
				user.setUserSystemNumber(rs.getInt("user_systemNumber"));
				user.setUserName(rs.getString("user_name"));
				user.setUserSex(rs.getString("user_sex"));
				user.setUserIdCard(rs.getString("user_idCard"));
				user.setUserTellNumber(rs.getString("user_tellNumber"));
				user.setUserBirthday(rs.getString("user_birthday"));
				user.setUserMail(rs.getString("user_mail"));
				user.setUserAddress(rs.getString("user_address"));
				user.setUserQq(rs.getString("user_qq"));
				user.setUserStatus(rs.getString("user_status"));
				user.setUserPassword(rs.getString("user_password"));
				user.setUserIsDeleted(rs.getBoolean("user_isDeleted"));
	            userList.add(user);
			}
			
			//查询总记录数
			String sql1 = "select count(*) from user where user_isDeleted = ?";
			String [] paras1 = {"0"}; 
			ResultSet rs1 = sqlHelper.executeQuery(sql1, paras1);
            int total=0;
            
            if(rs1.next()){ 
                total=rs1.getInt(1); 
            } 
            pageModel.setPageNo(pageNo); 
            pageModel.setPageSize(pageSize); 
            pageModel.setTotalRecords(total); 
            pageModel.setList(userList); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pageModel;
		
	}
	
	//通过id得到user
	public User getUserById(int id){
		User user = new User();
		String sql = "select * from user where user_id = ?";
		String [] paras = {id+""};
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		try {
			while(rs.next()){
				user.setUserId(rs.getInt("user_id"));
				user.setLimitId(rs.getInt("limit_id"));
				user.setUserSystemNumber(rs.getInt("user_systemNumber"));
				user.setUserName(rs.getString("user_name"));
				user.setUserSex(rs.getString("user_sex"));
				user.setUserIdCard(rs.getString("user_idCard"));
				user.setUserTellNumber(rs.getString("user_tellNumber"));
				user.setUserBirthday(rs.getString("user_birthday"));
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
		
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String [] paras = {
				null,
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
				"0",
		};
		
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			rs = true;
		}
		
		return rs;		
	}
	//通过id逻辑删除user
	public Boolean logicDeleteUserById(int id){
		Boolean result = false;
		
		String sql = "update user set user_isDeleted = ? where user_id = ?";
		String paras[] = {
				"1",
				id + ""
				};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//通过id删除user
	public Boolean deleteUserById(int id){
		Boolean rs = false;
		
		String sql = "delete from user where user_id = ?";
		String [] paras = {id+""};
		
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			rs = true;
		}
		
		return rs;
	}
	
	//通过id更新user
		public Boolean updateUserById(int id,User user){
			Boolean rs = false;
			
			return rs;
		}
	
}