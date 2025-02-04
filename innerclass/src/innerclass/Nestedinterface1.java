package innerclass;

interface A{
	interface B{
		public void message();
	}
}


public class Nestedinterface1 implements A.B{
	public void message()
	{
		System.out.println("this is nested interface inner class..");
	}
	
	public static void main(String[] args) {
		
		A.B m1 = new Nestedinterface1();
		m1.message();
		
	}
	

}
