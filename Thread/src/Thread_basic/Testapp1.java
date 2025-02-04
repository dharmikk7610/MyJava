package Thread_basic;

//   ............... performing multiple task in multiple Thread................\


class thread1 extends Thread {
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class thread2 extends Thread {
	
	public void run()
	{
		System.out.println("hello");
		System.out.println("guizees");
		System.out.println(Thread.currentThread().getName());
		
	}
	
}

public class Testapp1{
	
	public static void main(String[] args) {
		
	thread1 t1 = new thread1();
	t1.start();
	
	thread2 t2 = new thread2();
	t2.start();
	}
}



