package string;

/***
  String :- group of same char type elements
  
  -->> string is immutable
  -->>two type of String 
  		1>by uising litral  -->> create a 1 object--->> create object in scp
  		
  		(string contant pool(scp) is a area in heap memory to store java value.)
  		
  		2>by using new keyword  -->> create a 2 object (heap memory,scp)
 */

public class Basic {
	Basic()
	{
		System.out.println("hello i ' constructure");
	}
	
	public void method(String name)
	{
		Basic c = new Basic();
		System.out.println("my name is "+name);
	}
	
	public static void main(String[] args) {
		String name = "dharmik";
		Basic bc = new Basic();
		bc.method(name);
	}

}
