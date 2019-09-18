package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Vector;

public class ConversionVectToArray {

	public static void main(String[] args) {

		Vector<Integer> vc = new Vector<Integer>();
		
		vc.add(1);
		vc.add(2);
		vc.add(3);
		vc.add(4);
		vc.add(5);
		
		Enumeration<Integer> en=vc.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
//		Method 1

		Integer it[] = new Integer[vc.size()];
		
		vc.toArray(it);
		
		System.out.println("After Conversion");
		
		Enumeration<Integer> en1=vc.elements();
		while(en1.hasMoreElements())
		{
			System.out.println(en1.nextElement());
		}
		
		
//		Method 2
		
		System.out.println("Method 2");
		for (int k = 0; k<vc.size();k++)
		{
			it[k] = vc.get(k);
			System.out.println(it[k]);
		}
		
	}

}
