package innerclass;

class geeting{
	void stack()
	{
		System.out.println("hello...");
	}
}

class dp
{
geeting g1 = new geeting()
{
	void stack()
	{
		System.out.println("dharmik");
	}
};
}
public class anonimius3 {
	
	public static void main(String args[])
	{
		dp s1 = new dp();
		s1.g1.stack();
	}
}
