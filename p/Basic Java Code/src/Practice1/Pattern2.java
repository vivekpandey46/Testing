package Practice1;

public class Pattern2 {

	public static void main(String[] args) {
	
		int number = 10;
		for (int i = 1;i<=number;i++)
		{
			for (int j =number;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
