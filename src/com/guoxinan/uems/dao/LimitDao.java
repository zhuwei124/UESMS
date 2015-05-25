package com.guoxinan.uems.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 晚上22:21:00 
 * 类说明 ：处理权限数据与数据库之间的相互管理
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Limit;
import com.guoxinan.uems.util.SqlHelper;

public class LimitDao {
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
		
	//通过id得到Limit
	public Limit getLimitById(int id){
		Limit limit = new Limit();
		
		String sql = "select * from limitt where limit_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				limit.setLimitId(id);
				limit.setLimitName(rs.getString("limit_name"));
				limit.setLimitStatus(rs.getString("limit_status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return limit;
	}
	
	//插入Limit
	public Boolean insertLimit(Limit limit){
		Boolean result = false;
		
		//判断是否已经存在
		if(this.getLimitById(limit.getLimitId()).getLimitId() != null){
			return result;
		}
		
		String sql = "insert into limitt values (?,?,?)";
		String [] paras = {
				limit.getLimitId().toString(),
				limit.getLimitName(),
				limit.getLimitStatus()
		};
		
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}
	
	//通过id更新limit
	public Boolean updateLimitById(int id, Limit limit){
		Boolean result = false;
		
		if(this.deleteLimitById(id)){
			result = this.insertLimit(limit);
		}
		
		return result;
	}
	
	//通过id删除Limit
	public Boolean deleteLimitById(int id){
		Boolean result = false;
		
		String sql = "delete from limitt where limit_id = ?";
		String [] paras = {id + ""};
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}

}
