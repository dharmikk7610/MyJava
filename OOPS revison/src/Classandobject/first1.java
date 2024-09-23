package Classandobject;

/*
	all constructure (default,copy,paramiteresed)
	object : collection of class -->>real world entity
	class : intent of object -->>logical entity
*/

class Student {
	int rno;
	String name;
	public void write()
	{
		System.out.println("hello bachho"+rno+name);
	}
	Student(Student s3)
	{
		this.name  = s3.name;
		this.rno = s3.rno;
		System.out.println("dd");
		
	}
	Student()
	{
		
	}
}
public class first1 {
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="dharmik";
		s1.rno = 12;
		Student s2 = new Student(s1);
		s1.write();
	}

}
