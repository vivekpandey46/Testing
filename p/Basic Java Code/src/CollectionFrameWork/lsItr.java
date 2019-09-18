package CollectionFrameWork;

import java.util.ArrayList;
import java.util.ListIterator;

public class lsItr {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		
		
		ListIterator<String> itr = al.listIterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		System.out.println("________________________________________");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		

	}

}
