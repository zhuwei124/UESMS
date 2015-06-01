package com.guoxinan.uesms.web.test;

import com.guoxinan.uesms.dao.VehicleDao;
import com.guoxinan.uesms.model.Vehicle;

public class Test_VehicleDao {
	public static void main(String []args){
		VehicleDao vehicleDao = new VehicleDao();
		//System.out.println(vehicleDao.deleteVehicleById(1));
		Vehicle vehicle = vehicleDao.getVehicleById(1);
		vehicle.setVehicleId(2);
		
		System.out.println(vehicleDao.insertVehicle(vehicle));
	}
}
