import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		boolean flag =  false ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No:");
		int no = sc.nextInt();
		System.out.println("Enter a No2:");
		int no2 = sc.nextInt();
		
		
		for(int i=no;i<=no2;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = true ;
					break ;
				}
			}
			if(flag!=true)
			{
				System.out.println(i+" is prime");
			}
			flag = false ;
		}
	}
}
