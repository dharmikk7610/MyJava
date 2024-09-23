package jdbc.util.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Result;

//import jdbc.util.Dao.studentbeen.*;
import jdbc.util.Dao.studentbeen.Studentbeen;

import jdbc.util.Dbconnection;

public class StudentDao2 {

	public int insertStudent(Studentbeen sbeen) {
		int row = 0;
		String insertQuery = "INSERT INTO student(name ,std,marks) VALUES ('" + sbeen.getName() + "','" + sbeen.getStd()
				+ "','" + sbeen.getMarks() + "')";
		Statement stmt = null;
		Connection conn = Dbconnection.getConnection();

		if (conn != null) {
			// create statement object
			try {
				stmt = conn.createStatement();

				// exicute sql
				row = stmt.executeUpdate(insertQuery);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("db not connected..");
		}
		return row;
	}

	// delete data_base................

	public int deletestudent(int rno) {
		Statement stmt = null;
		int row = 0;
		String deleteQuery = "delete from student where rno=" + rno;
		System.out.println(deleteQuery);
		Connection conn = Dbconnection.getConnection();
		try {
			stmt = conn.createStatement();
			row = stmt.executeUpdate(deleteQuery);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}// end delete method

	public int updatestudent(Studentbeen sbeen, int rno) {

		int row = 0;
		Statement stmt = null;
		String updateQuery = "update student set name='" + sbeen.getName() + "', std='" + sbeen.getStd() + "',marks='"
				+ sbeen.getMarks() + "' where rno=" + rno;
		System.out.println(updateQuery);
		Connection conn = new Dbconnection().getConnection();

		try {
			stmt = conn.createStatement();
			row = stmt.executeUpdate(updateQuery);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return row;

	}

	public ArrayList<Studentbeen> getalluser() {

		ArrayList<Studentbeen> listobj = new ArrayList<>();

		ResultSet rs = null;

		String selectQuery = "SELECT * FROM student ";
		Connection conn = Dbconnection.getConnection();
		Statement stmt = null;

		Studentbeen sbeen = null;

		try {

			stmt = conn.createStatement();
			rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				
				int rno = rs.getInt("rno");
				String name = rs.getString("name");
				String std = rs.getString("std");
				int marks = rs.getInt("marks");
				
				sbeen = new Studentbeen(rno , name ,std,marks);
				listobj.add(sbeen);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return listobj;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentDao2 s = new StudentDao2();
		ArrayList< Studentbeen> listobj = s.getalluser();
		
		for(int i=0;i<listobj.size();i++)
		{
			Studentbeen s2 = listobj.get(i);
			System.out.println(s2.getRno()+" "+s2.getName()+" "+s2.getStd()+" "+s2.getMarks());
		}

		/***
		 * ----------------update data in data base ----------------------------
		 * 
		 * 
		 * Scanner sc = new Scanner( System.in); System.out.println("Enter Rno Which you
		 * want update Student record : "); int rno = sc.nextInt(); sc.nextLine();
		 * System.out.println("Enter Name : "); String name = sc.nextLine();
		 * System.out.println("Enter Std : "); String std = sc.nextLine();
		 * System.out.println("Enter Marks : "); int marks = sc.nextInt();
		 * 
		 * Studentbeen sbeen = new Studentbeen(0, name, std, marks);
		 * 
		 * StudentDao2 s = new StudentDao2(); int row = s.updatestudent(sbeen,rno); if
		 * (row > 0) { System.out.println("data is upadated..."); } else {
		 * System.out.println("data not upadated.."); }
		 */

		/******************
		 * .............................. delete student ..........
		 * 
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter a Rno want you
		 * delete..:"); int rno = sc.nextInt();
		 * 
		 * //Studentbeen seen = new Studentbeen(); StudentDao2 s = new StudentDao2();
		 * int row;
		 * 
		 * row = s.deletestudent(rno);
		 * 
		 * if (row > 0) { System.out.println("data is daleted..."); } else {
		 * System.out.println("data not deleted.."); }
		 */

		/*****
		 * *******insert the data in data_base******
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a name:"); String name = sc.nextLine();
		 * System.out.println("Enter a std:"); String std = sc.nextLine();
		 * System.out.println("Enter a marks:"); int marks = sc.nextInt();
		 * 
		 * Studentbeen sbeen = new Studentbeen(0, name, std, marks);
		 * 
		 * StudentDao2 s = new StudentDao2();
		 * 
		 * int row = s.insertStudent(sbeen); if (row > 0) { System.out.println("data is
		 * inserted..."); } else { System.out.println("data not inserted.."); }
		 */

	}// end of main

}// end of class
