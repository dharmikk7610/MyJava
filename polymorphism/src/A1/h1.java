package A1;

//overloading

public class h1 {

	 void findman()
	{
		System.out.println("i dont know that");
	}
	
	void finadman(String name)
	{
		System.out.println("i know that"+name);
	}
	
	public static void main(String[] args) {
	
		h1 s = new h1();
		s.findman();
		s.finadman("ram");
	}
	
	
}
