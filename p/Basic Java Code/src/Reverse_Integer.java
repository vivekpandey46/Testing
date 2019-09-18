import java.io.IOException;
import java.util.Scanner;


public class Reverse_Integer {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException
	
	{
		
		   Scanner sc=new Scanner(System.in);  
		     
		   System.out.println("Enter your no");
		   
		int numbers = sc.nextInt();
		int reverse = 0;
		
		while(numbers!=0){
			
			reverse = reverse*10 + numbers%10;
			numbers = numbers/10;
		}
		
		System.out.println(reverse);		
				}

	 
}
