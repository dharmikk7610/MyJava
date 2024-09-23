
import java.util.Scanner;

public class test {

	void isvalidage(int age ) throws isvalidageexception
	{
		if(age<18)
		{
		throw new isvalidageexception("please enter age above 18/n");
		}
		else
		{
			System.out.println("welcome for vote");
		}
	}
	public static void main(String args[])
	{
		test t = new test();
		Scanner sc = new Scanner( System.in);
		System.out.println("enter a age:");
		int age = sc.nextInt();
		try {
			t.isvalidage(age);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
	}
	
}


