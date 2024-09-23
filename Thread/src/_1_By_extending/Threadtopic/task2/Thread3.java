package _1_By_extending.Threadtopic.task2;

public class Thread3 extends Thread {
	
	Table t = null;

	public Thread3(Table t) {
		
		this.t = t;
	}
	
	public void run()
	{
		t.Printrun(MAX_PRIORITY);
	}
	
	

}
