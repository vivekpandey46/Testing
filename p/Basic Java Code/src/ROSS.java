
public class ROSS {

	public static void main(String[] args) {
	
	
//		String str[] = {"Vivek","Kumar","Pandey","ABC","Swati"};
//		
//		
//		
//		for (int i=str.length-1; i>=0; i--)
//		{
//			System.out.println(str[i]);
//		}
//		
		
		
		
		
		String s = "Vivek,Kumar,Pandey,ABC,Swati";
		String[] split = s.split(",");
		 

		for (int i=split.length-1; i>=0; i--)
		{
			System.out.println(split[i]);
		}
					
	}

	

}
