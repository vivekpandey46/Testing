package CollectionFrameWork;

import java.util.HashSet;

public class hssetToArray {

	public static void main(String[] args) {
	
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		
		Integer it[] = new Integer[hs.size()];
		
		hs.toArray(it);
		
		
		
		

	}

}
