package innerclass;

public class member1 {

	private  int  no =07;
	
	 class b{
		 void display()
		{
		System.out.println("no="+no);
	}}
	
	public static void main(String args[])
	{
		member1 obj1 = new member1();
		member1.b obj2 = obj1. new b();
		// member1.b obj2 = new member1. b();
		//member1.b.display();
		obj2.display();
	}
}

