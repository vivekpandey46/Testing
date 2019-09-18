package ExceptionHandeling;



public class ThrowProgram {
	
	public static void  m1(int i)
	{
	
		if (i<17)
		{
			throw new ArithmeticException("Not Valid number");
		}
		
		else
		{
			System.out.println("Welcome");
		}
	}


	
	public static void main(String[] args) {
	
		try{
			m1(11);
			int i = 10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Success");

	}

}
