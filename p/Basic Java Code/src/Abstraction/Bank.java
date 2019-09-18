package Abstraction;

public abstract class Bank {
	
	public abstract void Loan() ;
	
	public abstract void EducationLoan();
	
	public void HomeLoan()
	{
		System.out.println("Parent Class");		
	}
	
	public void CarLoan()
	{
		System.out.println("Parent Class");		
	}

}
