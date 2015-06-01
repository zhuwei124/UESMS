/*
 * 对数据库操作的类
 * 对数据库的操作，就是crud
 * 调用存储过程
 * */
package com.guoxinan.uesms.util;
import java.util.*;
import java.sql.*;
public class SqlHelper {
	//定义需要的对象
	Connection ct=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://127.0.0.1:3306/uesms";
	String user="guoxinan";
	String passwd="123456";
	
	//构造函数，初始化ct
	public SqlHelper()
	{
		try {
			//加载驱动
			Class.forName(driver);
			//得到连接
			ct=DriverManager.getConnection(url,user,passwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//[]paras，通过?赋值方式可以防止漏洞注入方式，保证安全性
	public ResultSet executeQuery(String sql,String []paras)
	{
		try {
			ps=ct.prepareStatement(sql);
			//对sql的参数赋值
			for(int i=0;i<paras.length;i++)
			{
				//如果为纯数字时候setInt
				if(paras[i].matches("[0-9]+")){
					ps.setInt(i+1, Integer.parseInt(paras[i]));
				}else {
					ps.setString(i+1, paras[i]);
				}				
			}
			//执行查询
			rs=ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//返回结果集
		return rs;
	}
	
	//更新
	public int executeUpdate(String sql,String []paras)
	{
		int count=0;
		try {
			ps=ct.prepareStatement(sql);
			//对sql的参数赋值
			for(int i=0;i<paras.length;i++)
			{
				ps.setString(i+1, paras[i]);
			}
			//执行查询
			//System.out.println(ps);
			count=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//返回结果集
		return count;
	}
	//关闭资源的方法
	public void close()
	{
		try {
			if(rs!=null) rs.close();
			if(ps!=null) ps.close();
			if(ct!=null) ct.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
