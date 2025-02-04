package Inner_Class;

// Static inner class ........

public class Testouter1 {
	static int c= 10;
	static class inner{
		void smethod()
		{
			System.out.println("thisn is static method...");
		}
	}

 
	public static void main(String[] args) {
		Testouter1.inner ic = new Testouter1.inner();
		ic.smethod();
	}

}
