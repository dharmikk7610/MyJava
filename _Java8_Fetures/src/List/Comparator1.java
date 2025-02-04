package List;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator1 {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(23);
		li.add(33);
		li.add(3);
		Collections.sort(li,new myclass()); 
		System.out.println(li);
	}

}
