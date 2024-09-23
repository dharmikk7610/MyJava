package udo;

import java.io.Serializable;
import java.util.Scanner;

public class student1 implements Serializable{
	
	private int rno;
	private String name;
	private int std;
	
	public student1(int rno, String name, int std) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public student1() {
		// TODO Auto-generated constructor stub
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
	
	public void scan()
	{
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter a rno:");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name:");
		name = sc.nextLine();
		System.out.println("Enter a std:");
		std = sc.nextInt();
		
	}
	public void display()
	{
		System.out.println(rno+" "+name+" "+std);
	}
	

}
