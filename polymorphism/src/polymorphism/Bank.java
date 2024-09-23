package polymorphism;

import java.util.Scanner;

public class Bank {

		void account()
		{
			System.out.println("hello our bank");
		}
		public static void main(String args[])
		{
			Bank b = new Bank();  
			Scanner sc = new Scanner( System.in);
			System.out.println("Enter a choice :");
			System.out.println("1>BOB:");
			System.out.println("2>SBI :");
			System.out.println("3>HDFC :");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
			
				b =new Bob();//upcasting : parents refarnce and child objects
				//super.account();
				b.account();
				
				Bob p = (Bob)b;  //downcasting : 
				p.pay();
				
				
				break;
			case 2:
				b =new Sbi();
				b.account();
				break;
			case 3:
				b =new Hdfc();
				b.account();
				break;
			}
			
		}
}
class Bob extends Bank
{
	void account()
	{
		super.account();   //super keyword
		System.out.println("BOB BANK ");
	}
	void pay()
	{
		System.out.println("1000");
	}
}
class Sbi extends Bank
{
	void account()
	{
		System.out.println("SBI BANK ");
	}
	void pay()
	{
		System.out.println("2000");
	}
}

class Hdfc extends Bank
{
	void account()
	{
		System.out.println("HDFC BANK ");
	}
	void pay()
	{
		System.out.println("3000");
	}
}

