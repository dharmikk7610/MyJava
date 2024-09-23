package innerclass;

public class nested {
	
		private static int  no =07;
		
		 static class b{
			 void display()
			{
			System.out.println("no="+no);
		}}
		
		public static void main(String args[])
		{
//			member1 obj1 = new member1();
//			member1.b obj2 = obj1. new b();
			 nested.b obj2 = new nested.b();
			//member1.b.display();
			obj2.display();
		}
	}



}
