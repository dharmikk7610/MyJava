package Threadmethod;

//  1>getname ,2>setname 3>current thred 4>isalive

public class m1 extends Thread {

	public void run()
	{
		System.out.println("hello medam");
		Thread.currentThread().setName("dharmik");
		System.out.println(Thread.currentThread().getName());  
	}
	
	public static void main(String[] args) {
		
		m1 m = new m1();
		System.out.println(m.isAlive());
		Thread.currentThread().setName("dharmik");

		System.out.println(Thread.currentThread().getName());
		
		m.start();
		
	}
}
