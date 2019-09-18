package Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writing {

	public static void main(String[] args) {
		
		String writr= "D://temp1.txt";
		
		try {
			FileWriter flw= new FileWriter(writr);
			BufferedWriter bfw = new BufferedWriter(flw);
			
			bfw.write("Hi Buddy");
			
		bfw.close();
			
		System.out.println("Successfully");
			
		}

		catch(Exception e){
			System.out.println(e);
		}
	}

}
