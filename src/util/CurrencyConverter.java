package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	double price;
	
	double bought;
	
	public static double converter(double price, double bought) {
		return (price * bought) + ((price * bought) * IOF);
	}
}
