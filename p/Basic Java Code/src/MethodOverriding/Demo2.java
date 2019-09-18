package MethodOverriding;

public class Demo2 extends Demo1 {
	
	public Demo2(){
		System.out.println("");
	}
	
	public void  Method()
	{
		
		System.out.println("Method Called from Child class");
		
		
	}

	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		d.Method();
		
		Demo2  d2 = new Demo2();

		
		
		
		

	}

}
