package innerclass;

public class member2 {
	
	class a
	{
		void display()
		{
			System.out.println("hello student...");
		}
	}
	public static void main(String args[])
	{
		member2 m = new member2();
		member2.a ojb2 = m. new a(); 
		ojb2.display();  
		
	}

}
