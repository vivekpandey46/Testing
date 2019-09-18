package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortingHMKey {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmp1 = new HashMap<Integer, String>();
		
		hmp1.put(98, "A");
		hmp1.put(55, "B");
		hmp1.put(99, "C");
		hmp1.put(32, "D");
		hmp1.put(21, "E");
		hmp1.put(87, "F");
		hmp1.put(9, "H");
		hmp1.put(91, "I");
		hmp1.put(95, "J");
		hmp1.put(45, "K");
		hmp1.put(87, "L");
		hmp1.put(89, "M");
		hmp1.put(100, "N");
		
		System.out.println("The size of HashMap is " + hmp1.size());
		
		
		Set st = hmp1.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mt = (Map.Entry)it.next();
			
			System.out.println(mt.getKey()+ "   "+ mt.getValue());
		}
		
		System.out.println("-------------------After Sorting-------------------");
		
		Map<Integer, String> mp = new TreeMap<Integer, String>(hmp1);
		
		Set lhm = mp.entrySet();
		
		Iterator it1 = lhm.iterator();
		
		while(it1.hasNext())
		{
			Map.Entry mt1 = (Map.Entry)it1.next();
			
			System.out.println(mt1.getKey()+ "   "+ mt1.getValue());
		}

	}

}
