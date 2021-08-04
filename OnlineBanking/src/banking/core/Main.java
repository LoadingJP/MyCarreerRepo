package banking.core;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		Login log= new Login();
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("USERNAME: ");
			
		String username = scanner.nextLine();
		
		System.out.println("PASSWORD: ");
		
		String password = scanner.nextLine();
		
		if (log.hasCapital(username)&& log.hasNumber(username)&& log.hasCapital(password)&&log.hasNumber(password)&&log.hasSpecialCharacter(password)) {
			
			printAccountMenu();
		}
		
		else {
			System.out.println("Invalid Password");
		}
		
	}
	
	public static void accountPage(int choice) {
		
		Account account = new CheckingAccount(10);
		Account savingAccount = new SavingAccount(10);
		Scanner scan = new Scanner(System.in);
			
			
			if (choice == 1) {
				System.out.println("Here are few things you can do with your checking account: ");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Exit");
			
				int option;
				
				option = scan.nextInt();
				
				do {
					
					if(option == 1) {
						
						System.out.println("Enter deposit amount: ");
						double amount = scan.nextDouble();
						account.deposit(amount);
						
						System.out.println("The amount of "+ amount + "has been deposited");
						System.out.println("Your new balance is " + account.getBalance());
						break;
						
					}
					
					else if (option ==2) {
						
						System.out.println("Enter withdrawl amount:");
						double amount =  scan.nextDouble();
						account.withdraw(amount);
						System.out.println("Your updated balance is " + account.getBalance());
						break;
						
						
					}
					
					else {
						
						printAccountMenu();
					
					}
				}
				while(option<3);
			
			
		}
			
			else if (choice == 2) {
				
				System.out.println("Here are few things you can do with your Savings account: ");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Exit");
				int option;
				option = scan.nextInt();
				
				do {
					
					if(option == 1) {
						
						System.out.println("Enter deposit amount: ");
						double amount = scan.nextDouble();
						savingAccount.deposit(amount);
						
						System.out.println("The amount of "+ amount + "has been deposited");
						System.out.println("Your new balance is " + savingAccount.getBalance());
						break;
					}
					
					else if (option ==2) {
						
						System.out.println("Enter withdrawl amount:");
						double amount =  scan.nextDouble();
						savingAccount.withdraw(amount);
						System.out.println("Your updated balance is " + savingAccount.getBalance());
						break;
						
						
					}
					
					else {
						printAccountMenu();
					}
					
				}
				
				while (option<3);
				
			}
			
		
	}
		
	
	
	public static void printAccountMenu() {
		

		Scanner scanner = new Scanner(System.in); 
		System.out.println("Logging In ");
		System.out.println("Welcome to Online Banking: Here are some features you can enjoy::::");
		//String string = "1.Checking Account\n"
				//+ "2.Savings Account\n"+ "3.Check Balance\n"+ "4.Exit";
		//String newString = string.replaceAll("\\s+", "\n");
		
		//System.out.println(newString);;
		String anotherString = "1.CHECKING ACCOUNT" + System.lineSeparator() + 
				"2.SAVINGS ACCOUNT"+System.lineSeparator()+ 
				 "3.EXIT";
		System.out.println(anotherString);
		int choice = scanner.nextInt();
			if (choice == 1) {
				
				accountPage(choice);
			}
			
			else if (choice == 2) {
				accountPage(choice);
			}
			
			else {
				
				System.out.println("Goodbye");
			}

	}
	

}
