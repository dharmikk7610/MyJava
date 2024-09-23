package udo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//import javax.imageio.stream.FileImageInputStream;

public class testapp4 {
	
	public static void main(String args[])
	{
		try (
			FileInputStream fin = new FileInputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\r1.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
				)
		{
			student1 s[] = (student1[]) oin.readObject();

			for (int i = 0; i < s.length; i++) {
				s[i].display();
			}

			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}

}
