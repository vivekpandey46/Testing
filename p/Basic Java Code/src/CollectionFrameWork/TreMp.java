package CollectionFrameWork;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreMp {

	public static void main(String[] args) {
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		tm.put(1, 10);
		tm.put(2, 20);
		tm.put(3, 30);
		tm.put(4, 40);
		tm.put(5, 50);
		
		Set st = tm.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mt = (Map.Entry)it.next();
			
			System.out.println(mt.getKey() +"    " + mt.getValue());
			
		}
		
		

	}

}
