package Practice;

public class NumberCheckInArray {

	public static void checking(int number)
	{
	
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i<a.length;i++)
		{
			if(a[i] == number)
			{
				System.out.println(number + " This number present in Array");
			}
			else if(a[i]!=number)
			{
				System.out.println("Number is not present");
			}
			
		}
		
		
	}
	public static void main(String[] args) {
	
		
		checking(9);

	}

}
