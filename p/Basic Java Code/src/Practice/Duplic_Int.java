package Practice;

public class Duplic_Int {

	public static void main(String[] args) {
		
		
		int a[] = {0,1,2,2,3,4,5,7,7,9,9,9};
		
		for (int i = 0;i<a.length;i++)
		{
			for(int k = i+1;k<a.length;k++)
			{
					
				if (a[i]==a[k])
				{
					System.out.println("Duplicate Number is " + a[i]);
					
				}
			}
		}

	}

}
