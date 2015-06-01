package com.guoxinan.uesms.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 晚上22:21:00 
 * 类说明 ：处理权限数据与数据库之间的相互管理
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.guoxinan.uesms.model.Limitt;
import com.guoxinan.uesms.model.PageModel;
import com.guoxinan.uesms.model.User;
import com.guoxinan.uesms.util.SqlHelper;

public class LimitDao {
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
	
	//分页查询,得到全部user
	public PageModel getLimitList(int pageNo,int pageSize){
		PageModel pageModel = new PageModel();
		ArrayList<Limitt> limitList = new ArrayList<Limitt>();
		
		String sql = "select * from limitt where limit_isDeleted = ? limit ? , ?";
		String [] paras = {
				"0",
				((pageNo-1) * pageSize) + "",
				(pageNo * pageSize) + ""
				};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				Limitt limit = new Limitt();  
				limit.setLimitId(rs.getInt("limit_id"));
				limit.setLimitName(rs.getString("limit_name"));
				limit.setLimitStatus(rs.getString("limit_status"));
				limit.setLimitLevel(rs.getInt("limit_level"));
				limit.setLimitIsDeleted(rs.getBoolean("limit_isDeleted"));
	            limitList.add(limit);
			}
			
			//查询总记录数
			String sql1 = "select count(*) from limitt where limit_isDeleted = ?";
			String [] paras1 = {"0"}; 
			ResultSet rs1 = sqlHelper.executeQuery(sql1, paras1);
            int total=0;
            
            if(rs1.next()){ 
                total=rs1.getInt(1); 
            } 
            pageModel.setPageNo(pageNo); 
            pageModel.setPageSize(pageSize); 
            pageModel.setTotalRecords(total); 
            pageModel.setList(limitList); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pageModel;
		
	}
		
	//通过id得到Limit
	public Limitt getLimitById(int id){
		Limitt limit = new Limitt();
		
		String sql = "select * from limitt where limit_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				limit.setLimitId(rs.getInt("limit_id"));
				limit.setLimitName(rs.getString("limit_name"));
				limit.setLimitStatus(rs.getString("limit_status"));
				limit.setLimitLevel(rs.getInt("limit_level"));
				limit.setLimitIsDeleted(rs.getBoolean("limit_isDeleted"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return limit;
	}
	
	//插入Limit
	public Boolean insertLimit(Limitt limit){
		Boolean result = false;
		
		String sql = "insert into limitt values (?,?,?,?,?)";
		String [] paras = {
				null,
				limit.getLimitName(),
				limit.getLimitStatus(),
				limit.getLimitLevel() + "",
				"0"
		};
		
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//通过id更新limit
	public Boolean updateLimitById(int id, Limitt limit){
		Boolean result = false;
		
		return result;
	}
	
	//通过id删除Limit
	public Boolean deleteLimitById(int id){
		Boolean result = false;
		
		String sql = "delete from limitt where limit_id = ?";
		String [] paras = {id + ""};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//通过id逻辑删除limit
	public Boolean logicDeleteLimitById(int id){
		Boolean result = false;
		
		String sql = "update limitt set limit_isDeleted = ? where limit_id = ?";
		String paras[] = {
				"1",
				id + ""
				};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	

}
