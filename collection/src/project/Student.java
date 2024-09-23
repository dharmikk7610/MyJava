package project;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private int rno;
	private String name;
	private int std;
	private float marks;

	Student() {

	}

	public Student(int rno, String name, int std, float marks) {

		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void Addstudent() {
		
		System.out.println("Enter a rno:");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name: ");
		
		name = sc.nextLine();
//		
		System.out.println("Enter a std:");
		std = sc.nextInt();
		System.out.println("Enter a Marks:");
		marks = sc.nextFloat();

	}

	public void Display() {

		System.out.println(rno + " " + name + " " + std + " " + marks);
	}

	public void updatedata() {
		
		System.out.println("Enter a name: ");
		name = sc.nextLine();
		
		System.out.println("Enter a std:");
		std = sc.nextInt();
		System.out.println("Enter a Marks:");
		marks = sc.nextFloat();
	}
	

}
