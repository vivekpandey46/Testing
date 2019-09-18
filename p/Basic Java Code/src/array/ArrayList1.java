package array;
import java.util.*;

public class ArrayList1 {
   public static void main(String args[]) {
     
	   ArrayList<String> list=new ArrayList<String>();
	   
	   list.add("Vivek");
	   list.add("Kumar");
	   list.add("Pandey");
	   
	   System.out.println(list);
	   
	   list.remove(2);
	   
	   System.out.println(list);
	   
	   list.add(1, "abcd");
	   
	   System.out.println(list);
	   
	   list.remove(1);
	   System.out.println(list);
	   
	   list.set(1,"Pandey");
	   
	   System.out.println(list);
	   
	   System.out.println(list.size());
	   
	   list.clear();
	   System.out.println("Empty" +list);
   }
}
