import java.util.Scanner;

public class task2 {
	
	
	// find the maximum and  minimum occurring character n given string:  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter a String:");
		String s1 = sc.nextLine();
		int arr [] = new int[200];
		
		
		
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)] = arr[s1.charAt(i)+1];
			
		}
		int max = -1;
		char c = ' ';
		
		for(int i=0;i<s1.length();i++)
		{
			if(max<arr[s1.charAt(i)])
			{
				max= arr[s1.charAt(i)];
				c= s1.charAt(i);
			}
		}
		System.out.println(max+" "+c);
	}
}
