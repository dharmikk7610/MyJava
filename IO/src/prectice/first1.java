package prectice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class first1 {
	
	public static void main(String[] args) {
//		System.out.println("Enter a String :");
//		Scanner sc = new Scanner( System.in);
//		String  name  = sc.nextLine();
		
		try {
			FileInputStream fin  = new FileInputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\pavan1.txt");
				int temp;
				while((temp=fin.read())!=-1)
				{
					System.out.print((char)temp);
				}
			
			//byte b[] = name.getBytes();
			
			fin.close();
			System.out.println("sucess");
			
		}
			
		catch (Exception e) {
			e.getStackTrace();
		}
	}

}
