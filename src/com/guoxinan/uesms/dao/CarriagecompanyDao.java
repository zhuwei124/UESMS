package com.guoxinan.uesms.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 下午16:21:00 
 * 类说明 ：处理承运方数据与数据库之间的相互管理
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uesms.model.Carriagecompany;
import com.guoxinan.uesms.util.SqlHelper;

public class CarriagecompanyDao {
	
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
		
	//通过id得到Carriagecompany
	public Carriagecompany getCarriagecompanyById(int id){
		Carriagecompany carriagecompany = new Carriagecompany();
		
		String sql = "select * from carriagecompany where carriagecompany_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				carriagecompany.setCarriageCompanyAddress(rs.getString("carriageCompany_address"));
				carriagecompany.setCarriageCompanyCorporateRepresentative(rs.getString("carriageCompany_corporateRepresentative"));
				carriagecompany.setCarriageCompanyId(rs.getInt("carriageCompany_id"));
				carriagecompany.setCarriageCompanyIsDeleted(rs.getBoolean("carriageCompany_isDeleted"));
				carriagecompany.setCarriageCompanyStatus(rs.getString("carriageCompany_status"));
				carriagecompany.setCarriageCompanyZipCode(rs.getString("carriageCompany_zipCode"));
				carriagecompany.setVehicleId(rs.getInt("vehicle_id"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return carriagecompany;
	}
	//通过id逻辑删除carriagecompany
	public Boolean logicDeletecarriagecompany(int id){
		Boolean result = false;
		
		String sql = "update carriagecompany set carriagecompany_isDeleted = ? where carriagecompany_id = ?";
		String paras[] = {
				"1",
				id + ""
				};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//通过id删除carriagecompany
	public Boolean deletecarriagecompany(int id){
		Boolean result = false;
		
		String sql = "delete from carriagecompany where carriagecompany_id = ?";
		String paras[] = {
				id + ""
				};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//插入carriagecompany
	public Boolean insertcarriagecompany(Carriagecompany carriagecompany){
		Boolean result = false;
		
		String sql = "insert into carriagecompany values (?,?,?,?,?,?,?)";
		String [] paras = {
				null,
				carriagecompany.getVehicleId()+"",
				carriagecompany.getCarriageCompanyCorporateRepresentative(),
				carriagecompany.getCarriageCompanyAddress(),
				carriagecompany.getCarriageCompanyZipCode(),
				carriagecompany.getCarriageCompanyStatus(),
				"0"
				
		};
		if (sqlHelper.executeUpdate(sql, paras) == 1) {
			result = true;
		}
		return result;
	}

}
