package innerclass;

class greeting 
{
	void stack()
	{
		System.out.println("hello student..");
	}
}

class india {
	greeting g1 = new greeting()
	{
		void stack()
		{
			System.out.println("my name is dharmik");	
		}	
	};
	
}
public class anonimius2 {
	public static void main(String args[])
	{
		india a = new india();
		a.g1.stack();
	}

}
