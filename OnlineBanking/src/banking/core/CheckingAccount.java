package banking.core;


public class CheckingAccount extends Account{
	private  double Maintenence_Fee = 15.50;
	private  double checkingBalance;
	
	public CheckingAccount(int accountNumber) {
		super(accountNumber);
	}
	
	
	
	public double getMaintenence_Fee() {
		return Maintenence_Fee;
	}



	public double applyMaintenance(double amount) {
		
		return amount - Maintenence_Fee;
		
	}
	
	

	
	public double getCheckingBalance() {
		return checkingBalance;
	}



	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	void deposit (double amount) {
		

		if (amount == 0) {
			
			System.out.println("The deposit should be more than null");
		}
		
		else {
			double balance = getCheckingBalance() + amount;
			setTotalBalance(balance);
			
			if (balance < 100) {
				System.out.println("There is a fee of " + Maintenence_Fee + " for this deposit:");
				double newBalance = applyMaintenance(balance);
				setTotalBalance(newBalance);
				
			}
			
			else {
				setTotalBalance(balance);
			}
		}
		
		
	}
	
	void withdraw(double amount) {
		

		if (amount == 0) {
			
			System.out.println("The withdraw should be more than null");
		}
		
		else if (amount>(getCheckingBalance() + Maintenence_Fee)) {
			
			System.out.println("Not enough funds in your account");
		}
		
		else if (amount < getCheckingBalance()) {
			
			double balance = getCheckingBalance() - amount;
			
			if (balance < 100) {
				
				System.out.println("You will be charge maintenence fee of " + getMaintenence_Fee());
				double newBalance=applyMaintenance(balance);
				setTotalBalance(newBalance);
			}
			
			else {
				
				setTotalBalance(balance);
			}
			
		}
		
		
		
	}

}
