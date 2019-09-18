
public class SwapTheNumser {

	public static void main(String[] args) {
		
		int a=10;
		int b = 5;
		
		System.out.println("Value for a before swaping" +a);
		System.out.println("Value for b before swaping" +b);
		
		//a = a+b;
		//b =a-b;
		//a = a-b;
		
		//a=a*b;
		//b=a/b;
		//a=a/b;
		
		a=a^b;
		b=a^b;
		a=a^b;
		

		System.out.println("Value for a After swaping" +a);
		System.out.println("Value for b After swaping" +b);
		
		

	}

}
