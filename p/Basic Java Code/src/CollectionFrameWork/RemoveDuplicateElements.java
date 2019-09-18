package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Vivek");
		str.add("Pandey");
		str.add("Kumar");
		str.add("Vivek");
		
		System.out.println("Before Removing Duplicate Elements");
		
		Iterator<String> it = str.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		LinkedHashSet<String> Lhs = new LinkedHashSet<String>();
		
		Lhs.addAll(str);
		
		str.clear();
		
		str.addAll(Lhs);
		
		System.out.println("After Removing Duplicate Elements");
		
Iterator<String> it1 = str.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		

	}

}
