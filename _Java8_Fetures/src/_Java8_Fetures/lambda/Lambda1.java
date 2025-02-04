package _Java8_Fetures.lambda;

@FunctionalInterface  //annotations
interface user{
	public void show();
}

public class Lambda1 {

	public static void main(String[] args) {
	
		user s = ()->{
			System.out.println("hello ..i am lambda user1");
		};
		
		s.show();
	
	}
}
