package A1;

	// overload Constructure
public class student {
	int marks;
	
	student()
	{
		System.out.println("you pass");
	}
	student(int mark)
	{
		System.out.println("you pass"+mark);
	}
	
	public static void main(String args[])
	{
		student s = new student();
		student s1 = new student(70);
//		s.result();
//		s.result(80);
	}

}
