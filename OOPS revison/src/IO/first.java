package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		
		try {
			FileOutputStream fout = new FileOutputStream("fname.txt");
			FileInputStream fin  = new FileInputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\OOPS revison\\fname.txt");
			int temp ;
			while(( temp= fin.read())!=-1)
			{
				System.out.println((char)temp);
			}
			byte b[] = name.getBytes();
			fout.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
