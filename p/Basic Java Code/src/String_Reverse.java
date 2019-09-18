public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Vivek"; 
		

		//Method 1
		StringBuffer strb = new StringBuffer(s);
		System.out.println(strb.reverse());
		
		//Method 2
		int i = s.length();
		String rev = "";
		for (int j = i-1;j>=0;j--)
		{
		
			rev=rev+s.charAt(j);
		}

		System.out.println(rev);
		}
	}
