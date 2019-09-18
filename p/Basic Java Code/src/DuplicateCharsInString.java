import java.util.HashMap;
import java.util.Set;
 
public class DuplicateCharsInString {
 
//    public void findDuplicateChars(String str){
         
//        HashMap<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
//        
//        char[] chrs = str.toCharArray();
//        
//        for(Character ch:chrs)
//        {
//            if(dupMap.containsKey(ch))
//            {
//                dupMap.put(ch, dupMap.get(ch)+1);
//            }
//            else 
//            {
//                dupMap.put(ch, 1);
//            }
//        }
//        Set<Character> keys = dupMap.keySet();
//        for(Character ch:keys)
//        {
//            if(dupMap.get(ch) > 1)
//            {
//                System.out.println(ch+"--->"+dupMap.get(ch));
//            }
//        }
//    }
//    	-----------------------------------------------------------------------------------------------------
//     
//    public static void main(String a[]){
//        DuplicateCharsInString dcs = new DuplicateCharsInString();
//        dcs.findDuplicateChars("vivek Pandeye");
    	
    	 public static void main(String a[]){
    
    String St = "vivek Pandey";
    
    
    
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    char ch[] = St.toCharArray();
    for (Character w :ch)
    {
    	if (map.containsKey(w))
    	{
    		map.put(w, map.get(w)+1);
    	}
    	
    	else
    	{
    		map.put(w, 1);
    	}
    }
    
    Set<Character> keys = map.keySet();
    
    for (Character w:keys)
    {
    	if (map.get(w)>1)
    	{
    		System.out.println(w+" "+map.get(w));
    	}
    }
    
    	
    	
    	
    }
}