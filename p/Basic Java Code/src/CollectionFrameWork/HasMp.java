package CollectionFrameWork;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMp {

	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Name", "Vivek");
		hm.put("Kumar", "Kumar");
		hm.put("Name", "Pandey");

		// By using For Loop		
		
//		for (Map.Entry m : hm.entrySet())
//		{
//			System.out.println("Key is " + m.getKey()+ " And Value is " + m.getValue());
//		}
		
//		By using Iterator
		
		Set st = hm.entrySet();
		
		Iterator it = st.iterator();
		
		while(it.hasNext())
		{
			Map.Entry metry = (Map.Entry)it.next();
			
			System.out.println("Key is " + metry.getKey() + " Value : " + metry.getValue());
		}
		
	}

}
