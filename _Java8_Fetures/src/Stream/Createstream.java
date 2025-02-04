package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

import javax.naming.LimitExceededException;

public class Createstream {

	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add( "java");
		list.add( "python");
		
		ArrayList<Integer> list2 =  new ArrayList<>();
		
		list2.add(1);
		list2.add(34);
		list2.add(23);
		list2.add( 12);
		
		//comparator-->> using  lambda function 
		//java.util
		Collections.sort( list2,(a,b)->b-a);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		
		Stream< String> myStream = list.stream() ; 
		
		String[] Array = {"ab","jack","right"};
		Stream< String> my = Arrays.stream(Array);
		
		Stream.generate(()-> "hello").limit(3);
		
	 	Stream.of( 1,2,3,4);
		Stream.iterate( 0, n->n+1).limit(100);
	}
}
