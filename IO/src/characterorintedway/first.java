package characterorintedway;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class first {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner( System.in);
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		try {
			FileWriter fw = new FileWriter("dp.txt");
			
			fw.write(name);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
