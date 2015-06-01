package com.guoxinan.uesms.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月12日 下午14:21:00 
 * 类说明 ：处理驾驶证数据与数据库之间的相互管理
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uesms.model.Drivinglicense;
import com.guoxinan.uesms.util.SqlHelper;

public class DrivinglicenseDao {
	
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
	
	//通过id得到Drivinglicense
	public Drivinglicense getDrivinglicenseById(int id){
		Drivinglicense drivinglicense = new Drivinglicense();
		
		String sql = "select * from drivinglicense where drivingLicense_id = ?";
		String [] paras = {id+""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				drivinglicense.setDriveId(id);
				drivinglicense.setDrivingLicenseEnd(rs.getString("drivingLicense_end"));
				drivinglicense.setDrivingLicenseId(rs.getInt("drivingLicense_id"));
				drivinglicense.setDrivingLicenseIssueDate(rs.getString("drivingLicense_issueDate"));
				drivinglicense.setDrivingLicenseRecord(rs.getInt("drivingLicense_record"));
				drivinglicense.setDrivingLicenseStart(rs.getString("drivingLicense_start"));
				drivinglicense.setDrivingLicenseStatus(rs.getString("drivingLicense_status"));
				drivinglicense.setDrivingLicenseVehicleTtype(rs.getString("drivingLicense_vehicleTtype"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return drivinglicense;
	}
	
	//插入Drivinglicense
	public Boolean insertDrivinglicense(Drivinglicense drivinglicense){
		Boolean result = false;
		
		String sql = "insert into drivinglicense values (?,?,?,?,?,?,?,?)";
		String [] paras = {
				null,
				drivinglicense.getDriveId() + "",
				drivinglicense.getDrivingLicenseVehicleTtype(),
				drivinglicense.getDrivingLicenseStatus(),
				drivinglicense.getDrivingLicenseRecord() + "",
				drivinglicense.getDrivingLicenseEnd().toString(),
				drivinglicense.getDrivingLicenseStart().toString(),
				"0"
		};
		
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}

	//通过id逻辑删除drivinglicense
		public Boolean logicDeleteDrivinglicenseById(int id){
			Boolean result = false;
			
			String sql = "update drivinglicense set drivinglicense_isDeleted = ? where drivinglicense_id = ?";
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
		public Boolean deleteDivinglicenseById(int id){
			Boolean rs = false;
			
			String sql = "delete from drivinglicense where drivinglicense_id = ?";
			String [] paras = {id+""};
			
			if(sqlHelper.executeUpdate(sql, paras) == 1){
				rs = true;
			}
			
			return rs;
		}

}
