package SuperKeyword;

public class TestCase2 extends TestCase1{
	
	 TestCase2() {
	
		System.out.println("This is child class non paramatrized constructor");
	}
	
	
	 TestCase2(int i)
	 {
		 System.out.println("This is child class paramatrized constructor");
	 }

	public static void main(String[] args) {
		
		TestCase2 t2 = new TestCase2();
		TestCase2 t3 = new TestCase2(10);
		

	}

}
