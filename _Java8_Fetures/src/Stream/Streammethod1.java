package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streammethod1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add( 12);
		list.add( 5);
		list.add( 18);
		list.add( 6);
		
	  ArrayList< Integer> list2 = (ArrayList<Integer>) list.stream().filter(x -> x%2 == 0).map(x -> x/2 ).collect(Collectors.toList()); 
	  System.out.println(list2);
	  
	 List<Integer> l =  list.stream().filter(x-> x>9).sorted((a,b)->b-a).collect(Collectors.toList());
	 
	 for (Integer i : l) {
	
		 System.out.println(i);
	}
	}
}

