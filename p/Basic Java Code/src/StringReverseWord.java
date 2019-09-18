
public class StringReverseWord {

	public static void main(String[] args) {
		
		String str = "I am Vivek Pandey";
		
		String arr[] = str.split(" ");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		
		
		
		
		
		for (int i=0;i<arr.length;i++)
		{
			
			StringBuffer strb = new StringBuffer(arr[i]);
			
			System.out.print(strb.reverse()+"\t");
		}

	}

}
