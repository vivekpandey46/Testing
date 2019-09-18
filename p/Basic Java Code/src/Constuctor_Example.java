
public class Constuctor_Example {
	
	Constuctor_Example()
	{
		
		System.out.println("Inside Non Paramatrze Constructor");
	}
	
	Constuctor_Example(int i,int j)
	{
		
		int c= i+j;
		
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		Constuctor_Example obj1=new Constuctor_Example(2,3);
		Constuctor_Example obj2=new Constuctor_Example();
		

		
	}

}
