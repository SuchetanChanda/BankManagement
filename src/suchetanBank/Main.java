package suchetanBank;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*********** Welcome to Suchetan Bank Limited ***********");
		
		System.out.println("Enter your credentials: ");
		System.out.println("Username: ");
		String userName = sc.next();
		System.out.println("Password: ");
		String passWord = sc.next();
		
		
		System.out.println("Please select the option: ");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Edit Profile");
		System.out.println("5. Change Password");
		System.out.println("6. Exit");
		
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			
			break;

		default:
			break;
		}
	}

}
