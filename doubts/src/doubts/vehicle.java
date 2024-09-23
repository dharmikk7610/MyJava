package doubts;

public abstract class vehicle {
	
	vehicle()
	{
		System.out.println("this is construtor");
	}
	
	abstract void gets();

}

class twvehicle extends vehicle
{
	public static void main(String args[])
	{
	vehicle v = new twvehicle();
	v.gets();
	}
	
	void gets()
	{
		System.out.println("twvehicle class ");
	}
}
