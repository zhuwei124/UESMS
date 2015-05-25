package com.guoxinan.uems.dao; 

import java.sql.ResultSet;
import java.sql.SQLException;

import com.guoxinan.uems.model.Station;
import com.guoxinan.uems.util.SqlHelper;

/** 
 * @author 朱伟 
 * @version 创建时间：2015年5月22日 下午6:04:09 
 * 类说明 :处理车站数据与数据库之间的相互管理
 */
public class StationDao {
	
	//创建sqlhelper
	SqlHelper sqlHelper = new SqlHelper();
	
	//通过id得到station
	public Station getStationById(int id){
		Station station = new Station();
		
		String sql = "select * from station where station_id = ?";
		String [] paras = {id + ""};
		
		ResultSet rs = sqlHelper.executeQuery(sql, paras);
		
		try {
			while(rs.next()){
				station.setStationId(id);
				station.setCarriageCompanyId(rs.getInt("carriageCompany_id"));
				station.setStationAddress(rs.getString("station_address"));
				station.setStationCode(rs.getString("station_code"));
				station.setStationCorporateRepresentative(rs.getString("station_corporateRepresentative"));
				station.setStationStatus(rs.getString("station_status"));
				station.setStationZipCode(rs.getString("station_zipCode"));
				station.setStstionBriefIntroduction(rs.getString("ststion_briefIntroduction"));
				station.setStstionIsDeleted(rs.getBoolean("ststion_isDeleted"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return station;
	} 

}
 