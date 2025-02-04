package _Java8_Fetures.lambda;

public class Lambdausingthread {
	
	public static void main(String[] args) {
		
		Runnable r = ()->
		{
			System.out.println("hello ....");
		};
		Thread th = new Thread(r);
		r.run();
	}

}
