package santander;

import java.util.ArrayList;
import java.util.List;

public class CheckingAccount extends Account {
	private List<Check> checks = new ArrayList<>();
	private Double limitSpecialCheck;

	public CheckingAccount(Client client, Double limit) {
		super(client);
		this.limitSpecialCheck = limit;
	}
	
	public CheckingAccount(Client client, Double initialValue, Double limit) {
		super(client, initialValue);
		this.limitSpecialCheck = limit;
	}

	@Override
	public boolean withdraw(Double value) {
		double sub = consult() - value;
		
		if(sub < 0)
			if(!useSpecialCheck(sub))
				return false;
		
		System.out.println(String.format("Limite: %.2f", limitSpecialCheck));
		return super.withdraw(value);
	}
	
	public void depositCheck(Check ...check) {
		for(Check c : check) {
			checks.add(c);
		}
		
		downAccount();
	}
	
	private boolean useSpecialCheck(Double sub) {
		if(limitSpecialCheck - Math.abs(sub) < 0)
			return false;
		
		limitSpecialCheck -= Math.abs(sub);
		return true;
	}
	
	private void downAccount() {
		for(Check check : checks)
			money += check.getValue();
		
		checks.removeAll(checks);
		System.out.println(String.format("Consul após depósito (cheque): %.2f", consult()));
	}
	
	public Double getLimitSpecialCheck() {
		return limitSpecialCheck;
	}
	
	@Override
	public String toString() {
		return String.format("Saldo: %.2f%nLimite: %.2f%n", consult(), limitSpecialCheck);
	}

}
