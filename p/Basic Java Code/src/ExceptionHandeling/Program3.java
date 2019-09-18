package ExceptionHandeling;

public class Program3 {

	
	public void m1() 
	{
		try
		{
			int i=9/0;
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) throws Exception {
		
		
		
		Program3 p3= new Program3();
		
		p3.m1();
		

	}

}
