package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class SyncArrLis {

	public static void main(String[] args) {
		
		ArrayList<String> al = (ArrayList<String>) Collections.synchronizedList(new ArrayList<String>());
		
	}

}
