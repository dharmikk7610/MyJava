package innerclass;

// Static nested class

public class Staticex1 {

	static int no =50 ;
	int no2 = 30;  // you not excess non-static data in static class ...
	
	static class  myinfo
	{
		public void message()
		{
			System.out.println("my data is "+no);
		}
	}
	
	public static void main(String[] args) {
		
		//not create outer class object ..
		
		Staticex1.myinfo m1 = new myinfo();
		m1.message();
	}
}
