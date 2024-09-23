package _1_By_extending.Threadtopic.task2;

public class Thread1 extends Thread{
	
	Table t = null;

	public Thread1(Table t) {
		
		this.t = t;
	}
	
	public void run() {
			t.Printrun(NORM_PRIORITY);
	}
	
	
	

}
