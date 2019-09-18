package CollectionFrameWork;

import java.util.LinkedList;

public class LinListoArray {

	public static void main(String[] args) {
	
		LinkedList<Integer> ls = new LinkedList<Integer>();
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		
		System.out.println(ls);
		
		Integer arr[] = new Integer[ls.size()];
		
//		for (int i = 0;i<ls.size();i++)
//		{
//			arr[i] = ls.get(i);
//			System.out.println(arr[i]);
//		}
		

		ls.toArray(arr);
		
		for (int k : arr)
		{
			System.out.println(k);
		}
	}

}
