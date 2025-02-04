package _Java8_Fetures.lambda;

import java.util.ArrayList;
import java.util.Collections;

class Student{
	public  int id;
	public  String name;
	public  int std;
	public Student(int id, String name, int std) {
		
		this.id = id;
		this.name = name;
		this.std = std;
	}
	
	Student()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}
	
	
	
	
}

public class Comparator2{

	public static void main(String[] args) {
		ArrayList<Student> li2 = new ArrayList<>();
		li2.add(new Student( 1,"dharmik",12));
		li2.add(new Student( 2,"ram",12));
		
		Collections.sort(li2 ,(a,b)->b.id-a.id);
		
		for(Student s :li2)  
		{
			System.out.println(s.id +" "+s.name+" "+s.std);
		}
		
	}
}
