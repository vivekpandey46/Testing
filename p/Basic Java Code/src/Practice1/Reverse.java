package Practice1;

public class Reverse {

	public static void main(String[] args) {

		String str = "Vivek";
		
		
		StringBuffer strb =new StringBuffer(str);
		
		System.out.println(strb.reverse());
		
		int number = 1234567890;
		int sum = 0;
		while (number!=0)
		{
			sum = sum*10 + number%10;
			
			number = number/10;
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		

	}

}
