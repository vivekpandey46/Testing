package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		
		HDFC hb = new HDFC();
		hb.CarLoan();
		hb.EducationLoan();
		hb.HomeLoan();
		hb.Loan();
		hb.PersonalLoan();
System.out.println("************************************************");		
		Bank b= new HDFC();
		b.HomeLoan();
		b.CarLoan();
		b.Loan();
		b.EducationLoan();
//		b.PersonalLoan()
		
		

	}

}
