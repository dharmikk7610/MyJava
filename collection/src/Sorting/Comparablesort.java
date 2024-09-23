package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Comparablesort {
	
	public static void main(String[] args) {
		
		Student s1  = new Student(1,"dharmik",12,99);
		Student s2  = new Student(2,"kevin",12,12);
		Student s3 = new Student(3,"jack",12,55);
		Student s4 = new Student(4,"rock",12,23);
		
		ArrayList<Student> Listobj = new ArrayList<Student>();
		
		Listobj.add(s1);
		Listobj.add(s2);
		Listobj.add(s3);
		Listobj.add(s4);
		
		
		for(Student s : Listobj)
		{
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
		}
		
		System.out.println();
		System.out.println("After a marks wise Sorting:");
		System.out.println();
		
		Collections.sort( Listobj);
		
		for(Student s : Listobj)
		{
			System.out.println(s.getRno()+" "+s.getName()+" "+s.getStd()+" "+s.getMarks());
		}
	}

}
