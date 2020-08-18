package bank;

public class Account {
	private static final double tax = 5.00;
	
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		this.balance = initialDeposit;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		this.balance = 0;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return holder;
	}
	
	public void setName(String name) {
		this.holder = name;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + tax;
	}
	
	@Override
	public String toString() {
		return String.format("Account: %d, Holder: %s, Balance: %.2f%n", number, holder, balance);
	}
}
