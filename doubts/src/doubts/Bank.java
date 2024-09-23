package doubts;

import java.util.Scanner;

public interface Bank {
		int no= 10;
		void getroi();
		
}

class SBI implements Bank

{

	public void getroi()
	{
		System.out.println("rate of intrest = 6%");
		
	}
}

class Axis implements Bank
{

	public void getroi()
	{
		System.out.println("rate of intrest = 8%");
		
	}
}

class Bob implements Bank
{

	public void getroi()
	{
		System.out.println("rate of intrest = 5%");
		
	}
}



