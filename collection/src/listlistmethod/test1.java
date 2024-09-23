package listlistmethod;

import java.util.Iterator;
import java.util.LinkedList;

public class test1 {
	
	public static void main(String[] args) {
		
		LinkedList< String> obj = new LinkedList<String>();
		obj.add("dharmik");
		obj.addFirst( "manny");
		obj.addLast( "jack");
		obj.add("me");
		obj.remove();   //remove method delete a first element when you not pass arguments.
		obj.remove("jack");
		//obj.clear();
		
		LinkedList< String> obj2 = new LinkedList<String>();
		
		//		obj2.add("rock");
//		obj2.add("null");
//		obj.addAll(obj2);
	 System.out.println(obj2);
		
		Iterator< String> itr =  obj.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
