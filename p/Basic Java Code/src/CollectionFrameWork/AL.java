package CollectionFrameWork;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Vivek");
		list.add("Pandey");
		list.add("Kumar");
		
		for (String list1 : list)
		{
			System.out.println(list1);
		}
		
		list.remove("Kumar");
		list.set(0, "Vicky");
		
		for (String list2 : list)
		{
			System.out.println(list2);
		}
		
		int size = list.size();
		
		System.out.println(size);
		
		System.out.println("+++++++++++++++++Clearing ArrayList Busffer++++++++++++++++++++++");
		
		
		boolean bl = list.contains("Vick");
		
		
		System.out.println(bl);
		list.clear();
		
		for(String list3 : list)
		{
			System.out.println(list3);
		}
		
		
		
	

	}

}
