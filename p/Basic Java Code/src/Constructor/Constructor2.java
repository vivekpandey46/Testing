package Constructor;

public class Constructor2 {

	public Constructor2()
	{
		System.out.println("Non Paramatrized Constructor");
	}
	
	public Constructor2(int i)
	{
		System.out.println(i);
	}
	
	public Constructor2(int i,int j){
		
		int a = i+j;
		
		System.out.println(a);
	}
	
	public Constructor2(float k, int l)
	{
		float a=k+l;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Constructor2 obj=new Constructor2();
		Constructor2 obj1=new Constructor2(1,1);
		Constructor2 obj2=new Constructor2(1);
		Constructor2 obj3=new Constructor2(1,1);
		

	}

}
