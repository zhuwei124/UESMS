package com.guoxinan.uesms.dao;
/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月18日 下午12:21:00 
 * 类说明 ：处理用户数据与数据库之间的相互管理
 */

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uesms.model.Driver;
import com.guoxinan.uesms.util.SqlHelper;

public class DriverDao {
	
	//创建SqlHelper		
	SqlHelper sqlHelper = new SqlHelper();
	
	//通过id得到Driver
	public Driver getDriverById(int id){
		Driver driver = new Driver();
		String sql = "select * from driver where driver_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				driver.setDriverId(id);
				driver.setDrivingLlicenseId(rs.getInt("drivingLlicense_id"));
				driver.setVehicleId(rs.getInt("vehicle_id"));
				driver.setDriverName(rs.getString("driver_name"));
				driver.setDriverVicheNumber(rs.getString("driver_vicheNumber"));
				driver.setDriverCompany(rs.getString("driver_company"));
				driver.setDriverIsDeleted(rs.getBoolean("driver_isDelete"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return driver;
	}
	
	//通过id逻辑删除Driver
	public Boolean logicDeleteDriverById(int id){
		Boolean result = false;
		
		String sql = "update driver set driver_isDeleted = ? where driver_id = ?";
		String paras[] = {
				"1",
				id + ""
				};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//通过id删除Driver
	public Boolean deleteDriverById(int id){
		Boolean result = false;
		
		String sql = "delete from driver where driver_id = ?";
		String [] paras = {id + ""};
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		
		return result;
	}
	
	//通过id更新Driver
	public Boolean updateDriverById (int id , Driver driver){
		Boolean result = false;
		
		return result;
	}
	
	//插入Driver
	public Boolean insertDriver (Driver driver){
		Boolean result = false;
		
		String sql = "insert into driver values (?,?,?,?,?,?,?)";
		String [] paras = {
				null,
				driver.getDrivingLlicenseId() + "",
				driver.getVehicleId() + "",
				driver.getDriverName(),
				driver.getDriverVicheNumber(),
				driver.getDriverCompany(),
				"0"
		};
		
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		return result;
	}
		
}
