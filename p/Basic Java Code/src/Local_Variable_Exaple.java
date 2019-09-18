
public class Local_Variable_Exaple {

	public String name = "Vivek";
	
	public void details()
	{
		String name="Pandey";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Local_Variable_Exaple obj1=new Local_Variable_Exaple();
		
		obj1.details();
		System.out.println(obj1.name);
	}

}
