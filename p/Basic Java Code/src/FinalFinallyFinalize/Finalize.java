package FinalFinallyFinalize;

public class Finalize {
	
	public  void finalize()
	{
		System.out.println("Finalize Method");
	}

	public static void main(String[] args) {
		
		System.out.println("Main methods");
		
		Finalize a = new Finalize();
		Finalize a1 = new Finalize();
		
		a = null;
		a1 = a;

	System.gc();
	}

}
