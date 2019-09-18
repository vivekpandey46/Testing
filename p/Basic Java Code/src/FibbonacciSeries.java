
public class FibbonacciSeries {

	public static void main(String[] args) {
		
		int num1=0;
		int num2 = 1;
		int sum = 0;
		
		for(int i = 1;i<=10;i++)
		{
			System.out.print(num1 + "\t");
			sum = num1+num2;
			
			num1 = num2;
			num2= sum;
		}

	}

}
