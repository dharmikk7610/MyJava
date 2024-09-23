package Classandobject;

/***
 	block : instant ,static
 	static method  -->> method area
 	
 	Static block:- its not requread to create a object of class and its
 					call always the first..
 	-systex:static{...code here ...}
 					
 	instant block:- it's call to before the constructor calling but after super class constructor call.
 	
 	-systex: {....code here ... }
 	
 */
class superr
{
	superr(){
		System.out.println("it's super class constructor..");
	}
}

public class Allblock extends superr {

	{
		System.out.println("this is instant block..");
	}
	static {
		System.out.println("this is static block...");
	}
	Allblock() {
	
		System.out.println("this is constructor calling ...");
		
	}
	public void getdata()
	{
		System.out.println("hii i am here..");
	}

	public static void main(String[] args) {
		Allblock a = new Allblock();
		a.getdata();
	}
}


