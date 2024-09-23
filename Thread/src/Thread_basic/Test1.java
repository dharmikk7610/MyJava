package Thread_basic;

//   ..........performing single task in single thread.........

public class Test1 extends Thread {

	public void run() {
		
		System.out.println("task 1..");
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.start();
//		t1.start(); when write same second time then eccour  a exception
	}
}
