package banking.core;

public class Account {

	private int accountNumber;
	
	private double totalBalance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double balance) {
		this.totalBalance = balance;
	}
	

}
