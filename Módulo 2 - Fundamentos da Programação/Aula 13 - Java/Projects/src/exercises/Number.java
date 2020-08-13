package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number {
	private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	public static double[] readValues() {
		double ret[] = null;
		boolean repeat = true;
		
		do {
			try {
				System.out.println("Digite os números:");
				ret = Arrays.stream(bf.readLine().split(" "))
						.mapToDouble(Double::parseDouble).toArray();
				repeat = false;
				
			} catch(NumberFormatException | IOException e) {
				System.out.println("Digite os números corretamente >:(");
			}
			
		} while(repeat);
		
		return ret;
	}

	public static double add(double[] values) {
		double r = 0;
		
		for(double value : values) {
			r += value;
		}
		
		return r;
	}
	
	public static double minus(double[] values) {
		double v = values[0];
		double r = 0;
		
		for(int i = 1; i < values.length; i++) {
			r = v - values[i];
			v = r;
		}
		
		return r;
	}
	
	public static double multiplication(double[] values) {
		double r = 1;
		
		for(double value : values) {
			r *= value;
		}
		
		return r;
	}
	
	public static double division(double[] values) {
		double v = values[0];
		double r = 0;
		
		for(int i = 1; i < values.length; i++) {
			r = v / values[i];
			v = r;
		}
		
		return r;
	}
}
