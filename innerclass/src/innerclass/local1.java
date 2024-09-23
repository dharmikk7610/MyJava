package innerclass;

public class local1 {
	
	void scan()
	{
//		System.out.println("heloo student");
		class display
		{
			void dis()
			{
				System.out.println("hello ...");
			}
			
			
		}
		display d1 = new display();
		d1.dis();
	}
	
public static void main(String args[])
{
	local1 l = new local1();
	l.scan();
}
}
