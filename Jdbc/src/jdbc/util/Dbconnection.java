package jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection{
	
	// 1) Make credentials


	private static final String  URLNAME = "jdbc:mysql://localhost:3306/royal";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
//	2> create a getconnection method:
	
	public static Connection  getConnection() {
		
		Connection conn =null;
		
		try {
//			3>Load Driver Class 
			Class.forName(DRIVERCLASS);
			
			// 4) pass credentials into DriverManager's getConnection method

			conn = DriverManager.getConnection(	URLNAME,PASSWORD ,USERNAME);
			
			// 5) validate connection object
			if(conn!=null) {
				System.out.println("database connected:"+conn);
			}
			else {
				System.out.println("database not connected..");
			}
			
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return conn;
		
	}
	
	public static void main(String[] args) {
		
		Dbconnection.getConnection();
	}
	
	
	
}
