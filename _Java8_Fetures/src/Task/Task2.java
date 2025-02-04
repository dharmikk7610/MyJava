package Task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//Task 3: Group a list of words by their lengths:
//Task 2: Combine two predicates to filter a list:
//Find the sum of all integers in a list:
//Find the shortest word in a list of strings.
//Create a chain of functions:
//
//First, multiply a number by 2.
//Then, add 5.
//Finally, return the result

@FunctionalInterface
interface user{
	String process(String name);
}

public class Task2 {
	
	public static void main(String[] args) {
	
		List<Integer> l1 = Arrays.asList(1,34,22,5,14);
		int sum = l1.stream().reduce( 0, Integer::sum);
		System.out.println(sum);
		
		List<String> l2 = Arrays.asList("dharmik","pavan","jack","rocky");
		
		Optional<String> sname = l2.stream().min((x,y)->x.length()-y.length());
		
		System.out.println(sname);
		
		user s = (name)->
		{
			return name+"here";
			
		};
		
	System.out.println(s.process("jk"));
	}

}
