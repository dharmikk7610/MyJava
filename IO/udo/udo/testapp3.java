package udo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class testapp3 {
	public static void main(String args[])
	{
	student1 s[] = new student1[5];
	for(int i=0; i<s.length;i++)
	{
		s[i] = new student1();
		s[i].scan();
	}
	
	try 
	(
			FileOutputStream fout = new FileOutputStream( "r1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
	)
	
	{

		out.writeObject(s);
		System.out.println("sucess ..");
		
	} catch (Exception e) {
		e.getStackTrace();
		// TODO: handle exception
	}

}
}
