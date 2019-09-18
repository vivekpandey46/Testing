package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting_Decending {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(9,1,4,3,7,4,12));
		
		System.out.println("Before Sorting");
		
		for (int counter: list)
		{
			System.out.println(counter);
		}

		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("After sorting");

		for(Integer counter: list)
		{
			System.out.println(counter);
		}
	}

}
