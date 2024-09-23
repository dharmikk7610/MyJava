package Threadmethod;

/*
 	priority is mainly use for who first exicuted ..
 		min_priority
 		max_priority
 		norl_priority
 		
 		1<priority<10
 		
 		two method :
 		----------	1>set priority	
 					2>get priority
 					
 */

public class prioritymethod extends Thread {
	
	public void run()
	{
		System.out.println("hello dharmik" +Thread.currentThread().getPriority());
//		System.out.println());
	}
	
	public static void main(String[] args) {
		
		prioritymethod m1 = new prioritymethod();
		m1.setPriority(MAX_PRIORITY);
		m1.start();
		prioritymethod m2 = new prioritymethod();
		m2.setPriority(MIN_PRIORITY);
		m2.start();
	}

}
