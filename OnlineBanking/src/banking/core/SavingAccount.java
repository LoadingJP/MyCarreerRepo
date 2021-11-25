package banking.core;

public class SavingAccount extends Account {
	
	private double interestRate = 0.15;
	private double savingBalance;
	
	public SavingAccount(int accountNumber) {
		
		super(accountNumber);
	}
	
	public double applyInterest(double amount) {
		
		double totalAmount = amount + (amount * interestRate);
		
		return totalAmount;
	}
	
	
	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	void withdraw(double amount) {
		
		
		double balance = getSavingBalance() - amount;
		if (amount == 0) {
			
			System.out.println("The withdraw should be more than null");
		}
		
		else if (amount>(getSavingBalance())) {
			
			System.out.println("Not enough funds in your account");
		}
		
		else if (amount < (getSavingBalance())) {
			
			setTotalBalance(balance);
			
			
			if (balance< 100) {
				
				System.out.println("You will loose the interest privileges from your account");
			
			}
			
			else {
				balance = applyInterest(balance);
				
				setTotalBalance(balance);
				
			}
			
			System.out.println("Your new balance is " + getSavingBalance());
		}
		
		
	}
	
	void deposit (double amount) {
			
			
			if (amount == 0) {
				
				System.out.println("The deposit should be more than null");
			}
			
			else {
				double balance = getSavingBalance() + amount;
				

				if (balance< 100) {
					
					setTotalBalance(balance);
				
				}
				
				else {
					balance = applyInterest(balance);
					
					setTotalBalance(balance);
					
				}
				
				System.out.println("Your new balance is " + getSavingBalance());
			}
			
			
		}

}
