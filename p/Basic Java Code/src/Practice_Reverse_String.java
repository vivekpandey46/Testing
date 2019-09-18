
public class Practice_Reverse_String {

	public static void main(String[] args) {
		
		String str= "Vivek";
		int i = str.length();
		System.out.println(i);
		
		StringBuffer strb = new StringBuffer();
		
		for (int j=i-1;j>=0;j--)
		{
			strb=strb.append(str.charAt(j));
		}
			
		System.out.println(strb);
	}

}
