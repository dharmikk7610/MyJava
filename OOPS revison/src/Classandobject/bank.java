package Classandobject;

public class bank {
	void banksystem()
	{
		System.out.println("hello bank here..");
	}
	
	public static void main(String[] args) {
		bank b = null;
		b = new Hdfc();
		b.banksystem();
		b= new Bob();
		b.banksystem();
		Hdfc x = (Hdfc)b;
		x.paymant();
	}

}

class Bob extends bank{
	void banksystem()
	{
		System.out.println("bob here");
	}
}

class Hdfc extends bank{
	void banksystem()
	{
		System.out.println("Hdfc here ..");
	}
	void paymant()
	{
		System.out.println("please payment here..");
	}
}

class State extends bank{
	void banksystem()
	{
		System.out.println("state here...");
	}
}


