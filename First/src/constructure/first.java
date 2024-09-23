package constructure;

public class first {
	
	int rno;
	String name;
	int std;
	
	private static first f = null;
	private first()
	{
		
	}
	public static first gets()
	{
		if(f==null)
		{
			f= new first();
		}
		return f;
	}
	
	
	public static void main(String args[])
	{
		first obj1 = first.gets();
		first obj2 = first.gets();
		first obj3 = first.gets();
		
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		System.out.println("obj3="+obj3);
	}

}
class x{
	public static void main(String[] args) {
		System.out.println("hello");
	}
}


