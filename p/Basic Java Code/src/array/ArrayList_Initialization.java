package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayList_Initialization {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(Arrays.asList(1,2,3,4,"Vivek"));
		
		System.out.println(list);

	}

}
