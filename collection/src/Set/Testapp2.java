package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Testapp2 {
	
	public static void main(String[] args) {
		
		HashSet< String> s = new HashSet<String>();
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
