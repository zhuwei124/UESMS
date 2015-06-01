package com.guoxinan.uesms.web.test;

import com.guoxinan.uesms.dao.StationDao;
import com.guoxinan.uesms.model.Station;

public class Test_StationDao {
	public static void main(String[] args){
//		StationDao stationDao = new StationDao();
//		System.out.println(stationDao.deleteDriverById(1));
		
		StationDao stationDao = new StationDao();
		Station station = stationDao.getStationById(1);
		station.setStationId(2);
		
		System.out.println(stationDao.insertStation(station));
	}
}
