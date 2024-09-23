package _1_By_extending;

public class first extends Thread {
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName()+" "+i);
		
		try {
			Thread.sleep( 500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
	
	public static void main(String[] args) {
		
		first f1 = new first();
		first f2 = new first();
		first f3 = new first();
		first f4 = new first();
		
		try {
			f1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f2.start();
		f3.start();
		f4.start();
		
		
		
		
		
	}

}
