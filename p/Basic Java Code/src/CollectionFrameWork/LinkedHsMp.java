package CollectionFrameWork;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHsMp {

	public static void main(String[] args) {
	
		LinkedHashMap<Integer, Integer> lsm = new LinkedHashMap<Integer, Integer>();
		
		lsm.put(1, 100);
		lsm.put(2, 200);
		lsm.put(3, 300);
		lsm.put(4, 400);
		lsm.put(5, 500);
		
		
		
		Set st = lsm.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mt = (Map.Entry)it.next();
			
			System.out.println(mt.getKey()+ "    "+ mt.getValue());
		}

	}

}
