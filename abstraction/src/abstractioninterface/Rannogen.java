package abstractioninterface;

import java.util.Scanner;

interface Allmehod{
	void method();
}

class Rannogen implements Allmehod {

	public void method()
	{
		System.out.println("How many number generate:");
		Scanner sc = new Scanner( System.in);
		int no = sc.nextInt();
		
		System.out.println("new random generete no...");
		
		for(int i=1;i<=no;i++)
		{
			int x=(int)(Math.random()*1000000)+1;
			System.out.println("mn"+x);
		}
		
		
	}
	public static void main(String[] args) {
		Rannogen rg = new Rannogen();
		rg.method();
	}
	
}
