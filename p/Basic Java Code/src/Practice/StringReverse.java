package Practice;

public class StringReverse {
	
	public static void main(String[] args)
	{
		
		String s = "Vivek Pandey";
		//Method 1
		StringBuffer strb = new StringBuffer(s);
		
		System.out.println(strb.reverse());
		
		//Method2
		
		int i = s.length();
		String rev = "";
		 
		for (int j = i-1; j>=0;j--)
		{
			rev=rev+s.charAt(j);
		}
		
		System.out.println(rev);
		
		
		
	}

}
