package Inner_Class;
// anynonimoues inner class

 abstract class Testapp1 {
	abstract void eat();
}
 
 class j{
	 public static void main(String[] args) {
		Testapp1 ou = new Testapp1() {
			public void eat()
			{
				System.out.println("you done...");
			}
		};
		ou.eat();
	}
	 
 }
 
 
