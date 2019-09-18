package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Pr3 {

	public static void main(String[] args) {

		System.out.println("ArrayList to Linkedlist Conversion");
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(0);
		al.add(9);
		al.add(7);
		al.add(5);
		al.add(3);
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(7);

		LinkedList<Integer> ll = new LinkedList<Integer>(al);
		System.out.println(ll);
		
		System.out.println("ArrayList to Vector Conversion");
		
		Vector<Integer> vc = new Vector<Integer>(al);
		
		System.out.println(vc);
		
		System.out.println("ArrayList to Array Conversion");
		
		Integer it[] = new Integer[al.size()];
		
		for (int i = 0;i<al.size();i++)
		{
			it [i]= al.get(i);
			
			System.out.println(it[i]);	
		}
		
		System.out.println("Convesrion of Array elemnts into ArrayList");
		
		Integer arr[] = {0,9,8,76,5,4,3,2,1};
		
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(arr));
		
		System.out.println(al1);
		
		System.out.println("Convesrion of Arraylist elemnts into LinkedList");
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>(Arrays.asList(arr));
		
		System.out.println(ll1);
//	--------------------------------------------------------------------------------
		
		System.out.println("Convesrion of LinkedList elemnts into Array");
		
		
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		
		ll2.add(11);
		ll2.add(12);
		ll2.add(13);
		ll2.add(14);
		ll2.add(15);
		ll2.add(16);
		
		
		Integer arr1[] = new Integer[ll2.size()];
		
		ll2.toArray(arr1);
		
		
		for (int  k : arr1)
		{
			System.out.println(k);
		}
		
//		for (int i = 0;i<ll2.size();i++)
//		{
//			arr1[i] = ll2.get(i);
//			
//			System.out.println(arr1[i]);
//		}
//		
		
		
		
		
				
				
		
		
		
		
		
	}

}
