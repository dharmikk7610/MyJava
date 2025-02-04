package Static;

public class Static1 {
	
	int rno =1;
	String name ="dharmik";
	static String collage_name = "newl.j";
	
	Static1()
	{
//		rno = 12;
//		name = "dp";
//		collage_name = "cc";
		System.out.println(rno+name+collage_name);
	}
	public static void main(String[] args) {
		Static1 s1 = new Static1();
		System.out.println(collage_name);
	}

}
