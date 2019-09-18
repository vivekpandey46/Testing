import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {

		String s1 = "Listen Please";
		String s2  ="Silent please";
		
		boolean status = true;
		
		String str1 = s1.replaceAll(" ", "");
		String str2 = s2.replaceAll(" ", "");
		
		if (str1.length()!=str2.length())
		{
			status = false;
			
		}
		
		else{
			
			char c1[] = str1.toLowerCase().toCharArray();
			char c2[] = str2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			
			status = Arrays.equals(c1, c2);
				
		}
		
		if(status)
		{
			System.out.println("Anagram ");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		
		
		
		
		
				
	}
	
	

}
