package task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testapp1 {
	
	public static void main(String args[])
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\src\\task\\testapp1.java");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\src\\task\\dubtestapp1.java");
		int temp;
		while((temp=fin.read()) !=-1)
		{
			System.out.print((char)temp);
			fout.write(temp);
		}
		fin.close();
		fout.close();
			
		} catch ( FileNotFoundException e) {
			// TODO: handle exception
			e.getStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
