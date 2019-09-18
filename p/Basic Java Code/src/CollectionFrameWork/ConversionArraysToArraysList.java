package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ConversionArraysToArraysList {

	public static void main(String[] args) {
	
		String list[] = {"ABC","DEF","GHI","JKL"};
		
		//First Method
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(list));
		
		System.out.println(list1);
		
		//Second Method
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		Collections.addAll(list2, list);
		
		System.out.println(list2);
		
		//Third Method Manually
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		for(int i = 0;i<list.length;i++)
		{
			list3.add(list[i]);
		}
		
		System.out.println(list3);
	}

}
