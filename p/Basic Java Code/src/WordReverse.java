
public class WordReverse {

	public static void main(String[] args) {
		
		
		String str = "I am Vivek Pandey";
		

		
		String arr[] = str.split(" ");
		
		
		for (int i=arr.length-1;i>=0;i--)	
		{
			
			StringBuffer strb = new StringBuffer(arr[i]);
			System.out.print(strb.reverse()+"\t");
			
		}

//	StringBuffer strb = new StringBuffer(str);
//	System.out.println(strb.reverse());
	
	}

}
