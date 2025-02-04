package Predicate;

import java.util.function.Predicate;

public class Predicate1 {
	
	public static void main(String[] args) {
		Predicate<String> predicate  = (x)-> x.toLowerCase().charAt(0) == 'd';
		Predicate<String> ps = x->x.toLowerCase().charAt(x.length()-1) =='k';
		Predicate<String> and  = predicate.and(ps);
		System.out.println(and.test("dharmik"));
		
		
	}

}
