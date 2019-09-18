package Practice;

public class LargestandSmallesValueFromArray {

	public static void main(String[] args) {
		
		int[] number = new int[]{1,2,3,4,5,6};
		
		int largest= number[0];
		int smallest = number[0];
		
		for (int i=1;i<number.length;i++)
		{
			if (number[i]>largest)
			
				largest = number[i];
			
		 else if(number[i]<smallest)
		
		  smallest = number[i];	
		
		}
			System.out.println("Smalles" + smallest);
			System.out.println("Largest" + largest);
		}
		
	}


