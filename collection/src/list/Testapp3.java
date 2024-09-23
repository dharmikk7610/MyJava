package list;
import java.util.Vector;
import java.util.Iterator;

public class Testapp3 {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();   // vector -->> use the syncronies method-->>threadafe
		v.add( "hello");
		v.add("bachho");
		v.add( "how");
		v.add("are you");
		
		System.out.println(v.size());
	
		
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name);
		}
	}

}
