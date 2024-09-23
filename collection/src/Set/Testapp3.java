package Set;

import java.util.TreeSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;

public class Testapp3 {
	
	public static void main(String[] args) {
		
		TreeSet< String> s = new TreeSet<String>();     // 
		s.add("my "); 
		s.add( "name is");
		s.add("dp");
		
		System.out.println(s);
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name);
		}
	}

}

