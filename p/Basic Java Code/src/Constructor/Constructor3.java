package Constructor;

public class Constructor3 {

	public Constructor3()
	{
		System.out.println("Null");
	}
	
	public Constructor3(int i)
	{
		this();
		System.out.println("1");
	}
	
	public Constructor3(int a,int b)
	{
		
		this(a);
		System.out.println("2");
		
	}
	
	public Constructor3(int i,int j,int k)
	{
		this(i,k);
		System.out.println("3");
	}
	public static void main(String[] args) {
		Constructor3 obj=new Constructor3(1,2,3);

	}

}
