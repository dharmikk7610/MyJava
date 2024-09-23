import java.util.Scanner;

public class testapp2 {

	void admin(String name ) throws isvalidadmin
	{
		if(!name.equals("admin"))
		{
			throw new isvalidadmin("you not excess");
		}
		else
		{
			System.out.println("Welcome you are admin host");
		}
	}
	public static void main(String args[])
	{
		testapp2 t =new testapp2();
		Scanner sc = new Scanner( System.in);
		System.out.println("enter a employees position:");
		String name = sc.nextLine();
		try {
			t.admin(name);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
