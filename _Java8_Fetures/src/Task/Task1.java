package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//Task 1: Sort a list of strings by length using a lambda:
//Task 2: Find the first string starting with "A" in a list: using->predicate,stream

interface allMethod{
	public void sort(String a,String b);
}

public class Task1 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("dharmik");
		list.add("pavan");
		list.add("jack");
		
		 list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		 System.out.println(list);
		 
		 Predicate<String> p1 = (name) ->name.toLowerCase().charAt(0)=='d' ;
		 Consumer<String> c1  = (x)->System.out.println(x);
		 
		 
		 for (String string : list) {
			
			 if(p1.test(string))
			 {
				c1.accept(string);
			 }
		}
		 
	//-----------------------------using stream*-------------------------
		List<String> s1 = list.stream()
				.filter((x)->x.toLowerCase().charAt(0)=='d')
				.collect(Collectors.toList());
		  System.out.println(s1);
	
		 
		 
		
	}

}
