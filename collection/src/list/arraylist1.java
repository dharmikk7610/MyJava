package list;

import java.util.ArrayList;

import java.util.Iterator;

class Student {
	private int rno;
	private String name;
	private int std;

	Student() {

	}

	public Student(int rno, String name, int std) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
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

public class arraylist1 {

	public static void main(String args[]) {
		Student s = new Student(1, "dharmik", 12);

		ArrayList obj1 = new ArrayList();
		obj1.add("dharmik");
		obj1.add('d');
		obj1.add(123);
		obj1.add(123.23);
		obj1.add(s);

//	....................first WAY............................

		// System.out.println("obj1.size:"+obj1.size());
//		Iterator itr = obj1.iterator() ;
//		
//		while(itr.hasNext())
//		{
//			Object obj  = itr.next();
//			
//			if(obj instanceof Student )
//			{
//				Student s1  = (Student)obj;
//				System.out.println(s1.getRno()+" "+s1.getName()+" "+s1.getStd());
//			}
//			else
//			{
//				System.out.println(obj);
//			}
//		}
		
		

		// .............SECOND WAY SIMPLE FOR LOOP  ...............................
	
		
//		
//		for (int i = 0; i < obj1.size(); i++) {
//			Object obj = obj1.get(i);
//
//			if (obj instanceof Student) {
//				Student s2 = (Student) obj;
//				System.out.println(s2.getRno() + " " + s2.getName() + " " + s2.getStd());
//			} else {
//				System.out.println(obj);
//			}
//		}
		
		//.....................third way for each......................
		
		
		for(Object obj : obj1)
		{
			if(obj instanceof Student)
			{
				Student s3 = (Student)obj;
				System.out.println(s3.getRno() + " " + s3.getName() + " " + s3.getStd());
			}
			else
			{
				System.out.println(obj);
			}
		}

	}

}
