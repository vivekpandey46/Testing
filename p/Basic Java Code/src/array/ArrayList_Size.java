package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Initial ArrayList Size " +list.size());
		
		list.add(11);
		list.add(2);
		list.add(14);
		list.add(22);
		list.add(25);
		
		System.out.println("ArrayList size afet addition " +list.size());
		
		System.out.println("Array list content");
		
		for(int counter: list)
		{
			System.out.println(counter);
		}
		System.out.println("Sort Arraylist Content");
		
		Collections.sort(list);
		
		for (int counter: list)
		{
			System.out.println(counter);
		}
		
		System.out.println("ArrayList Content sor in Decending orde");
		
		Collections.sort(list, Collections.reverseOrder());

		for (int counter: list)
		{
			System.out.println(counter);
		}
		
		
	}

}
