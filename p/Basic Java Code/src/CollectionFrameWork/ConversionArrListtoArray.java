package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ConversionArrListtoArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		
		Integer in[] = new Integer[al.size()];
		
//		for (int j = 0;j<al.size();j++)
//		{
//			in[j]=al.get(j);
//			
//			System.out.println(in[j]);
//		}
		
	
		al.toArray(in);
		
		for (int k : in){
		
		System.out.println(k);
		}
		
		

	}

}
