package suchetanBank;

import java.util.Scanner;

public class Customer implements Validation{
	public String Name;
	public String UserName;
	public String Password;
	public int age;
	public String SSN;
	public String Address;
	public String Email;
	public long phnNo;
	public double Balance=0.0;
	Account bankAccount;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Customer(String name, String userName, String password, int age, String sSN, String address, String email,
			long phnNo) {
		super();
		Name = name;
		UserName = userName;
		Password = password;
		this.age = age;
		SSN = sSN;
		Address = address;
		Email = email;
		this.phnNo = phnNo;
	}
	
	public boolean validateSSN() {
		if(this.SSN.length()==9)
			return true;
		else {
			return false;
		}
	}
	
	public boolean validateAge() {
		if(this.age>=18)
			return true;
		else {
			return false;
		}
	}

	public boolean login() {
		System.out.println("Enter your credentials: ");
		System.out.println("Username: ");
		String userName = sc.next();
		System.out.println("Password: ");
		String passWord = sc.next();
		
		if(userName.equals(this.UserName) && passWord.equals(this.Password))
			return true;
		else {
			return false;
		}
	}
	

	public void createAccount() {
		if(validateAge())
		{
			sc.nextLine();
			System.out.println("Enter the account type: ");
			System.out.println("Enter 'c' for Current or 's' for Saving: ");
			String res = sc.nextLine();
			if(res.equals("c"))
				bankAccount = new Current();
			else {
				bankAccount = new Saving();
			}
		}
		else {
			System.out.println("Customer is a minor! Can't create an account.");
		}
		
			 
		
	}
	
	public void deposit() {
		System.out.println("Enter the amount you want to deposit :");
		int amount = sc.nextInt();
		if(amount<=0)
		{
			System.out.println("Enter a positive amount!");
		}
		else {
			this.Balance += amount;
			System.out.println("Amount deposited successfully!");
		}
		
	}
	
	public void withdrawal() {
		System.out.println("Enter the amount you want to withdraw :");
		int amount = sc.nextInt();
		if(amount<=0)
		{
			System.out.println("Enter a positive amount!");
		}
		else {
			if(amount<=this.Balance)
			{
				this.Balance -= amount;
				System.out.println("Amount withdrawn successfully!");
			}
			else {
				System.out.println("You don't have enough credits in your account");
			}
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Your account balance is - "+this.Balance);
	}
	
	public void editProfile() {
		boolean session = true;
		while(session)
		{
		System.out.println("........Edit your profile..... ");
		System.out.println("Select the option you want to edit: ");
		System.out.println("1. Name");
		System.out.println("2. Password");
		System.out.println("3. Age");
		System.out.println("4. SSN");
		System.out.println("5. Address");
		System.out.println("6. Email");
		System.out.println("7. Phone Number");
		System.out.println("8. Return to Main menu");
		
		int choice = sc.nextInt();
		
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter your Name: ");
				String newName = sc.nextLine();
				this.Name = newName;
				System.out.println("Your name is saved successfully!");
				if(!continueEditing())
					session=false;
				break;
			
			case 2:
				this.changePassword();
				break;
			
			case 3:
				System.out.println("Enter your Age: ");
				int newAge = sc.nextInt();
				this.age = newAge;
				System.out.println("Your age is saved successfully!");
				if(!continueEditing())
					session=false;
				break;
				
			case 4:
				sc.nextLine();
				System.out.println("Enter your SSN: ");
				String newSSN = sc.nextLine();
				this.SSN = newSSN;
				System.out.println("Your SSN is saved successfully!");
				if(!continueEditing())
					session=false;
				break;
				
			case 5 :
				sc.nextLine();
				System.out.println("Enter your Address: ");
				String newAddress = sc.nextLine();
				this.Address = newAddress;
				System.out.println("Your address is saved successfully!");
				if(!continueEditing())
					session=false;
				break;
			
			case 6 :
				sc.nextLine();
				System.out.println("Enter your Email: ");
				String newEmail = sc.nextLine();
				this.Email = newEmail;
				System.out.println("Your email is saved successfully!");
				if(!continueEditing())
					session=false;
				break;
				
			case 7 :
				sc.nextLine();
				System.out.println("Enter your Phone Number: ");
				long newPhnNo = sc.nextLong();
				this.phnNo = newPhnNo;
				System.out.println("Your phone number is saved successfully!");
				if(!continueEditing())
					session=false;
				break;
			
			case 8: 
				session=false;
				break;
			default:
				System.out.println("Invalid option!!");
				break;
			}
		}
		
	}
	
	public boolean continueEditing() {
		System.out.println("Do you want to continue editing? Enter y/n :");
		String res = sc.next();
		if(res.equals("y"))
				return true;
		else {
			return false;
		}
		
	}
	
	public void changePassword() {
		System.out.println();
		System.out.println("Enter your old password");
		String oldP = sc.next();
		if(this.Password.equals(oldP))
		{
			System.out.println("Enter your new Password: ");
			String newP = sc.next();
			this.Password = newP;
			System.out.println("Your password is changed successfully!");
		}
		
		else {
			System.out.println("Error! You've entered invalid password. Try again.");
		}
	}
}

