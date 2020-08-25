package santander;

public class SavingAccount extends Account {

	private Double tax;
	
	public SavingAccount(Client client, Double tax) {
		super(client);
		this.tax = tax;
	}
	
	public SavingAccount(Client client, Double initialValue, Double tax) {
		super(client, initialValue);
		this.tax = tax;
	}

	@Override
	public boolean withdraw(Double value) {
		if(value > consult()) {
			return false;
		}
		
		return super.withdraw(value);
	}
	
	public void collectTax() {
		makeDeposit(consult() * tax);
	}
	
	@Override
	public String toString() {
		return String.format("Saldo: %.2f%n", consult());
	}

}
