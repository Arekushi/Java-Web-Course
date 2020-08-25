package santander;

public abstract class Account {
	protected Client client;
	protected double money;
	
	public Account(Client client, Double initialValue) {
		this.client = client;
		this.money = initialValue;
	}
	
	public Account(Client client) {
		this.client = client;
		this.money = 0;
	}
	
	public void makeDeposit(Double value) {
		money += value;
		System.out.println(String.format("Consulta após depósito: %.2f", consult()));
	}
	
	public boolean withdraw(Double value) {
		money -= value;
		System.out.println(String.format("Consulta após retirada: %.2f", consult()));
		return true;
	}
	
	public Double consult() {
		return money;
	}
}
