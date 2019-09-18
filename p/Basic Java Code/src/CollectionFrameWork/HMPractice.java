package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HMPractice {

	public static void main(String[] args) {
		
		HashMap<String, String> hmp = new HashMap<String, String>();
		
		
		hmp.put("A", "Vivek");
		hmp.put("B", "Kumar");
		hmp.put("C", "Pandey");
		hmp.put("D", "Vivek");
		hmp.put("A", "Vicky");
		
		
		Set	st = hmp.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mt = (Map.Entry)it.next();
			
			System.out.println("Key is = "+mt.getKey() + " Value is = "+mt.getValue());
		}

	}

}
