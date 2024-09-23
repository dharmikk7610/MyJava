package _1_By_extending.Threadtopic;

public class Mytable extends Thread {
	
	Table t = null;
	
	public Mytable(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(5);
	}

}
