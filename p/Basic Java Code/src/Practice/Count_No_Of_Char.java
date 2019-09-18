package Practice;

import java.util.HashMap;
import java.util.Set;

public class Count_No_Of_Char {

	public static void main(String[] args) {
	
		String str = "VIVEK";
		
		char[] chr = str.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : chr)
		{
			if (map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch , 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		for (Character ch : keys)
		{
			if (map.get(ch)>1);
			{
				System.out.println(ch+" "+map.get(ch));
			}
			
		}	
		
			}
			
			
		}
		
	
		
		
