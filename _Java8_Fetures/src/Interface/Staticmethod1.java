package Interface;

interface u {
	static void getName()
	{
		System.out.println("hey hello ...");
	}
}

public class Staticmethod1 {
	
	public static void main(String[] args) {

			Staticmethod1 m1 = new Staticmethod1();
			u.getName();
	}

}
