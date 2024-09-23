package _1_By_extending.Threadtopic.task2;

public class Thread2 extends Thread {
	
	Table t = null;

	public Thread2(Table t) {
		
		this.t = t;
	}
	
	public void run()
	{
		t.Printrun(MIN_PRIORITY);
	}
	
	

}
