package Itr;

import java.util.ArrayList;
import java.util.Iterator;

public class Itr1 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Vivek");
		str.add("Kumar");
		str.add("Pandey");
		
		Iterator it = str.iterator();
		
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
