public class IntFetchFromString {

	public static void main(String[] args) {

		String str = "This is the Error $$$$%Y&^$#@@ Code 4010";
		System.out.println("Error Number is: "+ str.replaceAll("[^a-z A-Z]",""));		
	}

}
