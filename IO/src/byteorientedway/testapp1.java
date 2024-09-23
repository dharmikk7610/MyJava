package byteorientedway;

import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class testapp1 {
	
	public static void main(String args[])
	{
		System.out.println("Enter the name :");
		Scanner sc  = new Scanner(System.in);
		String  name = sc.nextLine();
		
		try {
			
			FileOutputStream fout = new FileOutputStream("new1.java");
			byte b[] = name.getBytes();
			
			fout.write(b);
			
			fout.close(); //close
			
			System.out.print("sucess");
			
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		}
		catch ( IOException e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
	
	
}
