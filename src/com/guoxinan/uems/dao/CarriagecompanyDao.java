package com.guoxinan.uems.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 下午16:21:00 
 * 类说明 ：处理承运方数据与数据库之间的相互管理
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Carriagecompany;
import com.guoxinan.uems.util.SqlHelper;

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
	
	//插入carriagecompany
	public Boolean insertcarriagecompany(Carriagecompany carriagecompany){
		Boolean result = false;
		
		//如果已经存在则直接返回
		if(this.getCarriagecompanyById(carriagecompany.getCarriageCompanyId()).getCarriageCompanyId() != null){
			return result;
		}
		String isDeleted = "0";
		if(carriagecompany.getCarriageCompanyIsDeleted()){
			isDeleted = "1";
		}
		
		String sql = "insert into carriagecompany values (?,?,?,?,?,?,?)";
		String [] paras = {
				carriagecompany.getCarriageCompanyId()+"",
				carriagecompany.getVehicleId()+"",
				carriagecompany.getCarriageCompanyCorporateRepresentative(),
				carriagecompany.getCarriageCompanyAddress(),
				carriagecompany.getCarriageCompanyZipCode(),
				carriagecompany.getCarriageCompanyStatus(),
				isDeleted
				
		};
		if (sqlHelper.executeUpdate(sql, paras)>0) {
			result = true;
		}
		return result;
	}

}
