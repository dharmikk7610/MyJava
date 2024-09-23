package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Testapp1 {

	public static void main(String[] args) {
		
		PriorityQueue< String > q = new PriorityQueue<String>();
		
		q.add("dharmik ");
		q.add( "always");
		q.add("to be ");
		q.add("then all off");
		
		System.out.println(q);
		
		while(!q.isEmpty())
		{
			String name = q.poll();
			System.out.println(name);
		}
		
		// after a  use the poll method q all data is remove......
		
		System.out.println(q);   
	}
}
