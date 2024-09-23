package characterorintedway;

import java.io.FileReader;

public class first2 {

	public static void main(String args[])
	{
	  try {
		
		  FileReader fr = new FileReader( "C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\dp.txt");
		  int temp;
		  while((temp=fr.read())!=-1)
		  {
			 System.out.print((char)temp);  
		  }
		  
	} catch (Exception e) {
		// TODO: handle exception
		e.getStackTrace();
	}
	}
}
