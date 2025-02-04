package Inner_Class;
// member inner class 

public class first {
	public static void main(String[] args) {
		outer1 out = new outer1();
		outer1.inner in = out.new inner();
		in.method();
	}

}

class outer1{
	outer1()
	{
		System.out.println("class outer");
	}
	class inner{
		public void method()
		{
			System.out.println("hello brother..");
		}
	}
}
