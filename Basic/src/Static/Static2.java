package Static;

public class Static2 {
	
	int no =1;
	static String name = "dp";
	
	static void sum()
	{
//		System.out.println(no); -->> not excess the instant variables
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		Static2.sum();
		
	}

}
