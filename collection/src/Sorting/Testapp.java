package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testapp {

	public static void main(String[] args) {
		Employees e1 = new Employees(1, "dharmik", 12);
		Employees e2 = new Employees(2, "dharmik prajapati", 22);
		
		List<Employees> list = new ArrayList<>();
		list.add(e2);
		list.add(e1);
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
