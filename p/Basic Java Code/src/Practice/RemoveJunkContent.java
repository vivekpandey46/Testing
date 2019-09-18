package Practice;

public class RemoveJunkContent {

	public static void main(String[] args) {

		String s="!@#$%^&^&^%$$12345ANCDKDCNacndcdc";
		String FresValue= s.replaceAll("[^a-zA-Z0-9]", "");
				
				System.out.println(FresValue);

	}

}
