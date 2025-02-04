package Collection.Project;

import java.util.LinkedList;
import java.util.Scanner;

public class Cardekho {
	
	
	public static void main(String[] args) {
		LinkedList<Car> ll = new LinkedList<>();
		Scanner sc = new Scanner( System.in);
		int choice,i,sid;
		Boolean flag = false;
		String choice2;
		while(true)
		{
			
		
		System.out.println("1-->Add Car");
		System.out.println("2-->saw Car");
		System.out.println("3-->Update Car");
		System.out.println("4-->Search Car");
		System.out.println("5-->remove Car");
		System.out.println("6-->Exit the Shop");
		System.out.println("Enter a Choice:");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Car obj1 = new Car();
			obj1.Addcar();
			ll.add(obj1);
			System.out.println("data sucessfully inserted...");
			break;
			
		case 2:
			System.out.println("uname"+"cname"+"Modal"+"price"+"fual_type"+"mileage");
			for(i=0;i<ll.size();i++)
			{
				Car obj2 = ll.get(i);
				obj2.display();
			}
			break;
			
		case 3:
			System.out.println("Enter car id:");
			sid = sc.nextInt();
			for(i=0;i<ll.size();i++)
			{
				Car obj3 = ll.get(i);
				if(obj3.getid()==sid)
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				Car obj = ll.get(i);
				obj.updatedata();
				
				ll.set(i, obj);
			}
			else
			{
				System.out.println("id is not search....");
			}
			break;
			
		case 4:
			System.out.println("Enter car id:");
			sid = sc.nextInt();
			for(i=0;i<ll.size();i++)
			{
				Car obj4 = ll.get(i);
				if(obj4.getid()==sid)
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				Car obj5 = ll.get(i);
				obj5.display();
			}
			else
			{
				System.out.println("id is not find");
			}
			
			break;
			
		case 5:
			System.out.println("Enter car id:");
			sid = sc.nextInt();
			for(i=0;i<ll.size();i++)
			{
				Car obj3 = ll.get(i);
				if(obj3.getid()==sid)
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				ll.remove(i);
				System.out.println("data sucessfully delete...");
			}
			else
			{
				System.out.println("id is not found..");
			}
			
			break;
		case 6:
			System.exit(0);
			break;
			
		}
		

		
		
		}// while end
	}//main end

}//class end
