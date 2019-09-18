import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/p/Selenium Tag/src/config.properties");
		
		prop.load(ip);
		
		String F_Name = prop.getProperty("First_Name");
		String L_Name = prop.getProperty("Last_Name");
		
		System.out.println(F_Name);
		System.out.println(L_Name);
		
		

	}

}
