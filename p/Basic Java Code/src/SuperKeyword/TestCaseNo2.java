package SuperKeyword;

public class TestCaseNo2 extends TestCaseNo1{
	
	public void method()
	{
		
		System.out.println("Child class Method");
	}
	public void method2()
	{
		
		super.method();
		method();
	}

	public static void main(String[] args) {
		
		TestCaseNo2 t2 = new TestCaseNo2();
		t2.method2();

	}

}
