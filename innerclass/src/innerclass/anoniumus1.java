package innerclass;

  class anoniumus {
	
   	void dis()
   	{
   		System.out.println("helllo");
   	}
}

class first {
	anoniumus as1 = new anoniumus();
	void dis()
	{
		System.out.println("hello2");
	}
}

public class anoniumus1{
	public static void main(String[] args) {
		first as = new first();
		as.as1.dis();
	}
}

 
