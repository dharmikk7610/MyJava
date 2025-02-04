package Inner_Class;

// nested interface inner class

interface outer{
	void omsg();
	interface inner{
		void imsg();
	}
}
 class Testouter2 implements outer.inner {

	public void imsg()
	{
		System.out.println("hello nested iterface inner class");
	}
	void omsg()
	{
		System.out.println("hello i am outer class ..");
	}
	public static void main(String[] args) {
		
		outer.inner oi = new Testouter2();
		oi.imsg();
		
	}
	

}
