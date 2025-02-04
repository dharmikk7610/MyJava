package string;

import java.util.Scanner;

public class Method1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter  a name:");
		 String name = sc.nextLine();
		 String rname ="";
		
		 for(int i=name.length()-1;i>=0;i--)
		 {
			 rname = rname+name.charAt(i);
		 }
		 
		 System.out.println(rname);
		
	}

}
