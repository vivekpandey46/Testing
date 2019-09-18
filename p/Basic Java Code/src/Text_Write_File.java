import java.io.*;

public class Text_Write_File
{
	public static void main(String[] args) 
	{


		String fileName="D://temp.txt";



	
	try{

		FileWriter fileWriter=new FileWriter(fileName);

		// Always wrap FileWriter in BufferedWriter.
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

		// Write something into the text file
		bufferedWriter.write("Hello there,");
		bufferedWriter.write(" this is.");
		bufferedWriter.newLine();
		bufferedWriter.write("testing puprpose");
		bufferedWriter.write(" only.");

		// Close the text file.
		bufferedWriter.close();
		
		System.out.println("Success");
	}
catch(IOException ex){
	
	
	System.out.println("Error writing to file  "+ fileName + " ");

}
	}

}