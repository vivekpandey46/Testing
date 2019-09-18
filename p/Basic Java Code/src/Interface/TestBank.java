package Interface;

public class TestBank {

public static void main(String[] args) {
		
	System.out.println("**************************************************");
		HSBCBank hs = new HSBCBank();
		
		hs.CarLoan();
		hs.educationLoan();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		
	System.out.println("***************************************************");		
		USbank us = new HSBCBank();
		
		us.credit();
		us.debit();
		us.transferMoney();
		
	System.out.println("***************************************************");
	
	BrazilBank br = new HSBCBank();
	
	br.MutualFund();
	

}
}
