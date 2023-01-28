package suchetanBank;

public class Saving extends Account {
	double minimumBalance = 500.0;
	
	public Saving()
	{
		System.out.println("Saving account is created. Minimum balance is - "+minimumBalance);
	}
	@Override
	public void display()
	{
		System.out.println("This is the Savings account with AccountID - "+accountID +" The minimum balance allowed is- " + minimumBalance);
	}
}
