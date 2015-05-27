package com.guoxinan.uems.web.servlet;

import com.guoxinan.uems.dao.VehicleDao;
import com.guoxinan.uems.model.Vehicle;

public class Test_VehicleDao {
	public static void main(String []args){
		VehicleDao vehicleDao = new VehicleDao();
		//System.out.println(vehicleDao.deleteVehicleById(1));
		Vehicle vehicle = vehicleDao.getVehicleById(1);
		vehicle.setVehicleId(2);
		
		System.out.println(vehicleDao.insertVehicle(vehicle));
	}
}
