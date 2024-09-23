package list.itratorandlistitrator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class first {

	public static void main(String[] args) {
		
		ArrayList<String> listobj = new ArrayList<String>();
		listobj.add("dharmik");
		listobj.add("jack");
		listobj.add("karishma");
		listobj.add("rock");
		listobj.add("naina");
		
		Iterator< String> itr = listobj.iterator();   //Iterator method only use for forward direction axcess
		while(itr.hasNext())
		{
			String name = itr.next();
			System.out.println(name);
		}
		
		System.out.println("using the List Iterator.....");
		System.out.println();
		
		ListIterator< String> litr = listobj.listIterator(); //listiterator method use for forward and backward direction axcess
		while(litr.hasNext())
		{
			String name1 = litr.next();
			System.out.println(name1);
		}
		
		while(litr.hasPrevious())
		{
			String name1 = litr.previous();
			System.out.println(name1);
		}
	}
	
}
