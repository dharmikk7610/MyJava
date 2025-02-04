package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book b1 = new Book();
		b1.addbook();
		list.add(b1);
		Book b2 = new Book();
		b2.addbook();
		list.add(b2);
		
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			Book b = (Book)itr.next();
			b.display();
		}
		for (Book b : list) {
			b.display();
		}
		
	}
	
	

}
