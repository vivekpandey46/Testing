package StringJava;

public class FirstProgram {

	public static void main(String[] args) {
		String s1  = "VIvek";
		
		String s2 =s1.concat("Pandey");
		
		System.out.println(s2);
		
		String s3 = new String("Vivek");
		
		s3.concat(" Pandey");
		
		System.out.println(s3);

		System.out.println(s3.charAt(2));
		System.out.println(s3.length());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.indexOf("i"));
		
		boolean b = s3.equals("Vivek");
		System.out.println(b);
		
		boolean b1 = s3.equalsIgnoreCase("VIVEK");
		System.out.println(b1);
		
		
		boolean b3 = s3.startsWith("V");
		System.out.println(b3);
		
		boolean b4 = s3.startsWith("V", 2);
		
		System.out.println(b4);
	}
	

}
