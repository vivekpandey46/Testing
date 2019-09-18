package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Shorting_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,4,2,7,5,9,10));
		
		System.out.println("Before Shorting");
		
		for (Integer counter: list)
		{
			System.out.println(counter);
		}
		
		Collections.sort(list);
		
		System.out.println("After sorting");
		
		for(Integer counet:list)
		{
			System.out.println(counet);
		}
	}

}
