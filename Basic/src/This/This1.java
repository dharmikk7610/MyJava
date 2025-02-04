package This;

public class This1 {
	int no ;
	String name;
	
		This1(int no ,String name)
		{
			this.no = no;
			this.name = name;
			
			
		}
		void display()
		{
			System.out.println(no+" "+name);
		}
	
	
	public static void main(String[] args) {
		This1 t1 = new This1(1,"jack");
		t1.display();
		
		
	}

}
