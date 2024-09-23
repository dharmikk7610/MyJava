package doubts;

import java.util.Scanner;

public class a
{
	public static void main(String args[])
	{

		Bank b = null;
		System.out.println("1>>SBI");
		System.out.println("1>>axis");
		System.out.println("1>>BOB");
		System.out.println("Enter a choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			b = new SBI();
			b.getroi();
			break;
			
		case 2:
			b = new Axis();
			b.getroi();
			break;
			
		case 3:
			b = new Bob();
			b.getroi();
			break;
			
		}
	}
}

