package abstraction;

abstract class testapp1 {
	int no;
	abstract void maths(int marks);
	
}

class result extends testapp1
{

	void maths(int marks)
	{
		System.out.println("your marks is "+marks);
	}
	public static void main(String args[])
	{
		result r =new result();
		r.maths(10);
	}
}


