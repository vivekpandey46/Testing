package Inheritance;

public class Test {

	public static void main(String[] args) {
		
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		b.engine();
		
System.out.println("******************************************");		
		Car c=new Car();
		
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
	
System.out.println("******************************************");
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		
		System.out.println("******************************************");
		
		GrantTest t = new GrantTest();
		t.engine();
		
	}

}
