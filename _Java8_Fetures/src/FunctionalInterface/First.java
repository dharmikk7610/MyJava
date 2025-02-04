package FunctionalInterface;

import java.util.function.Function;

public class First {
	public static void main(String[] args) {
		Function<String, String> function = x->x.substring(0,3);
		
		System.out.println(function.apply("prajapati")); //make the output
	}

}
