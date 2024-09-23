package prectice;

import java.io.Serializable;
import java.util.Scanner;

public class employees implements Serializable{
	
	private int id;
	private int salary;
	private String name;
	
	public employees()
	{
		
	}

	public employees(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void scan()
	{
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter A ID:");
		 id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a name:");
		name = sc.nextLine();
		sc.nextLine();
		System.out.println("Enter a Salary:");
		 salary = sc.nextInt();
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	

}
