package Inner_Class;

// Local inner class...

public class Testapp2 {
	public static void main(String[] args) {
		outer_class oc = new outer_class();
		oc.message();
		
	}
}

class outer_class{
	void message()
	{
		class inner_local{
			void indisplay()
			{
				System.out.println("local inner class here..");
			}
		}
			inner_local in = new inner_local();
			in.indisplay();
		
	}
}
