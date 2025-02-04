package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vactor1 {
	public static void main(String[] args) {
		Vector v = new Vector<>();
		v.add( "dharmik");
		v.add('D');
		v.add(1);
		v.add( 0,3);
		
		Vector< String > v2 =  new Vector<>();
		v2.add( "dp");
		v2.add( "dk");
		v2.add(null);
		
		v2.addAll(v);
		System.out.println(v2);
	 
//		Iterator<String> itr =  v2.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
