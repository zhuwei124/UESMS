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
	
	//通过ID删除station
	public Boolean deleteDriverById(int id){
		Boolean result = false;
		
		String sql = "delete from station where station_id = ?";
		String []paras = {id + ""};
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}
	
	//插入station
	public boolean insertStation(Station station){
		boolean result = false;
		//判断是否存在
		if(this.getStationById(station.getStationId()).getStationId() != null){
			return result;
		}
		//处理是否删除的值
		String isDeleted = "0";
		if(station.getStstionIsDeleted()){
			isDeleted = "1";
		}
		
		String sql = "insert into station value(?,?,?,?,?,?,?,?,?)";
		String [] paras = {
				station.getStationId() + "",
				station.getCarriageCompanyId() + "",
				station.getStationCode() + "",
				station.getStationCorporateRepresentative() + "",
				station.getStationAddress() + "",
				station.getStationZipCode() + "",
				station.getStationStatus() + "",
				station.getStstionBriefIntroduction() + "",
				isDeleted
		};
		
		if(sqlHelper.executeUpdate(sql, paras) > 0){
			result = true;
		}
		
		return result;
	}

}
 