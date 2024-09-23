package collction.prectise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LIst1 {
	
	public static void main(String[] args) {
		/*There are various ways to traverse the collection elements:

			1>By Iterator interface.
			2>By for-each loop.
			3>By ListIterator interface.
			4>By for loop.
			5>By forEach() method.
			6>By forEachRemaining() method.*/
		
//		1>By Iterator interface.
/*		
	ArrayList< String> listobj = new ArrayList<String>();
	listobj.add( "dharmik");
	listobj.add( "rahul");
	listobj.add( "jack");
	listobj.add( "pavan");
	
	System.out.println(listobj.get( 2)); 
	listobj.set(2, "pratham");
	
	Iterator< String > itr  = listobj.iterator();
	while(itr.hasNext())
	{
		String s1 =itr.next();
		System.out.println(s1);
	}
*/
		
		
//		---------4>By for loop.-------------------
		/*
		ArrayList< String> list = new ArrayList<>();
		list.add( "dharmik");
		list.add( "rahul");
		list.add( "jack");
		list.add( "pavan");
		
		for(int i =0; i<list.size();i++)
		{
			String s = list.get(i);
			System.out.println(s);
		}*/
		
//		2>By for-each loop.------------------
		
		/*ArrayList< String> list = new ArrayList<>();
		list.add( "dharmik");
		list.add( "rahul");
		list.add( "jack");
		list.add( "pavan");
		
		for(String s : list)
		{
			//String s = list.get(i);
			System.out.println(s);
		}*/
		
//		3>By ListIterator interface.-------------------
		/*
		ArrayList< String> listobj = new ArrayList<String>();
		listobj.add( "dharmik");
		listobj.add( "rahul");
		listobj.add( "jack");
		listobj.add( "pavan");
		
		System.out.println(listobj.get( 2)); 
		listobj.set(2, "pratham");
		
		ListIterator< String > itr  = listobj.listIterator();
		while(itr.hasNext())
		{
			String s1 =itr.next();
			System.out.println(s1);
		}
		
		//previous..--> saw value in descdeing order
		while(itr.hasPrevious()) {
			String s = itr.previous();
			System.out.println(s);
		}*/
		
//		5>By forEach() method.------------------
		
	/*	ArrayList< String> list = new ArrayList<String>();
		list.add( "dharmik");
		list.add( "rahul");
		list.add( "jack");
		list.add( "pavan");
		
	    //The forEach() method is a new feature, introduced in Java 8.  
		list.forEach( s->   //Here, we are using lambda expression  
			System.out.println(s)
		); */
		
		ArrayList< String> list = new ArrayList<String>();
		list.add( "dharmik");
		list.add( "rahul");
		list.add( "jack");
		list.add( "pavan");
		
		Iterator< String> itr = list.iterator();
		itr.forEachRemaining(s->	 //Here, we are using lambda expression  
				System.out.println(s)   
				);
		
		
		
		
		
	}
	

}
