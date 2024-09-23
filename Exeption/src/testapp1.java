

//  throws -->> declare the exception
public class testapp1 {

	void start()  throws ArithmeticException
	{
		int a=9,b=0;
		int c;
	
		c=a/b;
		
	}
	public static void main(String args[])
	{
		testapp1 s = new testapp1();
		try {
			s.start();
		} catch (Exception e) {
			//e.getStackTrace();
			System.out.println("not divide by zero");
			System.out.println(e.getStackTrace());
		}
		
	}
}

