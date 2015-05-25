package com.guoxinan.uems.dao; 

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Vehicle;
import com.guoxinan.uems.util.SqlHelper;

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
				vehicle.setDriveId(rs.getInt("driver_id"));
				vehicle.setVehicleCarrier(rs.getString("vehicle_carrier"));
				vehicle.setVehicleIsDelete(rs.getBoolean("vehicle_isDelete"));
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
}
 