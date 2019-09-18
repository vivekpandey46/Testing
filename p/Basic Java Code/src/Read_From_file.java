import java.io.*;

public class Read_From_file{
public static void main(String [] args){

	// The name of the file to open.
	String fileName="D://temp.txt";

	// Reference to a line
	String line=null;

	try{
		// FileReader reads text files in the default encoding.
		FileReader fileReader=new FileReader(fileName);

		// Always wrap FileReader in BufferedReader.
		BufferedReader bufferedReader=new BufferedReader(fileReader);

		while((line=bufferedReader.readLine()) !=null){
			System.out.println(line);
		}

		// Close file after reading.
		
		bufferedReader.close();
	}
catch(FileNotFoundException ex)
{
	System.out.println("Unable to open file '" +fileName + "'"); 
		}
	catch(IOException ex)
{
	System.out.println("Error reading file "+ fileName + " "); 
	
}
}
}