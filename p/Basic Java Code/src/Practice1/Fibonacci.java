package Practice1;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int a= 0;
		int b = 1;
		int number = 10;
		int sum = 0;
		
		for(int i = 1;i<=number;i++)
		{
		
			System.out.print(a + "\t" );
			
			sum = a+b;
			
			a=b;
			b=sum;
			
		}
		
	}
}
