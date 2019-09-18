package MethodOverloading;

public class TypePromotion {
	
	public static void Method( byte k)
	{
		System.out.println("Method 1");
	}
	
	public static void Method( short k)
	{
		System.out.println("Method 2");
	}
	
	public static void Method(int i )
	{
		System.out.println("Method 3");
	}
	public static void Method( long k)
	{
		System.out.println("Mthod 4");
		
	}
	
	
	public static void Method(float c)
	{
		System.out.println("Method 5");
	}
	
	 public static void Method(double k)
	 {
		 System.out.println("Method 6");
	 }
	public static void main(String[] args) {
		
		Method(1);

	}

}
