package santander;

import java.util.Date;

public class Check {
	private Double value;
	private String emittingBank;
	private Date payday;
	
	public Check(Double value, String emittingBank, Date payday) {
		this.value = value;
		this.emittingBank = emittingBank;
		this.payday = payday;
	}
	
	public Double getValue() {
		return value;
	}
	
	public String getEmittingBank() {
		return emittingBank;
	}
	
	public Date getPayday() {
		return payday;
	}
}
