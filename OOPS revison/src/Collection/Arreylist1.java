package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arreylist1 {
	
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		arr1.add(121);
		arr1.add(0, 12);
		arr1.add("dharmik");
		arr1.add('p');
//		arr1.clear();
//		System.out.println(arr1.contains(12)); check value 
		System.out.println(arr1.size());
		
		System.out.println(arr1);
		
		Iterator itr = arr1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
