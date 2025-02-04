package Absctaction;

interface first {
	final String name = "Dharmik";
	void play();
}
interface second{
	void to_play();
}

public class Finterface implements first,second{

	public void to_play()
	{
		System.out.println("second method is..");
	}
	public void play()
	{
		System.out.println("my name is "+first.name);
	}
	public static void main(String[] args) {
		
		Finterface f = new Finterface();
		f.to_play();
		f.play();
		
	}
	
	
}
