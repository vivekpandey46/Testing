package Practice0;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "Silent Please";
		String s2 = "Listen Please";
		
		boolean status = true;
		String s3 = s1.replaceAll(" ", "");
		String s4 = s2.replaceAll(" ", "");
		
		
		if (s3.length()!=s4.length())
		{
			status = false;
		}
		else
		{
			
			char c1[] = s3.toLowerCase().toCharArray();
			char c2[] = s4.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2); 
					
			
		}
		if (status)
		{
			System.out.println("Anagaram");
			
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		

	}

}
