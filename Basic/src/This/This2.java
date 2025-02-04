package This;

public class This2 {
	
	void m()
	{
		System.out.println("this is m method");
	}
	void n()
	{
		this.m();
		System.out.println("this is n method");
	}

	public static void main(String[] args) {
		
		This2 t2 = new This2();
		t2.n();
	}
}
