package _1_By_extending.Threadtopic.task2;

public class Testapp {
	
	public static void main(String[] args) {
		
		Table resource = new Table();
		
		Thread1 t1 = new Thread1(resource);
		Thread2 t2 = new Thread2(resource);
		Thread3 t3 = new Thread3(resource);
//		
//		t1.setPriority(10);
//		t2.setPriority(5);
//		t3.setPriority(15);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
	}

}
