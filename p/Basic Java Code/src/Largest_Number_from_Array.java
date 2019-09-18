
public class Largest_Number_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]= new int[]{3,5,2,9,1,2,10};
		
		int Largest = number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(number[i]>Largest)
				Largest = number[i];
		}
		System.out.println(Largest);
		}
}
