package InputOutput;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	
	 public static void main( String[] args )
	   {	
	      try {
		     File file = new File("D:\\newfile.txt");
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	             boolean fvar = file.createNewFile();
	             System.out.println(fvar);
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }
	   }

}
