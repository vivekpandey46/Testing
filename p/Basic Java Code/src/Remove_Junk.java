
public class Remove_Junk {
	

	public static void main(String[] args) {
		
		String s = "!@#$%%$$VivekPandey1234$^^^)](*^%";
		
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
		
		int a=10,b=20,c=30;
		//b=10,c=20,a=30;
		
		a = (a+b+c)-((c=b)+(b=a));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
