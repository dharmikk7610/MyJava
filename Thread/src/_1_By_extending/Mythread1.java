package _1_By_extending;

public class Mythread1 extends Thread {
	
	public void run()
	{
		System.out.println("i  am Thread " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Mythread1 th1 = new Mythread1();
		Mythread1 th2 = new Mythread1();
		Mythread1 th3 = new Mythread1();
		Mythread1 th4 = new Mythread1();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		Thread t4 = new Thread(th4);
		
			
		t1.start();
		t2.start();
		
		
		
	}

}
