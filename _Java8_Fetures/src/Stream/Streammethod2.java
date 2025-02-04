package Stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streammethod2 {
	
	public static void main(String[] args) {
		
	List<Integer> s1 = Stream.iterate( 0, x->x+1).limit(50).filter(x ->x % 2 ==0).distinct()
			.peek((x)->System.out.println(x))
			
			.skip(2).collect( Collectors.toList());
		
	System.out.println(s1);
	
	
	}
	
}
