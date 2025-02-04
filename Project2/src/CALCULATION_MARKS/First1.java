package CALCULATION_MARKS;

//import java.lang.reflect.Array;
import java.util.Scanner;

public class First1 {

	
	public static void main(String[] args) {
		String name;
		char grade;
		int mmarks , emarks,pmarks,smarks,sum=0,pr;
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter a your name:");
		 name = sc.nextLine();
		System.out.println("Enter a marks of maths subject:");
		mmarks = sc.nextInt();
		if(mmarks>100)
		{
			System.out.println("marks is not considerd..please check..");
			mmarks = 0;
			return;
		}
		else {
			sum = sum+mmarks;
		}
		
		System.out.println("Enter a marks of English subject:");
		emarks = sc.nextInt();
		if(emarks>100)
		{
			System.out.println("marks is not considerd..please check..");
			emarks = 0;
			return;
		}
		else {
			sum = sum+emarks;
		}
		System.out.println("Enter a marks of Science subject:");
		smarks = sc.nextInt();
		if(smarks>100)
		{
			System.out.println("marks is not considerd..please check..");
			smarks = 0;
			return;
		}
		
			else {
				sum = sum+smarks;
			}
		
		System.out.println("Enter a marks of pps subject:");
		pmarks = sc.nextInt();
		if(pmarks>100)
		{
			System.out.println("marks is not considerd..please check..");
			pmarks = 0;
			return;
		}
		else {
			sum = sum+pmarks;
		}
		
		pr = sum%100;
		if(pr>=90)
		{
			grade = 'A';
		}
		else if(pr>=70 && pr<90)
		{
			grade = 'B';
		}
		else if(pr>=50 && pr<70)
		{
			grade = 'C';
		}
		else if(pr>=35 && pr<50)
		{
			grade = 'D';
		}
		else {
			grade = 'F';
			//System.out.println("you fail in exam..");
		}
		
		System.out.println("....Your Result...");
	
		System.out.println(name);
		System.out.println("sum pr grade");
		System.out.print(sum );
		System.out.print(" ");
		System.out.print(pr );
		System.out.print(" ");
		System.out.println(grade);
		
		
	}
}
