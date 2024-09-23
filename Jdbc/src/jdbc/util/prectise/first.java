package jdbc.util.prectise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class first {
		public void  insertstudent() throws Exception   
		{
			int row =0;
			Statement stmt = null;
			String insertQuery = "INSERT INTO  student (name,std,marks) values('rotal','12',44)";
			// load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/royal","root","root");
			
			// create sql connection
				
				stmt  = conn.createStatement();
				row = stmt.executeUpdate(insertQuery);
				
				if(row>0)
				{
					System.out.println("sucess..");
				}
				else
				{
					System.out.println("fail...");
				}
			
		}
		public static void main(String[] args) {
			first s1 = new first();
			try {
				s1.insertstudent();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
