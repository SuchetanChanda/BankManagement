package suchetanBank;

public class Current extends Account{
	double minimumBalance = 0.0;
	
	public Current()
	{
		System.out.println("Current account is created! Minimum balance is -" + minimumBalance);
	}
	@Override
	public void display() {
		System.out.println("This is the Current Acoount with AccountID - "+accountID +" Minimum Balance allowed is- "+minimumBalance);
	}
}
