package _Java8_Fetures.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class Comparatorusinglambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		li.add( 23);
		li.add(12);
		li.add( 5);
		li.add( 10);
		
		Collections.sort(li,(a,b)->b-a); //using lambda function
		System.out.println(li);
	}
}
