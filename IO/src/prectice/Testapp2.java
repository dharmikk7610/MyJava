package prectice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Testapp2 {
	
	public static void main(String[] args) {
		try (
			FileInputStream fin = new FileInputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\object1.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);)
				{
			employees obj[]  = (employees[])oin.readObject();
			for(int i=0;i<obj.length;i++)
			{
				obj[i].display();	
			}
			
			
		//	System.out.println("dharmik");
			
		} catch (Exception e2) {
			e2.getStackTrace();
			// TODO: handle exception
		}
		
	}

}
