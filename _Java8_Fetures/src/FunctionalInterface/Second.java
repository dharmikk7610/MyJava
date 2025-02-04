package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Second {

	public static void main(String[] args) {
		Predicate<String> predicate  = name-> name.toLowerCase().charAt(0)=='d';
		Function< String, String> f1 = name->name.concat("here");
		Consumer< String> c1 = x-> System.out.println(x);
		Supplier< String> supplier = ()->"dharmik";
		if(predicate.test(supplier.get()))
		{
			c1.accept(	f1.apply(supplier.get()));
		}
	}
}
