
public class Constructor_Chaining {
	
	Constructor_Chaining()
	{
		this("Vivek");
		System.out.println("No Parameter");
		
		
		
		
	}
	
	Constructor_Chaining(String s){
		this(7,8);
		
		System.out.println("Parameter");
	}
	Constructor_Chaining(int i, int j)
	{
		
		System.out.println("Constructor_Chaining");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_Chaining obj=new Constructor_Chaining();
	}

}
