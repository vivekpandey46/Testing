package Practice;

public class StrStorVar {

	public static void main(String[] args) {
	
		String str = "Vivek";
		
//		StringBuffer strb = new StringBuffer(str);
//		
//		StringBuffer s = strb.reverse();
//		
//		System.out.println("The value of s is " +s);
//		
//		Integer len = str.length();
		int i = str.length();
		String rev = "";
		
		for (int j = i-1;j>=0;j--)
		{
		
			rev=rev+str.charAt(j);
			
			System.out.println(rev);
		}
		
		
		
		
		
		

		
		
		
		
	}

}
