package money;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double DolarToReais(double dolarPrice, double valueBought) {
		return (dolarPrice + dolarPrice * IOF) * valueBought;
	}
}
