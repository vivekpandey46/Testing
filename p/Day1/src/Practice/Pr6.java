package Practice;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Pr6 {

	public static void main(String[] args) {
	
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		hm.put(12, 100);
		hm.put(17, 200);
		hm.put(19, 300);
		hm.put(1, 400);
		hm.put(14, 500);
		hm.put(25, 600);
		hm.put(28, 700);
		hm.put(40, 800);
		hm.put(41, 900);
		hm.put(49, 1000);
		hm.put(51, 1100);
		hm.put(70, 1200);
		hm.put(79, 1300);
		
		
		
		Iterator itr = hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry me = (Map.Entry)itr.next();
			
			
			System.out.println(me.getKey()+"------------"+me.getValue());
		}
		
		
		System.out.println("After sorting");
		
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(hm);
		
		
		Iterator itr1 = tm.entrySet().iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry me2 = (Map.Entry)itr1.next();
			
			System.out.println(me2.getKey()+"-----------"+me2.getValue());
		}
		
		
		
		
		

	}

}
