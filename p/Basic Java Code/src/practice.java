
public class practice {

	public static void main(String[] args) {
		
		int[] number = new int[]{2,5,38,48,35,99};
		
		int largest= number[0];
		int smallest= number[0];
		
		for (int i=1;i<number.length;i++)
		{
			if (number[i]>largest)
			largest = number[i];
			else if (number[i]<smallest)
				smallest = number[i];
				}
		System.out.println("Largest number" + largest);
		System.out.println("Smallest number" + smallest);

	}

}
