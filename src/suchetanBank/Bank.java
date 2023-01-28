package suchetanBank;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*********** Welcome to Suchetan Bank Limited ***********");
		
		System.out.println(" Create an new Customer: ");
		
		System.out.println("Enter your Name: ");
		String Name = sc.nextLine();
		
		System.out.println("Enter Username: ");
		String userName = sc.next();
		
		System.out.println("Enter Password: ");
		String passWord = sc.next();
		
		System.out.println("Enter your Age: ");
		int Age = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter your SSN: ");
		String SSN = sc.nextLine();

		System.out.println("Enter your Address: ");
		String Address = sc.nextLine();
		

		System.out.println("Enter your Email: ");
		String Email = sc.nextLine();

		System.out.println("Enter your Phone Number: ");
		long PhnNo = sc.nextLong();
		
		
		Customer c1 = new Customer(Name, userName, passWord, Age, SSN, Address, Email, PhnNo);

		while(true)
		{
			boolean session = false;
			if(c1.login())
				session=true;
			else {
				System.out.println("Credential Mismatch");
			}
			
			while(session)
			{
				System.out.println("Please select the option: ");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Check Balance");
				System.out.println("4. Edit Profile");
				System.out.println("5. Change Password");
				System.out.println("6. Create Account");
				System.out.println("7. Exit");
				
				int option = sc.nextInt();
				
				switch (option) {
				case 1:
					c1.deposit();
					break;
				case 2:
					c1.withdrawal();
					break;
				case 3:
					c1.checkBalance();
					break;
				case 4 : 
					c1.editProfile();
					break;
				case 5:
					c1.changePassword();
					break;
				case 6:
					c1.createAccount();
					break;
				case 7:
					session=false;
					break;
				default:
					System.out.println("Invalid option!");
					break;
				}
				
				if(session)
				{
					System.out.println("Do you want to continue in the main menu? Y/N :");
					String res = sc.next();
					if(!res.equals("y"))
						session=false;
				}
				
			}
		}
		
		
		
	}

}
