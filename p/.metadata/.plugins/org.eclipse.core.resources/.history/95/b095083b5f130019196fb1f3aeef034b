package ExceptionHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Program1 {

	public static void main(String[] args) {

		
		try{
			
			
			FileReader fr= new FileReader("TestFile.txt");
			int i = 9/0;
			System.out.println("Successfully Worked");
			
			
		}
		

		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		
		}
		

		catch (Exception e)
		{
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

	
		


	}

}
