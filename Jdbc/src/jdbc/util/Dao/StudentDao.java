package jdbc.util.Dao;

import java.sql.Connection;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.util.Dbconnection;
import jdbc.util.Dao.studentbeen.Studentbeen;

public class StudentDao {
	
	public int  insertStudent(String name ,String std,int marks)
	{
		int row =0;
		String insertQuery = "INSERT INTO student(name ,std,marks) VALUES ('"+name+"','"+std+"','"+marks+"')";
		Statement stmt = null;
		Connection conn = Dbconnection.getConnection();
		
		if(conn!=null)
		{
			//create statement object
			try {
				stmt = conn.createStatement();
				
			//exicute sql 	
				row = stmt.executeUpdate(insertQuery);
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("db not connected..");
		}
		return row;
	}
	
	
	
	public static void main(String[] args) {
		StudentDao s = new StudentDao();
		
		Scanner sc = new Scanner( System.in);
		
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		System.out.println("Enter a std:");
		String std = sc.nextLine();
		System.out.println("Enter a marks:");
		int  marks = sc.nextInt();
		
		
		
		int row = s.insertStudent(name,std,marks);
		if(row>0)
		{
			System.out.println("data is inserted...");
		}
		else
		{
			System.out.println("data not inserted..");
		}
		
		s.insertStudent(name,std,marks);
		
		
	}

	
	

}

