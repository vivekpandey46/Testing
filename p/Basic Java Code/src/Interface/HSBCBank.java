package Interface;

public class HSBCBank implements USbank , BrazilBank{

	@Override
	public void credit() {
		System.out.println("Amount Credited in your account");
		
	}

	@Override
	public void debit() {
		
		System.out.println("Amount Debited from your Account");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("Amount transffered from your account");
		
	}
	
	public void educationLoan()
	{
		System.out.println("HSBC Education Loan");
	}
	
	public void CarLoan()
	{
		System.out.println("HSBC Car Loan");
	}

	
	public void MutualFund() {
	
		System.out.println("Mutual Fund from BrazilBank");
		
		
	}

}
