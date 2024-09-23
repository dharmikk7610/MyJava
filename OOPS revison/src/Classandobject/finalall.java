package Classandobject;
/***
   final use with variable,method,class
   final meas to fixed.
   
   -->> when you create a final variable that means that value be not change
   --->> when you create a final method that means that method not overrides..
   --->> when you create a final class that means that class not extends..
 */

 class x {
	final int age =20;
	final void  getdata()
	{
		System.out.println("hello ..");
	}

}

class finalall extends x{
	
//	void getdata()
//	{
//		
//		System.out.println("hello here ..");
//	}
	
	public static void main(String[] args) {
		finalall a = new finalall();
//		super.getdata();  --->> not use super in main method use for method and constructor
		//a.age = 15;  -->> do not change the value
		System.out.println("hello my age is "+a.age);
		a.getdata();
		
	}
}
