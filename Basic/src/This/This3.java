package This;

public class This3 {
	
	This3()
	{
		System.out.println("this is default constructure");  //this use refere the default con.. 
	}
	This3(int x)
	{
		this();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		This3 t3 = new This3(12);
		
	}

}
