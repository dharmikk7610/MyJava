package collction.prectise;

import java.util.Scanner;


public class Student implements Comparable<Student> {
	Scanner sc = new Scanner( System.in);
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	Student()
	{
		
	}
	
	public Student(Scanner sc, int rno, String name, int std, int marks) {
		
		this.sc = sc;
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
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
	
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		this.marks = marks;
	}
	
	public void Add()
	{
		System.out.println("Enter a rno:");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name: ");
		
		name = sc.nextLine();
//		
		System.out.println("Enter a std:");
		std = sc.nextInt();
		System.out.println("Enter a Marks:");
		marks =sc.nextInt();
		
	}
	
	public void updateStudent()
	{
		System.out.println("Enter a name: ");
		
		name = sc.nextLine();
//		
		System.out.println("Enter a std:");
		std = sc.nextInt();
		System.out.println("Enter a Marks:");
		marks =sc.nextInt();
	}
	
	public void display()
	{
//		System.out.println(11);
		System.out.println(rno + " " + name + " " + std + " " + marks);
	}

	@Override
	public int compareTo(Student s2) {
		if(getmarks()>s2.getmarks())
		{
			return 1;
		}
		else if(getmarks()<s2.getmarks())
		{
			return -1;
		}
		else {
		
		return 0;
		}
	}
	
	
	

}
