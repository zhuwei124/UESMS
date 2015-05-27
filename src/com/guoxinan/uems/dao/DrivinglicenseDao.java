package com.guoxinan.uems.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月12日 下午14:21:00 
 * 类说明 ：处理驾驶证数据与数据库之间的相互管理
 */
import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Drivinglicense;
import com.guoxinan.uems.util.SqlHelper;

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
				drivinglicense.setDrivingLicenseEnd(rs.getDate("drivingLicense_end"));
				drivinglicense.setDrivingLicenseId(rs.getInt("drivingLicense_id"));
				drivinglicense.setDrivingLicenseIssueDate(rs.getDate("drivingLicense_issueDate"));
				drivinglicense.setDrivingLicenseRecord(rs.getInt("drivingLicense_record"));
				drivinglicense.setDrivingLicenseStart(rs.getDate("drivingLicense_start"));
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
		
		//判断是否已经存在
		if(this.getDrivinglicenseById(drivinglicense.getDrivingLicenseId()).getDrivingLicenseId() != null){
			return result;
		}
		
		String sql = "insert into drivinglicense values (?,?,?,?,?,?,?,?)";
		String [] paras = {
				drivinglicense.getDrivingLicenseId() + "",
				drivinglicense.getDriveId() + "",
				drivinglicense.getDrivingLicenseVehicleTtype(),
				drivinglicense.getDrivingLicenseStatus(),
				drivinglicense.getDrivingLicenseRecord() + "",
				drivinglicense.getDrivingLicenseEnd().toString(),
				drivinglicense.getDrivingLicenseStart().toString(),
				drivinglicense.getDrivingLicenseIssueDate().toString()
		};
		
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}
	//通过id删除Drivinglicense
	//public 

}
