package Prectise;

public class Localinner1 {
	String name  = "dp" ;
	void  first()
	{
		System.out.println("this is parent class...");
		
		class inner{
			void display() {
				System.out.println("hello my name is "+name);
			}
		}
		inner i = new inner();
		i.display();
		
	}
	public static void main(String[] args) {
		Localinner1 l1 = new Localinner1();
		l1.first();
	}
	

}
