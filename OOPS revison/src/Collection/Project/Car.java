package Collection.Project;

import java.util.Scanner;

public class Car {
	Scanner sc =new Scanner( System.in);
	private int id;
	private String uname;
	private String cname;
	private String modal;
	private float price;
	private String fual_type;
	private int mileage;
	
	Car()
	{
		
	}

	public Car(String name, String modal, float price, String fual_type, int mileage) {
		this.id = id;
		this.uname = uname;
		this.cname = cname;
		this.modal = modal;
		this.price = price;
		this.fual_type = fual_type;
		this.mileage = mileage;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
	}

	public String getuName() {
		return uname;
	}

	public void setuName(String uname) {
		this.uname = uname;
	}
	public String getcName() {
		return cname;
	}
	
	public void setcName(String cname) {
		this.cname = cname;
	}
	


	public String getModal() {
		return modal;
	}

	public void setModal(String modal) {
		this.modal = modal;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getFual_type() {
		return fual_type;
	}

	public void setFual_type(String fual_type) {
		this.fual_type = fual_type;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void Addcar()
	{
		System.out.println("Enter a ID:");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a your name:");
		uname = sc.nextLine();
		System.out.println("Enter a car name for your choice..:");
		cname = sc.nextLine();
		System.out.println("Enter a car MOdal:");
		modal = sc.nextLine();
		System.out.println("Enter a car Price:");
		price = sc.nextInt();
		sc.nextLine();
		System.out.println("choise fual type(petrol/desial..)");
		fual_type = sc.nextLine();
		mileage = 35;
	}
	
	public void display()
	{
		System.out.println(uname+" "+cname+" "+modal+" "+price+" "+fual_type+" "+mileage);
	}
	
	public void updatedata()
	{
		System.out.println("Enter a your name:");
		uname = sc.nextLine();
		
		System.out.println("Enter a car name for your choice..:");
		cname = sc.nextLine();
		System.out.println("Enter a car MOdal:");
		modal = sc.nextLine();
		System.out.println("Enter a car Price:");
		price = sc.nextInt();
		sc.nextLine();
		System.out.println("choise fual type(petrol/desial..)");
		fual_type = sc.nextLine();
	}

}
