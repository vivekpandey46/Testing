
public class MissingNumbser2 {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20};
		
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 0;i<a.length;i++)
		{
			sum = sum+ a[i];
		}
		
		for (int k =1;k<=20;k++)
		{
			sum1 = sum1+k;
		}
		
		System.out.println("Missing number is "+ (sum1-sum));
	}

}
