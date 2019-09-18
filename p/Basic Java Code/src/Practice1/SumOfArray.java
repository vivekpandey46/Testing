package Practice1;

public class SumOfArray {

	public static void main(String[] args) {

		int[] number = new int[]{1,2,3};
		
		int sum = 0;
		
		for (int i = 0;i<number.length;i++)
		{
			sum = sum+number[i];
		}
		
		System.out.println(sum);
		

	}

}
