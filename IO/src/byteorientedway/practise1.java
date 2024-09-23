package byteorientedway;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class practise1 {
	
	

	public static void main(String args[])
	{
		
		int a[] = new int[4];
		System.out.println("Enter a number");
		for(int i=0;i<a.length;i++)
		{
			Scanner sc = new Scanner( System.in);
			
			
		     a[i]=sc.nextInt();
		}
		try {
			
			for(int i=0;i<a.length;i++)
			{
				int temp = a[i];
				
			if(temp %2==0)
			{
			FileOutputStream fout = new FileOutputStream( "odd.txt");
			
			fout.write(temp);
			//fout.close();
			System.out.println("odd");
			}
			else
			{
				FileOutputStream fout  = new FileOutputStream("even.txt");
				fout.write(temp);
				//fout.close();
				System.err.println("even");
			}
			
			
			}
			//fout.close();
			}
		
		//System.out.print("sucess");
		 catch (FileNotFoundException e) {
			e.getStackTrace();
			
		}
		catch (IOException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		System.out.print("sucess");
	}
}
