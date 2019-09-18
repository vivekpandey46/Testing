
public class Pair {

	public static void main(String[] args) {
		
		int[] number=new int[]{2,-2,10,40,2,6};
		
		int k = number.length;
		
		for(int i=0;i<k;i++)
		{
			for (int j =i+1;j<k-i;j++)
			{
			
				if (number[i]+number[j]==4)
				{
					System.out.print(number[i] +",");
					System.out.println(number[j]);
					
				}
				
				else if (number[i]-number[j]==4)
				{
					System.out.print(number[i] +",");
					System.out.println(number[j]);
				}
				
				
			}
			
		}

	}

}
