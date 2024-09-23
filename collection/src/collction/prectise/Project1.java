package collction.prectise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
		ArrayList< Student> listobj = new ArrayList<>();
		while(true)
		{
		Scanner sc =new Scanner( System.in);
		
		int choice,i;
		boolean flag = false; 
		
		System.out.println("1..Add");
		System.out.println("2..Upadate");
		System.out.println("3..Searching");
		System.out.println("4..Delete");
		System.out.println("5..Sorting COMPARABLE:");
		System.out.println("6..Dispaly");
		System.out.println("8..Exit");
		System.out.println("7.. sorting comparator");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Student s1 = new Student();
			 s1.Add();
			listobj.add(s1);
			
			System.out.println("data is sucessfully inserted...");
			break;
			
		case 2:
			System.out.println("Enter a rno you want to change:");
			int srno = sc.nextInt();
			
			for( i=0;i<listobj.size();i++)
			{
				Student s2 = listobj.get(i);
				if(s2.getRno()==srno)
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				Student s3 = listobj.get(i);
				s3.updateStudent();
				
				listobj.set(i, s3);
			}
			else
			{
				System.out.println("roll no is not fount Error...");
			}
			break;
			
		case 3:
			System.out.println("Enter a rno:");
			srno = sc.nextInt();
			
			for(i=0;i<listobj.size();i++)
			{
				Student s = listobj.get(i);
				if(s.getRno()==srno)
				{
					s.display();
					break;
				}
			}
			break;
		case 4:
			System.out.println("Enter a rno:");
			 srno = sc.nextInt();
			 
			 for(i=0;i<listobj.size();i++)
			 {
				 Student s3 = listobj.get(i);
				 if(s3.getRno()==srno)
				 {
					 flag = true;
					 break;
				 }
			 }
			 if(true)
			 {
				 listobj.remove(i);
				 System.out.println("delete sucessfully.....");
				 
			 }
			 else {
				 System.out.println("roll number is not found..");
			 }
			 break;
		case 5:
			Collections.sort(listobj);
			for(Student s : listobj)
			{
				System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getmarks());
			}
			  break;
			
		case 6:
		//	 System.out.println("display");
			// System.out.println("Number of students in the list: " + listobj.size());
		    for(i=0;i<listobj.size();i++) {
		    	System.out.println("display");
		        Student s4 = listobj.get(i);
		        s4.display();
		    }
		    break;
		   
		case 7:
			Collections.sort( listobj,new namewisesorting());
			Iterator< Student> itr = listobj.iterator();
			while(itr.hasNext())
			{
				Student s = itr.next();
				System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getmarks());
			}
			
		   
		case 8:
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.exit(0);
		
		}  //end switch
		}
	} //end main
}
