package jdbc.util.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbc.util.Dbconnection;

public class Dao {
	
	public int insert(String name , int std, int marks)
	{
		int row =0;
		String insert  = "INSERT INTO student (name,std,marks) values('"+name+"','"+std+"','"+marks+"') ";
		Connection conn = Dbconnection.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			row = stmt.executeUpdate( insert);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("please check");
			e.printStackTrace();
		}
		
		return row;
		
		
	}

	
	
	public static void main(String[] args) {
		
		Dao d = new Dao();
		Scanner sc = new Scanner( System.in);
//		System.out.println("Enter a rno:");
//		int rno = sc.nextInt();
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		System.out.println("Enter a std:");
		int std = sc.nextInt();
		System.out.println("Enter a marks:");
		int marks = sc.nextInt();
		int row = d.insert(name,std,marks);
	
		if(row>0)
		{
			System.out.println("query is insert sucessfully");
		}
		else
		{
			System.out.println("error..please check??");
		}
	}

}
