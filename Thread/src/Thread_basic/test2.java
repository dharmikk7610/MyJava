package Thread_basic;

// .........performing the single task in multiple Thread ..........
public class test2 extends Thread  {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		test2 t1 = new test2();
		t1.start();
		
		test2 t2 = new test2();
		t2.start();
	}
}

