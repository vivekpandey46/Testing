package QSpier_Demos;
import java.util.HashMap;
import java.util.Set;



public class DuplicateChar {
	public static void main(String[] args) {

		String str = "Vivek PandeeeVVey";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		char ch[] = str.toCharArray();
		
		for (char w : ch)
		{
			if (map.containsKey(w))
			{
				map.put(w, map.get(w)+1);
			}
			else
			{
				map.put(w, 1);
			}
			
			
			Set<Character> keys = map.keySet();
			
			for (Character w1 : keys)
			{
				if (map.get(w1)>1)
					
					System.out.println(w1 + " "+ map.get(w1));
			}
			
		}
		
		
		
		
					
		}
		
		
		
		
		
	}
	
	


