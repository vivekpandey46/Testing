package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Pr5 {

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		
		Integer hsarr[] = new Integer[hs.size()];
		
		hs.toArray(hsarr);
		
		for (int l : hsarr)
		{
			System.out.println(l);
		}
		System.out.println("Converting HashSet to treeset");
		
		TreeSet<Integer> ts = new TreeSet<Integer>(hs);
		
		System.out.println(ts);
		
		System.out.println("Converting HashSet to ArrayList");
		
		ArrayList<Integer> alhs = new ArrayList<Integer>(hs);
		
		System.out.println(alhs);
				

	}

}
