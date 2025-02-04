package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Unary_binaryopretor {

	public static void main(String[] args) {
		
//		Function<String ,String> f1 = name->name.concat("here");
//		System.out.println(f1.apply("dharmik"));
		UnaryOperator<String> u1 = (name)->name.concat("here");
		System.out.println(u1.apply("dp"));
		
		
		BinaryOperator< String> b1 = (name,name2)-> name.concat(name2);
		
		System.out.println(b1.apply( "dharmik", "prajapati"));
//		---------------------------------------------------------------------------------------
		BiConsumer< String, Integer> s1 = (name,x)->System.out.println(name+x);
		s1.accept( "dp", 7610);
		
		
	}
}
