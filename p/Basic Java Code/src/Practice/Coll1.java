package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class Coll1 {

	public static void main(String[] args) {


		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		hm.put(6, "F");
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry map = (Map.Entry)it.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		
		
		
		

	}

}
