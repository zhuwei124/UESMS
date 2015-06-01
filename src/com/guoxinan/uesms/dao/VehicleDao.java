package com.guoxinan.uesms.dao; 

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uesms.model.Vehicle;
import com.guoxinan.uesms.util.SqlHelper;

/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月22日 下午6:17:16 
 * 类说明 :管理车辆数据和数据库之间的交换
 */
public class VehicleDao {
	
	//创建sqlHelper
	SqlHelper sqlHelper = new SqlHelper();
	
	//通过id得到Vehicle
	public Vehicle getVehicleById(int id){
		Vehicle vehicle = new Vehicle();
		
		String sql = "select * from vehicle where vehicle_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				vehicle.setVehicleId(id);
				vehicle.setDriverId(rs.getInt("driver_id"));
				vehicle.setVehicleCarrier(rs.getString("vehicle_carrier"));
				vehicle.setVehicleIsDeleted(rs.getBoolean("vehicle_isDelete"));
				vehicle.setVehicleLocation(rs.getString("vehicle_location"));
				vehicle.setVehicleNumber(rs.getString("vehicle_number"));
				vehicle.setVehicleRemark(rs.getString("vehicle_remark"));
				vehicle.setVehicleRoute(rs.getString("vehicle_route"));
				vehicle.setVehicleStatus(rs.getString("vehicle_status"));
				vehicle.setVehicleType(rs.getString("vehicle_type"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vehicle;
	}
	//通过id逻辑删除vehicle
	public Boolean logicDeleteVehicleById(int id){
		Boolean result = false;
		
		String sql = "update Vehicle set vehicle_isDeleted = ? where vehicle_id = ?";
		String paras[] = {
				"1",
				id + ""
				};
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}
	//通过id删除vehicle
	public Boolean deleteVehicleById(int id){
		Boolean result = false;
		
		String sql = "delete from vehicle where vehicle_id = ?";
		String [] paras = {id + ""};
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		return result;
	}
	//插入vehicle
	public boolean insertVehicle(Vehicle vehicle){
		boolean result = false;
		
		String sql = "insert into vehicle values(?,?,?,?,?,?,?,?,?,?)";
		String [] paras = {
				null,
				vehicle.getDriverId() + "",
				vehicle.getVehicleType() + "",
				vehicle.getVehicleNumber() + "",
				vehicle.getVehicleStatus() + "",
				vehicle.getVehicleRemark() + "",
				vehicle.getVehicleCarrier() + "",
				vehicle.getVehicleRoute() + "",
				vehicle.getVehicleLocation(),
				"0"
		};
		
		if(sqlHelper.executeUpdate(sql, paras) == 1){
			result = true;
		}
		return result;
	}
}
 