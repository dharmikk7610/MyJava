package polymorphism.Vehicles;

import java.util.Scanner;

public class Vehicle {
	void name()
	{
		
	}
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Scanner sc = new Scanner( System.in);
		System.out.println("1>>twvehicle");
		System.out.println("2>>lmvvehicle");
		System.out.println("3>>Hmvvehicle");
		
		System.out.println("Enter a choice:");
		 int choice =  sc.nextInt();
		 
		switch(choice)
		{
		case 1:
			v = new Twvehicle();
			 v.name();
			 
		Twvehicle tv = (Twvehicle)v;
		tv.myinfo();
			 break;
		}
		}

}
