package Practice1;

public class Fectorial {

	public static void main(String[] args) {

		int number = 10;
		int fectorial = 1;
		
		for (int i= number;i>0;i--)
		{
			fectorial = fectorial*i;
		}
		System.out.println(fectorial);

	}

}
