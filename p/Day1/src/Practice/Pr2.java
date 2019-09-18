package Practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Pr2 {
	
	public static void main(String[] args) {

//		-------------------------------------
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		Iterator<Integer> it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Iteration by listiterator");
		
		ListIterator<Integer> li = al.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("Iteration by listiterator in reverse order");
		
//		ListIterator<Integer> li1 = al.listIterator();
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		

		System.out.println("##########################################");
//		--------------------------------------
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(6);
		ll.add(7);
		ll.add(7);
		ll.add(9);
		ll.add(10);
		
		Iterator<Integer> it1 = ll.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		System.out.println("Iteration linkedlist elements by using listiterator");
		
		ListIterator<Integer> llli = ll.listIterator();
		
		while(llli.hasNext())
		{
			System.out.println(llli.next());
		}
		
		System.out.println("Iteration Linkedlist elemnts by listiterator in reverse order");
		
		while(llli.hasPrevious())
		{
			System.out.println(llli.previous());
		}
		
// ------------------------------------------------------------
		
		Vector<Integer> vc = new Vector<Integer>();
		
		vc.add(11);
		vc.add(12);
		vc.add(13);
		vc.add(14);
		vc.add(15);
		
		System.out.println("Iteratoring vector Elements");
		Iterator<Integer> IT = vc.iterator();
		
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		
		System.out.println("Iteratoring vector Elements by using listIterator");
		ListIterator<Integer> vli = vc.listIterator();
		
		while(vli.hasNext())
		{
			System.out.println(vli.next());
		}
		
		System.out.println("Iteratoring vector Elements in reverse order by using listIterator");
		
		
		while(vli.hasPrevious())
		{
			System.out.println(vli.previous());
		}
		
		System.out.println("Iteratoring vector Elements in reverse order by using Enumeration");
		
		Enumeration<Integer> en =vc.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	}


