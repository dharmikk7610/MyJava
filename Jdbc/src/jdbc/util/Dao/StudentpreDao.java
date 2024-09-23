package jdbc.util.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

import jdbc.util.Dbconnection;
import jdbc.util.Dao.studentbeen.Studentbeen;

public class StudentpreDao {
	
	public int  insertStudent(Studentbeen sbeen)
	{
		int row = 0;
		PreparedStatement pstmt = null; 
		String insertQuery  = "INSERT INTO student (name,std,marks) VALUES (?,?,?)";
		Connection conn = Dbconnection.getConnection();
		try {
			pstmt=conn.prepareStatement(insertQuery);
			
			
			pstmt.setString(1, sbeen.getName());
			pstmt.setString(2, sbeen.getStd());
			pstmt.setInt(3, sbeen.getMarks());
		
			row = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}
	
	public int studentdelete(int rno)
	{
			int row=0;
			PreparedStatement pstmt = null;
			String deleteQuery = "DELETE FROM student WHERE rno = ?";
			Connection conn = Dbconnection.getConnection();
			try {
				pstmt = conn.prepareStatement( deleteQuery);
				pstmt.setInt(1,rno);
				
				row = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return row;
	}
	
	public int studentupdate(int rno,Studentbeen sbeen)
	{
		int row = 0;
		PreparedStatement pstmt = null;
		String updateQuery = "UPDATE student SET name=?,std=?,marks=? WHERE rno =?";
		Connection conn = Dbconnection.getConnection();
		try {
			pstmt = conn.prepareStatement( updateQuery);
			
			pstmt.setString(1, sbeen.getName());
			pstmt.setString(2, sbeen.getStd());
			pstmt.setInt(3, sbeen.getMarks());
			pstmt.setInt(4, rno);
			
			row = pstmt.executeUpdate();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return row;
	}
	
	public ArrayList<Studentbeen> allstudent()
	{
		ResultSet rs = null;
		Studentbeen sbeen = null;
		PreparedStatement pstmt = null;
		ArrayList< Studentbeen > listobj = new ArrayList<>();
		String selectQuery = "SELECT * FROM student";
		Connection conn = Dbconnection.getConnection();
		try {
			pstmt = conn.prepareStatement( selectQuery);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int rno = rs.getInt("rno");
				String name  = rs.getString("name");
				String std = rs.getString("std");
				int marks = rs.getInt("marks");
				
				sbeen = new Studentbeen(rno,name,std,marks);
				listobj.add(sbeen);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listobj;
	}
	public static void main(String[] args) {
		
		
	
		//----------Insert data in dataBAse---------:
	/*	Scanner sc = new Scanner( System.in);
		System.out.println("Enter a name:");
		String name  = sc.nextLine();
		System.out.println("Enter a std:");
		String std  = sc.nextLine();
		System.out.println("Enter a your marks:");
		int marks = sc.nextInt();
		
		Studentbeen sbeen = new Studentbeen( 0,name ,std,marks);
		
		StudentpreDao s = new StudentpreDao();
		int  row = s.insertStudent(sbeen);  
		
		if(row>0)
		{
			System.out.println("Insert done sucessfully....");
		}
		else
		{
			System.err.println("Error.. please check..??");
		}
		
		
	*/
		
		//---------------data delete in data_base--------------
	/*	Scanner sc = new Scanner( System.in);
		System.out.println("Enter a rno you delete..");
		int rno = sc.nextInt();
		
			StudentpreDao s = new StudentpreDao();
			int row = s.studentdelete(rno);
			
			if(row>0)
			{
				System.out.println("delete data sucess fully..");
			}
			else {
				System.out.println("Error ...please try...again ");
			}
			
		*/
		
		// ------------------- data update in  data_base------------
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a rno you want update date:");
		int rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name:");
		String name  = sc.nextLine();
		System.out.println("Enter a std:");
		String std  = sc.nextLine();
		System.out.println("Enter a your marks:");
		int marks = sc.nextInt();
		
		Studentbeen sbeen = new Studentbeen(0,name,std,marks);
		
		StudentpreDao s = new StudentpreDao();
		int row = s.studentupdate(rno,sbeen);
		if(row>0)
		{
			System.out.println("update done sucessfully....");
		}
		else
		{
			System.err.println("Error.. please check..??");
		}*/
		
	// saw allstudent data in data_base---------------------
		StudentpreDao s = new StudentpreDao();
		ArrayList< Studentbeen> listobj = s.allstudent();
		
		for(int i=0;i<listobj.size();i++)
		{
			Studentbeen s2 = listobj.get(i);
			System.out.println(s2.getRno()+" "+s2.getName()+" "+s2.getStd()+" "+s2.getMarks());
		}
		
	
		
	}
	

}
