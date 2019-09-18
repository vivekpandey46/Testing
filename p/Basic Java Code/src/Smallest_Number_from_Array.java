
public class Smallest_Number_from_Array {

	public static void main(String[] args) {
		
		
		int number[]= new int[]{2,5,9,65,53,12};
		
		int Smallest = number[0];
		
		for (int i=1;i<number.length;i++)
		{
			if (number[i]<Smallest)
				number[i]=Smallest;
		}
System.out.println(Smallest);
	}

}
