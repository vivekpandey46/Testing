package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Vector;

public class ENU {

	public static void main(String[] args) {
		
		Vector<Integer> vc = new Vector<Integer>();
		
		vc.add(1);
		vc.add(2);
		vc.add(3);
		
		Enumeration<Integer> en = vc.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		

	}

}
