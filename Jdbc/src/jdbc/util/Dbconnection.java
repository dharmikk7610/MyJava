package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	
	private static final String  URLNAME = "jdbc:mysql://localhost:3306/dharmik";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME ="root";
	private static final String PASSWORD ="root";
	
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try {
			Class.forName(DRIVERCLASS);
			
			conn = DriverManager.getConnection(URLNAME,USERNAME,PASSWORD);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(conn!=null) {
			System.out.println("database connected:"+conn);
		}
		else {
			System.out.println("database not connected..");
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		
		Dbconnection.getConnection();
	}
}
