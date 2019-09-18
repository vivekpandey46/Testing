package ExceptionHandeling;

public class Program2 {

	
	public void method4()
	{
		int i = 9/0;
		System.out.println("Method1");
	}
	
	public void method3()
	{
		method4();
		System.out.println("Method2");
	}
	
	public void method2()
	{
		try{
		method3();
		System.out.println("Method2");
		}
		catch(Exception e)
		{
			System.out.println("Handelled");
		}
	}
	public void method1()
	{
		
		method2();
		System.out.println("Method1");
		
		
	}
	public static void main(String[] args) {

		Program2 pr = new Program2();
		pr.method1();
		
}

}
