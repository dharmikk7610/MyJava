package Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class Testapp1 {

	public static void main(String[] args) {
		HashMap< Integer, String > map = new HashMap<Integer,String>();
		map.put(1, "dharmik");
		map.put( 2, "jainam");
		map.put(3,"jack" );
		map.put( 4, "rock");
		
		//not use same key because when use the same key then value is override......
		 
		map.put( 1,"royal");  
		System.out.println(map);
		
		for(Entry<Integer, String> e : map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}
