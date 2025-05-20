import java.util.Scanner;

public class Prime1 {
	
	public static void main(String[] args) {
		boolean flag =false ;
		Scanner sc = new Scanner( System.in);
		System.out.println("enter a number:");
		int no = sc.nextInt();
	
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=true;
				break;
			}
				
		}
		if(flag)
		{
			System.out.println(no+"is not prime ..");
		}
		else {
			System.out.println(no+"is  prime...");
		}
		
	}

}
