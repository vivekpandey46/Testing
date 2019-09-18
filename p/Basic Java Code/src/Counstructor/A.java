package Counstructor;

public class A {
	

	
	public A(int i)
	{
		this(1,2);
		System.out.println(i);
	}
	
	public A(int i, int j)
	{
		this(10,20,30);
		System.out.println(i);
		System.out.println(j);
	}
	
	public A(int i, int j, int k)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
