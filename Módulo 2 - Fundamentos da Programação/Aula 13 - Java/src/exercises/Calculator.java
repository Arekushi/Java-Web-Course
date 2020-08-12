package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	
	static BufferedReader bf;

	public static void main(String[] args) throws IOException {
		bf = new BufferedReader(new InputStreamReader(System.in));
		
		double result = 0;
		int operator;
		
		do {
			System.out.println("1 - Somar\n"
							+ "2 - Subtrair\n"
							+ "3 - Multiplicar\n"
							+ "4 - Dividir\n"
							+ "5 - Sair");
			
			operator = Integer.parseInt(bf.readLine());
			
			if(checkOperator(operator)) {
				double values[] = Number.readValues();
				
				switch(operator) {
					case 1:
						result = Number.add(values);
						break;
						
					case 2:
						result = Number.minus(values);
						break;
						
					case 3:
						result = Number.multiplication(values);
						break;
						
					case 4:
						result = Number.division(values);
						break;
				}
				
				System.out.println(String.format("O valor é: %.2f", result));
			}
			
		} while(operator != 5);
		
		System.out.println("Bye bye forasteiro >:(");
	}
	
	private static boolean checkOperator(int operator) {
		return operator > 0 && operator < 5;
	}

}
