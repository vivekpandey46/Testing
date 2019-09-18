package Practice1;

public class Pattern3 {

	public static void main(String[] args) {
		
		int number = 5;
		for (int i = 1;i<=number;i++)
		{
			for (int j =number;j>1;j--)
			{
				System.out.println(" ");
			}
			for (int k = 1;k<=i;k++)
			{
				System.out.print("*");
			}
			
		}

		System.out.println();
	}

}
