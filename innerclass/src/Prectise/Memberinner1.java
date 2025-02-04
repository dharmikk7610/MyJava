package Prectise;

public class Memberinner1 {
	
	public Memberinner1() {
		// TODO Auto-generated constructor stub
		System.out.println("this super constructor...");
	}
	
	int  no = 1;
	private String name  = "dharmik" ;
	
	class inner{
		void display()
		{
			
			System.out.println("ready for memeber inner class" +no +name);
		}
	}
	
	public static void main(String[] args) {
		
		Memberinner1 i1 = new Memberinner1();
		Memberinner1.inner i2 = i1. new inner();
		i2.display();
	}

}
