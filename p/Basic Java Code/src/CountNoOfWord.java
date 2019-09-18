
public class CountNoOfWord {

	public static void main(String[] args) {
		
		
		String str = "Hi All how's the day";
		
		int total = 0;
		
		String arr[] = str.split(" ");
		
		
		for (int i = 0 ;i<arr.length;i++)
		{
			total ++;
		}
		System.out.println(total);
	}

}
