package FinalFinallyFinalize;

public class Finally {

	public static void main(String[] args) {
	
		test();
		
	}	
		public static void test()
		{
			try{
				System.out.println("Try Block");
				int i = 10/0;
			}
			
			catch(Exception e)
			{
				System.out.println("Catch Block");
			}
			finally
			{
				System.out.println("Finally Block");
			}
		}	
		public static void test2()
		{
			try{
				System.out.println();
				
			}
			
			catch (Exception e) {
				
				System.out.println("");
				
			}
           
			finally
			{
				System.out.println("");
			}
		}

	}


