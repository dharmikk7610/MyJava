package Interface;

interface user{
	default void getName()
	{
		System.out.println("say hello");
	}
}

interface student{
	default void getName()
	{
		System.out.println("child say hello ...");
	}
}

public class Defaultmethod1 implements user,student {
	 public static void main(String[] args) {
		 Defaultmethod1 m1 = new Defaultmethod1();
			m1.getName();
			
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		student.super.getName();
	}

}
