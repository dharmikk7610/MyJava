package Set;

import java.util.LinkedHashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;

public class Testapp1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet< String> s = new LinkedHashSet<String>();
		s.add("my ");
		s.add( "name is");
		s.add("dp");
		s.add("this");
		
		System.out.println(s);
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name);
		}
	}

}

