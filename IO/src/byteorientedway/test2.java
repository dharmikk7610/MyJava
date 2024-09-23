package byteorientedway;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test2 {

	public static void main(String args[])
	{
		//StringBuilder sb = new StringBuilder();
		try {
			FileInputStream fin  = new FileInputStream("C:\\Users\\Dharmik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\IO\\new1.java");
			int temp;
			while((temp = fin.read()) != -1)
			{
				//char value = (char)temp;
				System.out.print((char)temp);
				//sb.append(value);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e )
		{
			e.getStackTrace();
		}
		//System.out.println(sb);
	}

}
