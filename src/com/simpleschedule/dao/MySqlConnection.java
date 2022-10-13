package com.simpleschedule.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/db_diary?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "root";
	
	
	public Connection toConnect() {
		Connection con = null;
			
		try {
		 	Class.forName(driver);
		    con = DriverManager.getConnection(url,user,password);
		    return con;
		    	 
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}		
	}
	
	
	public void connectionTest() {
		try {
			Connection con = toConnect();
			System.out.println(con);
			con.close();
				
		} catch (Exception e) {
			System.out.println(e);
		}
	}	
}