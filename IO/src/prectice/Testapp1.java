package prectice;

import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//import javax.imageio.stream.FileCacheImageOutputStream;

public class Testapp1 {
	
	
	
	public static void main(String[] args) {
		employees obj[] = new employees[2];
		
		for(int i=0;i<obj.length;i++)
		{
			 obj[i] = new employees();
			 obj[i].scan();
		}
		try {
			FileOutputStream fout = new FileOutputStream("object1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(obj);
			out.close();
			fout.close();
			System.out.println("sucess");
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.getStackTrace();
		}
		
	}

}
